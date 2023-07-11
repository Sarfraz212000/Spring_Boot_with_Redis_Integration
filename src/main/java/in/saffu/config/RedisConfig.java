package in.saffu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.saffu.binding.Country;

@Configuration
public class RedisConfig {

	          // here it represent connection with redis server
	@Bean
	public JedisConnectionFactory jedisConnection() {

		JedisConnectionFactory jedisfactory = new JedisConnectionFactory();
		         
		return jedisfactory;
	}

	              // here we perform the operation with redis server
	@Bean
	public RedisTemplate<String, Country> redisTemplate() {

		RedisTemplate<String, Country> rt = new RedisTemplate<>();
		rt.setConnectionFactory(jedisConnection());
		return rt;
	}

}
