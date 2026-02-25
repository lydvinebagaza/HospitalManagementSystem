public class Main {

    public static void main(String[] args) {

        Hospital hospital =
                new Hospital("City Hospital", "Nairobi");

        Patient p1 =
                new Patient(1, "Perlita", "0700000000", "Malaria");

        Doctor d1 =
                new Doctor(2, "Dr Monica", "0711111111",
                        "Cardiology", 5000);

        Appointment ap1 =
                new Appointment(101, "27 nov", p1, d1);

        p1.admitPatient();
        d1.diagnosePatient();
        ap1.schedule();

        System.out.println(p1.getDetails());
        System.out.println("Payment: " + p1.calculatePayment());

        hospital.generateReport();
    }
}
