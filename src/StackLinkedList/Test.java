package StackLinkedList;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("item1");
        stack.push("item2");
        System.out.println(stack.pop());
        stack.push("item3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
