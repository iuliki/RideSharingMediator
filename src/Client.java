public class Client {

    private String name;
    private int location;

    public Client(String name, int location) {
        this.name = name;
        this.location = location;
    }
    public void sendRequest() {
        Mediator.sendCar(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }


}