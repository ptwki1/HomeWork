package Task24;

public class Time {
    int sec;
    int min;
    int h;

    public Time(int sec, int min, int h) {
        this.sec = sec;
        this.min = min;
        this.h = h;
    }

    public Time(int second) {
        this.h=second/3600;
        this.min=(second%3600)/60;
        this.sec =(second%3600)%60 ;
    }


    public Time() {
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Time{" +
                "sec=" + sec +
                ", min=" + min +
                ", h=" + h +
                '}';
    }

    public int allSecond(){
        return sec+min*60+h*3600;
    }
}
