package String;

import java.util.*;


public class Lines {
    public static void main(String args[]) {
      
      String testString = "hello\nworld\nis\nexecuted";
 
        List<String> lines = new ArrayList<>();
 
        testString.lines().forEach(line -> lines.add(line));
 
        System.out.println(lines);
    }
}
