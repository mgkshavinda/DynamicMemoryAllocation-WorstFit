import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] memoryBlocks = {100, 500, 200, 300, 600}; // Available memory block sizes
        int[] requests = {212, 417, 112, 426}; // Memory allocation requests

        WorstFitAllocation worstFitAllocation = new WorstFitAllocation();

        int[] allocation = worstFitAllocation.worstFit(memoryBlocks, requests);

        // Print Results
        System.out.println("Memory Blocks after Allocation: " + Arrays.toString(memoryBlocks));
        System.out.println("Allocation Results: " + Arrays.toString(allocation));
    }
}
