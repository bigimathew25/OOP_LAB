import java.util.*;
class Complex
{
    double real;
    double img;
Complex()
{
    real=0.0;
    img=0.0;
}
Complex(double rp)
{
    real=rp;
    img=0.0;
}
Complex(double rp, double ip)
{
    real=rp;
    img=ip;
}

double getReal()
{
    return real;
}
double getImg()
{
    return img;
}

void setReal(double rp)
{
    real = rp;
}
void setImg(double ip)
{
    img = ip;
}
Complex plus(Complex c)
{
    Complex sum = new Complex(real + c.real, img + c.img);
    return sum;
}
} 
class ComplexAddition 
{
    public static void main(String[] args) 
    {
        double rp, ip;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of first complex number: ");
        rp = sc.nextDouble();
        ip = sc.nextDouble();
        Complex c1 = new Complex(rp, ip);

        System.out.println("Enter the real and imaginary part of second complex number: ");
        rp =sc.nextDouble();
        ip =sc.nextDouble();
        Complex c2 = new Complex(rp, ip);
        
        Complex c3 = c1.plus(c2);

        System.out.println("The first complex number is : " + c1.getReal() + "+" + c1.getImg() + "i");
        System.out.println("The second complex number is : " + c2.getReal() + "+" + c2.getImg() + "i");
        System.out.println("Sum of Complex Numbers is : " + c3.getReal() + "+" + c3.getImg() + "i");
        
    }
}


































































































