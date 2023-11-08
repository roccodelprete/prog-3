package printerSpoolerPackage;

public class PrinterSpooler {
    private static PrinterSpooler instance;

    /**
     * private constructor to avoid client to use it
     */
    private PrinterSpooler() {}

    /**
     * method to get class instance
     * @return the instance
     */
    public static PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    /**
     * method to print a message
     * @param message the message to print
     */
    public void print(String message) {
        System.out.print(message);
    }
}
