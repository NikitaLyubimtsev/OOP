package seminar1;

public class Fruit extends Product{
    private String kind;

    public Fruit(Long id, String name, double price, String kind) {
        super(id, name, price);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return String.format("%s сорта %s имеет цену: %s руб. за килограмм", getName(), getKind(), getPrice());
    }
}
