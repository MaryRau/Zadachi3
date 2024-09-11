// задача 9
class Animal_2 {
    public void move(){
        System.out.println("Животное двигается");
    }
}

class Fish extends Animal_2{
    @Override
    public void move() {
        System.out.println("рыба плавает");
    }
}

class Bird extends Animal_2{
    @Override
    public void move() {
        System.out.println("птица летает");
    }
}

class Dog_2 extends Animal_2{
    @Override
    public void move() {
        System.out.println("собака бегает");
    }
}