# GoldenRatio
Golden Ratio Approximation

This project demonstrates how to approximate the Golden Ratio (φ ≈ 1.6180339887...) using continued fractions in Java.
The program takes an integer n as input and recursively computes:

𝑔
(
𝑛
)
=
1
+
1
𝑔
(
𝑛
−
1
)
,
𝑔
(
0
)
=
1
g(n)=1+
g(n−1)
1
	​
## How It Works

The method golden(int n) computes the approximation:

- Base case: g(0) = 1

- Recursive step: g(n) = 1 + 1 / g(n-1)

The main method:

- Reads an integer n from user input

- Prints the result of golden(n)
,g(0)=1

As n increases, the result converges closer to the true Golden Ratio.
