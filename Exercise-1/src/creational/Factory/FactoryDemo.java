package creational.Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Astronaut pilot = AstronautFactory.createAstronaut("pilot");
        Astronaut eng = AstronautFactory.createAstronaut("engineer");

        pilot.performDuty();
        eng.performDuty();
    }
}
