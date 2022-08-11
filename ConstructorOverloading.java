class BoxDemo{
    BoxDemo(){
        System.out.println("pass1");
    }
    BoxDemo(int a){
        System.out.println("pass2");
    }
    BoxDemo(int a, int b){
        System.out.println("pass3");
    }
    BoxDemo(double a, double b){
        System.out.println("pass4");
    }
    BoxDemo(BoxDemo){
        
    }
}
public class ConstructorOverloading {
    public static void main(String[] args){
        BoxDemo b1= new BoxDemo();
        BoxDemo b2= new BoxDemo(1);
        BoxDemo b3= new BoxDemo(1,2);
        BoxDemo b4= new BoxDemo(1.1, 3.4);
        b1=b2;
        b1.BoxDemo;
    }
}

