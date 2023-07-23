import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[]args){

        int x=4,y=8,z=2;

        x+=z;
        System.out.println("Write the result of x="+x);
        x-=z;
        System.out.println("Write the result of x="+x);
        x*=z;
        System.out.println("Write the result of x="+x);
        x/=z;
        System.out.println("Write the result of x="+x);
        x%=y;
        System.out.println("Write the result of x="+x);

        Scanner input=new Scanner(System.in);
        int x1,y1,z1;
        System.out.println("Please insert the value of x1=");
        x1=input.nextInt();

        System.out.println("Please insert the value of y1=");
        y1=input.nextInt();

        System.out.println("Please insert the value of z1=");
        z1=input.nextInt();

        x1+=y1;
        System.out.println("X+Y="+x1);

        x1-=y1;
        System.out.println("X-Y="+x1);

        x1*=y1;
        System.out.println("X*Y="+x1);

        x1/=z1;
        System.out.println("X/Z="+x1);

        x1%=z1;
        System.out.println("X%Z="+x1);

        //y1=input.nextInt();
       // z1=input.nextInt();



    }
}
