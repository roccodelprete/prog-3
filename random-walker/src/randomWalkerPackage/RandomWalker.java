package randomWalkerPackage;

public class RandomWalker {
    private int lastWalkedDistance;
    private int currentMilestone;
    private RandomWalker randomWalker;

    public RandomWalker() {
        this.randomWalker = this;
    }

    public void randomWalk() {
        this.lastWalkedDistance = (int) (Math.random() * 100);
        this.currentMilestone += this.lastWalkedDistance;
    }

    public int getCurrentMilestone() {
        return this.currentMilestone;
    }

    public int getLastWalkedDistance() {
        return this.lastWalkedDistance;
    }

    public Memento createMemento() {
        return new WalkerMemento();
    }

    class WalkerMemento implements Memento {
        private int mementoCurrentMilestone;
        private int mementoLastWalkedDistance;

        public WalkerMemento() {
            this.mementoCurrentMilestone = currentMilestone;
            this.mementoLastWalkedDistance = lastWalkedDistance;
        }

        @Override
        public void restoreState() {
            currentMilestone = this.mementoCurrentMilestone;
            lastWalkedDistance = this.mementoLastWalkedDistance;
        }
    }
}
