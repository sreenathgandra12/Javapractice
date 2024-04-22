package Day3;

public class Mobile {
    private String mobileName;

    private String model;
    private String colour;
    private String ram;

    public Mobile( String mobileName, String model, String colour, String ram) {
        this.mobileName = mobileName;
        this.model = model;
        this.colour = colour;
        this.ram = ram;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                " mobileName='" + mobileName + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
