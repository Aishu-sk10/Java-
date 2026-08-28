class Book
{
    String bkname;
    int bkid;
    String bkauthor;
    Book(String bkname,int bkid,String bkauthor)
    {
        this.bkname=bkname;
        this.bkid=bkid;
        this.bkauthor=bkauthor;
    }
    void Bkupdatedetails(String bkname,int bkid,String bkauthor)
    {
        this.bkname=bkname;
        this.bkid=bkid;
        this.bkauthor=bkauthor;
    }
    void bkdisplay()
    {
        System.out.println("bookname=" + bkname);
        System.out.println("bookid = "+bkid);
        System.out.println("bookauthor =" + bkauthor);
    }
}
class Bookdetails
{
  public static void main (String[] args)
  {
      Book b1=new Book("wise and otherwise",452,"sudha murthy");
      b1.Bkupdatedetails("wings of fire",235,"apj abdul kALAM");
      b1.bkdisplay();
        
    }
}