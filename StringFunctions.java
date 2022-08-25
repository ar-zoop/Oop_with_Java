//equals(), charAt(), length(), String array
public class StringFunctions{
    public static void main(String[] args){
        String[] arr= new String[3];
        arr[0]="Hi";
        arr[1]="Hi";
        arr[2]="World";
        System.out.println(arr[0].equals(arr[1]));
        System.out.println(arr[2].charAt(2));
        System.out.println(arr[2].length());
    }
}