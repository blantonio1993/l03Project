package Model;

public class Person {


    protected String name;

    protected Height height;

    protected int weight;

    protected String hometown;

    protected String highSchool;


    public Person(String name, Height height, int weight, String hometown, String highSchool) {

        this.name = name;

        this.height = height;

        this.weight = weight;

        this.hometown = hometown;

        this.highSchool = highSchool;

    }

    public Person() {
        this("Brett",new Height(5,11),220,"Collegeville","Perkiomenvalley");
    }


    public String toString() {

        return (name + "," + height + "," + weight + "," + hometown + "," + highSchool);

    }

}