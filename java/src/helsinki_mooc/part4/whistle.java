package helsinki_mooc.part4;

public class whistle {

    // class variable(s)
    private String sound;

    // constructor
    public whistle(String newSound) {

        this.sound = newSound;

    }

    // this method is void and omits static key word bc static methods dont belong to a object!!
    public void sound() {

        System.out.println(sound);

    }

    // main method
    public static void main(String[] args) {

        whistle duckWhistle = new whistle("Kvaak");
        whistle roosterWhistle = new whistle("peef");

        // method invocation
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();

    }

}
