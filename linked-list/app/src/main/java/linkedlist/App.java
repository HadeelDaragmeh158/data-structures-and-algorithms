/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

public class App {

    public static void main(String[] args) {
        LinkedList <Integer> List = new LinkedList<Integer>();
        System.out.println("\ninsert\n");

        List.insert(8);
        List.insert(5);
        List.insert(5);
        List.insert(15);
       // System.out.println("item number is "+List.getItemsNumber());

        System.out.println("\ninclude ");
        System.out.println("The include bool" + List.includes( 8));
        System.out.println("The include bool" + List.includes(1));
        System.out.println("To String  "+List.ToString());
        //System.out.println("item number is "+List.getItemsNumber());

        System.out.println("\n Append ");
        List.append(20);
        System.out.println("To String  "+List.ToString());
     //   System.out.println("item number is "+List.getItemsNumber());

        System.out.println("\n insertBefor ");
        List.insertBefor(5, 12);
        System.out.println("To String  "+List.ToString());
       // System.out.println("item number is "+List.getItemsNumber());

        System.out.println("\n insertAfter ");
        List.insertAfter(8,27);
        System.out.println("To String insertAfter "+List.ToString());
       // System.out.println("item number is "+List.getItemsNumber());

        System.out.println("\n kthFromEnd ");
        System.out.println(List.kthFromEnd(8));
        System.out.println(List.kthFromEnd(5));

    }
}
