package in.Parent;

public class car {
    public String color;
    public String model;
    private double fuellevel;
    private long costoffuel;
    public car(){
        System.out.println("Default Constructor");
    }
    public car(String color, String model, double fuellevel, long costoffuel){
        this.color = color;
        this.model = model;
        this.fuellevel = fuellevel;
        this.costoffuel = costoffuel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuellevel=").append(fuellevel);
        sb.append(", costoffuel=").append(costoffuel);
        sb.append('}');
        return sb.toString();
    }
}
