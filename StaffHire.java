/**
 * This class is the only base class in the project
 * @author (Suyogya Luitel)
 * @version (1.0)
 */
public class StaffHire
{
    //Declaring variables
    private int vacancyNo;
    private String designation;
    private String jobType;
    
    //creating a constructor to initialize the variables
        public StaffHire(int vacancyNo,String designation,String jobType){
            this.vacancyNo = vacancyNo;
            this.designation=designation;
            this.jobType=jobType;
        }       
        
    //creating accessor methods for private variables 
    
    public int getVacancyNO(){
        return vacancyNo;
    }
    
    public String getDesignation(){
        return designation;
    } 
    
    public String getJobType(){
        return jobType;
    }
    
    public void setVacancyNO(int vacancyNo){
        this.vacancyNo=vacancyNo;
    }
    
    public void setDesignation(String designation){
        this.designation=designation;
    }
    
    public void setJobType(String jobType){
        this.jobType=jobType;
    }
    
    //defining a method to display the values of variables
    public void display(){
        System.out.println("Vacancy no     = " + vacancyNo);
        System.out.println("Designation    = " + designation);
        System.out.println("Job type       = " + jobType);
    }
}