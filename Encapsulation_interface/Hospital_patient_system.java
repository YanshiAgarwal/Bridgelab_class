package Encapsulation_interface;

//Hospital Patient System

class Patient {
 private int id;
 private String name;
 private int age;

 public Patient(int id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }

 public String getName() { return name; }
 public int getAge() { return age; }

 public double calculateFee() {
     return 0.0; // will be changed in child classes
 }
}

class Inpatient extends Patient {
 private int days;    // days admitted

 public Inpatient(int id, String name, int age, int days) {
     super(id, name, age);
     this.days = days;
 }

 public double calculateFee() {
     return days * 1000; // 1000 per day
 }
}

class Outpatient extends Patient {
 public Outpatient(int id, String name, int age) {
     super(id, name, age);
 }

 public double calculateFee() {
     return 500; // flat fee
 }
}

class Doctor {
 private int id;
 private String name;
 private String spec;

 public Doctor(int id, String name, String spec) {
     this.id = id;
     this.name = name;
     this.spec = spec;
 }

 public String getName() { return name; }
 public String getSpec() { return spec; }
}

class Appointment {
 private Patient patient;
 private Doctor doctor;
 private String date;
 private String time;

 public Appointment(Patient patient, Doctor doctor, String date, String time) {
     this.patient = patient;
     this.doctor = doctor;
     this.date = date;
     this.time = time;
 }

 public void show() {
     System.out.println("Patient: " + patient.getName() + " (Age " + patient.getAge() + ")");
     System.out.println("Doctor: " + doctor.getName() + " - " + doctor.getSpec());
     System.out.println("Date: " + date + " Time: " + time);
     System.out.println("Fee: " + patient.calculateFee());
     System.out.println("------------------------------");
 }
}

public class Hospital_patient_system {
 public static void main(String[] args) {
     Patient p1 = new Inpatient(1, "Aman", 30, 5); // 5 days admitted
     Patient p2 = new Outpatient(2, "Ram", 25);    // visiting

     Doctor d1 = new Doctor(101, "Dr. Amit", "Cardiology");
     Doctor d2 = new Doctor(102, "Dr. Rohit", "Dermatology");

     Appointment a1 = new Appointment(p1, d1, "25-09-2025", "10:00 AM");
     Appointment a2 = new Appointment(p2, d2, "26-09-2025", "2:30 PM");

     a1.show();
     a2.show();
 }
}



