************************************************************************
file with basedata            : mf23_.bas
initial value random generator: 398751383
************************************************************************
projects                      :  1
jobs (incl. supersource/sink ):  32
horizon                       :  233
RESOURCES
  - renewable                 :  2   R
  - nonrenewable              :  2   N
  - doubly constrained        :  0   D
************************************************************************
PROJECT INFORMATION:
pronr.  #jobs rel.date duedate tardcost  MPM-Time
    1     30      0       27        6       27
************************************************************************
PRECEDENCE RELATIONS:
jobnr.    #modes  #successors   successors
   1        1          3           2   3   4
   2        3          3          10  15  23
   3        3          3           6   7  14
   4        3          2           5   6
   5        3          2          13  27
   6        3          2           8  12
   7        3          3          20  24  26
   8        3          3           9  11  17
   9        3          2          21  29
  10        3          3          21  25  29
  11        3          3          13  16  22
  12        3          2          18  24
  13        3          1          18
  14        3          2          23  24
  15        3          1          28
  16        3          2          18  19
  17        3          3          19  20  23
  18        3          1          30
  19        3          2          26  28
  20        3          2          22  30
  21        3          1          27
  22        3          1          28
  23        3          2          25  29
  24        3          2          25  31
  25        3          1          30
  26        3          1          27
  27        3          1          31
  28        3          1          31
  29        3          1          32
  30        3          1          32
  31        3          1          32
  32        1          0        
************************************************************************
REQUESTS/DURATIONS:
jobnr. mode duration  R 1  R 2  N 1  N 2
------------------------------------------------------------------------
  1      1     0       0    0    0    0
  2      1     3       1    7    8    0
         2     8       1    5    0    3
         3    10       1    2    8    0
  3      1     8       4    6    7    0
         2     9       4    3    2    0
         3    10       3    3    0    7
  4      1     2      10    8    6    0
         2     4       8    7    3    0
         3     7       5    6    0    5
  5      1     7       6    4    1    0
         2     7       6    5    0    8
         3     9       6    3    0    6
  6      1     1       5    9    0    4
         2     9       4    9    3    0
         3     9       4    9    0    4
  7      1     3       8    7    5    0
         2     6       7    5    0    2
         3     9       5    5    5    0
  8      1     2       6    4    8    0
         2     5       4    4    6    0
         3     5       3    3    0    5
  9      1     4      10    7    4    0
         2     7       5    6    0    4
         3     9       4    6    4    0
 10      1     3      10    7    9    0
         2     3      10    8    0    2
         3     5       8    5    9    0
 11      1     1       5    6    0   10
         2     4       5    4    0    9
         3     8       4    4    9    0
 12      1     1      10    8    0    5
         2     5       8    4    7    0
         3     6       7    3    6    0
 13      1     3      10    9    0    8
         2     8       9    8    0    8
         3    10       9    4    0    5
 14      1     4       9    9    7    0
         2     5       5    9    0    7
         3     8       5    7    0    7
 15      1     1       9    7    6    0
         2     4       8    7    5    0
         3     8       5    4    0    8
 16      1     4       5    5    6    0
         2     6       4    3    5    0
         3     7       4    1    0    1
 17      1     4       9    7    8    0
         2     5       9    5    5    0
         3     8       8    1    0    7
 18      1     1       7    9    0    7
         2     8       6    7    0    4
         3     8       6    6    0    5
 19      1     1      10    7    7    0
         2     8       5    5    5    0
         3    10       5    3    0    4
 20      1     3      10    6    9    0
         2     4      10    6    0    8
         3    10      10    5    0    5
 21      1     5       6    2    0    4
         2     6       3    1    0    3
         3     6       3    2    8    0
 22      1     1       7    3    0   10
         2     5       6    3    0   10
         3     7       4    2    0   10
 23      1     7       7    7    8    0
         2     7       7    7    0    2
         3     8       4    6    0    2
 24      1     1       4    7    0    4
         2     2       3    6    9    0
         3     3       3    6    0    3
 25      1     4       6    7    0    3
         2     5       5    7    0    3
         3     9       3    7    0    2
 26      1     5       3    6    0    7
         2     5       2    6    5    0
         3     6       2    5    0    7
 27      1     3       4    4    5    0
         2     4       2    3    0    4
         3     9       2    3    5    0
 28      1     5       9    4    0    6
         2     5       9    3    5    0
         3     6       7    2    4    0
 29      1     1       8    4    6    0
         2     6       6    4    5    0
         3     8       5    3    0    5
 30      1     1       9    5    9    0
         2     6       9    4    0   10
         3     7       9    4    8    0
 31      1     2       8    8    0    6
         2     4       3    6    0    3
         3     8       1    3    0    1
 32      1     0       0    0    0    0
************************************************************************
RESOURCEAVAILABILITIES:
  R 1  R 2  N 1  N 2
   33   29  124  130
************************************************************************
