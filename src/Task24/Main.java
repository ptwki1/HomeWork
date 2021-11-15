package Task24;

public class Main {
    public static void main(String [] args){
        Time time =new Time();
        System.out.println(time.toString());
        Time time1=new Time(60,60,1);
        System.out.println(time1.allSecond());
        Time time2=new Time(1);
        Time timeInterval2= new Time(5000);
        System.out.println(timeInterval2);
    }
}
