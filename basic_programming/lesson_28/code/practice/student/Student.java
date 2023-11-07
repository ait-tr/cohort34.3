package practice.student;

public class Student {
    // поля
    private int id;
    private String firstName;
    private String secondName;
    private int[] marks;

    public Student(int id, String firstName, String secondName, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.marks = marks;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    // метод, который считает средний балл студента
    public double averageMark(int[] marks) {
        // сложить все оценки
        int sum = 0; // переменная для накопления суммы
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i]; // накапливаем сумму оценок
        }
        // разделить на их количество
        return sum/(double)marks.length;
    }

}
