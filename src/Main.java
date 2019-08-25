public class Main {

    public static void main(String[] args) {



        Pitbull pitbull = new Pitbull(18,Color.BLACK,6);
        System.out.println(pitbull.info());


        Shepherd shepherd = new Shepherd(40,Color.BROWN);
        System.out.println(shepherd.info());

        Shepherd shepherd1 = new Shepherd(50);
        System.out.println(shepherd1.info());


        pitbull.makeVoice();
        pitbull.makeVoice("Mrrr");
        pitbull.makeVoice("Mrr", 3);
    }
}
