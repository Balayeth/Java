import java.util.Scanner;

public class Input_from_user {
    public static void main(String[]args) {

       Scanner number2=new Scanner(System.in);
        Scanner name=new Scanner(System.in);
        Scanner db=new Scanner(System.in);
       int num1;
       String name1;
       long db1;

       System.out.print("Enter Id No=");
        num1=number2.nextInt();
       System.out.println("Id="+num1);

        System.out.print("Enter Name=");
        name1=name.nextLine();
        System.out.println("Name="+name1);

        System.out.print("Number");
        db1=db.nextLong();
        System.out.print("Number="+db1);
    }
}
