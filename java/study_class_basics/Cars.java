public class Cars {
    private String make = "Tesla";
    private String model = "model x";
    private String color = "grey";
    private int doors = 2;
    private boolean convertible = true;

    public void describecar() {
        System.out.println(doors + "doors" +
                color + make + model + (convertible ? "covertiable" : ""));
    }

    public String getmake() {
        return make;
    }

    public String getmodel() {
        return model;
    }

    public String getcolor() {
        return color;
    }

    public int getdoors() {
        return doors;
    }

    public boolean getcon() {
        return convertible;
    }

    public void setmake(String make)
    {
        if (make == null) make ="unknown";
        String lowercasemake = make.toLowerCase();
        switch(lowercasemake)
        {
            case "holden","porsche","tesla"->this.make = make;
            default-> {
                this.make = "unsupported";
        }
    }
}
}
