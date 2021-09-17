import java.util.Arrays;
import java.lang.Integer;

public class ArrayBagTest<T> extends ResizableArrayBag<T> {
    public static void main(String[] args) {
        System.out.println("Hello World.");
        BagInterface<String> bag1 = new ResizableArrayBag<String>();
        BagInterface<String> bag2 = new ResizableArrayBag<String>();
        for (int x = 0; x < 3; x++) {
            bag1.add(Integer.toString(x));
            bag2.add(Integer.toString(x + 2));
        }
        System.out.println("Bag1: " + Arrays.toString(bag1.toArray()));
        System.out.println("Bag2: " + Arrays.toString(bag2.toArray()));

        BagInterface<String> bag3 = bag1.union(bag2);
        System.out.println("Union: " + Arrays.toString(bag3.toArray()));

        BagInterface<String> bag4 = bag1.difference(bag2);
        System.out.println("Difference: " + Arrays.toString(bag4.toArray()));

        BagInterface<String> bag5 = bag1.intersection(bag2);
        System.out.println("Intersection: " + Arrays.toString(bag5.toArray()));
    }

}