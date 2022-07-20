//Chapter 6
//Introducing Classes
import java.util.* ;
class Box{
    double width;
    double height;
    double depth;
};

class BoxDemo{
    public static void main(String args[]){
        Box mybox=new Box();
        double vol;
        mybox.width=10;
        mybox.height=20;
        mybox.depth=30;
        vol=mybox.width* mybox.height * mybox.depth;
        System.out.println(vol);
        Box mybox2=new Box();
    }
};

