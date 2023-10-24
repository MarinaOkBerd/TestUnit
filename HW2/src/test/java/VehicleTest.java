package org.example;

public class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Toyota", "Camry", 2020);
        motorcycle = new Motorcycle("Yamaha", "Vixion", 2023);
    }

    @Test
    @DisplayName("Car является транспортом.")
    void CarIsVehicle(){
        assertInstanceOf(Vehicle.class, this.car);
    }

    @Test
    @DisplayName("Car имеет 4 колеса.")
    void hasFourWheels(){
        assertEquals(this.car.getNumWheels(), 4);
    }

    @Test
    @DisplayName("Motorcycle имеет 2 колеса.")
    void hasTwoWheels(){
        assertEquals(this.motorcycle.getNumWheels(), 2);
    }

    @Test
    @DisplayName("Car имеет скорость 60км/ч.")
    void CarSpeedTest(){
        this.car.testDrive();
        assertEquals(this.car.getSpeed(), 60);
    }

    @Test
    @DisplayName("Motorcycle имеет скорость 75км/ч.")
    void MotorcycleSpeedTest(){
        this.motorcycle.testDrive();
        assertEquals(this.motorcycle.getSpeed(), 75);
    }

    @Test
    @DisplayName("Car в режиме парковки останавливается.")
    void CarParkingTest(){
        this.car.testDrive();
        this.car.park();
        assertEquals(this.car.getSpeed(), 0);
    }

    @Test
    @DisplayName("Motocycle в режиме парковки останавливается.")
    void MotorcycleParkingTest(){
        this.motorcycle.testDrive();
        this.motorcycle.park();
        assertEquals(this.motorcycle.getSpeed(), 0);
    }
}
