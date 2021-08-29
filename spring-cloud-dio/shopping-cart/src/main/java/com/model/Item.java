package com.model;


import org.springframework.data.redis.core.RedisHash;


@RedisHash("item")
public class Item {
    private long productId;
    private int amount;
}
