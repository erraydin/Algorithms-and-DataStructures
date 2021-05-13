package StackArray;

public class Test {
    public static void main(String[] args) {
        StackOfStrings stack = new StackOfStrings();
        stack.push("item1");
        stack.push("item2");
        stack.push("item3");
        stack.push("item4");
        stack.push("item5");
        stack.push("item6");
        stack.push("item7");
        stack.push("item8");
        stack.push("item9");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
