package guy;  //same package as the class being tested

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThatOneGuyTest {
    @Test
    public void dummyTest(){
        assertEquals(2, 2);
    }
    @Test
    public void anotherDummyTest(){
        assertEquals(4, 4);
    }
}
