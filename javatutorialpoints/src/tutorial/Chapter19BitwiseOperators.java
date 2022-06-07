package tutorial;

public class Chapter19BitwiseOperators {
}

/*
Bitwise Operators
- work on binary digits/bits of input values
- operands converted to binary then operator applied then converted back to decimal

Two Types of Bitwise Operators:
- Bitwise Logical
    - OR(|): Gives 1 if either is 1, return true; otherwise zero or false
    - AND(&): Gives 1 if both is 1, return true; otherwise zero or false
    - XOR(^): Gives 1 if bits are different, return true; otherise zero or false
    - NOT(~): Give opposite of each bit in integer, only takes one integer
- Bitwise Shift
    - value <operator> <number_of_times>
    - Signed Left Shift [<<]: similar to 2^n, shift bits to left. add 0s to the right
    - Signed Right Shift [>>]: input is negative, then empty spaces are 1s, if input is positive then empty spaces are 0s
    - Unsigned Right Shift [>>>]: input sign is negligible, always fill empty space with 0s

Logical v. Bitwise Operators:
- logical works on boolean return true/false bitwise works on binary digits (int, short, char, byte) return integer
- logical evaluates 1st boolean expression before MAYBE 2nd boolean expression, bitwise evaluates both operands always
- logical used for decisions with multiple conditions, bitwise perform bit by bit operations


Real Life Cases for Bitwise Operators:
- Communication stacks where individual bits of headers attached to data has important info
- Embedded system (set/clear/toggle) one single bit instead of all the bits
- Encrypt data for safety issues using XOR operator
- Data compression to convert data to another representation, reduce amount of space used



 */
