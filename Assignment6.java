import java.util.Scanner;

public class Assignment6 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter number between 0-2");
        number=input.nextInt();
        if(number == 0){
            System.out.println("Zero");
        }else if (number==1){
            System.out.println("One");
        }else if (number==2){
            System.out.println("Two");
        }else {
            System.out.println("Invalid Digit");
        }

}}
