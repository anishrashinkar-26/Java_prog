public class EXP_5_inheritance {
  /* static class Book {
    String auth, title, publ;

    public Book(String auth, String title, String publ) {
        this.auth = auth;
        this.title = title;
        this.publ = publ;
    }
}
static class bookInfo extends Book{
    int price, stockpos;

    public bookInfo(int price, int stockpos,String auth, String title, String publ) {
        super(auth , title, publ);
        this.price = price;
        this.stockpos = stockpos;
    }
    public void show(){
        System.out.println("auth = " + auth + "title = "+ title +" "+  publ+ " "+ price + "" + stockpos);
    }
}
public static void main (String[] args){
    bookInfo b = new bookInfo(300, 20, "Anish", "Book 1","Bookpub" );
    b.show();
}
*/
    //multi level:
  static class Book {
      String auth, title, publ;

      public Book(String auth, String title, String publ) {
          this.auth = auth;
          this.title = title;
          this.publ = publ;
      }
  }
    static class bookInfo extends Book{
        int price, stockpos;

        public bookInfo(int price, int stockpos,String auth, String title, String publ) {
            super(auth , title, publ);
            this.price = price;
            this.stockpos = stockpos;
        }
        public void show(){
            System.out.println("auth = " + auth + "title = "+ title +" "+  publ+ " "+ price + "" + stockpos);
        }
    }
    static class BookSales extends bookInfo{
      int copies;
        public BookSales(int price, int stockpos, String auth, String title, String publ, int c) {
            super(price, stockpos, auth, title, publ);
            copies = c;
        }
        public void revenue (int price){
            System.out.println("revenue for price " + price + " and copies: "+ copies + " copies : " + copies *price );

        }

    }


    public static void main (String[] args){
        bookInfo b = new bookInfo(300, 20, "Anish", "Book 1","Bookpub" );
        b.show();
        BookSales bs = new BookSales(300, 20, "Anish", "Book 1","Bookpub" , 40);
        bs.revenue(50);
    }



}
interface FY {
String name = "Anish";

}
interface SY{
    String name = "Anish sy";

}
