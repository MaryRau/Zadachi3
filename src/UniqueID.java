// задача 13
class UniqueID {
    static int nextId = 1;
    final int ID;

    public UniqueID() {
        this.ID = nextId++;
    }
}