package les1.opdracht1_5;

public class Student {
    private String naam;
    private int studentNummer;

    public  Student(String nm) {
        naam = nm;
        studentNummer = 0;
    }

    public Student(String nm, int sn) {
        naam = nm;
        studentNummer = sn;
    }

    public String getNaam() {
        return naam;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int sn) {
        studentNummer = sn;
    }

    public String toString() {
        return "Deze student heet " + naam + " en heeft nummer " + studentNummer;
    }
}
