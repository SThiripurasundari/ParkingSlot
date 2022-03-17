import java.util.ArrayList;

public class ParkingSlot {

    private static int availableParkingSlot = 2;
    private static final int totalParkingSlots = 2;
    private static ArrayList<Car> parkedcar = new ArrayList<>();

    public boolean isAvailableParkingSlot() {

        if (availableParkingSlot > 0) {

            return true;
        }
        return false;


    }

    public boolean park(Car car) {

        if (isAvailableParkingSlot()) {
            availableParkingSlot--;
            parkedcar.add(car);
            return true;
        } else {
            return false;
        }

    }
}
