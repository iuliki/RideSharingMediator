public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Jules", 5);
        Client client2 = new Client("Stef", 5);

        Car car1 = new Car(1, "sofer1", 50, 3);
        Car car2 = new Car(2, "sofer2", 30, 3);
        Car car3 = new Car(3, "sofer3", 20, 3);
        Car car4 = new Car(4, "sofer4", 10, 3);

        Mediator.RegisterCar(car1);
        Mediator.RegisterCar(car2);
        Mediator.RegisterCar(car3);
        Mediator.RegisterCar(car4);

        Scooter scooter1 = new Scooter(1, 3, 3);
        Scooter scooter2 = new Scooter(2, 3, 32);
        Scooter scooter3 = new Scooter(3, 5, 9);
        Scooter scooter4 = new Scooter(4, 8, 8);

        client1.sendRequest();
        client2.sendRequest();



    }

}