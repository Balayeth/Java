import java.util.Scanner;

public class Triangle {
    public static void main(String[]args){

        Scanner input= new Scanner (System.in);

        double A,b,h;

        System.out.print("Please enter the base in meter=");
        b=input.nextInt();

        System.out.print("Please enter the height in meter=");
        h=input.nextInt();
        A=0.5*b*h;
        System.out.print("The Area of the triangle ="+A);





}}
