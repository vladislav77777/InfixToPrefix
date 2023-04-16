# InfixToPrefix
You are given mathematical expressions specified in infix notation with two prefix functions (minand max). Your task is to evaluate this expression using shunting yard algorithm.

Your implementation must include Stack ADT (as an interface or an abstract class) and its implementation. You may also use Queue ADT and its implementation to connect the converted reverse Polish notation with the evaluator.

Input
The single line of input contains correct mathematical expression. The expression contains only single-digit decimal number (e.g. 0, 5, 9), subtraction (-), division (/), multiplication (*), addition (+) operators,
left and right parentheses, maximum and minimum functions with two arguments: max ( <arg1> , <arg2> ) and min ( <arg1> , <arg2> )
All tokens are separated by spaces.
Output
Print the integer value of the input expression.

Examples
input
1 + 2 * min ( 3 , 5 ) - 4 / 2
output
5
input
1 + 2 + 3 + 4 + 5
output
15
input
1 * 4 / 2 * 6 / 3
output
4
input
3 - 2 - 1
output
0
