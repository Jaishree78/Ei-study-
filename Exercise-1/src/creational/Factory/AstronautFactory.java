package creational.Factory;

class AstronautFactory {
    public static Astronaut createAstronaut(String role) {
        switch (role.toLowerCase()) {
            case "pilot": return new Pilot();
            case "engineer": return new Engineer();
            case "scientist": return new Scientist();
            default: throw new IllegalArgumentException("Unknown role: " + role);
        }
    }
}