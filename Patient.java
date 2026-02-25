public class Patient extends Person implements Billable {

    private String illness;
    private boolean admitted;
    private static int totalPatients = 0;

    public Patient(int id, String name, String phoneNumber, String illness) {
        super(id, name, phoneNumber);
        this.illness = illness;
        this.admitted = false;
        totalPatients++;
    }

    public void admitPatient() {
        admitted = true;
        System.out.println(getName() + " admitted.");
    }

    public void dischargePatient() {
        admitted = false;
        System.out.println(getName() + " discharged.");
    }

    @Override
    public double calculatePayment() {
        return admitted ? 1000 : 300;
    }

    @Override
    public void generateBill() {
        System.out.println("Bill generated for patient.");
    }

    @Override
    public void printReceipt() {
        System.out.println("Receipt printed.");
    }
}
