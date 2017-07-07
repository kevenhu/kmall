package com.keven.kmall.cache.impl;

import com.keven.kmall.cache.UserCache;
import com.keven.kmall.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Keven on 2017/7/6.
 */
@Service
public class UserCacheRedisImpl implements UserCache {

    @Autowired
    private RedisTemplate<String,User> redisTemplate;

    public User findUserByAccount(String account) {
        final String key = "User:"+account;
        User user = redisTemplate.execute(new RedisCallback<User>() {
            public User doInRedis(RedisConnection redisConnection) throws DataAccessException {
                return redisTemplate.opsForValue().get(key);
            }
        });
        return user;
    }

    public void save(User user) {
        final String key="User:"+user.getAccount();
        redisTemplate.opsForValue().set(key,user);
    }
}
