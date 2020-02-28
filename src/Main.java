public class Main {

    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
//        stack.pop();
        stack.peek();
        stack.show();
        stack.pop();
        System.out.println("____________________");
        stack.show();
        stack.push(12);
        System.out.println("____________________");
        stack.show();
        stack.pop();
        System.out.println("____________________");
        stack.show();

    }
}
