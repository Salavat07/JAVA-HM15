public class Dogs {
    private String name;
    private int age = generetrDefaultAge();

    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;

    }

    private int generetrDefaultAge() {
        return 17;
    }


    public Dogs() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return getAge() + " " + getName();
    }
}