package ExOne;

import java.util.ArrayList;
import java.util.List;

public class bai1 {

    
    static class Student {
        private String id;
        private String name;
        private double gpa;

        public Student(String id, String name, double gpa) {
            this.id = id;
            this.name = name;
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return id + " _ " + name + " - GPA: " + gpa;
        }
    }

   
    static class StudentManager<T> {
        private List<T> list = new ArrayList<>();

        public void add(T item) {
            list.add(item);
        }

        public List<T> getAll() {
            return list;
        }
    }

    public static void main(String[] args) {
        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV001", "Nguyễn Huy Hoàng", 3.1));
        manager.add(new Student("SV002", "Mai Ngọc Thanh Bình", 4.0));
        manager.add(new Student("SV003", "Mai Bảo An", 3.8));
        manager.add(new Student("SV003", "Mai Bảo An", 3.2));

        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}