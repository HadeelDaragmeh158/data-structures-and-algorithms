/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GetMax;

public class App {

    public static void main(String[] args) {

        MaxStack stack = new MaxStack();
        stack.push(1);
        stack.push(5);
        stack.push(15);
        stack.push(3);
        stack.push(9);
        stack.push(100);
        stack.push(20);

        System.out.println(stack);
        System.out.println("Max is : ");
        System.out.println(stack.getMax());
    }

}
