import randomWalkerPackage.Memento;
import randomWalkerPackage.RandomWalker;

public class Main {
    public static void main(String[] args) {
        RandomWalker walker = new RandomWalker();
        Memento stop = walker.createMemento();

        for (int i = 1; i <= 4; i++) {
            System.out.println("\nStarting trip...\n");
            walker.randomWalk();
            System.out.println("Last walked distance: " + walker.getLastWalkedDistance());
            System.out.println("Current milestone: " + walker.getCurrentMilestone());
            if (Math.random() < .4) {
                System.out.println("\nRestore state...");
                stop.restoreState();
            } else {
                stop = walker.createMemento();
            }
        }
        System.out.println("\nYou reach " + walker.getCurrentMilestone() + " km");
    }
}