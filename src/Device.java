// задача 19
class Device {
    String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println(brand + " включен");
    }

    public void turnOff() {
        System.out.println(brand + " выключен");
    }
}

class Smartphone extends Device {
    public Smartphone(String brand) {
        super(brand);
    }

    public void takePhoto() {
        System.out.println(brand + " сделал фото");
    }
}

class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }

    public void incrBright() {
        System.out.println(brand + " повысил яркость.");
    }

    public void lowerBright() {
        System.out.println(brand + " понизил яркость.");
    }
}