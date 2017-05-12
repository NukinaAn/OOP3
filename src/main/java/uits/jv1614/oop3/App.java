package uits.jv1614.oop3;


public class App {
    public static void main(String[] args){
      
        Patient [] patient = new Patient[4];
        int [] interval = {1500 , 4000};
        patient[0] = new Patient(1, "Петр" , "Петров", "Петрович", "Барабашова 32", 3664, "ORZ");
        patient[1] = new Patient(2, "Артур" , "Герасимов", "Герасимович", "Холодная гора 4", 2345, "Bronchit");
        patient[2] = new Patient(3, "Иван" , "Иванов", "Иванович", "Советская 67", 1234, "Krasnucha");
        patient[3] = new Patient(4, "Евгений" , "Жмуркин", "Андреевич", "Герое Труда 7", 6578, "ORZ");
        
         for(Patient elem : patient) {
            System.out.println(elem.toString());
         }
         System.out.println("Cписок пациентов, имеющих данный диагноз: ");
           for (int i = 0; i <= 3; i++) {
            patient[i].diagnosis();
           }
           
           NumberInInterval(interval, patient);
    }
    public static void NumberInInterval(int [] interval, Patient[] patient){
         System.out.println("Cписок пациентов, номер медицинской карты которых находится в за-данном интервале:");
            for(Patient elem : patient) {
                if (elem.getNumberCard() >= interval[0] && elem.getNumberCard() <= interval[1]) {
                System.out.println(elem.toString());
                }
            }
     }
}
