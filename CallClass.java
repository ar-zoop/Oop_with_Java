class OuterClass {
    void looping(){
        for(int i=0; i<5;i++){
            class InnerClass{
                void printFromInnerClass(){
                    System.out.println("Hello from the inner class");
                }
            }
            InnerClass ic= new InnerClass();
            ic.printFromInnerClass();
        }   
    }
}

public class CallClass{
    static public void main(String[] args){
        OuterClass oc =new OuterClass();
        oc.looping();
    }
}
