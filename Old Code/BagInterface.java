public interface BagInterface<T> {
    // final int MAX_CAPACITY;
    /*
     * ^^Don't think we need this implemented actually^^
     */

    // Dealing with bag of INTEGERS, T = int

    int getCurrentSize(); // returns the size of bag

    boolean isEmpty(); // returns if the bag list empty

    boolean add(T add); // adding item to the bag
    /*
     * If bag is full or value type does not match the bag type, returns false
     * because t could not be added If bag is not full and the value type does match
     * the bag type, returns true as the item was successfully added
     */

    T remove(); // removes any object from bag
    /*
     * Output is the removed value, if bag is empty, return null For Nodes, remove
     * the first due to efficiency
     */

    boolean remove(T add); // removes value of t
    /*
     * If t is in the bag, returns true If t is not in the bag, returns false
     */

    void clear(); // removes all values, Thanos snap those values
    // No return value

    int getFrequencyOf(T frequency); // return how many times t appears in the list
    // NOT NEEDED FOR SETS

    boolean contains(T contains); // return does the list contain t

    T[] toArray(); // turns bag into an int[]

}