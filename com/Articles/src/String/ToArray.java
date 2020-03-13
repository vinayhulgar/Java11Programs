package String;

import java.util.ArrayList;
import java.util.List;

public class ToArray {
    public static void main(String args[]) {
      
     List<String> names = new ArrayList<>();
        names.add("alex");
        names.add("brian");
        names.add("charles");
 
        String[] namesArr1 = names.toArray(new String[names.size()]);       //Before Java 11
        String[] namesArr2 = names.toArray(String[]::new);                  //Since Java 11

        System.out.println(namesArr1);
        System.out.println(namesArr2);
    }
}
