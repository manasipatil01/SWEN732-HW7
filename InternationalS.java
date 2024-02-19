//Element Interface representing an international student in the support system.
interface InternationalS {
    // Method to get the name of the international student.
    String getName();
    
    // Method to get mobile no of the international student
    String getMob_no();
    
    // Method to get the age of the international student.
    String getAge();
    
    // Method to get the country of the international student.
    String getCountry();
    
    // Method to accept a support visitor for providing support.
    void accept(Visitor visitor);
}
//end of InternationalS interface