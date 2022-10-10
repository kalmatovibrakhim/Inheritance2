public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void setName(String name){this.name=name;}
    void setDesignation(String designation){this.designation=designation;}

    String getName(){return name;}
    String getDesignation(){return designation;}


    public void learn(){
        System.out.println("Person learns");
    }
    public void walk(){
        System.out.println("Person walks");
    }
    public void eat(){
        System.out.println("Person eats");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
