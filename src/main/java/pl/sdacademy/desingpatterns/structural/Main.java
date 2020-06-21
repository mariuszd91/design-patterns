package pl.sdacademy.desingpatterns.structural;

public class Main {
    public  static void main(String[] args) {
        Cat cat = new NevaMasqueradeCat();
        Dog dog = new CatToDogAdapter(cat);
        dog.eat();
        dog.woof();

    }
}
