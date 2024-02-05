public class BikeBrand {
    private String name;
    private int gears;

    public BikeBrand(String name, int gears) {
        this.name = name;
        this.gears = gears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
