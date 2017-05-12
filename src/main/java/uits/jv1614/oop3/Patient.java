package uits.jv1614.oop3;

public class Patient {
   private int id;
   private String SurName;
   private String Name;
   private String MiddleName;
   private String address;
   private int NumberCard;
   private String diagnosis;
   
   
  public Patient(int id, String Name, String SurName, String MiddleName, String address, int NumberCard, String diagnosis) {
        
        this.id = id;
        this.Name = Name;
        this.SurName = SurName;
        this.MiddleName = MiddleName;
        this.address = address;
        this.NumberCard = NumberCard;
        this.diagnosis = diagnosis;
        
}
    public int getid() {
        return id;
    }
 
    public void setid(int id) {
        this.id = id;
    }
 
    public String getName() {
        return Name;
    }
 
    public void setName(String name) {
        this.Name = name;
    }
 
    public String getSurname() {
        return SurName;
    }
 
    public void setSurname(String surname) {
        this.SurName = surname;
    }
    public String getMiddleName() {
        return MiddleName;
    }
 
    public void setMiddleName(String surname) {
        this.MiddleName = MiddleName;
    }
     public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumberCard() {
        return NumberCard;
    }
 
    public void setNumberCard(int NumberCard) {
        this.NumberCard = NumberCard;
    }
    public String getdiagnosis() {
        return diagnosis;
    }
 
    public void setFaculty(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    @Override
    public String toString() {
         return " id:" + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " address: " + address + '\n' +
                " NumberCard: " + NumberCard + '\n' +
                " diagnosis: " + diagnosis + '\n' ;
    }
    
    public void diagnosis() {
        if ((this.getdiagnosis()).equals("ORZ")){
        System.out.println("id: " + getid());
        System.out.println("SurName: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("MiddleName: " + getMiddleName());
        System.out.println("adres: " + getAddress());
        System.out.println("NumberCard: " + getNumberCard());
        System.out.println("diagnosis: " + getdiagnosis());
        
        }
    }
}
