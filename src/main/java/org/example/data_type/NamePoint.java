package org.example.data_type;

public class NamePoint extends Point implements Resettable {
    private String name;

    public NamePoint(double x, double y, double z) {
        super(x, y, z);

    }

    public NamePoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public NamePoint() {
        this(0, 0, 0, "Origin");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        name = "Absent";
    }
}
