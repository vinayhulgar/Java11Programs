package String;

public class StripLeading {
    public static void main(String args[]) {
      String str = "    OnlineJavaIde";
      System.out.println(str.stripLeading());
      
       String str1 = "    OnlineJavaIde   ";
      System.out.println(str1.strip());
      
      String str2 = "OnlineJavaIde   ";
      System.out.println(str2.stripTrailing());

      String str3 = "OnlineJavaIde       ";
      System.out.println(str3.stripTrailing());

      
    }
}
