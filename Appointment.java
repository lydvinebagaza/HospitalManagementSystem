public class Appointment implements Schedulable {

    private int appointmentID;
    private String date;
    private Patient patient;
    private Doctor doctor;

    public Appointment(int appointmentID, String date,
                       Patient patient, Doctor doctor) {

        this.appointmentID = appointmentID;
        this.date = date;
        this.patient = patient;
        this.doctor = doctor;
    }

    @Override
    public void schedule() {
        System.out.println("Appointment scheduled on " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Appointment cancelled.");
    }
}
