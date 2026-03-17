import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


         try { System.out.println("Enter patient ID:");
int id = sc.nextInt();
sc.nextLine(); 

System.out.println("Enter patient name:");
String name = sc.nextLine();

System.out.println("Enter phone number:");
String phone = sc.nextLine();

System.out.println("Enter illness:");
String illness = sc.nextLine();
Patient p1 = new Patient (id, name, phone, illness);
p1.admitPatient();
System.out.println("Payment:" +p1.calculatePayment ());
                
        } catch (Exception e) {
                System.out.println("Invalid input");
         } finally {
                sc.close ();
         }
        }

       
}
