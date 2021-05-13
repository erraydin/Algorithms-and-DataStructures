package StackArray;

public class Test {
    public static void main(String[] args) {
        StackOfStrings stack = new StackOfStrings(12);
        stack.push("item1");
        stack.push("item2");
        System.out.println(stack.pop());
        stack.push("item3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
