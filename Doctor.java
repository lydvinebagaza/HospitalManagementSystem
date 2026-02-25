public class Doctor extends Employee {

    private String specialization;

    public Doctor(int id, String name, String phoneNumber,
                  String specialization, double salary) {

        super(id, name, phoneNumber, salary);
        this.specialization = specialization;
    }

    public void diagnosePatient() {
        System.out.println(getName() + " diagnosing patient...");
    }

    @Override
    public double calculatePayment() {
        return salary;
    }
}
