import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get memory blocks from the usercle
        System.out.println("Enter the number of memory blocks: ");
        int blockCount = scanner.nextInt();
        int[] memoryBlocks = new int[blockCount];
        System.out.println("Enter the sizes of the memory blocks:");

        for (int i = 0; i < blockCount; i++) {
            System.out.print("Block " + (i + 1) + ": ");
            memoryBlocks[i] = scanner.nextInt();
        }

        // Get memory requests from the user
        System.out.print("\nEnter the number of memory allocation requests: ");
        int requestCount = scanner.nextInt();
        int[] requests = new int[requestCount];
        System.out.println("Enter the sizes of the allocation requests:");

        for (int i = 0; i < requestCount; i++) {
            System.out.print("Request " + (i + 1) + ": ");
            requests[i] = scanner.nextInt();
        }

        
        WorstFitAllocation worstFitAllocation = new WorstFitAllocation();
        int[] allocation = worstFitAllocation.worstFit(memoryBlocks, requests);

        // Print Results
        System.out.println("Memory Blocks after Allocation: " + Arrays.toString(memoryBlocks));
        System.out.println("Allocation Results: " + Arrays.toString(allocation));

        // Print detailed allocation summary
        System.out.println("\nAllocation Details:");

        for (int i = 0; i < requests.length; i++) {
            if (allocation[i] != -1) {
                System.out.println("Request " + requests[i] + " allocated to Block " + (allocation[i] + 1));
            } else {
                System.out.println("Request " + requests[i] + " could not be allocated.");
            }
        }

        scanner.close();
    }
}
