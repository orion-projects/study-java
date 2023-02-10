// SET key value [NX | XX] [GET]
      [EX seconds | PX milliseconds | EXAT unix-time-seconds | PXAT unix-time-milliseconds | KEEPTTL]
SET key value
SET key value NX
SET key value XX
SET key value GET
SET key value EX 1000
SET key value PX 1000000
SET key value EXAT 100000000000
SET key value PXAT 100000000000000
SET key value KEEPTTL

// SETEX key seconds value
SETEX key 1000 value

// SETNX key value
SETNX key value

// MSET key value [key value ...]
MSET key value key2 vaule2

// MSETNX key value [key value ...]
MSETNX key value key2 vaule2


// GET key
GET key

// GETEX key [EX seconds | PX milliseconds | EXAT unix-time-seconds | PXAT unix-time-milliseconds | PERSIST]
GETEX key
GETEX key EX 100
GETEX key PX 100000
GETEX key EXAT 100000000000
GETEX key PXAT 100000000000000
GETEX key PERSIST

// MGET key [key...]
MGET key key

// GETSET key vaule
GETSET key newvalue

// GETDEL key
GETDEL key


// DECR key
DECR decr

// DECRBY key decrement
DECRBY decrby 10

// INCR key
INCR incrkey

// INCRBY key
INCRBY incrby 10

// INCRBYFLOAT key increment
INCRBYFLOAT incrbyfloat 10


// GETRANGE key start end
GETRANGE key 1 3

// SETRANGE key offset value
SETRANGE key 1 value

// APPEND key value
APPEND append "append"

// STRLEN key
STRLEN key

// PSETNX key milliseconds value

// LCS key1 key2 [LEN] [IDX] [MINMATCHLEN len] [WITHMATCHLEN]