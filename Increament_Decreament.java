public class Increament_Decreament {
    public static void main(String[]args){

        int a,b,c,x,y,z,a1,b1,c1,x1,y1,z1;
         x=20; // Post Increament
        y=x++;
        System.out.println("y="+y);
        z=x++;
        System.out.println("z="+z);
        a=x++;
        System.out.println("a="+a);
        b=x++;
        System.out.println("b="+b);
        c=x;
        System.out.println("c="+c);


        x1=20; //pre increament
        y1=++x1;
        System.out.println("y1="+y1);
        z1=++x1;
        System.out.println("z1="+z1);
        a1=++x1;
        System.out.println("a1="+a1);
        b1=++x1;
        System.out.println("b1="+b1);
        c1=++x1;
        System.out.println("c1="+c1);

        System.out.println("Here the result of Decreament");


        x=20; // Post Decreament
        y=x--;
        System.out.println("y="+y);
        z=x--;
        System.out.println("z="+z);
        a=x--;
        System.out.println("a="+a);
        b=x--;
        System.out.println("b="+b);
        c=x--;
        System.out.println("c="+c);


        x1=20; //pre Decreament
        y1=--x1;
        System.out.println("y1="+y1);
        z1=--x1;
        System.out.println("z1="+z1);
        a1=--x1;
        System.out.println("a1="+a1);
        b1=--x1;
        System.out.println("b1="+b1);
        c1=--x1;
        System.out.println("c1="+c1);
    }
}
