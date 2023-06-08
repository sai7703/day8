class Bike{
void run()
{
System.out.println("running");
}}
class Car extends Bike{
void run()
{
System.out.println("running safely");
}
public static void main(String args[]){
Car b;
b=new Car();
b.run();}}