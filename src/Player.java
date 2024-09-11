// задача 17
class Player {
    private String name;
    private int health;
    private int strength;
    private Weapon weapon;

    public Player(String name, int health, int strength, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        int damage = strength + weapon.getDamage();
        enemy.takeDamage(damage);
        if (enemy.isAlive())
            System.out.println(this.name + " атакует " + enemy.getName() + ", используя " + this.weapon.getName() + ", и наносит " + damage + " урона.");
        else System.out.println(this.name + " атакует " + enemy.getName() + ", используя " + this.weapon.getName() + ", и убивает его.");
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public String getName() {
        return name;
    }
}

class Enemy {
    private String name;
    private int health;
    private int strength;

    public Enemy(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public void attack(Player player) {
        int damage = this.strength;
        player.takeDamage(damage);
        if (player.isAlive())
            System.out.println(this.name + " атакует " + player.getName() + " и наносит " + damage + " урона.");
        else System.out.println(this.name + " атакует " + player.getName() + " и убивает его.");
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return this.name;
    }
}

class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getName() {
        return this.name;
    }
}