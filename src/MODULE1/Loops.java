package MODULE1;


public class Loops {

    public static void main(String[] args) {
        
        // Example of for-each loop
        // The for-each loop is used to iterate over elements in an array or collection
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("-------------------------");

        // Example of do-while loop
        // The do-while loop will run at least once, even if the condition is false
        int count = 1;
        System.out.println("Using do-while loop:");
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);
    }
}
