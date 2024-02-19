//Concrete Visitor class representing support staff who provide various types of support to international students.
class Staff implements Visitor {
    // Implements methods to provide immigration, cultural, academic, and communication support to international students.
    @Override
    public void give_immigration_help(InternationalS student) {
        System.out.println("Helping " + student.getName() + " with immigration procedures.");
    }

    @Override
    public void give_cultural_help(InternationalS student) {
        System.out.println("Helping " + student.getName() + " in cultural adjustment.");
    }

    @Override
    public void give_academic_help(InternationalS student) {
        System.out.println("Providing academic guidance to " + student.getName() + ".");
    }

    @Override
    public void give_communication_help(InternationalS student) {
        System.out.println("Helping " + student.getName() + " with language learning and adaptation.");
    }
}
//end of Staff class