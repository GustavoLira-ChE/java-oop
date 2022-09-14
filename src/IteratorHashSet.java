import java.util.HashSet;
import java.util.Iterator;

public class IteratorHashSet {
    public static void main(String[] args){
        HashSet<Integer> myNumbers = new HashSet<Integer>();
        myNumbers.add(73);
        myNumbers.add(26);
        myNumbers.add(22);
        myNumbers.add(434);
        myNumbers.add(32);
        myNumbers.add(123);

        Iterator<Integer> i = myNumbers.iterator();
        System.out.println(i.next());
        while (i.hasNext()){
            int currentI = i.next();
            if (currentI > 100){
                System.out.println("Number " + currentI + " is going to be removed");
                i.remove();
            }
            System.out.println(currentI);
        }
        System.out.println(myNumbers);
    }
}
