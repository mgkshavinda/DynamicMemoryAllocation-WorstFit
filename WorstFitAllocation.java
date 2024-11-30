import java.util.Arrays;

public class WorstFitAllocation {
    public int [] worstFit(int[] memoryBlocks, int[] requests) {
        int[] allocation = new int[requests.length];
        Arrays.fill(allocation, -1);

        for (int i = 0; i < requests.length; i++) {
            int req = requests[i];
            int worstIndex = -1;

            // Find the largest block that can fit the request
            for (int j = 0; j < memoryBlocks.length; j++) {
                if (memoryBlocks[j] >= req) {
                    if (worstIndex == -1 || memoryBlocks[j] > memoryBlocks[worstIndex]) {
                        worstIndex = j;
                    }
                }
            }

            // Allocate memory if a suitable block is found
            if (worstIndex != -1) {
                allocation[i] = worstIndex; // Store block index
                memoryBlocks[worstIndex] -= req; // Reduce block size
            }
        }

        return allocation;
    }
}