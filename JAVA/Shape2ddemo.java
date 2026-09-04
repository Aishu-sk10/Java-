abstract class Shape2d
{
    double a;
    double b;
    abstract void area();
    abstract void display();
}
class Rectangle extends Shape2d
{
    double area1;
    Rectangle()
    {
        a=23.0;
        b=1.0;
    }
    void area()
    {
        area1 = a*b;
         
    }
    void display()
    {
        System.out.println("calculated area = " + area1);
    }
}
class Triangle extends Shape2d
{
    double area2;
    Triangle()
    {
        a=50.0;
        b=1.0;
    }
    void area()
    {
        area2=0.5*a*b;
        
    }
    void display()
    {
        System.out.println("calcualted area ="+ area2);
    }
}
class Shape2ddemo
{
    public static void main (String[] args) {
        Rectangle r = new Rectangle();
       r.area();
       r.display();
       Triangle t = new Triangle();
       t.area();
       t.display();
       
    }
}