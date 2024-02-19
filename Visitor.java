/*  Visitor interface for providing various types of support to international students.
    Methods for providing immigration, cultural, academic, and communication support to international students.
    It also includes a default method to provide overall support. 
*/ 
interface Visitor {
    
    //Methods providing different support
    void give_immigration_help(InternationalS student);
    void give_cultural_help(InternationalS student);
    void give_academic_help(InternationalS student);
    void give_communication_help(InternationalS student);

    // Default method to provide overall support
    default void visit(InternationalS student) {
        give_immigration_help(student);
        give_cultural_help(student);
        give_academic_help(student);
        give_communication_help(student);
    }
}
//end of interface visitor