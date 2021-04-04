package io.github.kprasad99.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TestRedisConfiguration.class})
class SpringCacheRedisApplicationTests {

	@Test
	void contextLoads() {
	}

}
