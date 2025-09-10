package This_static_final_instanceof;

class Patient {
    static String hospitalName = "City Hospital";   
    static int totalPatients = 0;                   
    String name;
    int age;
    String ailment;
    final int patientID;    

    
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;   
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void showDetails() {
        if (this instanceof Patient) {
            System.out.println("ID: " + patientID + " , Name: " + name + " , Age: " + age + " , Ailment: " + ailment + " , Hospital: " + hospitalName);
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Amit", 30, "Fever", 201);
        Patient p2 = new Patient("Neha", 25, "Cold", 202);
        Patient p3 = new Patient("Ravi", 40, "Fracture", 203);

        p1.showDetails();
        p2.showDetails();
        p3.showDetails();

        Patient.getTotalPatients();
    }
}

