import java.util.*;
class Main {
  public static void main (String[] args) {
    int a,b;
Scanner sp=new Scanner(System.in);
System.out.println("Enter the value of a & b");
a=sp.nextInt();
b=sp.nextInt();
System.out.println("Before swapping" +a +b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping" +a +b);
  }
}
