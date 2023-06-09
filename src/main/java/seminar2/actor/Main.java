package seminar2.actor;

public class Main {
    public static void main(String[] args) {

        Actor human1 = new Human("Nikita", 34, "Moscow");
        System.out.println(human1);
        human1.setMakeOrder();
        System.out.println(human1);
        human1.setTakeOrder();
        System.out.println(human1);


    }
}
