package tn.projects.microservices.sample.dao;

import redis.clients.jedis.Jedis;

public interface IJedisFactory {

	public Jedis getJedis();
	public void sayHello();

}
