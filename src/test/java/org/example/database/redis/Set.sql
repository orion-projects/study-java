// init
SADD set "set_member1" "set_member2" "set_member3"
SADD source "source_member1" "source_member2" "source_member3"
SADD destion "destion_member1" "destion_member2" "destion_member3"


// SADD key member [member ...]
SADD set "one" "two"

// SREM key member [member ...]
// 删除member
SREM set "set_member"

// SPOP key [count]
// 随机返回并删除count个member。
SPOP set 2

// SRANDMEMBER key [count]
// 随机返回count个member。
SRANDMEMBER set 2

// SMOVE source destionation member
// 将source集的member移动到destionation
SMOVE source destion "source_member1"

// SMEMBERS key
// 返回所有的member。
SMEMBERS set

// SINTER key [key ...]
// 交集
SINTER set set

// SINTERSTORE destination key [key ...]
SINTERSTORE destion set set

// SINTERCARD numkeys key [key ...] [LIMIT limit]
SINTERCARD 2 set set
SINTERCARD 2 set set LIMIT 1

// SUNION key [key ...]
// 并集
SUNION source destion

// SUNIONSTORE destionation key [key ...]
SUNIONSTORE destion source destion

// SDIFF key [key ...]
// 差集
SDIFF set set

// SDIFFSTORE destination key [key ...]
SDIFFSTORE destion set set

// SISMEMBER key member
// 判断member是否为集合key的成员。
SISMEMBER set "one"

// SMISMEMBER key member [member ...]
SMISMEMBER set "one" "two"

// SCARD key
SCARD set