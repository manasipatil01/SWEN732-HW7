// Concrete Elements representing undergraduate international students in the support system.
class UG_Student implements InternationalS {
    private String name;
    private String mob_no;
    private String age;
    private String country;

    public UG_Student(String name,String mob_no, String age, String country) {
        this.name = name;
        this.mob_no = mob_no;
        this.age = age;
        this.country = country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMob_no() {
        return mob_no;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String getCountry() {
        return country;
    }

    // Accepts a support visitor for providing support.
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
//end of UG_Student class