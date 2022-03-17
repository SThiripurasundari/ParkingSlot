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
    void denyParkingIfNoSlotAvailable() throws ParkingSlotFullException, CarAlreadyParkedException {

        ParkingSlot parkingslot = new ParkingSlot(1);

        parkingslot.park(new Car());

        assertThrows(ParkingSlotFullException.class, () -> parkingslot.park(new Car()));

    }

    @Test
    void denyParkingSameCarTwice() throws CarAlreadyParkedException, ParkingSlotFullException {

        ParkingSlot parkingslot = new ParkingSlot(2);

        Car car = new Car();
        parkingslot.park(car);

        assertThrows(CarAlreadyParkedException.class, () -> parkingslot.park(car));

    }
}
