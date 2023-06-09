package seminar2.actor;

public abstract class Actor implements ActorBehaviour {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public void setMakeOrder() {
       // System.out.println(name + " создал заказ!");
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
      //  System.out.println(name + " получил заказ!");
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public String getName() {
        return name;
    }
}
