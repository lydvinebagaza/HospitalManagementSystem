public abstract class person {

    private int id;
    private String name;
    private String phoneNumber;

    public Person(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return id + " | " + name + " | " + phoneNumber;
    }

    public void updatePhoneNumber(String newPhone) {
        this.phoneNumber = newPhone;
    }

    public abstract double calculatePayment();
}
    
}
