import java.util.Scanner;

public class Assignment7 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        char Ans;
        System.out.println("Do you love Java?");
        Ans=input.next().charAt(0);
        if(Ans=='y'|| Ans=='Y'){
            System.out.println("You are a Java lover");
        }else if (Ans=='n'|| Ans=='N'){
            System.out.println("Your are not a Java lover");
        }else{
            System.out.println("You don't know about Java/You may inserted wrong command");
        }

    }
}
