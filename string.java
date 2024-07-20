import java.util.*;
class string{
 public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   String value = sc.next();
   int v = value.length();
   int c = 5235;
   float b = 34.2342f;
 //   int v1 = value.toLowercase();
   System.out.println(value);
    System.out.println(v);
    System.out.printf("the value of c is:%d and the value of of b is: %f",c,b);
    System.out.println(value.toLowerCase());
    System.out.println(value.toUpperCase());
    String  san ="Prasanthi";
    System.out.println(san.replace("Pra","san"));
    String van ="            fas";
    System.out.println(van.trim());
    System.out.println(value.indexOf("ssa"));
  }
 }
