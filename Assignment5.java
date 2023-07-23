import java.util.Scanner;

public class Assignment5 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int age;

        System.out.println("Please enter your age=");
        age=input.nextInt();
        System.out.println("Voter age is="+age);

        if(age>=18){
            System.out.println("Valid Voter");
        }
        else{
            System.out.println("Invalid voter");
        }


    }
}
