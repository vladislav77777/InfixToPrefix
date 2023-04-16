# InfixToPrefix
You are given mathematical expressions specified in infix notation with two prefix functions (minand max). Your task is to evaluate this expression using shunting yard algorithm.<br>

Your implementation must include Stack ADT (as an interface or an abstract class) and its implementation. You may also use Queue ADT and its implementation to connect the converted reverse Polish notation with the evaluator.

Input<br>
The single line of input contains correct mathematical expression. The expression contains only single-digit decimal number (e.g. 0, 5, 9), subtraction (-), division (/), multiplication (*), addition (+) operators, left and right parentheses, maximum and minimum functions with two arguments: max ( <arg1> , <arg2> ) and min ( <arg1> , <arg2> )<br>
All tokens are separated by spaces.
Output<br>
Print the integer value of the input expression.<br>
<br>
Examples:<br>
<br>
input<br>
1 + 2 * min ( 3 , 5 ) - 4 / 2<br>
output<br>
5<br>
input<br>
1 + 2 + 3 + 4 + 5<br>
output<br>
15<br>
input<br>
1 * 4 / 2 * 6 / 3<br>
output<br>
4<br>
input<br>
3 - 2 - 1<br>
output<br>
0<br>
