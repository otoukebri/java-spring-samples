package tn.projects.microservices.sample.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;

/**
 * @author Mickael BARON
 * 
 *         Based on:
 *         https://github.com/fjunior87/JedisCrud/tree/master/src/com/xicojunior
 *         /jediscrud/dao
 * 
 *         Improvements: used Redis pipeline.
 */
//@Named("redis")

@Service ("employeeManager")
public class HelloWorldDAORedisImpl implements IHelloWorldDAO {

	@Autowired
	IJedisFactory refSession;
	
	@Override
	public List<HelloWorld> getHelloWorlds() {
		List <HelloWorld> helloWorlds = new ArrayList<HelloWorld>();
		// Get all HelloWorld ids from the redis list using LRANGE.
		Jedis jedis = refSession.getJedis();
		List<String> allUserIds = jedis.lrange(Keys.HELLOWORLD_ALL.key(), 0, -1);
		if (allUserIds != null && !allUserIds.isEmpty()) {
			List<Map<String, String>> responseList = new ArrayList<Map<String, String>>();
			for (String userId : allUserIds) {
				// Call HGETALL for each HelloWorld id.
				responseList.add(jedis.hgetAll(Keys.HELLOWORLD_DATA.formated(userId)));
			}
			// Iterate over the results
			for (Map<String, String> properties : responseList) {
				helloWorlds.add(BeanUtil.populate(properties, new HelloWorld()));
			}
		}
		jedis.close();
		return helloWorlds;
	}
	
	@Override
	public void addHelloWorld(HelloWorld newHelloWorld) {
		newHelloWorld.setStartDate("Thu Oct 07 21:10:51 UTC 2016");
		System.out.println("refSession is" + refSession);
		Jedis jedis = refSession.getJedis();
		System.out.println("HelloWorldDAORedisImpl.addHelloWorld() " + jedis);
		long helloWorldId = jedis.incr(Keys.HELLOWORLD_IDS.key());
		System.out.println("HelloWorldDAORedisImpl.addHelloWorld()  " + " helloWorldId -> " +  helloWorldId);
		newHelloWorld.setRid(helloWorldId);
		// Add to HelloWorld list.
		//System.out.println("HelloWorldDAORedisImpl.addHelloWorld()  " + " Keys.HELLOWORLD_ALL.key() -> " +  Keys.HELLOWORLD_ALL.key());
		jedis.lpush(Keys.HELLOWORLD_ALL.key(), String.valueOf(helloWorldId));
		// Add to the hash structure.
		Map<String, String>  m = BeanUtil.toMap(newHelloWorld);
		System.out.println("map is" +m);
		String s= Keys.HELLOWORLD_DATA.formated(String.valueOf(helloWorldId));
		System.out.println(">>value to send " +  s);
		jedis.hmset(s, m);
		jedis.close();
	}
	
	
}
