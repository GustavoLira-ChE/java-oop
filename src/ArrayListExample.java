import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList <String> cars = new ArrayList<String>();

        // Add items
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Access an Item
        System.out.println(cars.get(1));

        //Change an item
        cars.set(0, "Volkswagen");
        System.out.println(cars);

        //Array's size
        System.out.println(cars.size());

        //Remove an item
        cars.remove(2);
        System.out.println(cars);

        //Remove all items
        cars.clear();
        System.out.println(cars);

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(49);
        myNumbers.add(39);
        myNumbers.add(23);
        myNumbers.add(99);

        System.out.println(myNumbers);
        for (int i = 0; i < myNumbers.size(); i++){
            System.out.println(myNumbers.get(i));
        }
        Collections.sort(myNumbers);  // Sort myNumbers
        System.out.println("Sort myNumbers");
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
