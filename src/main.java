package src;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


         try { System.out.println("Enter patient ID:");
int id = sc.nextInt();
sc.nextLine(); 

System.out.println("Enter patient name:");
String name = sc.nextLine();

System.out.println("Enter phone number:");
int phone = sc.nextInt ();

System.out.println("Enter illness:");
String illness = sc.nextLine();
 
System.out.println("Payment:"  );
                
        } catch (Exception e) {
                System.out.println("Invalid input");
         } finally {
                sc.close ();
         }
        }

       
}
