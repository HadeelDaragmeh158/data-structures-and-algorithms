/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testBt(){
        BinaryTree bt =new BinaryTree();
        bt.setRoot(new Node<>(5));
        bt.getRoot().setLeftNode(new Node<> (8));
        bt.getRoot().setRightNode(new Node<>(15));
        bt.getRoot().getLeftNode().setLeftNode(new Node<>(1));
        bt.getRoot().getLeftNode().setRightNode(new Node<> (27));

        assertEquals("BinaryTree{root  5  8  1  27  15}", bt.toString() );
    }
    @Test
    void postTestt(){
        BinaryTree postTest = new BinaryTree<>();
        postTest.setRoot(new Node<>(5));
        postTest.getRoot().setLeftNode(new Node <>(8));
        postTest.getRoot().setRightNode(new Node<>(15));
        postTest.getRoot().getLeftNode().setLeftNode(new Node<>(1));
        postTest.getRoot().getLeftNode().setRightNode(new Node <>(27));
        postTest.postOrder(postTest.getRoot());

        assertEquals("[1, 27, 8, 15, 5]", String.valueOf(postTest.getPostOrder()));
    }

    @Test void inTestt(){
        BinaryTree inTest = new BinaryTree<>();
        inTest.setRoot(new Node<>(5));
        inTest.getRoot().setLeftNode(new Node<> (8));
        inTest.getRoot().setRightNode(new Node<>(15));
        inTest.getRoot().getLeftNode().setLeftNode(new Node<>(1));
        inTest.getRoot().getLeftNode().setRightNode(new Node<> (27));
        inTest.inOrder(inTest.getRoot());

        assertEquals("[1, 8, 27, 5, 15]", String.valueOf(inTest.getInOrder()));
    }

    @Test void preTestt(){
        BinaryTree preTest = new BinaryTree<>();
        preTest.setRoot(new Node<>(5));
        preTest.getRoot().setLeftNode(new Node<> (8));
        preTest.getRoot().setRightNode(new Node<>(15));
        preTest.getRoot().getLeftNode().setLeftNode(new Node<>(1));
        preTest.getRoot().getLeftNode().setRightNode(new Node<> (27));
        preTest.preOrder(preTest.getRoot());

        assertEquals("[5, 8, 1, 27, 15]", String.valueOf(preTest.getPreOrder()));
    }
    @Test
    void testBST(){
        BinarySearchTree bst = new BinarySearchTree(new Node<>(1) );
        bst.add(5);
        bst.add(15);
        bst.add(20);
        bst.add(21);
        bst.add( 22);
        bst.add(23);
        System.out.println(bst);

        assertEquals("BinarySearchTree{root= 1  5  15  20  21  22  23}",bst.toString() );
    }
    @Test
    void testBSTMax(){
        BinarySearchTree bst = new BinarySearchTree(new Node<>(100) );
        bst.add(5);
        bst.add(15);
        bst.add(55);
        bst.add(225);

        assertEquals(225,bst.getMax() );
    }
    @Test
    void testBF(){
        BinarySearchTree bst = new BinarySearchTree(new Node<>(100) );
        bst.add(5);
        bst.add(15);
        bst.add(55);
        bst.add(225);
        System.out.println(bst.breadthFirst());
        assertEquals("[100, 5, 225, 15, 55]",String.valueOf(bst.breadthFirst() ));
    }


}
