// задача 1
public class Person
{
    String name;
    int age;
    String gender;

    public void changeName (String newName)
    {
        this.name = newName;
    }

    public void info()
    {
        System.out.printf("Имя: {0}\nВозраст: {1}\nПол: {2}", this.name, this.age, this.gender);
    }

    public void incrAge()
    {
        this.age += 1;
    }
}