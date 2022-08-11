import java.util.*;
class DemoOverload{
    void Demo(){
        System.out.println("pass1");
    }
    void Demo(int a){
        System.out.println("pass2");
    }
    void Demo(double a , double b){
        System.out.println("pass3");
    }
    void Demo(int a, int b){
        System.out.println("pass4");        
    }
}
class MethodOverloading{
    public static void main(String args[]){
        DemoOverload d1=new DemoOverload();
        DemoOverload d2=new DemoOverload();
        DemoOverload d3=new DemoOverload();
        DemoOverload d4=new DemoOverload();
        d1.Demo();
        d2.Demo(1);
        d3.Demo(2,3.4);
        d4.Demo(2.3, 4.5);
    }
}