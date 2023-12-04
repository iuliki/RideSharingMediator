import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Mediator {

    private static ArrayList<Car> cars = new ArrayList<Car>();
    private static ArrayList<Scooter> scooters = new ArrayList<>();
    public static void RegisterCar(Car car)
    {
        if(!cars.contains(car))
            cars.add(car);
    }
    public static void RegisterScooter(Scooter scooter)
    {
        if(!scooters.contains(scooter))
            scooters.add(scooter);
    }

    public static Car getCar() {

        cars.sort(Comparator.comparing(Car::getDistance));

        System.out.println("Alege soferul: ");

        int numberofCars = 0;

        for(Car car:cars) {

            if(car.isInProgress() == false){

                System.out.println("[" + numberofCars + "] " + car.getDriverName());
                numberofCars++;
            }

            if(numberofCars == 4) break;
        }


        boolean optionChosed = false;

        while(!optionChosed){

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if(option == 1){
                //aici metoda care apeleaza o metoda daca soferul accepta sau nu
                optionChosed = true;
               // int option = scanner.nextInt();

                if (option >= 0 && option < numberofCars) {
                    Car selectedCar = cars.get(option);

                    // Așteaptă răspuns de la șofer
                    boolean accepted = selectedCar.acceptRequest();

                    if (accepted) {
                        optionChosed = true;
                        return selectedCar;
                    } else {
                        System.out.println("Soferul " + selectedCar.getDriverName() + " a respins solicitarea. Alege alt sofer.");
                    }
                } else {
                    System.out.println("Opțiune invalidă. Alege din nou.");
                }
            }
            else if(option == 2){
                optionChosed = true;
                if (option >= 0 && option < numberofCars) {
                    Car selectedCar = cars.get(option);

                    // Așteaptă răspuns de la șofer
                    boolean accepted = selectedCar.acceptRequest();

                    if (accepted) {
                        optionChosed = true;
                        return selectedCar;
                    } else {
                        System.out.println("Soferul " + selectedCar.getDriverName() + " a respins solicitarea. Alege alt sofer.");
                    }
                } else {
                    System.out.println("Opțiune invalidă. Alege din nou.");
                }
            }
            else {
                optionChosed = true;
                if (option >= 0 && option < numberofCars) {
                    Car selectedCar = cars.get(option);

                    // Așteaptă răspuns de la șofer
                    boolean accepted = selectedCar.acceptRequest();

                    if (accepted) {
                        optionChosed = true;
                        return selectedCar;
                    } else {
                        System.out.println("Soferul " + selectedCar.getDriverName() + " a respins solicitarea. Alege alt sofer.");
                    }
                } else {
                    System.out.println("Opțiune invalidă. Alege din nou.");
                }
            }
        }

        return null;
    }

    public static Scooter getScooter() {
        scooters.sort(Comparator.comparingInt(Scooter::getChargeLevel));

        System.out.println("Alege scouterul:");

        int numberOfScooters = 0;

        for (Scooter scooter : scooters) {
            if (!scooter.isInProgress()) {
                System.out.println("[" + numberOfScooters + "] Scouter " + scooter.getId() +
                        " - Nivel baterie: " + scooter.getChargeLevel() + "%");
                numberOfScooters++;
            }

            if (numberOfScooters == 4) break;
        }

        boolean optionChosen = false;

        while (!optionChosen) {
            Scanner scanner2 = new Scanner(System.in);
            int option = scanner2.nextInt();


            if (option >= 0 && option < numberOfScooters) {
                Scooter selectedScooter = scooters.get(option);

                // Așteaptă răspuns de la scouter
                boolean accepted = selectedScooter.acceptRequestScooter(3,3);

                if (accepted) {
                    optionChosen = true;
                    return selectedScooter;
                } else {
                    System.out.println("Scouterul " + selectedScooter.getId() + " a respins solicitarea. Alege alt scouter.");
                }
            } else {
                System.out.println("Opțiune invalidă. Alege din nou.");
            }
        }

        return null;
    }

    public static void sendCar(Client client) {

        Car car = getCar();

        if( car != null ) {

            car.setInProgress(true);
            System.out.println("Masina " + car.getId() + " a preluat clientul " + client.getName());
        }
    }
    public static void sendScooter(Client client, int tripDistance) {
        Scooter scooter = getScooter();

        if (scooter != null) {
            scooter.setInProgress(true);
            System.out.println("Scouter " + scooter.getId() + " a preluat clientul " + client.getName());
        }
    }

}