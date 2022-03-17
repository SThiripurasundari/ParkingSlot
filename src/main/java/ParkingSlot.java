import java.util.ArrayList;

public class ParkingSlot {

    public final static String ERROR_SLOT_FULL = "Slot Full";
    public final static String ERROR_CAR_ALREADY_PARKED = "Car already parked";


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


    public boolean park(Car car) throws CarAlreadyParkedException, ParkingSlotFullException {

        if (isAvailableParkingSlot() && !parkedCars.contains(car)) {
            availableParkingSlot--;
            parkedCars.add(car);
            return true;

        } else {
            if (parkedCars.contains(car)) {

                throw new CarAlreadyParkedException(ERROR_CAR_ALREADY_PARKED);

            } else

                throw new ParkingSlotFullException(ERROR_SLOT_FULL);
        }

    }
}
