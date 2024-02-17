public class ShipDemo {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        // Initialize the array elements with Ship, CruiseShip, and CargoShip objects
        ships[0] = new Ship("INS Vikrant", "1992");
        ships[1] = new CruiseShip("INS Arihant", "1972", 4000);
        ships[2] = new CargoShip("HMS Shivaji", "2002", 50000);

        // Loop through the array, calling the print function for each element
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
