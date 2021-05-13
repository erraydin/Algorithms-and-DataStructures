package StackLinkedList;

public class Test {
    public static void main(String[] args) {
        StackOfStrings stack = new StackOfStrings();
        stack.push("item1");
        stack.push("item2");
        System.out.println(stack.pop());
        stack.push("item3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
