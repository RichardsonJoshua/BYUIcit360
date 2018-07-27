import java.util.TreeSet;

public class TreeCollection {
    public static void main(String[] args){

    	//Create a tree and add elements to it
        TreeSet treeSet = new TreeSet();
        
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.add("5");
        treeSet.add("6");
        treeSet.add("7");
        treeSet.add("8");
        treeSet.add("9");
        treeSet.add("0");
        System.out.println(treeSet);

        //Print the first element in the tree
        System.out.println(treeSet.first());
        //tree sorts elements by numerical order, so first is 0

        //Does the tree contain the number 2?
        boolean test = treeSet.contains("2");
        //Yes!!
        System.out.println(test);

        //What is the size of the tree?
        System.out.println(treeSet.size());
        //size 9

        //Remove 0 and 2
        treeSet.remove("2");
        treeSet.remove("0");
        
        System.out.println(treeSet);
        
      //How many are left now?
        System.out.println(treeSet.size());
        //size 7


    }
}
