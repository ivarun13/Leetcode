package Hospital;

/**
 * Created by varun on 10/20/16.
 */
public class Room {

    private int number;
    private boolean status;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room(int number, boolean status) {
        this.number = number;
        this.status = status;
    }

    public boolean isStatus() {

        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
