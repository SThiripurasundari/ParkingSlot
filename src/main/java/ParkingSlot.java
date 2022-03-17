import java.util.ArrayList;

public class ParkingSlot {

    public final static String ERROR_SLOT_FULL = "Slot Full";
    public final static String ERROR_CAR_ALREADY_PARKED = "Car already parked";

    private int totalParkingSlots;
    private final ArrayList<Car> parkedCars = new ArrayList<>(totalParkingSlots);

    public ParkingSlot(int parkingSlots) {
        totalParkingSlots = parkingSlots;

    }

    public int availableParkingSlot() {
        return totalParkingSlots - parkedCars.size();
    }

    public boolean isCarParked(Car car) {
        return parkedCars.contains(car);

    }

    public void park(Car car) throws CarAlreadyParkedException, ParkingSlotFullException {
        if (isCarParked(car))
            throw new CarAlreadyParkedException(ERROR_CAR_ALREADY_PARKED);
        if (availableParkingSlot() > 0) {
            parkedCars.add(car);
        } else
            throw new ParkingSlotFullException(ERROR_SLOT_FULL);

    }
}
