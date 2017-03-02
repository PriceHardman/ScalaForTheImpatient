/*
  Exercise 1:
    According to the precedence rules,
    how are 3 + 4 -> 5 and 3 -> 4 + 5 evaluated?
 */

// -> and + have the same precendence, since
// ->'s is that of -, which is the same as
// that of +. And since neither are assignment
// operators, they are left-associative,
// so
3 + 4 -> 5 // evaluates left to right as
(3 + 4) -> 5 // ==
7 -> 5

// 3 -> 4 + 5 on the other hand evaluates
// as (3 -> 4) + 5, which is invalid and
// won't compile.