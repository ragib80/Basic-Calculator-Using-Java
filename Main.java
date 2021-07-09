import java.util.Scanner;
import java.io.*;

public class Main {


   public static void main (String[] args) throws IOException{
      
       
 while(true){
       Scanner scan = new Scanner(System.in);
       System.out.println("Please ENTER your oppertation:\n 1: add \n 2: sub \n 3: mul \n 4: div \n 5: pow\n 6: log\n 7:exit\n");
      String op=scan.next();
     Calculate cl=new Calculate();
     int count=0;
     
    
     switch(op){
         
         
    
     case "1" : 
         cl.add();
         System.out.println(" " );
         break;
        
         
     
     case "2":
         cl.subtract();
         System.out.println(" " );
         break;
         
     case "3":
         cl.multiply();
         System.out.println(" " );
          break;
          
     case "4":
         cl.division();
         System.out.println(" " );
         break;
         
     case "5":
         cl.XtoY();
         System.out.println(" " );
       break;
       
       case"6":
           cl.log();
           System.out.println(" ");
           break;
       
     case "7":
         System.out.println("you are exiting now ! ");
         System.exit(0);
         break;
     default: 
         System.out.println(" in valid opperation, chosse again !!");
   
   }
     
         
   
   } 

}
}