import java.util.Scanner;

public class Assignment3 {
    public static void main(String[]args){

        Scanner id=new Scanner(System.in);
        Scanner title=new Scanner(System.in);
        Scanner price=new Scanner(System.in);
        Scanner description=new Scanner(System.in);
        Scanner category=new Scanner(System.in);

        long id1;
        String title1;
        double price1;
        String description1;
        String category1;

        System.out.println("Enter you id");
        id1=id.nextInt();

        System.out.println("Enter the title");
        title1=title.nextLine();

        System.out.println("Give the price in Taka");
        price1=price.nextDouble();

        System.out.println("Product description");
        description1=description.nextLine();

        System.out.println("Select Category");
        category1=category.nextLine();

        System.out.println("Id="+id1);
        System.out.println("Title="+title1);
        System.out.println("Price="+price1);
        System.out.println("Description="+description1);
        System.out.println("Categoty="+category1);


    }
}
