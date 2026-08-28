import airctrl.model.Flight;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight(
                "AM101", "AirMex", "MEX", "TIJ",
                "AC001", "G12", "BOARDING", 2
        );

        System.out.println("AIRCTRL");
        System.out.println("Flight: " + flight.getFlightId());
        System.out.println("Status: " + flight.getStatus());
        System.out.println("Priority: " + flight.getPriority());
    }
}
