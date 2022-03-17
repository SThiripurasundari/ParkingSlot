import java.util.ArrayList;

public class ParkingSlot {

    private static int availableParkingSlot;
    private static int totalParkingSlots;
    private static final ArrayList<Car> parkedCars = new ArrayList<>();

    public ParkingSlot(int parkingSlots) {

        totalParkingSlots = parkingSlots;
        availableParkingSlot = totalParkingSlots;

    }

    public boolean isAvailableParkingSlot() {
        return availableParkingSlot > 0;

    }

    public boolean park(Car car) throws Exception {

        if (isAvailableParkingSlot() && !parkedCars.contains(car)) {
            availableParkingSlot--;
            parkedCars.add(car);
            return true;
        } else {

            if (parkedCars.contains(car)) {
                throw new Exception("Car already parked");

            } else

                throw new Exception("Slot Full");
        }

    }
}
