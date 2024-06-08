package company;

public class Worker implements WorkOperation, Feed {
    @Override
    public void work() {
        System.out.println("Lavoratore lavora");
    }

    @Override
    public void eat() {
        System.out.println("Mi cibo");
    }
}
