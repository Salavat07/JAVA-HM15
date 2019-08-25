public class Shepherd extends Pitbull {
    private Color color;
    private int mass;

    @Override
    public Color getColor() {
        return color;
    }

    public String info(){
        return super.info() + " " + getMass() + " " + getColor();
    }

    public Shepherd(){}

    public Shepherd(int mass, Color color){
        this.mass = mass;
        this.color = color;
    }

    public Shepherd(int mass){
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }
}
