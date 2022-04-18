package ss11_dsa_stack_and_queue.bai_tap.bai_tap_1_dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class ReversedInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer[] array = new Integer[]{41, 2, 14, 6, 8, 9};
        for (Integer integer : array) {
            stack.push(integer);
        }
        System.out.println("Stack before reversed:");
        System.out.println(stack);

        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty()) {
            newStack.push(stack.pop());
        }
        stack = newStack;
        System.out.println("Stack after reversed: ");
        System.out.println(stack);
    }
}
