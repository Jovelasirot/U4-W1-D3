package entities;

public class Call {
    private int duration;
    private String numberCalled;

    public Call(int duration, String numberCalled) {
        this.duration = duration;
        this.numberCalled = numberCalled;
    }


    public int getDuration() {
        return duration;
    }

    public String getNumberCalled() {
        return numberCalled;
    }
}
