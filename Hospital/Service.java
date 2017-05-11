package Hospital;

/**
 * Created by varun on 10/20/16.
 */
public class Service {

    private String name;
    private Doctor doctor;

    public String getName() {
        return name;
    }

    public Service(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
