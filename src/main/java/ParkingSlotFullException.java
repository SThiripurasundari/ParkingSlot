public class ParkingSlotFullException extends Exception {
    public ParkingSlotFullException(String errorSlotFull) {
        super(errorSlotFull);
    }
}
