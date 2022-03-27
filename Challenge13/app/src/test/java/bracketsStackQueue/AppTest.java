/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bracketsStackQueue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
@Test
    public void testValid(){
    String validate1 = "()[[Extra Characters]]";
    String validate2 = "{}{Code}[Fellows](())";
    String validate3 = "(](";
    String validate4 = "{(})";
    Brackets brackets1= new Brackets(validate1);

    assertEquals(true,brackets1.validateBrackets());
}
    @Test
    public void testValidFalse(){
        String validate1 = "()[[Extra Characters]]";
        String validate2 = "{}{Code}[Fellows](())";
        String validate3 = "(](";
        String validate4 = "{(})";
        Brackets brackets1= new Brackets(validate3);

        assertEquals(false,brackets1.validateBrackets());
    }
    @Test
    public void testValidNull(){
        String validate1 = "()[[Extra Characters]]";
        String validate2 = "{}{Code}[Fellows](())";
        String validate3 = "(](";
        String validate4 = "";
        Brackets brackets1= new Brackets(validate4);

        assertEquals(true,brackets1.validateBrackets());
    }

}
