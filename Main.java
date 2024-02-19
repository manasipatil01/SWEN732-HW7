// Main class demonstrating the international student support system by setting up students and providing support.
public class Main {
    public static void main(String[] args) {
        // Set up the International Student Support System
        ISS_System supportSystem = new ISS_System();
        InternationalS ugs = new UG_Student("Pooja","9876543210","23","Sri Lanka");
        InternationalS gs = new GraduateStudent("Manasi","9876543210","23","India");

        //add student to the system
        supportSystem.add_student(ugs);
        supportSystem.add_student(gs);

        // Provide support to international students using the SupportStaff visitor
        Visitor supportStaff = new Staff();
        supportSystem.give_support_to_student(supportStaff);
    }
}
//end of Main class