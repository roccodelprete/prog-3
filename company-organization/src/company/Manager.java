package company;

public class Manager {
    WorkOperation workOperation;

    public void setWorker(WorkOperation newWorkOperation) {
        this.workOperation = newWorkOperation;
    }

    public void manage() {
        this.workOperation.work();
    }
}
