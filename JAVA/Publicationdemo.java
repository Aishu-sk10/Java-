class Publication
{
    String title;
    float price;
    Publication(String title,float price)
    {
        this.title=title;
        this.price=price;
    }
}
class Book extends Publication
{
    int pgc;
    Book(String title,float price, int pgc)
    {
    super(title,price);
    this.pgc=pgc;
    }

void display()
{
    System.out.println("the title = "+ title);
    System.out.println("the price= "+ price);
    System.out.println(" the pgc="+pgc);
    
}}
class Tape extends Publication
{
    float pt;
    Tape(String title,float price,float pt)
    {
        super(title,price);
        this.pt=pt;
        
    }
    void display()
    { System.out.println("the title = "+ title);
    System.out.println("the price= "+ price);
        System.out.println("the pt is = "+pt);
        
    }
}
class Publicationdemo
{
    public static void main (String[] args) {
        Book p1= new Book("wise and otherwise",45.02f,25);
        p1.display();
        Tape p2 = new Tape("wise and otherwise",23.23f,2.33f);
    
        p2.display();
        
        
    }
}