package Hospital;

import java.util.*;


/**
 * Created by varun on 10/20/16.
 */
public class Doctor {

    private String name;
    private Service Specialist;
    private List<Date> Appointment;

    public Doctor(String name, Service specialist) {
        this.name = name;
        Specialist = specialist;
    }

    public Service getSpecialist() {

        return Specialist;
    }

    public void setSpecialist(Service specialist) {
        Specialist = specialist;
    }

    public List<Date> getAppointment() {
        return Appointment;
    }

    public void setAppointment(List<Date> appointment) {
        Appointment = appointment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
