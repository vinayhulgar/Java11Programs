package collections;

import java.util.ArrayList;
import java.util.List;


/*

*/
public class VarImpl {
    public static void main(String args[]) {
      var list = List.of("1","3");
      var copy = List.copyOf(list);
      System.out.println(list == copy);

      var list2 = new ArrayList<>();
      var copy2 = List.copyOf(list2);
      System.out.println(list2 == copy2);
      
    }
}