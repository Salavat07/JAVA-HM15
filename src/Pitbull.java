public class Pitbull extends Dogs {


    private Color color;
    private int arms;
    private double height;

    public String info() {
        return super.info() + " " + getArms() + " " + getHeight() + " " + getColor();
    }

    public Pitbull(double height, int arms) {
        this.height = height;
        this.arms = arms;

    }

    final void makeVoice() {
        System.out.println("Grr Grr");
    }

    void makeVoice(String voice) {
        System.out.println(voice);
    }

    void makeVoice(String voice, int number) {
        System.out.println(number);
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public Pitbull(double height, Color color, int arms) {
        this.arms = arms;
        this.height = height;
        this.color = color;
    }


    public Pitbull(int arms) {
        this.arms = arms;
    }

    public Color getColor() {
        return color;
    }


    public Pitbull() {
    }

    public double getHeight() {
        return height;

    }

    public int getArms() {
        return arms;
    }
}