/**
 * This class is a derived class in the project and is used to appoint part-time staff. 
 * @author (Suyogya Luitel)
 * @version (1.0)
 */

public class PartTimeStaffHire extends StaffHire
{
    //Declaring variables
    private final int workingHours;
    private final int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

    // Creating a constructor to initialize the variables
    public PartTimeStaffHire(int vacancyNo, String designation, String jobType, int workingHours, int wagesPerHour, String shifts) {
        super(vacancyNo, designation, jobType);
        this.workingHours = workingHours;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = false;
    }

    // Creating accessor methods for private variables
    public int getWorkingHours() {
        return workingHours;
    }

    public int getWagesPerHour() {
        return wagesPerHour;
    }

    public String getShifts() {
        return shifts;
    }

    public void setShifts(final String shifts) {
        if (joined) {
            System.out.println("The staff is already hired. So, shifts cannot be changed.");
        } else {
            this.shifts = shifts;
        }
    }

    public String getStaffName() {
        return staffName;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getQualification() {
        return qualification;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public boolean getJoined() {
        return joined;
    }

    public boolean getTerimnated() {
        return terminated;
    }

    // Creating a method to hire part time staff
    public void hirePartTimeStaff(final String staffName, final String joiningDate, final String qualification,
            final String appointedBy) {
        if(joined){
            // System.out.println(staffName+" cannot join");
        }else{
          this.staffName=staffName;
          this.joiningDate=joiningDate;
          this.qualification=qualification;
          this.appointedBy=appointedBy;
          joined=true;
          terminated=false;
        }
    }
    
    //Creating a method to terminate a part time staff
    public void terminate(){
        if(terminated)
            System.out.println("The staff has already been terminated. Thus, termination is not possible");
        else{
          staffName="";
          joiningDate="";
          qualification="";
          appointedBy="";
          joined=false;
          terminated=true;
        //   System.out.println("The staff is successfully terminated.");
        }
    }
  
    //Creating a method to display the detailes of this class
    public void display(){
        super.display();
        System.out.println("");  
        if(joined){
            System.out.println("Staff name      = "+staffName);
            System.out.println("Wages per hour  = "+wagesPerHour);
            System.out.println("Working hours   = "+workingHours);
            System.out.println("Joining date    = "+joiningDate);
            System.out.println("Qualification   = "+qualification);
            System.out.println("Appointed by    = "+appointedBy);
            System.out.println("Income per day  = "+(wagesPerHour*workingHours));
        }
    }  
}