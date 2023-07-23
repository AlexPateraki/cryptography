# cryptography
Implementing an algorithm for solving constraint satisfaction problems, and use it to try finding solutions for the following cryptarithmetic puzzles:
I. "TO + TO = FOR" in the hexadecimal numeral system.
II. "TOO + TOO = FOR" also in the hexadecimal numeral system.
III. "WON + WON = TOO" in the decimal numeral system.

The basic steps followed for implementing the algorithm were as follows:
1)Defining an array according to the base.
2)Finding permutations ( using three functions: printAllRecursive, swap, and printArray). 
The main idea for the second step was taken from the website https://www.baeldung.com/java-array-permutations.
3)Calculating equality functions between the letters for each permutation and applying suitable encoding using if statements to isolate the constants.
4)Returning the result.
