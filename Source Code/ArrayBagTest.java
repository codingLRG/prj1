import java.util.Arrays;

public class ArrayBagTest<T> extends ResizableArrayBag<T> {
    public static void main(String[] args) {
        System.out.println("Hello World.");
        BagInterface<Integer> bag1 = new ResizableArrayBag<Integer>();
        BagInterface<Integer> bag2 = new ResizableArrayBag<Integer>();
        for (int x = 0; x < 3; x++) {
            bag1.add(x);
            bag2.add(x + 2);
        }
        System.out.println(Arrays.toString(bag1.toArray()));
        System.out.println(Arrays.toString(bag2.toArray()));

        BagInterface<Integer> bag3 = bag1.union(bag2);
        System.out.println(Arrays.toString(bag3.toArray()));
    }

}