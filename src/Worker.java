import java.util.ArrayList;
import java.util.List;

// задача 2
class Worker extends Person
{
    int salary;
}

class Manager extends Worker
{
    List<Worker> workers = new ArrayList<>();
}