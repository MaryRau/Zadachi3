// задача 3
interface Animal
{
    public void makeSound();
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("Гав-гав");
    }
}

class Cat implements Animal{
    public void makeSound()
    {
        System.out.println("Мяу");
    }
}

class Cow implements Animal
{
    public void makeSound()
    {
        System.out.println("Муу");
    }
}