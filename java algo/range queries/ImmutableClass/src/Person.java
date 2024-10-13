import java.util.Arrays;

public class Person {
    private String name;
    private String dob;
    private Person[] kids;

    public Person[] getKids() {
        return kids;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKids(Person[] kids) {
        this.kids = kids;
    }

    @Override
    public String toString() {
        String kidString ="na";
        if(kids!=null)
        {
            String[] names= new String[kids.length];
            Arrays.setAll(names, i -> names[i]=kids[i]==null?"":kids[i].name);
            kidString = String.join(",",names);
        }
        return name+", dob = "+dob+", kids = "+ kidString;
    }
}
