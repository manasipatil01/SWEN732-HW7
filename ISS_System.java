import java.util.ArrayList;
import java.util.List;

// Object Structure class managing international students and providing support using a support visitor.
class ISS_System {
    
    // Manages a list of international students.
    private List<InternationalS> students = new ArrayList<>();

    public void add_student(InternationalS student) {
        students.add(student);
    }

    // Provides support to all students using a support visitor.
    public void give_support_to_student(Visitor visitor) {
        for (InternationalS student : students) {
            student.accept(visitor);
        }
    }
}
//end of ISS_System class