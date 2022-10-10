public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void learn() {
        System.out.println(super.getName()+" learns");;
    }

    @Override
    public void walk() {
        System.out.println(super.getName()+" walks");
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+" eats");
    }

    public void coding(){
        System.out.println(super.getName()+" codes");
    }

    @Override
    public String toString() {
        return "Programmer{" +"name='" + super.getName().toUpperCase() + '\'' +
                ", designation='" + super.getDesignation().toUpperCase() +'\'' +
                ", companyName='" + companyName.toUpperCase() + '\'' +
                '}';
    }
}
