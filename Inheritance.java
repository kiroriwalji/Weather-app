class A {
    void display(){
        System.out.println("hello parent");
        
    }
}
class B extends A{
    void show(){
        System.out.println("Hello child ");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B k = new B();
        k.show();
        k.display();
    }
}