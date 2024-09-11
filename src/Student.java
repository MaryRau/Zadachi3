import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// задача 10
class Student {
    public String name;
    public String group;
    public int grade;

}

class University {
    List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public List<Student> sortByName()
    {
        return students.stream()
                .sorted(Comparator.comparing(s -> s.name))
                .collect(Collectors.toList());
    }

    public List<Student> filterByGrade(int minGrade, int maxGrade)
    {
        return students.stream()
                .filter(s -> s.grade >= minGrade && s.grade <= maxGrade)
                .collect(Collectors.toList());
    }
}