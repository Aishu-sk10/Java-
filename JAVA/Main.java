class Mobilephone
{
    int modelnumber;
    String manufacturename;
    int cost;
    int size;
    String colour;
    int memcapacity;
    int campixel;
    Mobilephone()
    {
        System.out.println("default constrictor called");
    }
    Mobilephone(int modelnumber,String manufacturename,int cost,int size,String colour,int memcapacity,int campixel)
    {
        this.modelnumber=modelnumber;
        this.manufacturename=manufacturename;
        this.cost=cost;
        this.size=size;
        this.colour=colour;
        this.memcapacity=memcapacity;
        this.campixel=campixel;
    }
    void display()
    {
        System.out.println("modelnumber = "+modelnumber);
        System.out.println("manufacturename = "+manufacturename);
        System.out.println("cost = "+cost);
        System.out.println("size = "+size);
        System.out.println("colour = "+colour);
        System.out.println("memcapacity = "+memcapacity);
        System.out.println("campixel = "+campixel);
        
    }
}
class Main
{
    public static void main(String args[])
    {
        Mobilephone m1=new Mobilephone();
        Mobilephone m2= new Mobilephone(45,"vivio",450000,45,"black",45,23);
        m2.display();
    }
}