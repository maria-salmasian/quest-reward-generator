# Quest Reward Generator

This Java application generates a string of rewards based on a logistic function and a deterministic pseudo-random function. The rewards are represented by characters 'b' and 's', indicating "big rewards" and "small rewards" respectively.

## Overview

The program uses a logistic function to create a smooth transition of reward probabilities around the midpoint of the generated string. The rewards are determined by comparing a deterministic pseudo-random value with the logistic function value at each position in the string.

## Files

- `Main.java`: The main Java file containing the reward generation logic.

## Usage

### Prerequisites

- Java Development Kit (JDK) 17 or above

### Compilation

To compile the program, use the following command:

```sh
javac Main.java
```
### Execution

To execute the program, use the following command:

```sh
java Main.java
```
The program generates a reward string of length 100 and prints it to the console.

## Code Explanation

### Constants and Variables

- `STEEPNESS`: Controls the steepness of the logistic curve. Adjusting this value can change the reward distribution. Larger values are suitable for small datasets, while smaller values are better for larger datasets.

### Methods

- `questRewardGenerator(int n)`: Generates a string of length `n` with rewards 'b' and 's'.
    - Parameters:
        - `int n`: The number of rewards to generate.
    - Returns:
        - `String`: The generated reward string.

- `logistic(int x, int n)`: Computes the logistic function value for a given `x` and `n`.
    - Parameters:
        - `int x`: The current index in the range `0` to `n-1`.
        - `int n`: The total number of rewards.
    - Returns:
        - `double`: The value of the logistic function at the given index.

    The logistic function is used to determine the probability of generating a 'b'  versus 's' 
    at each position in the reward string. This allows for a controlled distribution of rewards based on a smooth, sigmoidal curve defined by the logistic function's parameters (STEEPNESS and midpoint n/2.0). Adjusting these parameters can effectively change how rewards are distributed, which may be useful depending on the application and dataset characteristics.

### Main Method

The main method initializes `n` to `100`, calls `questRewardGenerator(n)` to generate the reward string, and prints the result.

## Customization

- You can change the length of the reward string by modifying the value of `n` in the `main` method.
- You can adjust the `STEEPNESS` constant to control the steepness of the logistic curve, affecting the distribution of rewards.
