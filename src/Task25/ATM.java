package Task25;

public class ATM {
    int nom20;
    int nom50;
    int nom100;

    public ATM(int nom20, int nom50, int nom100) {
        this.nom20 = nom20;
        this.nom50 = nom50;
        this.nom100 = nom100;
    }

    public ATM() {
    }

    public void addDeneg(int nom20, int nom50, int nom100){
       this.nom20+=nom20;
       this.nom50+=nom50;
       this.nom100+=nom100;
    }

    public boolean getDeneg(int kolvo){
        int sum=nom20*20+nom50*50+nom100*100;
        int kolvo100=0;
        int kolvo20=0;
        int kolvo50=0;
        if(kolvo>sum){
            System.out.println("Прости но столько денег у меня нет!!!");
            return false;
        }
        while(kolvo>0){
            if(kolvo>=100){
                kolvo100++;
                nom100--;
                kolvo=kolvo-100;
            }else if(kolvo>=50){
                kolvo50++;
                nom50--;
                kolvo=kolvo-50;
            }else {
                kolvo20++;
                nom20--;
                kolvo=kolvo-20;
            }
        }
        System.out.println("Все прошло отлично!!! ты получил свою сумму таким номиналом"+ "100="+kolvo100+
                " 50=" + " "+kolvo50+" "+"20="+kolvo20);
        return true;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "nom20=" + nom20 +
                ", nom50=" + nom50 +
                ", nom100=" + nom100 +
                '}';
    }
}
