LPUSH source "one" "two" "three"
LPUSH destion "1" "2" "3"
LPUSH list "one" "two"

// LPUSH key element [element ...]
LPUSH list "four"

// RPUSH key element [element ...]
RPUSH list "zero"

// lpushx key element [element ...]
LPUSHX list "five"

// RPUSHX key element [element ...]
RPUSHX list "zero"

// LINSERT key <before | after> pivot element
LINSERT list before "two" "three"
LINSERT list after "one" "zero"

// LPOP key [count]
LPOP list 2

// RPOP key [count]
RPOP list 1

// LMPOP numkeys key [key ...] <LEFT | RIGHT> [COUNT count]
LMPOP 2 source destion LEFT COUNT 2

// RPOPLPUSH source desctination
RPOPLPUSH source destion

// LMOVE source destination <LEFT | RIGHT> <LEFT | RIGHT>
LMOVE source desction LEFT LEFT

// LSET key index element
LSET list 1 "1"

// LREM key count element
LREM list 1 "zero"

// LTRIM key start stop
LTRIM list 1 4

// LINDEX key index
LINDEX list 1

// LRANGE key start end
LRANGE list 1 2
LRANGE list 0 -1

// LLEN key
LLEN list

// BLPOP key [key ...] timeout

// BRPOP key [key ...] timeout

// BLMPOP timeout numkeys key [key ...] <LEFT | RIGHT> [COUNT count]

// BLMOVE source destination <LEFT | RIGHT> <LEFT | RIGHT> timeout

// BRPOPLPUSH source destination timeout