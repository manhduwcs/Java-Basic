package truePackage1;

public class MyMath<T, U> {
    private T fir;
    private U sec;

    public MyMath(T fir, U sec) {
        this.fir = fir;
        this.sec = sec;
    }

    public MyMath() {
        
    }

    public void addFirstElement(T fir) {
        this.fir = fir;
    }

    public void addSecondElement(U sec) {
        this.sec = sec;
    }

    public void displayAll() {
        System.out.println("Information : Class T = " + fir.getClass() + " ; Class U = " + sec.getClass());
    }

    public T getFirst() {
        return this.fir;
    }

    public void setFirst(T fir) {
        this.fir = fir;
    }

    public U getSecond() {
        return this.sec;
    }

    public void setSecond(U sec) {
        this.sec = sec;
    }
}
