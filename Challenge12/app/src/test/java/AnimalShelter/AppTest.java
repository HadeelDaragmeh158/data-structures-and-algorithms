/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AnimalShelter;

import classes.Animal;
import classes.AnimalShelter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

@Test
    void testAnimals(){
    AnimalShelter myAnimal=new AnimalShelter();
    myAnimal.enQueue(new Animal("dog"));
    myAnimal.enQueue(new Animal("dog"));
    assertEquals("{dog}",myAnimal.deQueue("dog").toString() );
}
}