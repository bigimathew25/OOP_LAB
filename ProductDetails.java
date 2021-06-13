import java.util.*;

class Product
{
    int pcode;
    String pname;
    double price;

    void setData(int code,String name,double prc )
    {
        pcode=code;
        pname=name;
        price=prc;       
    }
    void getData()
    {
        System.out.println("Product name : "+pname);
        System.out.println("Product code : "+pcode);
        System.out.println("Product price : "+price);
        System.out.println(" "); 
    }
    void lowprice(Product p1,Product p2)
    {
        if(price<=p1.price && price<=p2.price)
            System.out.println("Product1 has the lowest price with price value : " +price);  
        else if (p1.price<=price && p1.price<=p2.price)  
            System.out.println("Product2 has the lowest price with price value : " +p1.price);  
        else  
            System.out.println("Product3 has the lowest price with price value : " + p2.price);  
    }
}
class ProductDetails 
{
    public static void main(String args [ ]) 
    {
        Scanner sc=new Scanner(System.in);
        int code;
        double price;
        String name;
        Product prod1=new Product();
        Product prod2=new Product();
        Product prod3=new Product();
        System.out.println("Enter the details of first product ");
        System.out.print("Enter the Product name : ");
        name=sc.nextLine();
        System.out.print("Enter the Product code : ");
        code=sc.nextInt();
        System.out.print("Enter the Product price : ");
        price=sc.nextDouble();
        prod1.setData(code, name, price);
        System.out.println(" "); 

        System.out.println("Enter the details of second product ");
        sc.nextLine();
        System.out.print("Enter the Product name : ");
        name=sc.nextLine();
        System.out.print("Enter the Product code : ");
        code=sc.nextInt();
        System.out.print("Enter the Product price : ");
        price=sc.nextDouble();
        prod2.setData(code, name, price);
        System.out.println(" "); 

        System.out.println("Enter the details of third product ");
        sc.nextLine();
        System.out.print("Enter the Product name : ");
        name=sc.nextLine();
        System.out.print("Enter the Product code : ");
        code=sc.nextInt();
        System.out.print("Enter the Product price : ");
        price=sc.nextDouble();
        prod3.setData(code, name, price);
        System.out.println(" "); 

        System.out.println("Product 1 ");
        prod1.getData();
        System.out.println("Product 2 ");
        prod2.getData();
        System.out.println("Product 3 ");
        prod3.getData();

        prod1.lowprice(prod2, prod3);

    }
}