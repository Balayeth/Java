import java.util.Scanner;
public class Logical_Or {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        char letter;
        System.out.print("Enter a letter");
        letter=input.next().charAt(0);
        if(letter=='a' || letter=='e'|| letter=='i'|| letter=='o' || letter=='u' ){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }}
