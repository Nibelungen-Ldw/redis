import redis.clients.jedis.Jedis;

public class Test {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.154.128", 6379);
		String ping = jedis.ping();
		System.out.println(ping);
		jedis.set("liu", "deang");
		String string = jedis.get("liu");
		System.out.println(string);

	}
}
