package elena.hw2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int flag = 1;
            Stack stack = new Stack();
            while (flag != 0) {
                System.out.println("\n Write down:\n 1.push element\n 2.pop element\n 3.peek element");
                System.out.println(" 4.check emptiness\n 5.show stack\n 0.exit \n");
                switch (in.nextInt()) {
                    case 1:
                        System.out.println(" Write down object that you want to push");
                        stack.push(in.next());
                        stack.show();
                        break;
                    case 2:
                        Object elemPop = stack.pop();
                        if (elemPop != null) {
                            System.out.println(" Last element was " + elemPop);
                        } else {
                            System.out.println(" The stack is empty");
                        }
                        break;
                    case 3:
                        Object elemPeek = stack.peek();
                        if (elemPeek != null) {
                            System.out.println(" Last element is " + elemPeek);
                        } else {
                            System.out.println(" The stack is empty");
                        }
                        break;
                    case 4:
                        System.out.println(" Emptiness: " + stack.isEmpty());
                        break;
                    case 5:
                        stack.show();
                        break;
                    case 0:
                        flag = 0;
                        break;
                    default:
                        System.out.println(" You write something wrong");
                        break;
                }
            }
        } catch (InputMismatchException exc) {
            System.err.println("Caught InputMismatchException: ");
        }
    }
}
