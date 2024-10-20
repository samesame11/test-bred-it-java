import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public List<Integer> process(List<Integer> numberList, int chunk) {
        List<Integer> result = new ArrayList<>(); // List to store the sums of each chunk

        // Loop through the list with steps of 'chunk'
        for (int i = 0; i < numberList.size(); i += chunk) {
            int sum = 0; // Initialize the sum for this chunk

            // Loop through the current chunk
            for (int j = i; j < i + chunk; j++) {
                // Check if j is within the bounds of the list
                if (j < numberList.size()) {
                    sum += numberList.get(j); // Add the current number to the sum
                }
            }
            result.add(sum); // Add the sum of this chunk to the result list
        }

        return result; // Return the list of sums
    }

    public static void main(String[] args) {
        Test2 test = new Test2(); // Create an instance of Test2
        
        // Example inputs
        List<Integer> input1 = List.of(1, 2, 3, 4, 5);
        System.out.println("Output 1: " + test.process(input1, 2)); 

        List<Integer> input2 = List.of(1, 2, 3, 4, 5);
        System.out.println("Output 2: " + test.process(input2, 3)); 

        List<Integer> input3 = List.of(1, 2, 3, 4, 5);
        System.out.println("Output 3: " + test.process(input3, 4)); 

        List<Integer> input4 = List.of(1, 2, 3, 4, 5);
        System.out.println("Output 3: " + test.process(input4, 5)); 
    }
}
