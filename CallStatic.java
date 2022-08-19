import java.util.*;
class UseStatic {
    static int a, b=3;
    static{
        System.out.println("We're in UseStatic");
        // System.out.println("This is called  first");
        System.out.println("b= "+b);
        System.out.println("a= "+a);
        a=b*4;
        System.out.println("a=b*4= "+a);

    }
    static void printingStaticVars(){
        System.out.println("a= "+ a);
        System.out.println("b= "+b);
    }
    
}

class CallStatic{
    static{
        System.out.println("We're in CallStatic");
        UseStatic.printingStaticVars();
        System.out.println("We're leaving CallStatic");
    }
    public static void main(String[] args){
        // UseStatic obj= new UseStatic();
        UseStatic.printingStaticVars();
    }
}