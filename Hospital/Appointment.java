package Hospital;

import java.util.Date;

/**
 * Created by varun on 10/20/16.
 */
public class Appointment {

    private Date appointment;
    private Patient client;
    private  Doctor dc;

    public Doctor getDc() {
        return dc;
    }

    public void setDc(Doctor dc) {
        this.dc = dc;
    }

    public Appointment(Date appointment) {
        this.appointment = appointment;
    }

    public Date getAppointment() {
        return appointment;
    }

    public void setAppointment(Date appointment) {
        this.appointment = appointment;
    }

    public Patient getClient() {
        return client;
    }

    public void setClient(Patient client) {
        this.client = client;
    }
}
