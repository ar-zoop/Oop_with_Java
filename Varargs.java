public class Varargs {
    public static void main(String[] args){
        vartest();
        vartest(1,2,3,4,5,6,7,8,9);
        vartest(true,false,true,false,true,false,true,false);
    }
    static void vartest(){
        System.out.println("In vartest 1");
    }
    static void vartest(boolean ... b){
        System.out.println("In vartest 2. Datatype= boolean");
        for (boolean x : b){
            System.out.println(x);
        }
    }
    static void vartest(int ... i){
        System.out.println("In vartest 3. Datatype= int");
        for (int x : i){
            System.out.println(x);
        }
    }
}
