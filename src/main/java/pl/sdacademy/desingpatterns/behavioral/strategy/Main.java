package pl.sdacademy.desingpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(name: "ABC", new PunchStrategy());
        warrior.hit();
        warrior.setHitStrategy(new SwordSwingStrategy());
        warrior.hit();
        warrior.SetHitStrategy(() -> System.out.println(("Customowy sposób uderzania")));
        warrior.hit();
    }
}
