import java.util.Scanner;

public class Scooter {

    private int id;
    private boolean inProgress = false;
    private int chargeLevel;
    private int maxDistance;

    public Scooter(int id, int chargeLevel, int maxDistance) {
        this.id = id;
        this.chargeLevel = chargeLevel;
        this.maxDistance = maxDistance;
    }

    public boolean acceptRequestScooter(int clientLocation, int tripDistance) {
        int estimatedDistance = Math.min(chargeLevel, maxDistance); // Estimarea distanței pe care o poate parcurge scouterul

        if (estimatedDistance >= tripDistance * 0.5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Scouter " + id + ", doresti sa accepti solicitarea? (1 pentru Da, 0 pentru Nu): ");
            int response = scanner.nextInt();
            return response == 1;
        } else {
            System.out.println("Scouter " + id + " nu poate acoperi cel puțin 50% din călătoria întreagă. Respins automat.");
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public boolean isInProgress() {
        return inProgress;
    }

    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}