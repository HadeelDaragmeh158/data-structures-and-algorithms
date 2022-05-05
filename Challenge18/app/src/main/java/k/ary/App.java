/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package k.ary;

import k.ary.classes.KAray;
import k.ary.classes.Node;

public class
App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node ele1 = new Node (15);
        Node ele2 = new Node (8);
        Node ele3 = new Node (5);
        Node ele4 = new Node (27);
        Node ele5 = new Node (1);
        Node ele6 = new Node (16);
        Node ele7 = new Node (4);

        root.getNideTree().add(ele1);
        root.getNideTree().add(ele2);
        root.getNideTree().add(ele3);
        ele1.getNideTree().add(ele4);
        ele2.getNideTree().add(ele5);
        ele3.getNideTree().add(ele6);
        ele4.getNideTree().add(ele7);

        KAray Karay= new KAray(root);
        Karay.printTree(root);
        Karay.fizzBuzzTree(root);


    }
}