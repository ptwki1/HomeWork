package Task25;

public class Main {
    public static void main(String ... agrs){
        ATM atm=new ATM();
        System.out.println(atm.toString());
        atm.addDeneg(100,100,100);
        System.out.println(atm.toString());
        atm.getDeneg(310);
        System.out.println(atm);
    }
}
