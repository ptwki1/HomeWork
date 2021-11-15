package Task29;

import Task25.Main;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Task29 {
    public static void main(String ...agrs){
        int count=0;
        List<Student> listMarks=new ArrayList<>();// создаем коллекцию для оценок
        Scanner scanner=new Scanner(System.in);//объект для ввода данных с клавиатуры
        for(int i=0;i<5;i++){ // цикл для добовления элементов
            System.out.println("Введите имя студента и оценку студента");
//            Student student = new Student(scanner.next(), scanner.nextInt());
            Student student=new Student();
            student.setFio(scanner.next());
            student.setMark(scanner.nextInt());
            listMarks.add(student);// добовляем элементы
        }
        System.out.println(listMarks);// выводи на экран всю коллекцию
        for (Iterator<Student> it = listMarks.iterator(); it.hasNext(); ) { // создаем объект итератор для перебора нашей коллекии
            if (it.next().getMark() >=5) { // проверка на положительная оценка или нет
                count++;
            }
        }
        System.out.println(count);// выводим конечный результат

    }
}
