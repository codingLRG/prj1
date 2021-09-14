interface Bag
{
    final int MAX_CAPACITY; 
    /*
        The size of the bag, will decide what size it is later :P 
    */

    //Dealing with bag of INTEGERS, T = int

    int getCurrentSize(); //size of bag

    boolean isEmpty(); //bag list empty

    boolean add(int t); //adding item to the bag
    /*
        If bag is full or value type does not match the bag type, 
            returns false because t could not be added
        If bag is not full and the value type does match the bag type,
            returns true as the item was successfully added 
    */

    int remove(); //removes any object from bag
    /*
        Output is the removed value, if bag is empty, return null
        For Nodes, remove the first due to efficiency
    */

    boolean remove(int t); //removes value of t
    /*
        If t is in the bag, returns true
        If t is not in the bag, returns false
    */

    void clear(); //removes all values, Thanos snap those values 
    //No return value

    int getFrequencyOf(int t); //return how many times t appears in the list
    //NOT NEEDED FOR SETS

    boolean contains(int t); //return does the list contain t

    int[] toArray(); //turns bag into an int[]

}