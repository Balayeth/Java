import java.util.Scanner;

public class Assignment4 {

public static void main(String[]args){

    Scanner input=new Scanner(System.in);
    int iPhone18,numberofInstallment,installmentpermonth;


    System.out.println("Please enter the phone price=");
    iPhone18=input.nextInt();
    System.out.println("IPhone18="+iPhone18);

    System.out.println("Please enter the number of installment=");
    numberofInstallment=input.nextInt();
    System.out.println("Number of Installment="+numberofInstallment);

    installmentpermonth=iPhone18/numberofInstallment;
    System.out.println("Installment Amount Per Month="+installmentpermonth);


}}
