import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingSlotTest {

    @Test
    void parkTheCar() {

        ParkingSlot parkingslot = new ParkingSlot();
        Assertions.assertTrue(parkingslot.park(new Car(1)));

    }


}
