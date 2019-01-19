************************************************************************
file with basedata            : mf63_.bas
initial value random generator: 1372624058
************************************************************************
projects                      :  1
jobs (incl. supersource/sink ):  32
horizon                       :  242
RESOURCES
  - renewable                 :  2   R
  - nonrenewable              :  2   N
  - doubly constrained        :  0   D
************************************************************************
PROJECT INFORMATION:
pronr.  #jobs rel.date duedate tardcost  MPM-Time
    1     30      0       31       17       31
************************************************************************
PRECEDENCE RELATIONS:
jobnr.    #modes  #successors   successors
   1        1          3           2   3   4
   2        3          3           6   7  16
   3        3          1           5
   4        3          3          11  16  26
   5        3          3           8   9  26
   6        3          2          23  26
   7        3          1           9
   8        3          3          10  12  15
   9        3          3          18  25  28
  10        3          3          13  14  27
  11        3          2          20  21
  12        3          3          13  16  21
  13        3          3          19  24  29
  14        3          1          21
  15        3          1          29
  16        3          3          17  20  28
  17        3          1          27
  18        3          2          19  22
  19        3          2          30  31
  20        3          2          22  25
  21        3          1          23
  22        3          2          24  27
  23        3          1          24
  24        3          1          31
  25        3          1          30
  26        3          2          28  31
  27        3          1          29
  28        3          1          30
  29        3          1          32
  30        3          1          32
  31        3          1          32
  32        1          0        
************************************************************************
REQUESTS/DURATIONS:
jobnr. mode duration  R 1  R 2  N 1  N 2
------------------------------------------------------------------------
  1      1     0       0    0    0    0
  2      1     2       6   10   10    4
         2     6       4   10   10    4
         3     9       2   10    9    3
  3      1     5       6    8    8    5
         2     5       7    9    6    5
         3     7       3    6    6    4
  4      1     1       4    8    9    2
         2     6       2    4    9    2
         3     9       2    1    8    2
  5      1     4       6    6    8    9
         2     4       4    5    9    9
         3     5       4    5    4    8
  6      1     2       7    7    5   10
         2    10       7    6    4    9
         3    10       7    7    2    9
  7      1     2       9    5    9    2
         2     4       8    5    4    2
         3     7       8    3    2    1
  8      1     2       4    9    9    9
         2     3       2    7    7    4
         3     5       2    5    6    3
  9      1     4      10    8    7    5
         2     5       6    7    4    3
         3     8       4    7    4    1
 10      1     1       5    7    7    8
         2     7       3    6    6    6
         3     8       3    6    6    2
 11      1     4       9    9    6    6
         2     7       7    5    4    5
         3    10       4    3    3    5
 12      1     3       7    3   10    7
         2     6       6    3    7    7
         3    10       6    3    6    4
 13      1     1       7   10    8    8
         2     8       7   10    5    7
         3    10       6    9    5    6
 14      1     2       8    5    6    8
         2     6       8    4    6    7
         3     8       8    4    3    2
 15      1     1       3    7    2    9
         2     2       2    6    2    8
         3     7       2    6    1    7
 16      1     4       3    7    5    4
         2     6       2    6    3    3
         3     9       1    5    3    2
 17      1     4       6    8    8    7
         2     9       4    7    4    7
         3     9       4    3    6    7
 18      1     1       9    8    6    6
         2     2       8    6    5    5
         3     5       8    5    5    5
 19      1     8       4    5    7   10
         2    10       1    5    2   10
         3    10       3    4    5   10
 20      1     5       6    3    7    5
         2     6       6    2    7    4
         3    10       4    2    7    3
 21      1     3       7    9    5    8
         2     4       7    8    4    5
         3    10       6    6    3    3
 22      1     1      10    8    5    8
         2     7      10    8    2    7
         3     8      10    6    2    6
 23      1     1       7    5    8    4
         2     2       6    4    7    3
         3     9       4    3    6    2
 24      1     1       7    7    8    6
         2     5       5    6    6    6
         3     8       3    1    6    2
 25      1     2       7    9    3    9
         2     4       4    9    2    9
         3    10       3    8    2    7
 26      1     3       4    9    5    7
         2     7       4    8    5    7
         3     8       3    4    5    6
 27      1     5       7    4   10    7
         2     8       5    3   10    5
         3     9       5    3   10    4
 28      1     1       6    8    8    2
         2     3       4    8    8    1
         3     3       3    8    8    2
 29      1     2       6    5    8    5
         2     7       4    5    5    5
         3    10       4    1    5    5
 30      1     2       5   10    5    4
         2     5       3   10    5    3
         3     7       2    9    5    2
 31      1     1      10    7    3   10
         2     3       5    5    2    8
         3     4       4    5    2    8
 32      1     0       0    0    0    0
************************************************************************
RESOURCEAVAILABILITIES:
  R 1  R 2  N 1  N 2
   27   28  206  194
************************************************************************
