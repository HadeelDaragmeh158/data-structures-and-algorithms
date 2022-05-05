/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package k.ary;

import k.ary.classes.KAray;
import k.ary.classes.Node;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
@Test
    void testKTee(){
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
    Karay.fizzBuzzTree(root);
    Karay.printTree(root);
    assertEquals(
            "2 -> FizzBuzz,Node{value=8},buzz,"+
                    "15 -> Fizz,"+
                    "27 -> Node{value=4},"+
                    "        4 ->"+
                    "        8 -> Node{value=1},"+
                    "        1 -> "+
                    "        5 -> Node{value=16},"+
                    "        16 -> "+
                    "        2 --> Node{value=15},Node{value=8},Node{value=5},"+
                    "15 --> Node{value=27},"+
                    "27 --> Node{value=4},"+
                    "4 --> "+
                    "8 --> Node{value=1},"+
                    "1 --> "+
                    "5 --> Node{value=16},"+
                    "16 -->"
         ,
                 "2 -> FizzBuzz,Node{value=8},buzz,"+
                "15 -> Fizz,"+
                "27 -> Node{value=4},"+
        "        4 ->"+
        "        8 -> Node{value=1},"+
        "        1 -> "+
        "        5 -> Node{value=16},"+
        "        16 -> "+
        "        2 --> Node{value=15},Node{value=8},Node{value=5},"+
                "15 --> Node{value=27},"+
                "27 --> Node{value=4},"+
                "4 --> "+
                "8 --> Node{value=1},"+
                "1 --> "+
                "5 --> Node{value=16},"+
                "16 -->"
    );
}
}
