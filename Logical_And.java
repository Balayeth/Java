import java.util.Scanner;
public class Logical_And {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        char letter;
        System.out.print("Enter a letter");
        letter=input.next().charAt(0);
        if(letter>='a'&& letter<='z'){
            System.out.println("small letter");
        }else if (letter>='A'&& letter<='Z'){
            System.out.println("Capital Letter");
        }else {
            System.out.println("Not any letter");
        }
}}
