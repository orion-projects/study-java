// HSET key field value [field value ...]
HSET hash key value key2 value2

// HMSET key field value [field value ...]
HMSET hash key value key2 value2

// HSETNX key field value
HSETNX hash key valus

// HGET key field
HGET hash key

// HMGET key field [field...]
HMGET hash key

// HGETALL key
HGETALL hash

// HKEYS key
HKEYS hash

// HVALS ley
HVALS hash

// HRANDFIELD key [count [WITHVALUES]]
HRANDFIELD hash
HRANDFIELD hash 2
HRANDFIELD hash 2 withvalues

// HDEL key field [field...]
HDEL hash hdel

// HEXISTS key field
HEXISTS hash key

// HINCRBY key field increment
HINCRBY hash inc 10

// HINCRBYFLOAT key field increment
HINCRBYFLOAT hash incf 1.1

// HLEN key
HLEN hash

// HSTRLEN key field
HSTRLEN hash key

// hscan key cursor [MATCH pattern] [COUNT count]

