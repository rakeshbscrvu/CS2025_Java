class Printer {
    public synchronized void printDocument(String user, String document) {
        System.out.println(user + " started printing: " + document);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(user + " finished printing: " + document);
    }
}

class User extends Thread {
    private String userName;
    private Printer printer;
    private String document;

    public User(String userName, Printer printer, String document) {
        this.userName = userName;
        this.printer = printer;
        this.document = document;
    }

    @Override
    public void run() {
        printer.printDocument(userName, document);
    }
}

public class Lab7 {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        User user1 = new User("Alice", sharedPrinter, "Report.pdf");
        User user2 = new User("Bob", sharedPrinter, "Invoice.docx");
        User user3 = new User("Charlie", sharedPrinter, "Notes.txt");

        user1.start();
        user2.start();
        user3.start();
    }
}
