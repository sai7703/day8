class Student{
int rollno;
String name;
static String college="MTIET";
static void change(){
college="ITS";}
Student(int i,String n){
rollno=i;
name=n;
}
void display(){
System.out.println(rollno+" "+name+"  "+college);
}}
class Static2{  
public static void main(String args[]){  
Student.change();
     
Student s1 = new Student(111,"sai");  
Student s2 = new Student(222,"kirito");  
Student s3 = new Student(333,"taki");   
s1.display();  
s2.display();  
s3.display();  
}  }
