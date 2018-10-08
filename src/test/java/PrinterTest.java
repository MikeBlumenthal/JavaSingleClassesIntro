import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 500);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.checkPaper() );
    }

    @Test
    public void canPrint(){
        printer.print(3,10);
        assertEquals(70, printer.checkPaper() );
        assertEquals(470, printer.checkToner() );
    }

    @Test
    public void willNotPrintWithInsufficientPaper(){
        printer.print(2,100);
        assertEquals(100, printer.checkPaper() );
        assertEquals(500, printer.checkToner() );
    }

    @Test
    public void willNotPrintWithInsufficientToner(){
        printer.refill(1000);
        printer.print(6, 100);
        assertEquals(1100, printer.checkPaper() );
        assertEquals(500, printer.checkToner() );
    }

    @Test
    public void canRefillPaper(){
        printer.print(4, 20);
        printer.refill(100);
        assertEquals(120, printer.checkPaper() );
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.checkToner() );
    }


}
