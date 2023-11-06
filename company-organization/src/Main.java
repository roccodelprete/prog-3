import company.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();

        Worker worker = new Worker();
        SuperWorker superWorker = new SuperWorker();

        manager.setWorker(worker);
        manager1.setWorker(new Robot());
        manager2.setWorker(superWorker);

        manager.manage();
        manager1.manage();
        manager2.manage();

        worker.eat();
    }
}