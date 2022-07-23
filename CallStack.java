//Chpter 6
//Stack class

import java.util.* ;

class Stack{

    public int s1[]=new int [10];
    public int top=-1;
    void push(int data){
        if(top>=9){
            System.out.println("Overflow");
        }
        else{
            s1[++top]= data;
        }
    }
     
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
        }
        else{
            System.out.println(s1[top]+" has been popped");
            top--;
        }
    }
    void display(){
        if(top==-1){
            System.out.println("Underflow");
        }
        else{
            for(int i=0;i<top+1;i++){
                System.out.print(s1[i]+" ");
            }
            System.out.println();
        }
    }
};

class CallStack{
    public static void main(String[] args){
        Stack stack1 =new Stack();
        stack1.pop();
        stack1.push(1);
        stack1.push(2);
        stack1.display();
        stack1.pop();
        stack1.pop();
        stack1.display();
    }
};