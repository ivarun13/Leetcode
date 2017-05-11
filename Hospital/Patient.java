package Hospital;
import java.util.*;
/**
 * Created by varun on 10/20/16.
 */
public class Patient {

    private String name;
    private Room room;
    private Appointment appointment;



    public String getName() {
        return name;

    }

    public Room getRoom() {
        return room;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public void setRoom(Room room) {
        this.room = room;

    }

    public Patient(String name, Room room) {
        this.name = name;
        this.room = room;
    }
    public Patient(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }
}
