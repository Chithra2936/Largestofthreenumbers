
import java.util.Scanner;
public class LargestUsingElseIf{
    private static Scanner sc;
    public static void main(String[] args){
        int x,y,z;
        sc=new Scanner(System.in);
        System.out.println("\n Please enter three different value:");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>y&&x>z){
            System.out.format("n%d is Greater than both %d and %d",x,y,z);
        }
        else if(y>x&&y>z)
        {
            System.out.format("n%d is Greater than both %d and %d",y,x,z);
    }
    else if(z>x&&z>y){

        System.out.format("n%d is Greater than both %d and %d",z,x,y);
        }
    
    else{
        System.out.println("\nEither any two values or all the three values are equal");
        }
    }

        
    }
