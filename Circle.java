import java.util.Scanner;
public class Circle {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        double A,r;
        System.out.print("Please enter the radius in meter=");
        r=input.nextDouble();
        A=3.1417*r*r;
        System.out.print("The area of the round share is="+A);

    }
}
