package demoPest;

import static org.junit.Assert.*;
import org.junit.Test;

public class VirtualPestTest {
    @Test
    public void testConstructor() {
        VirtualPest pest1 = new VirtualPest("Frodo", 1);
        assertEquals("Frodo", pest1.getName());
        assertEquals(1, pest1.getIntState());
    }

    @Test
    public void testGetFile() {
        VirtualPest pest1 = new VirtualPest("Frodo", 1);
        String myFile = "src/demoPest/fish.jpg";
        assertEquals(myFile, pest1.getFile());
    }

    @Test
    public void testGetNumActions() {
        VirtualPest pest1 = new VirtualPest("Frodo", 1);
        assertEquals(3, pest1.getNumActions());
    }

    @Test
    public void testGetState() {
        VirtualPest pest1 = new VirtualPest("Frodo", 1);
        assertEquals("hungry", pest1.getState());
        pest1 = new VirtualPest("Frodo", 2);
        assertEquals("sleepy", pest1.getState());
        pest1 = new VirtualPest("Frodo", 3);
        assertEquals("full", pest1.getState());
        pest1 = new VirtualPest("Frodo", 4);
        assertEquals("grouchy", pest1.getState());
        pest1 = new VirtualPest("Frodo", 5);
        assertEquals("error", pest1.getState());
    }

    @Test
    public void testGetAction() {
        VirtualPest pest1 = new VirtualPest("Frodo", 1);
        assertEquals("feed", pest1.getAction(1));
        assertEquals("pet", pest1.getAction(2));
        assertEquals("put to bed", pest1.getAction(3));
        assertEquals("", pest1.getAction(4));
    }
}
