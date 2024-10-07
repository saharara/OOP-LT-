public class Animal {
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Animal(String id) {
        this.id = id;
    }


    public static void main(String[] args) {
        Fish f1 = new Fish("123");
        f1.move();
    }
}