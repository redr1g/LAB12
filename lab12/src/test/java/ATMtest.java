import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.Task1.Tray;
import ucu.edu.ua.Task1.Tray20;
import ucu.edu.ua.Task1.Tray5;
import ucu.edu.ua.Task1.Tray50;

public class ATMtest {
    @Test
    public void ATMTests() {
        Tray tray5 = new Tray5();
        Tray tray20 = new Tray20();
        Tray tray50 = new Tray50();

        tray50.setNext(tray20);
        tray20.setNext(tray5);

        Assertions.assertEquals(tray50.process(125), 1);

        boolean flag = true;
        try {
            tray50.process(126);
        } catch (IllegalArgumentException e){
            flag = false;
        }
        Assertions.assertFalse(flag);
    }
}