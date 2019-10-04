package Model;
import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember {

    private int number;

    private String position;


    public FootballPlayer(int number, String name, String position, int feet, int inches, int weight, String hometown, String highSchool) {

        super(name, new Height(feet, inches), weight, hometown, highSchool);

        this.number = number;

        this.position = position;

    }

    public  FootballPlayer() {
        this(23,"Brett","QB",5,11,280,"Collegeville","Perkiomenvalley");

    }

    @Override

    public String getAttribute(int n) {

        switch (n) {

            case 0:
                return name + "";


            case 1:
                return height + "";


            case 2:
                return weight + "";


            case 3:
                return hometown;


            case 4:
                return highSchool;


            case 5:
                return number + "";


            case 6:
                return position;


        }


        return null;

    }

    @Override

    public ArrayList<String> getAttributes() {


        ArrayList<String> attributes = new ArrayList<String>();

        for (int i = 0; i < 7; i++)

            attributes.add(getAttribute(i));

        return attributes;


    }

    @Override

    public String getAttributeName(int n) {

        switch (n) {

            case 0:
                return "name";


            case 1:
                return "height";


            case 2:
                return "weight";


            case 3:
                return "hometown";


            case 4:
                return "highSchool";


            case 5:
                return "number";


            case 6:
                return "position";


        }


        return null;


    }

    @Override

    public ArrayList<String> getAttributeNames() {

        ArrayList<String> attributesNames = new ArrayList<String>();

        for (int i = 0; i < 7; i++)

            attributesNames.add(getAttributeName(i));

        return attributesNames;

    }








}