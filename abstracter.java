import java.util.*;
class abstracter{
    public static float radius=10f;
    public static void main(String[] args){
        circle obj1= new circle();
        square obj2= new square();
        System.out.println(obj1.area(10f));
        System.out.println(obj2.area(11f));
    }
    
}
class circle{
    float area(float r){
        return 3.14f*r*r;
    }
}

class square{
    float area(float l){
        return l*l;
    }
}