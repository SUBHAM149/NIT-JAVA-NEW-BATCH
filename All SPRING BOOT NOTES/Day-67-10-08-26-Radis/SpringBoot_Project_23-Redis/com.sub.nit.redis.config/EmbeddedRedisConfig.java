package com.sub.nit.redis.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Configuration;
import redis.embedded.RedisServer;

import java.io.IOException;

@Configuration
public class EmbeddedRedisConfig {

    private RedisServer redisServer;

    @PostConstruct
    public void startRedis() throws IOException {

        redisServer = new RedisServer(6379);

        try {
            redisServer.start();
            System.out.println("Embedded Redis started on port 6379");
        } catch (Exception e) {
            System.out.println(
                "Embedded Redis failed to start: " + e.getMessage()
            );
        }
    }

    @PreDestroy
    public void stopRedis() throws IOException {

        if (redisServer != null && redisServer.isActive()) {
            redisServer.stop();
            System.out.println("Embedded Redis stopped");
        }
    }
}
