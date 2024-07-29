fun birthday(arr: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var count = 0

    for (i in 0..arr.size - m) {
        val sum = arr.sliceArray(i until i + m).sum()
        if (sum == d) count++
    }


    return count
}

fun main(args: Array<String>) {
/*
     You will need to sand an array with n size, and with this array you will need to sum the values in a fixed interval
     for example : 2+5+1+3+4+4+3 / 5+1+3+4+4+3+5 ...
*/
    val s = arrayOf(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1)
    val d = 18
    val m = 7

    val result = birthday(s, d, m)

    println(result)
}

/*
* Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

    The length of the segment matches Ron's birth month, and,
    The sum of the integers on the squares is equal to his birth day.

Determine how many ways she can divide the chocolate.

Example


Lily wants to find segments summing to Ron's birth day, with a length equalling his birth month, . In this case, there are two segments meeting her criteria: and

.

Function Description

Complete the birthday function in the editor below.

birthday has the following parameter(s):

    int s[n]: the numbers on each of the squares of chocolate
    int d: Ron's birth day
    int m: Ron's birth month

Returns

    int: the number of ways the bar can be divided

Input Format

The first line contains an integer
, the number of squares in the chocolate bar.
The second line contains space-separated integers , the numbers on the chocolate squares where .
The third line contains two space-separated integers, and

, Ron's birth day and his birth month.

Constraints

, where (
)

Sample Input 0

5
1 2 1 3 2
3 2

Sample Output 0

2

*/