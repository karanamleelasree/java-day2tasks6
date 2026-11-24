class Book {
    String title ;
    double price;
    Book(){
        title = "UNKOWN";
        price = 0.0;
    }
    Book(String title){
        this.title=title;
        price =0.0;
    }
    Book(String title , double price){
        this.title = title;
        this.price = price;
    }
    void display(){
        System.out.println("title:"+title);
        System.out.println("Price:"+price);
    }
    
}
class Main3{
    public static void main(String args[]){
        Book b1 = new Book("Jungle Book");
        Book b2 = new Book("Jungle Book", 200);
        Book b3 = new Book();
        b1.display();
        b2.display();
        b3.display();
    }
}
