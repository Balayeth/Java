import java.util.Scanner;

public class Fahrenhit_And_Celsius {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        double celcius,Fahrenhit;
        System.out.print("Please write down the temperature of BD in celcius=");
        celcius=input.nextInt();
        Fahrenhit=1.8*celcius+32;
        System.out.println("The temperature of BD in Fahnethit is ="+Fahrenhit);

        System.out.print("Please enter the temperature of Canada in Fahrenhit=");
        Fahrenhit=input.nextInt();
        celcius=0.555555555556*(Fahrenhit-32);
        System.out.print("The temperature of Canada in celsius is="+celcius);






    }
}
