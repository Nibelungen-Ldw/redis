import java.io.IOException;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class TestCluster {
	public static void main(String[] args) throws IOException {
		HostAndPort hostAndPort = new HostAndPort("192.168.154.128", 6379);
		JedisCluster jedisCluster = new JedisCluster(hostAndPort);
		jedisCluster.set("liudewang", "GG");
		String string = jedisCluster.get("liudewang");
		System.out.println(string);
		jedisCluster.close();
	}
}
