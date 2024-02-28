import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class  Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye"
        int index = scottishIslands.indexOf("Skye");
        System.out.println("Index: " + index);

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop
            for (int i = 0; i<scottishIslands.size(); i++)
            {
                scottishIslands.get(i);
            }
        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i<numbers.size(); i++)
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(numbers.get(i));
            }
        System.out.println("Even numbers:" + evenNumbers);

//        2. Print the difference between the largest and smallest value
            int largest = numbers.get(0);
            int smallest = numbers.get(0);
        for (int newNum : numbers)
            {
                if (newNum < smallest)
                {
                    smallest = newNum;
                }
                if (newNum > largest)
                {
                    largest = newNum;
                }
            }
                System.out.println(largest - smallest);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
                boolean result = false;
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == 1 && numbers.get(i + 1) == 1)
                    {
                        result = true;
                    }
                }
                    System.out.println(result);

//        4. Print the sum of the numbers,
                int sum = 0;
                for (int i = 0; i<numbers.size(); i++)
                {
                    sum = sum + numbers.get(i);
                }
                System.out.println("Sum: " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
            int sumOfNums = 0;
                for (int i = 0; i < numbers.size(); i++)
                {
                    if (numbers.get(i) == 13) {
                        break;
                    }
                    else {
                        sumOfNums = sumOfNums + numbers.get(i);
                    }
                }
                System.out.println(sumOfNums);
    }
}