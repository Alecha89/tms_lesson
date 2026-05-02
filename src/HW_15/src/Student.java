/**
 * Created by Yushko Aliaksei on 02.05.2026
 */
import java.util.*;
public class Student {
    String name;
    String group;
    int course;
    List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    // вычисление среднего балла
    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // фильтр и перевод студентов
    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove(); // Удаляем студента
            } else {
                student.course++; // Переводим на следующий курс
            }
        }
    }

    //печать имен студентов на каком курсе
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        boolean found = false;
        for (Student s : students) {
            if (s.course == course) {
                System.out.println("- " + s.name);
                found = true;
            }
        }
        if (!found) System.out.println("На данном курсе студентов нет.");
    }
}



