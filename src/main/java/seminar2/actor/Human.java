package seminar2.actor;

public class Human extends Actor {

    private int age;
    private String address;

    public Human(String name, int age, String address) {
        super(name);
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String orderStatus() {
        return (isTakeOrder) ? "получил заказ." : ((isMakeOrder) ? "оформил заказ." : "заказ не найден!");
    }

    @Override
    public String toString() {
        return String.format("Клиент: %s (Возраст: %s, адрес: %s) - %s", name, age, address, orderStatus());
    }
}
