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
    Node<T> FirsNode = new Node<>(Value);
    FirsNode.next =this.head;

    if (head==null){
        tail=FirsNode;
    }else{
        FirsNode.next.precedent=FirsNode;
    }
    this.head=FirsNode;
    itemsNumber++;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////

public  boolean includes(T value) {
    if(head == null){
        return false;
    }

    Node<T> incloudeSearch = head;

    while (incloudeSearch != null) {

        if (incloudeSearch.value == value) {
            return true;
        }
        incloudeSearch = incloudeSearch.next;
    }
    return false;

}


////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////

public String toString(){
//   Arguments: none
//   Returns: a string representing all the values in the Linked List, formatted as:
//   "{ a } -> { b } -> { c } -> NULL"
    Node<T> thePointerS=this.head;
    String Str = new String("");
    while(thePointerS != null){
        Str+="{ "+thePointerS.value+" }=> ";
        thePointerS=thePointerS.next;
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
    Node <T> node =new Node<>(value);
   try{ if (this.head == null){
        head = node ;

    }else {
 node.next =null;
    Node<T> lastOne=head;
    while(lastOne!=null){
        lastOne= lastOne.next;
    }
    lastOne.next =node;
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
    if (thisNode.value == value) {
        insert(newValue);
        itemsNumber++;
    }while(thisNode.next !=null){
        Node <T> node =new Node<>(newValue);
        if (thisNode.next.value==value){
            node.next =thisNode.next;
            thisNode.next =node;
            itemsNumber++;
            break;
            }
        thisNode=thisNode.next;
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
    Node<T> thisNode=this.head;
    Node<T> node = new Node<>(newValue);
    if (tail.value==value){
        append(newValue);
    }
    while(thisNode !=null){
        if(thisNode.value==value){
            node.next =thisNode.next;
            thisNode.next =node;
            itemsNumber++;
            break;
        }
        thisNode=thisNode.next;
     }

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////
public int getItemsNumber(){
    return itemsNumber;
}

 public T kthFromEnd(int k) {
     int index=0;
     Node<T> node =this.tail;

     try{
         while(node!=null) {
             if (index == k)
                 return (T) node.value;
             index++;
             node = node.precedent;
         }
     }catch (Exception e){
         System.out.println("Exception");;
     }
     return (T)"Exception";
 }
}
