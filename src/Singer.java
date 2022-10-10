public class Singer extends Person{
    private String bandname;

    public Singer(String name, String designation, String bandname) {
        super(name, designation);
        this.bandname = bandname;
    }

    public String getBandname() {
        return bandname;
    }

    public void setBandname(String bandname) {
        this.bandname = bandname;
    }

    public Singer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void learn() {
        System.out.println("Singer learns");
    }

    @Override
    public void walk() {
        System.out.println(super.getName()+" walks");
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+" eats");
    }

    public void sing(){
        System.out.println(super.getName()+" sings");
    }
    public void playGuitar(){
        System.out.println(super.getName()+" plays guitar");
    }

    @Override
    public String toString() {
        return "Singer{" +"name='" + super.getName().toUpperCase()+ '\'' +
                ", designation='" + super.getDesignation().toUpperCase() + '\'' +
                ", bandname='" + bandname.toUpperCase() + '\'' +
                '}';
    }
}
