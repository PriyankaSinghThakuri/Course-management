/**
 * NonAcademicCourse is a sub class of AcademicCourse.
 * This class Register and remove the NonAcademicCourse.
 * @author(Priyanka Singh Thakuri)
 */
public class NonAcademicCourse extends Course
{   // class level variable
    private String instructorname;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private int duration;
    private boolean isRegistered;
    private boolean isRemoved;
    
    //constructors for NonAcademicCourse class
    public NonAcademicCourse(String courseID,String coursename,int duration,String prerequisite)
    {   
        super(courseID,coursename,duration);
        this.duration = duration;
        this.prerequisite = prerequisite;
        startDate = "";
        completionDate = "";
        examDate = "";
        isRegistered = false;
        isRemoved = false;
    }
    
    //method to get instructorname
    public String getInstructorname()
    {
        return this.instructorname;
    }
    
    //method to get prerequisite
    public String getPrerequisite()
    {
        return this.prerequisite;
    }
    
    //method to get startDate
    public String getStartDate()
    {
        return this.startDate= startDate;
    }
    
    //method to get completionDate
    public String getCompletionDate()
    {
        return this.completionDate= completionDate;
    }
    
    //method to get examDate
    public String getExamDate()
    {
        return this.examDate= examDate;
    }
    
    //method to get isRegistered
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    
    //method to get isRemoved
    public boolean getIsRemoved()
    {
        return this.isRemoved;
    }
    
    //method to set instructorname
    public void setInstructorname(String newinstructorname)
    {   
        /*
         * condition applied
         * NonAcademicCourse has not registered yet, set instructorname
         * NonAcademicCourse is already registered, display message
         */
        if(isRegistered==false) //checking condition
        {
            this.instructorname = newinstructorname;
            isRegistered=true;//assigning boolean value
        }
        else{
            System.out.println("You have already assigned instructor" +instructorname);
        }
    }
    
    //method to register NonAcademicCourse
    public void Register(String courseLeader,String instructorname,String startDate,String completionDate,String examDate)
    {
        /*
         * condition applied
         * if NonAcademicCourse has not registered yet,register it and display suitable message
         * if NonAcademicCourse is already registered, display appropriate message.
         */
        if(isRegistered==false) //checking condition for registring NonAcademicCourse
        {
            setInstructorname(instructorname);
            this.instructorname = instructorname;
            super.setCourseLeader(courseLeader);
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            this.isRegistered = true;
            System.out.println("The non-academic course has been removed successfully");
        }
        else// if already registered display message
        {   
            System.out.println("The non-academic course has been already registered");
        
        }
    }
    
    //method to remove NonAcademicCourse
    public void Remove()
    {   
        /*
         * condition applied
         * if NonAcademicCourse is already removed, display suitable message
         * if NonAcademicCourse is not removed yet, remove it and display appropriate message.
         */
        if(isRemoved==true) //checking condition for removing NonAcademicCourse
        {
            System.out.println("The non-academic course has been already removed");
         }
        else // if not removed,remove it and display message
         {  super.setCourseLeader("");
            instructorname ="";
            startDate = "";
            completionDate = "";
            examDate = "";
            isRegistered = false;
            isRemoved = true;
            System.out.println("The non-academic course has sucessfully removed");
          }
    }
     
    //method to display overall information about NonAcademicCourse
    public void Display()
    {
        /*
         * condition applied
         * if NonAcademicCourse is already registered, display appropriate message.
         */
        super.display();
        if(isRegistered==true) //already registered
        {
         
         System.out.println("Name of instructor =" +getInstructorname());
         System.out.println("Date when course start =" +getStartDate());
         System.out.println("Date of completion of course =" +getCompletionDate());
         System.out.println("Date of exam =" +getExamDate());
        }
    }
}

        
        
        
            
            
            
            
    
    
    
    

    
    
        
        
    
