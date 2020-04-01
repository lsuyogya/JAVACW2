// import javax.swing.JOptionPane;

/**
 * This class is a derived class in the project and is used to appoint fulltime staff. 
 * @author (Suyogya Luitel)
 * @version (1.0)
 */
public class FullTimeStaffHire extends StaffHire {
  //Declaring variables
  private int salary;
  private int workingHours;
  private String staffName;
  private String joiningDate;
  private String qualification;
  private String appointedBy;
  private boolean joined;
  
  //Creating a constructor to initialize the variables
  public FullTimeStaffHire(int vacancyNo, String designation, String jobType, int salary, int workingHours){
      super(vacancyNo, designation, jobType);
      this.salary=salary;
      this.workingHours=workingHours;
      staffName = "";
      joiningDate = "";
      qualification = "";
      appointedBy = "";
      joined = false;
  }
  
  //Creating accessor methods for private variables
  public int getSalary(){
      return salary;
  }
  
  public void setSalary(int salary){
      if (joined==false)
        this.salary = salary;
      else
        System.out.println("The staff is already appointed");
  }
  
  public int getWorkingHours(){
      return workingHours;
  }
  
  public void setWorkingHours(int workingHours){
      this.workingHours=workingHours;
  }
  
  public String getStaffName(){
      return staffName;
  }
    
  public String getJoiningDate(){
      return joiningDate;
  }
    
  public String getQualification(){
      return qualification;
  }
    
  public String getAppointedBy(){
    return appointedBy;
  }

  public boolean getJoined(){
    return joined;  
  }
  
  //Creating a method to hire full time staff
  public void hireFullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
      if(joined){ 
        // System.out.println(this.staffName+" has already joined for this vacancy at "+ this.joiningDate);
      }
      else{
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
           joined=true;
      }
  }
   
  //Creating a method to display the detailes of this class
  public void display(){
      super.display(); //calling the display method from the base class
      System.out.println("");
      if(joined){
            System.out.println("Staff name    = "+staffName);
            System.out.println("Salary        = "+salary);
            System.out.println("Working Hours = "+workingHours);
            System.out.println("Joining date  = "+joiningDate);
            System.out.println("Qualification = "+qualification);
            System.out.println("Appointed by  = "+appointedBy);
      }
  }  
}