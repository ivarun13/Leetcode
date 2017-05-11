package Hospital;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import Hospital.Room;

/**
 * Created by varun on 10/20/16.
 */
public class Hospital {

    private List<Doctor> doctorList = new ArrayList<Doctor>();
    private List<Nurse> nurseList = new ArrayList<Nurse>();
    private List<Patient> patientList = new ArrayList<Patient>();
    private List<Room> roomList = new ArrayList<Room>();
    private List<Service> servicesList = new ArrayList<Service>();
    private String name;
    private String address;



    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = new ArrayList<Doctor>();
    }

    public List<Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(List<Nurse> nurseList) {
        this.nurseList = nurseList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Service> getServicesList() {
        return servicesList;
    }

    public void setServicesList(List<Service> servicesList) {
        this.servicesList = servicesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static void main(String[] args) {
        Hospital h = new Hospital();
        Room r1 = new Room(101,true);
        Room r2 = new Room(102,true);
        Room r3 = new Room(103,false);
        Room r4 = new Room(104,false);
        Room r5 = new Room(105,false);
        h.getRoomList().add(r1);
        h.getRoomList().add(r2);
        h.getRoomList().add(r3);
        h.getRoomList().add(r4);
        h.getRoomList().add(r5);


        Service s1 = new Service("HIV");
        Service s2 = new Service("Cold");
        Service s3 = new Service("TB");
        Service s4 = new Service("Numonia");
        Service s5 = new Service("Fever");

        Patient p1 = new Patient("akshesh",r1);
        Patient p2 = new Patient("bhavik",r2);
        h.getPatientList().add(p1);
        h.getPatientList().add(p2);

        Doctor d1 = new Doctor("Parth 1",s1);
        Doctor d2 = new Doctor("Parth 2",s2);
        Doctor d3 = new Doctor("Parth 3",s3);
        Doctor d4 = new Doctor("Parth 4",s4);
        Doctor d5 = new Doctor("Parth 5",s5);
        h.getDoctorList().add(d1);
        h.getDoctorList().add(d2);
        h.getDoctorList().add(d3);
        h.getDoctorList().add(d4);
        h.getDoctorList().add(d5);


        boolean quit = false;
        h.setName("padmavati");
        while(!quit) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter from below commands to proceed further");
            System.out.println("D -> for DoctorsList");
            System.out.println("P -> for PatientsList ");
            System.out.println("A -> for Appointment");
            System.out.println("exit -> to exit from application");
            String command = in.nextLine();

            if (command.equals("D")) {
                 for(Doctor d : h.getDoctorList())
                     System.out.println(d.getName());
            }
            else if(command.equals("P"))
            {
                for(Patient p : h.getPatientList())
                    System.out.println(p.getName());
            }
            else if(command.equals("A"))
            {
                System.out.println("What is your name?");
                String command3 = in.nextLine();
                Patient p = new Patient(command3);
                System.out.println("Available Rooms please select one:");
                for(Room r : h.getRoomList()) {
                    if (!r.isStatus()) {
                        System.out.println(r.getNumber());
                    }
                }
                String command4 = in.nextLine();
                Room rn = new Room(Integer.parseInt(command4),true);
                p.setRoom(rn);

                System.out.println("what kind of check up you need?");
                System.out.println("HIV,  Cold, TB, Numonia, Fever");
                String command2 = in.nextLine();
                Appointment a = new Appointment(new Date());

                System.out.println(command2);
                for(Doctor d : h.getDoctorList())
                {
                    if(d.getSpecialist().getName().equals(command2))
                    {
                        a.setDc(d);
                        p.setAppointment(a);
                        h.getPatientList().add(p);
                    }
                }
                System.out.println("Thanks for your business:");
                System.out.println("Here is your details:");
                System.out.println(p.getName());
                System.out.println(p.getRoom().getNumber());
                System.out.println(p.getAppointment().getDc().getName());
                System.out.println(p.getAppointment().getAppointment().toString());


            }
        }
    }
}