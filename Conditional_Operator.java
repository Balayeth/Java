import java.util.Scanner;

public class Conditional_Operator {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int x,y,large;
        System.out.print("Enter any number");
        x=input.nextInt();
        y=input.nextInt();
        large=(x>y)? x:y;
        System.out.println("Large number is "+large);

    }
}
