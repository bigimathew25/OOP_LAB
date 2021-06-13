class Rectangle
{
    float length;
    float breadth;

    void setData(float l, float b)
    {
       length = l;
       breadth = b;
    }


    float getArea()
    {

         return length * breadth;
    }

}

class RectangleArea
{

   public static void main(String args[])
   {
     
      Rectangle R1 = new Rectangle();
      R1.setData(12.4f,13f);
      float area1 = R1.getArea();
      System.out.println("Area of first rectangle = " + area1);

      Rectangle R2 = new Rectangle();
      R2.setData(10.5f,9f);
      float area2 = R2.getArea();
      System.out.println("Area of second rectangle = " + area2);

      Rectangle R3 = new Rectangle();
      R3.setData(13f,14f);
      float area3 = R3.getArea();
      System.out.println("Area of third rectangle = " + area3);

   }
}