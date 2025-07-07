class PrintTable {
    synchronized void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }
    }
}

class Table5 extends Thread {
    int number;
    PrintTable op;

    Table5(PrintTable op) {
        this.op = op;

    }

    public void run() {
        op.table(5);
    }

}

class Table7 extends Thread {
    int number;
    PrintTable op;

    Table7(PrintTable op) {
        this.op = op;
    }

    public void run() {
        op.table(7);

    }
}

public class code1 {
    public static void main(String args[]) {

        PrintTable op = new PrintTable();

        Table5 t1 = new Table5(op);
        Table7 t2 = new Table7(op);

        t1.setName("Table 1");
        t2.setName("Table 2");

        t1.start();
        t2.start();

    }
}