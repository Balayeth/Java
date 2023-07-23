import java.util.Scanner;

public class Assignment8 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        char Ans,Ans2;
        System.out.println("Have you completed your MBA?");
        Ans=input.next().charAt(0);
        System.out.println("Are you fluent at English?");
        Ans2=input.next().charAt(0);
        if(Ans=='Y' && Ans2=='Y'){
            System.out.println("You are eligible for the job");
        } else{
            System.out.println("Sorry, you are not eligible for the job. Work hard and try again");
        }
}}
