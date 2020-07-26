package tn.projects.microservices.sample.dao;

import java.net.URI;

import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author Mickael BARON
 * 
 */

@Service("jedisFactory")
public class JedisFactory implements IJedisFactory {
	
	private static final String REDISALIAS_PORT_ENV_KEY = "REDISALIAS_PORT";
	private JedisPool jedisPool = new JedisPool(new JedisPoolConfig(), getRedisURI());

	public JedisFactory() {
		jedisPool = new JedisPool(new JedisPoolConfig(), getRedisURI());
	}
	
	public JedisPool getJedisPool() {
		return jedisPool;
	}

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}	

	private URI getRedisURI() {
		String redisPort = System.getenv(REDISALIAS_PORT_ENV_KEY);
		return URI.create(redisPort != null && !redisPort.isEmpty() ? redisPort : "tcp://localhost:6379");
	}

	@Override
	public Jedis getJedis() {
		if (jedisPool == null){
			System.out.println("JedisFactory.getJedis() >> create a new pool!!");
			jedisPool = new JedisPool(new JedisPoolConfig(), getRedisURI());
		}
		System.out.println("JedisFactory.getJedis() " + jedisPool);		
		System.out.println("JedisFactory.getJedis()>>>" +jedisPool.getResource());
		return jedisPool.getResource();
	}

	@Override
	public void sayHello() {
		System.out.println("JedisFactory.sayHello() ");		
	}
	
}