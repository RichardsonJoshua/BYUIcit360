package JSONExample;

import java.io.File;
import org.json.simple.JSONObject;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON {

    public static void main(String[] args) {
        
        Scanner  input = new Scanner(System.in); 
        //Prompt the user
        System.out.println("Enter thing number: ");
        //Store answer
        int number  = input.nextInt();
        
        // create a new JSON object
        JSONObject thing1 = new JSONObject();
        
        // put the number with the number
        thing1.put("number", number);
        
        
        JSONArray name = new JSONArray();
        
        while(true){

            // create a JSON object and array and store a class object in it
            JSONObject thing = new JSONObject();
            
            thing.put("name", name);
            
            
            name.add(thing);
        }
        
        // add the array to the thing1 object
        thing1.put("name", name);
        
        System.out.println(thing1).toJSONString());
        
       
        File file = new File("ThingInformation.txt");
        
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(thing1.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        
        System.out.println("File created\n\n Press Return to continue");
        System.out.println();
        
        //Send the updated info back to JSON
        try {
            Scanner jsonInput = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
           while (jsonInput.hasNextLine()) {
               jsonIn.append(jsonInput.nextLine());
           }
            System.out.println(jsonIn.toString());
            input.nextLine();
            
            JSONParser parser = new JSONParser();
            
            JSONObject object1 = (JSONObject) parser.parse(jsonIn.toString());
            
            System.out.printf("Thing name is %s\n", object1.get("name").toString());
            
            JSONArray names = (JSONArray) object1.get("name");
            
            for (int i = 0; i < names.size(); i++) {
                JSONObject numberIn = (JSONObject) numberIn.get(i);
                String nameIn = (String) nameIn.get("name");
                System.out.printf("name: %s \n", nameIn);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
}
