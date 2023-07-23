import java.util.Scanner;

public class Assignment9 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int digit;
        System.out.println("Please press a digit for language selection");
        digit=input.nextInt();
    //if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english

        switch(digit){
            case 1:
                System.out.println("Bengali");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("Urdu");
                break;
            case 4:
                System.out.println("English");
                break;
            default:
                System.out.println("Please press a valid digit");


        }
    }
}
