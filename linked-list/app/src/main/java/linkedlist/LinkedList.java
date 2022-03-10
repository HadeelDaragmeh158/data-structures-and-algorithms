package linkedlist;

public class LinkedList <T>{
    Node<T> head =null;
    Node<T> tail=null;
//its for me
    int itemsNumber=0;

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
public void insert(T Value ){
//    Arguments: value
//    Returns: nothing
//    Adds a new node with that value to the head of the list with an O(1) Time performance.
    Node FirsNode = new Node(Value);
    FirsNode.Next=this.head;
    if (this.head==null){
        this.tail=FirsNode;
    }else{
        FirsNode.Next.precedent=FirsNode;
    }
    this.head=FirsNode;
    itemsNumber++;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////

public  Boolean includes(T Value){
//    Arguments: value
//    Returns: Boolean
//    Indicates whether that value exists as a Node’s value somewhere within the list.
    Node thePointer =this.head;
    boolean result=false;
    while(thePointer!=null )
    {
        if(thePointer.Value==Value){
            result=true;
            break;
        }

        thePointer=thePointer.Next;
    }
    return result;
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////

public String ToString(){
//   Arguments: none
//   Returns: a string representing all the values in the Linked List, formatted as:
//   "{ a } -> { b } -> { c } -> NULL"
    Node thePointerS=this.head;
    String Str = new String("");
    while(thePointerS != null){
        Str+="{ "+thePointerS.Value+" }=> ";
        thePointerS=thePointerS.Next;
    }

    Str+="{NULL}";
    return Str;
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
public void append(T value){
//arguments: new value
//adds a new node with the given value to the end of the list
    Node <T> node =new Node(value);
   try{ if (this.head == null){
        head = node ;
    }else {
 node.Next=null;
    Node lastOne=head;
    while(lastOne!=null){
        lastOne= lastOne.Next;
    }
    lastOne.Next=node;
    itemsNumber++;
    }}catch (NullPointerException e){
       System.out.println("NullPointerException");
   }

}
/////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////

public void  insertBefor(T value , T newValue ) {
//arguments: value, new value
//adds a new node with the given new value immediately before the
// first node that has the value specified
    Node<T> thisNode = this.head;
    if (thisNode.Value == value) {
        insert(newValue);
    }while(thisNode.Next!=null){
        Node <T> node =new Node<>(newValue);
        if (thisNode.Next.Value==value){
            node.Next=thisNode.Next;
            thisNode.Next=node;break;
            }
        thisNode=thisNode.Next;
        itemsNumber++;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void insertAfter (T value, T newValue) {
//arguments: value, new value
//adds a new node with the given new value
// immediately after the first node that has the value specified
    Node thisNode=this.head;
    Node node = new Node (newValue);
    if (tail.Value==value){
        append(newValue);

    }
    while(thisNode !=null){
        if(thisNode.Value==value){
            node.Next=thisNode.Next;
            thisNode.Next=node;break;
        }
        thisNode=thisNode.Next;
     }
        itemsNumber++;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////

//    public T   kthFromEnd(int k){
    //    argument: a number, k, as a parameter.
    //Return the node’s value that is k places from the tail of the linked list.
    //You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.
//    int length =0;
//    Node node =this.head;
//
//
//    }
}
