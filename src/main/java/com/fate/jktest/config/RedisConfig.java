package com.fate.jktest.config;

import com.fate.jktest.bean.base.BaseEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * @Author: fate
 * @Date: 2019/3/5 23:11
 * @Version 1.0
 */
@Configuration
public class RedisConfig {
    /**
     * 自定义Redis序列化解析
     * @param redisConnectionFactory
     * @return
     * @throws UnknownHostException
     */
    @Bean
    public RedisTemplate<Object, ? extends BaseEntity> redisEntityTemplate(
            RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, ? extends BaseEntity> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        template.setDefaultSerializer(new Jackson2JsonRedisSerializer<BaseEntity>(BaseEntity.class));
        return template;
    }
}
