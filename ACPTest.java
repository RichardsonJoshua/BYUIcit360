import java.util.HashMap;

public class AppControllerTesting {
    
    HashMap<String, Handler> handlerMap = new HashMap<>();

    
    public AppControllerTesting() {
        TestHandler test = new TestHandler();
        mapCommand("test", test);

       
    }


   
    public void handleRequest(String command, HashMap<String,Object> data){
        Handler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handle(data);
        }
        else {
            System.out.println("Invalid command");
        }
    }

    public void mapCommand(String aCommand, Handler acHandler){
        handlerMap.put(aCommand,acHandler);
    }

    public static void runTests() {
        AppControllerTesting act = new AppControllerTesting();
        HashMap<String,Object> testMap = new HashMap<>();
        testMap.put("Alpha", "Alex Ovechkin");
        testMap.put("Beta", "Sidney Crosby");
        testMap.put("Gamma", "John Tavares");
        testMap.put("Delta", "Jamie Benn");
        act.handleRequest("test", testMap);

        act.handleRequest("other", testMap);
    }

    public static void main(String[] args) {
        runTests();
    }
}
