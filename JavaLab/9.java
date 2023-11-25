
class  h{
    public static void main(String[] args) {
        
    }
}   
abstract class Shape {
    int a,b;
    abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(int lenght,int breath){
        super.a = lenght;
        super.b = breath; 
    }
    @Override
    void printArea() {
        System.out.println(a*b);
    }
}
class Triangle extends Shape{
    Triangle(int lenght,int breath){
        super.a = lenght;
        super.b = breath; 
    }
    @Override
    void printArea() {
        System.out.println(0.5*a*b);
    }
}
class Circle extends Shape{
    Circle(int lenght,int breath){
        super.a = lenght;
    }
    @Override
    void printArea() {
        System.out.println(Math.PI*a*a);
    }
}