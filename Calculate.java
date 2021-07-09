import java.util.Scanner;
import java.io.*;

public class Calculate implements ScientificCalculator {
    
    
    public double c;
    
public double d;

  
    public  double add()  {
  
        try {
            System.out.print("ENTER YOUR NUM 1 : ");
            Scanner input = new Scanner(System.in);
            double c=input.nextDouble();
            System.out.print("enter your  num 2 : " );
           FileWriter   f = new FileWriter("file.txt");
            BufferedWriter b=new BufferedWriter(f);
            double d=input.nextDouble();
            double result;
            result=c+d;   
            System.out.println("your addition result is : "+result);
            b.write(" enterd num 1 : "+c+" and num 2: "+d+"\n  addition result  is : "+ Double.toString(result));
           
            b.close();
            return result;
        } catch (IOException ex) {
           System.out.println(" an error  occured "+ex);
        } 
      return 0;
    
     
    }

   
    
    public double subtract()  {
        
        try {
            FileWriter   f  = new FileWriter("file.txt");
            BufferedWriter b=new BufferedWriter(f);
            System.out.println("ENTER YOUR NUM 1 : ");
            Scanner input = new Scanner(System.in);
            double c=input.nextDouble();
            System.out.println("enter your  num 2 : " );
            double d=input.nextDouble();
            double result;
            result=c-d;
            System.out.println("your subtract result is : "+result);
            b.write(" enterd num 1 : "+c+" and num 2: "+d+"\n  substraction result  is : "+ Double.toString(result));
           
            b.close();
            return result;
        } catch (IOException ex) {
             System.out.println(" an error  occured "+ex);
        } 
        
        return 0;
    }
    
    
    public double multiply()  {
          try {
            FileWriter   f  = new FileWriter("file.txt");
            BufferedWriter b=new BufferedWriter(f);
            System.out.println("ENTER YOUR NUM 1 : ");
            Scanner input = new Scanner(System.in);
            double c=input.nextDouble();
            System.out.println("enter your  num 2 : " );
            double d=input.nextDouble();
            double result;
            result=c*d;
            System.out.println("your multiplication result is : "+result);
            b.write(" enterd num 1 : "+c+" and num 2: "+d+"\n  multiplication result  is : "+ Double.toString(result));
           
            b.close();
            return result;
        } catch (IOException ex) {
             System.out.println(" an error  occured "+ex);
        } 
        
        return 0;
    }
		
    


    public double division()  {
        try {
            FileWriter   f  = new FileWriter("file.txt");
            BufferedWriter b=new BufferedWriter(f);
            System.out.println("ENTER YOUR NUM 1 : ");
            Scanner input = new Scanner(System.in);
            double c=input.nextDouble();
            System.out.println("enter your  num 2 : " );
            double d=input.nextDouble();
            double result;
            result=c/d;
            System.out.println("your devision result is : "+result);
            b.write(" enterd num 1 : "+c+" and num 2: "+d+"\n  devision  is : "+ Double.toString(result));
           
            b.close();
            return result;
        } catch (IOException ex) {
             System.out.println(" an error  occured "+ex);
        } 
        
        return 0;
    }
    public double XtoY() {
        
         try {
            FileWriter   f  = new FileWriter("file.txt");
            BufferedWriter b=new BufferedWriter(f);
            System.out.print("ENTER YOUR NUM  : ");
        Scanner input = new Scanner(System.in);
        double c=input.nextDouble();
        System.out.print("enter your  power : " );
       
        double d=input.nextDouble();
        double result;
        result=(double)Math.pow(c,d);
        System.out.println(" "+c+" to the power ( ^ ) "+d+ " is " +result);
       
            b.write(" enterd num  : "+c+" and power ( ^ ): "+d+"\n   result  is : "+ Double.toString(result));
           
            b.close();
            return result;
        } catch (IOException ex) {
             System.out.println(" an error  occured "+ex);
        } 
        
        return 0;
    }
        
        
        
public double log() {
        
        try {
            FileWriter   f  = new FileWriter("file.txt");
            BufferedWriter b=new BufferedWriter(f);
            System.out.print("ENTER YOUR NUM  : ");
        Scanner input = new Scanner(System.in);
       
       
        double c=input.nextDouble();
        double result;
        result=(double)Math.log(c);
        System.out.println("log of " +c+ " is "+result);
            b.write(" log of : "+c+" , result  is : "+ Double.toString(result));
           
            b.close();
            return result;
        } catch (IOException ex) {
             System.out.println(" an error  occured "+ex);
        } 
        
        return 0;
    }
} 