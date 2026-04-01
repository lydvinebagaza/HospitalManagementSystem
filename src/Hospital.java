package src;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Hospital {

    private String hospitalName;
    private String address;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName, String address) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.patients = new ArrayList<>();
    }

    public void printHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Address: " + address);
    }

    public void addPatient(Patient m) {
        patients.add(m);
    }

    public void savePatientsToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("patients.txt"));

            for (Patient p : patients) {
                writer.write(p.getName() + "," + p.getPhoneNumber());
                writer.newLine();
            }

            writer.close();
            System.out.println("Saved successfully");

        } catch (IOException e) {
            System.out.println("Error saving file");
        }
    }

    public void loadPatientsFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("patients.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // name, phone

                String name = data[0];
                String phone = data[1];

                Patient p = new Patient(0, name, phone, "Unknown"); // ID = 0 et illness par défaut
                patients.add(p);
            }

            reader.close();
            System.out.println("Loaded successfully");

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    public void generateReport() {
        System.out.println("Hospital report generated.");
    }
}
