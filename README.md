Tower of Hanoi - Java Implementation

This project is a simple Java implementation of the classic Tower of Hanoi problem using recursion. It demonstrates the fundamental concept of recursion in solving mathematical and algorithmic problems.

🧠 Problem Statement

The Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move the entire stack from the source rod to the destination rod, obeying the following rules:

1. Only one disk can be moved at a time.


2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.


3. No larger disk may be placed on top of a smaller disk.

📂 Project Structure

📁 TowerOfHanoi
 └── Recursion.java

📌 Key Concepts Used

Recursion

Divide and Conquer Algorithm

Backtracking (Conceptual)

🧾 Code Explanation

towersOfHanoi(int n, String src, String helper, String dest):

Recursive method to solve the problem.

Moves n-1 disks to the helper rod, moves the last disk to the destination, then moves the n-1 disks from helper to destination.


main(String[] args):

Driver method to call the recursive function with n = 3 and rods labeled "S", "H", and "D" (Source, Helper, Destination).

📌 Sample Output

For n = 3, the output will be:

Transfer disk 1 from S to D
Transfer disk 2 from S to H
Transfer disk 1 from D to H
Transfer disk 3 from S to D
Transfer disk 1 from H to S
Transfer disk 2 from H to D
Transfer disk 1 from S to D

✅ How to Run

1. Make sure you have Java installed.


2. Compile the code:

javac Recursion.java


3. Run the program:

java Recursion

📚 References
Java Recursion Concepts
🧑‍💻 Author

Kushagra Pandey
Java Enthusiast
