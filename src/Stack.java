public class Stack {
    private int size=1000;
    private int arr[]=new int[size];
    private int top=-1;
//TODO:push element
    public void push(int data){
        if (isFull()){
            System.out.println("Stack Full");
        }
        else {
            top++;
            arr[top]=data;
        }


    }
    //TODO:pop element

    public void pop(){
        if (isEmpty()){
            System.out.println("Stack Empty");
        }else{
            top--;
        }

    }
    //TODO:peek element

    public void peek(){
        if (isEmpty()){
            System.out.println("Stack Empty");
        }else {
            System.out.println("element at top "+arr[top]);
        }


    }
    //TODO:check for empty array

    public boolean isEmpty(){

        if (top==-1){
            return true;

        }

            return false;


    }
    //TODO:check full

    public boolean isFull(){

        if (top==arr.length-1){
            return true;
        }

        return false;


    }
    public void show(){
        if (isEmpty())
        {
            System.out.println("Stack Empty");
        }else{

            for (int i=top;i>=0;i--){

                System.out.println(arr[i]);
            }
        }


    }

}
