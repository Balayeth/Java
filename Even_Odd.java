import java.util.Scanner;

public class Even_Odd {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
    int num;
    System.out.println("Enter the number=");
    num=input.nextInt();
    if(num%2==0){
        System.out.println("Even");
    }
    else{
        System.out.print("Odd");
    }

}}
