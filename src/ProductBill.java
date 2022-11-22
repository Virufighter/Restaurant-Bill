import java.util.ArrayList;
import java.util.Scanner;

public class ProductBill {
    String id;
    String pName;
    int qty;
    double price;
    double total_price;

    public ProductBill(String id,String pName, int qty, double price, double total_price) {
        this.id=id;
        this.pName = pName;
        this.qty = qty;
        this.price = price;
        this.total_price = total_price;
    }
    public static void  displayFormat(){
        System.out.println("\tId \t\tProduct name \t\t quantity \t\t\t price \t\t\t\t total price\n ");

    }
    public void display(){
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n",id, pName, qty, price, total_price);
    }

    public static void main(String[] args) {
        String id = null;
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;
        char choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the customer name");
        String c=sc.next();
        System.out.println("enter the phone number");
        String c1=sc.next();
        ArrayList<ProductBill> par=new ArrayList<ProductBill>();
        do{
            System.out.println("enter the id");
            id= sc.next();
            System.out.println("enter the product name");
            productName= sc.next();
            System.out.println("enter the quantity");
            quantity= sc.nextInt();
            System.out.println("enter the product price");
            price=sc.nextDouble();
            totalPrice=quantity*price;
            overAllPrice = overAllPrice + totalPrice;
            ProductBill p=new ProductBill(id,productName,quantity,price,totalPrice);
            par.add(p);
            System.out.println("do you want to continue 'y' for yes and 'n' for no");
            choice =sc.next().charAt(0);
        }while (choice=='y' || choice=='Y');
        System.out.println("\nCustomer Name : "+c+"\n"+"Phone Number"+c1+"n");
        ProductBill.displayFormat();
        for (ProductBill p:par){
            p.display();
        }
        System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);

    }
}
