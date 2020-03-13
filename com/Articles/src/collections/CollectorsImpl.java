package collections;

import java.util.stream.Collectors;
public class CollectorsImpl {
    public static void main(String args[]) {
      String str = "OnlineJavaIde";
      System.out.println(str.
      lines().collect(Collectors.toList()));
      
      
    }
}
