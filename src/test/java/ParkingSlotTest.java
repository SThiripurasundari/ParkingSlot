import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSlotTest {


    @Test
    void parkTheCar() throws Exception {

        ParkingSlot parkingslot = new ParkingSlot(1);

        assertTrue(parkingslot.park(new Car()));

    }

    @Test
    void parkMultipleCars() throws Exception {

        ParkingSlot parkingslot = new ParkingSlot(2);

        parkingslot.park(new Car());

        assertTrue(parkingslot.park(new Car()));

    }

    @Test
    void denyParkingIfNoSlotAvailable() throws Exception {

        ParkingSlot parkingslot = new ParkingSlot(1);

        parkingslot.park(new Car());

        Throwable throwable = assertThrows(Exception.class, () -> parkingslot.park(new Car()));
        assertEquals(ParkingSlot.ERROR_SLOT_FULL, throwable.getMessage());
    }

    @Test
    void denyParkingSameCarTwice() throws Exception {

        ParkingSlot parkingslot = new ParkingSlot(2);

        Car car = new Car();
        parkingslot.park(car);

        Throwable throwable = assertThrows(Exception.class, () -> parkingslot.park(car));
        assertEquals(ParkingSlot.ERROR_CAR_ALREADY_PARKED, throwable.getMessage());
    }
}
