import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int Num1,Num2,Num3,Result,num1,num2;

        Num1=10;
        Num2=200;
        Num3=30;

        Result=Num1+Num2;
        System.out.println("Sum="+Result);
        Result=Num2+Num3-Num1;
        System.out.println("Sum="+Result);

        double Result2=Num2/Num3;
        System.out.println("Sum="+Result2);
        double Result1=(double)Num2/Num3;
        System.out.println("Sum="+Result1);

        System.out.println("Enter number1=");
        num1=input.nextInt();
        System.out.println("Enter number2=");
        num2=input.nextInt();
        Result=num1+num2;
        System.out.println("Sum="+Result);


    }
}
