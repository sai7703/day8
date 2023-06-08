class Student{
int rollno;
String name;
static String college="MTIET";
Student(int i,String n){
rollno=i;
name=n;
}
void display(){
System.out.println(rollno+" "+name+"  "+college);
}}
class Static1{
public static void main(String args[]){
Student s=new Student(111,"sai");
Student r=new Student(121,"kirito");
s.display();
r.display();
}}
