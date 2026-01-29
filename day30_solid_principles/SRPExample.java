class Invoice {
    public void calculateTotal() {
        System.out.println("Calculating invoice total");
    }
}

class InvoicePrinter {
    public void printInvoice() {
        System.out.println("Printing invoice");
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.calculateTotal();

        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoice();
    }
}
