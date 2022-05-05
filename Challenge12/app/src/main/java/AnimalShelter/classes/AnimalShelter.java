package AnimalShelter.classes;

public class AnimalShelter {
  private Queue<Animal> catQueue = new Queue<>();
  private Queue<Animal> dogQueue = new Queue<>() ;


    public AnimalShelter() {

    }

    public void enQueue(Animal animal){
        if (animal.getName().equals("cat")){
            catQueue.enqueue(animal);
        }
        else if (animal.getName().equals("dog")){
            dogQueue.enqueue(animal);
        }else
            throw new IllegalArgumentException("Please enter cat or dog.");
    }
    public Animal deQueue(String pref){
        if (pref.equals("dog"))
            return dogQueue.dequeue();
        else if (pref.equals("cat")) {
            return catQueue.dequeue();
        }
        return null ;
    }

//    @Override
//    public String toString() {
//        Node<Animal> catPointer = catQueue.getFront();
//        Node<Animal> dogPointer = dogQueue.getFront();
//
//        StringBuilder cat = new StringBuilder();
//        StringBuilder dog= new StringBuilder();
//
//        while (catPointer!=null){
//            cat.append("[").append(String.valueOf(catPointer.getValue())).append("] ");
//            catPointer=catPointer.getNext();
//        }
//        while (dogPointer!=null){
//            dog.append("[").append(String.valueOf( dogPointer.getValue())).append("] ");
//            dogPointer=dogPointer.getNext();
//        }
//        return "Cat Queue --->  "+cat+ "\n"+ "Dog Queue ---> "+dog;
//
//    }


    @Override
    public String toString() {
        return "AnimalShelter{" +
                "catQueue=" + catQueue +"\n"+
                ", dogQueue=" + dogQueue +
                '}';
    }
}
