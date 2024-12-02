# DynamicMemoryAllocation-WorstFit

This project implements the **Worst Fit** algorithm for dynamic memory allocation in Java. The Worst Fit algorithm assigns memory to the largest available block to minimize the likelihood of fragmenting memory into small unusable blocks.

## Features

- Simulates dynamic memory allocation using the Worst Fit algorithm.
- Allows users to manually input memory block sizes and allocation requests at runtime.
- Provides clear feedback if invalid input is entered.
- Outputs allocation details, including which memory block each request is allocated to, and remaining block sizes after allocation.

## How It Works

1. The user specifies the number of memory blocks and their sizes.
2. The user specifies the number of allocation requests and their sizes.
3. The program dynamically allocates memory requests to the largest available block using the Worst Fit algorithm.
4. If a request cannot be allocated, it remains unallocated, and the user is notified.


## Example Execution

### Input
```plaintext
Enter the number of memory blocks: 5
Enter the sizes of the memory blocks (positive integers):
Block 1: 100
Block 2: 500
Block 3: 200
Block 4: 300
Block 5: 600

Enter the number of memory allocation requests: 4
Enter the sizes of the allocation requests (positive integers):
Request 1: 212
Request 2: 417
Request 3: 112
Request 4: 426
