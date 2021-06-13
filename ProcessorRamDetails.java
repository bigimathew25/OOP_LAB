import java.util.*;
class CPU
{
    float price;
    RAM rob;
    Processor pob;
    CPU(float p, String rammemory, String rammanufacturer, String pmanufacturer, String pcore)
    {
        price = p;
        rob = new RAM(rammemory, rammanufacturer);
        pob = new Processor(pcore, pmanufacturer);
    }
    
    static class RAM
    { 
        String rammanufacturer;
        String rammemory;
        RAM( String rammemory, String rammanufacturer)
        {  
            this.rammanufacturer = rammanufacturer;
            this.rammemory = rammemory;
        }
        void rdisplay()
        {
            System.out.println("Details of RAM");
            System.out.println("RAM Memory = " + rammemory);
            System.out.println("RAM manufacturer = " + rammanufacturer);
            System.out.println(" ");
            
        }
    }
    class Processor
    {
        String pcore;
        String pmanufacturer;
        Processor(String pcore, String pmanufacturer)
        {  
            this.pcore = pcore;
            this.pmanufacturer = pmanufacturer;
        }
        void pdisplay()
        {
            System.out.println("Details of Processor");
            System.out.println("Processor Core = " + pcore);
            System.out.println("Processor manufacturer = " + pmanufacturer);
            
        }
    }
    void display()
    {
        System.out.println("Details of CPU");
        System.out.println("CPU Price = " + price);
        System.out.println(" ");
        rob.rdisplay();
        pob.pdisplay();
        
    }
}
        
    
class ProcessorRamDetails
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        float price;
        String rammemory, rammanufacturer, pcore, pmanufacturer;
        
        System.out.println("Enter the details of CPU");
        sc.nextLine();
        System.out.print("Enter the CPU price: ");
        price = sc.nextFloat();
        System.out.println(" ");
        
        System.out.println("Enter the details of RAM");
        sc.nextLine();
        System.out.print("Enter the RAM Manufacturer: ");
        rammanufacturer = sc.nextLine();
        System.out.print("Enter the RAM Memory: ");
        rammemory = sc.nextLine();
        System.out.println(" ");
        
        System.out.println("Enter the details of Processor");
        sc.nextLine();
        System.out.print("Enter the Processor Core: ");
        pcore = sc.nextLine();
        System.out.print("Enter the Processor Manufacturer: ");
        pmanufacturer = sc.nextLine();
        System.out.println(" ");

       CPU cpu1 = new CPU(price, rammemory, rammanufacturer, pmanufacturer, pcore);
       cpu1.display();
       
    }

}