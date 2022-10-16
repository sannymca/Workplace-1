 import java.util.*;
 public class Ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter Your Choice");
        System.out.println("1.Charcter to Ascii");
        System.out.println("2.Ascii to Charcter");
     //   System.out.println("3.Wrong choice.");
        int Choice=sc.nextInt();
        switch(Choice)
        {
            case 1:
                System.out.println("Enter a Single charcter");
                char ch=sc.next().charAt(0);
                int Ascii=(int)ch;
            
              System.out.println("Ascii value is "+Ascii);
              break;
              case 2:
                  System.out.println("Enter a Integer");
                  
                  int n=sc.nextInt();
                  char ch1=(char)n;
                  System.out.println("Integer to Charcter "+ch1);
                  break;
                  default:
                  System.out.println("Wrong choise");
      
              }
    }
    }
}