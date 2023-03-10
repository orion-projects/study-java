package org.example.database.redis;
/**
 * 淘汰策略
 * 1、volatile-lru
 *    从已设置过期时间的数据集中，挑选最近最少使用的数据淘汰。
 * 2、volatile-ttl
 *    从已设置过期时间的数据集中，挑选即将过期的数据淘汰。
 * 3、volatile-random
 *    从已设置过期时间的数据集中，随机挑选数据淘汰。
 * 4、allkeys-lru
 *    从所有数据集中，挑选最近最少使用的数据淘汰。
 * 5、allkeys-random
 *    从所有数据集中，随机挑选数据淘汰。
 * 6、no-enviction
 *    禁止淘汰数据，默认策略。
 */

/**
 * 缓存雪崩
 *    缓存雪崩指数据未加载到缓存中或缓存在同一时间大面积失效。
 * 1、缓存预热
 *    应用上线后将相关缓存加载到缓存系统中。
 * 2、设置不同的过期时间。
 */

/**
 * 缓存穿透
 *    查询一个不存在的数据。
 * 1、缓存null值。
 *    如果查询返回的数据为null，则依旧缓存null并设置一个很短的过期时间（防止查询故障返回null）。
 * 2、布隆过滤器
 *    布隆过滤器由一个很长的位数组和一系列函数组成，数组的每个元素都只占1bit空间，并且每个元素只能为0或1。
 *    布隆过滤器可能会出现错误判断，但不会漏掉判断。如果布隆过滤器判断元素不在集合中，那么肯定不在；如果判断元素在集合中，那么有一定的概率判断错误。
 */

/**
 * 过期键删除策略
 * 1、定时删除
 *    在设置键的过期时间的同时创建一个定时器。定时器在键的过期时间来临时，立即执行对键的删除操作。
 * 2、定期删除
 *    每隔一段时间程序就对数据库进行一次检查，删除里面的过期键。
 * 3、惰性删除
 *    每次获取键的时候都检查键是否过期，如果过期就删除；如果没有过期，就返回该建。
 */