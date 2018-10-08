public class Printer {
    private int paperRemaining;
    private int tonerRemaining;



    public Printer(int initialPaper, int initialToner){
        this.paperRemaining = initialPaper;
        this.tonerRemaining = initialToner;
    }

    public int checkPaper(){
        return this.paperRemaining;
    }

    public int checkToner(){
        return this.tonerRemaining;
    }

    public void print(int pages, int copies){
        if (this.paperRemaining >= (pages * copies)){
            this.paperRemaining -= (pages * copies);
        }
    }

    public void refill(int freshSheets){
        this.paperRemaining += freshSheets;
    }


}
