package Task29;

public class Student {
    String fio;
    int mark;

    public Student(String fio, int mark) {
        this.fio = fio;
        this.mark = mark;
    }

    public Student() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }


    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", mark=" + mark +
                '}';
    }
}
