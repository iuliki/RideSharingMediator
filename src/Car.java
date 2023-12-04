import java.util.Scanner;

public class Car {

    private int id;
    private String driverName;
    private boolean inProgress = false;
    private int distance;
    private int comfort;

    private boolean continueRequest;

    public Car(int id, String driverName, int distance, int comfort) {
        this.id = id;
        this.driverName = driverName;
        this.distance = distance;
        this.comfort = comfort;
    }
    public boolean acceptRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soferul " + driverName + ", doresti sa accepti solicitarea? (1 pentru Da, 0 pentru Nu): ");
        int response = scanner.nextInt();
        return response == 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public boolean isInProgress() {
        return inProgress;
    }

    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


}