# Stacks and Queues
Stack class and Queue class in the same packege with super Node class 

## Challenge
write strucrure queue and stack with testing 
Queue class to add from front and remove from the first elemente
Stack class to add in top

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
#### Stack Big O:
- Time O(n)
- Space O(n)

#### Queue Big O:
- Time O(n)
- Space O(n)

## API
<!-- Description of each method publicly available to your Stack and Queue--> 
#### Queue
- enqueue
    Arguments: value
    adds a new node with that value to the back of the queue with an O(1) Time performance.
- dequeue
    Arguments: none
    Returns: the value from node from the front of the queue
    Removes the node from the front of the queue
    Should raise exception when called on empty queue
- peek
    Arguments: none
    Returns: Value of the node located at the front of the queue
    Should raise exception when called on empty stack
- is empty
    Arguments: none
    Returns: Boolean indicating whether or not the queue is empty
    
  
 #### Stack methods:
- push
    Arguments: value
    adds a new node with that value to the top of the stack with an O(1) Time performance.
- pop
    Arguments: none
    Returns: the value from node from the top of the stack
    Removes the node from the top of the stack
    Should raise exception when called on empty stack
- peek
    Arguments: none
    Returns: Value of the node located at the top of the stack
    Should raise exception when called on empty stack
- is empty
    Arguments: none
    Returns: Boolean indicating whether or not the stack is empty.
    
