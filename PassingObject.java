class MethodObjectPassing{
    int a,b;
    void setValue(int n, int m){
        a=n;
        b=m;
    }
    Boolean isEquals(MethodObjectPassing o){
        if(o.a==a && o.b==b) return true;
        return false;
    }
}

class ConstructorObjectPassing{
    int a,b;
    ConstructorObjectPassing(int n, int m){
        a=n;
        b=m;
    }
    ConstructorObjectPassing(ConstructorObjectPassing o){
        a=o.a;
        b=o.b;
    }
    void display(){
        System.out.println(a+" "+ b);
    }
}

public class PassingObject {
    public static void main(String[] args){
        //Testing passing object to a method
        MethodObjectPassing ob1=new MethodObjectPassing();
        MethodObjectPassing ob2=new MethodObjectPassing();
        MethodObjectPassing ob3=new MethodObjectPassing();
        ob1.setValue(2,4);
        ob2.setValue(3,4);
        ob3.setValue(2,4);
        System.out.println(ob1.isEquals(ob2));
        System.out.println(ob1.isEquals(ob3));

        //Testing passing object constructor
        ConstructorObjectPassing ob4=new ConstructorObjectPassing(12,13);
        ConstructorObjectPassing ob5=new ConstructorObjectPassing(-1,-1);
        ob5=ob4;
        ConstructorObjectPassing ob6=new ConstructorObjectPassing(ob5);
        ob4.display();
        ob5.display();
        ob6.display();
    }
}
