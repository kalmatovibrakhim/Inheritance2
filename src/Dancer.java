public class Dancer extends Person{
    private String groupname;

    public Dancer(String name, String designation, String groupname) {
        super(name, designation);
        this.groupname = groupname;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void learn() {
        System.out.println(super.getName()+" learns");
    }

    @Override
    public void walk() {
        System.out.println(super.getName()+" walks");
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+" eats");
    }

    public void dance(){
        System.out.println(super.getName()+" dances");
    }

    @Override
    public String toString() {
        return "Dancer{" +"name='" + super.getName().toUpperCase()+ '\'' +
                ", designation='" + super.getDesignation().toUpperCase()+ '\'' +
                ", groupname='" + groupname.toUpperCase() + '\'' +
                '}';
    }
}
