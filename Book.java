class Author{
String authorname;
int age;
String place;
Author(String name,int age,String place)
{
this.authorname=name;
this.age=age;
this.place=place;
}}
class Book
{
String name;
int price;
Author auther;
Book(String n,int p,Author auther)
{
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String args[]){
Author auther=new Author("john green",34,"USA");
Book b=new Book("the fault in our stars",300,auther);
System.out.println("Book name  :"+b.name);
System.out.println("Book price  :"+b.price);
System.out.println(" ----------Author Details----------");
System.out.println("Author Name:"+b.auther.authorname);
System.out.println("Author Age:"+b.auther.age);
System.out.println("Author place:"+b.auther.place);}
}

