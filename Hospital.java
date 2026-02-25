 public class Hospital {

    private String hospitalName;
    private String address;

    public Hospital(String hospitalName, String address) {
        this.hospitalName = hospitalName;
        this.address = address;
    }

    public void generateReport() {
        System.out.println("Hospital report generated.");
    }
}
