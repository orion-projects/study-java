// PFADD key [element [element...]]
PFADD pfadd
PFADD pfadd one
PFADD pfadd one  two

// PFCOUNT key [key...]
PFCOUNT pfadd

// PFMERGE destkey courcekey [sourcekey ...]
PFMERGE newpfadd pfadd