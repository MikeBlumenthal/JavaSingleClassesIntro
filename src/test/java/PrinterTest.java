import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.checkPaper() );
    }

    @Test
    public void canPrint(){
        printer.print(3,10);
        assertEquals(70, printer.checkPaper());
    }

    @Test
    public void willNotPrintWithInsufficientPaper(){
        printer.print(2,100);
        assertEquals(100, printer.checkPaper() );
    }

    @Test
    public void canRefillPaper(){
        printer.print(4, 20);
        printer.refill(100);
        assertEquals(120, printer.checkPaper() );
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.checkToner() );
    }
}
