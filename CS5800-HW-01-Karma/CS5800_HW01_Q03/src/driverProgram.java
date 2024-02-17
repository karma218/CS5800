public class driverProgram {
    public static void main(String[] args) {
        // Instructors
        Instructor nima = new Instructor("Yunsheng", "Wang", "3-2156");
        Instructor alice = new Instructor("Alice", "Johnson", "4-2048"); // New instructor for Advanced Software Engineering

        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook effectiveJava = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley"); // Second textbook


        Course connectedAndAutonomousVehicle = new Course("Connected and Autonomous Vehicle");
        connectedAndAutonomousVehicle.addInstructor(nima);
        connectedAndAutonomousVehicle.addTextbook(cleanCode);


        System.out.println("=== Connected Autonomous Vehicle Course (Initial) ===");
        connectedAndAutonomousVehicle.printCourseDetails();

        connectedAndAutonomousVehicle.addInstructor(alice);
        connectedAndAutonomousVehicle.addTextbook(effectiveJava); // Adding the second textbook


        System.out.println("=== Connected Autonomous Vehicle Course (Updated) ===");
        connectedAndAutonomousVehicle.printCourseDetails();
    }
}
