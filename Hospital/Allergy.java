package Hospital;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by varun on 10/20/16.
 */
public class Allergy {

    private Patient patient;
    private Doctor doctor;
    public enum Severity { LOW, MODERATE, HIGH };
    public enum allergy {swaling, rasheas ,ithcing};
    private Nurse reporter;
    private Date time;
    private Severity Severe;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getReporter() {
        return reporter;
    }

    public void setReporter(Nurse reporter) {
        this.reporter = reporter;
    }

    public Severity getSevere() {
        return Severe;
    }

    public void setSevere(Severity severe) {
        Severe = severe;
    }

    public Date getTime() {
        return time;

    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Allergy()
    {

    }


    public static void main(String[] args) {
        Allergy a = new Allergy();

        System.out.println(Arrays.toString(allergy.values()));

    }

}
