class Point
{
    double x;
    double y;

Point()
{
    x=0;
    y=0;
}
Point(double x,double y)
{
    this.x=x;
    this.y=y;
}
Point(Point p)
{
this.x=p.x;
this.y=p.y;
}
 double finddistance(double x,double y)
 {
     double distance;
     distance=Math.sqrt((this.x-x ) * (this.x-x) + (this.y-y)*(this.y-y));
     return distance;
 }
 double finddistance(Point p)
 {
    double distance;
     distance=Math.sqrt((this.x-p.x ) * (this.x-p.x) + (this.y-p.y)*(this.y-p.y));
     return distance; 
 }
 
 void display()
 {
     System.out.println("("+ x +","+ y +")");
 }
}
 class Pointdemo
 {
     public static void main (String[] args) 
     {
        Point p1= new Point(3.25,7.89);
        p1.display();
        Point p2 = new Point(5.37,18.12);
        p2.display();
        Point p3 = new Point(p2);
        p3.display();
         double d1=p1.finddistance(2.3,5.2);
         double d2=p1.finddistance(p3);
         System.out.println("distance d1" + d1);
         System.out.println("distance d2" + d2);
        
     }
 }

