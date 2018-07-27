import java.util.LinkedList;

public class ListCollection {
    public static void main(String[] args) {

    	//Create a list of 5 names
        LinkedList list1 = new LinkedList();
        list1.push("Dominic");
        list1.push("Josh");
        list1.push("Marisol");
        list1.push("Alejandro");
        list1.push("Yadira");
        System.out.println(list1);
        
        //Remove the second entry in the list
        list1.remove(1);
        System.out.println(list1);

        //pop out the first entry
        System.out.println(list1.pop());
        //all that is left is the 3 names of the family

        

        //add to the front of the list everyone's respective age
        list1.push(1);
        list1.push(27);
        list1.push(24);
        System.out.println(list1);

        //Add the last name to the end of the list
        list1.addLast("Richardson");
        System.out.println(list1);

        //Pull out my name
        System.out.println(list1.get(4));



    }
}
