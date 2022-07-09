    /**
 * AcademicCourse is a sub class of Course class.
 * This class register AcademicCourse.
 * @author(Priyanka Singh Thakuri)
 */
public class AcademicCourse extends Course
{  //class level variable
   private String lecturername;
   private String level;
   private String credit;
   private String startingDate;
   private String completionDate;
   public int numberofAssessments;
   private boolean isRegistered;
   
   //constructor for AcademicCourse class
    public AcademicCourse(String courseID, String coursename, int duration, String level, String credit, int numberofAssessments)
    { 
       super(courseID,coursename,duration);
       this.level = level;
       this.credit = credit;
       this.numberofAssessments = numberofAssessments;
       lecturername = "";
       startingDate = "";
       completionDate = "";
       isRegistered = false;
       
    }
    
  
    //method to get level
    public String getLevel()
    {
        return this.level;
    }
    
    //method to get credit
    public String getCredit()
    {
        return this.credit;
    }
    
    //method to get numberofAssessments
    public int getNumberofAssessments()
    {
        return this.numberofAssessments;
    }
    
    //method to get lecturername
    public String getLecturername()
    {
        return this.lecturername;
    }
    
    //method to get startingDate
    public String getStartingDate()
    {
        return this.startingDate;
    }
    
    //method to get completionDate
    public String getCompletionDate()
    {
        return this.completionDate;
    }
    
    //method to get isRegistered
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    
    //method to set lecturername
    public void setLecturername(String newlecturername)
    {
        this.lecturername= newlecturername;
    }
    
    //method to set numberofAssessments
    public void setNumberofAssessments(int newnumberofAssessments)
    {
        this.numberofAssessments= newnumberofAssessments;
    }
    
    //method to register AcademicCourse
    public void Register(String courseLeader,String lecturername,String startingDate,String completionDate)
    {   
        /*
         * condition applied
         * if AcademicCourse is already registered, display appropriate message for it
         * if AcademicCourse has not been registered, register the AcademicCourse and display suitable message.
         */
        if(isRegistered==true)// checking condition as if AcademicCourse is already registered
        {
         this.lecturername = lecturername;
         this.startingDate = startingDate;
         this.completionDate = completionDate;
            
         System.out.println("This AcademicCourse of"+getLecturername()+"starting from"+getStartingDate()+"to"+getCompletionDate()+"has been already registered");
        }
        else // if not registered, register the AcademicCourse and display the message
        {
         super.setCourseLeader(courseLeader);
         this.lecturername = lecturername;
         this.startingDate = startingDate;
         this.completionDate = completionDate;
         this.isRegistered = true;
                
         System.out.println("Congratulations! You have successfully registered a Academic-Course");
                
        }
    }
    
    //method to display information about AcademicCourse
    public void Display()
    {    /*
           * condition applied
           * if AcademicCourse is already registered, display all info
           * if not display info about courseId,coursename,duration and courseLeader
           */
        if(isRegistered==true)// already registered AcademicCourse, checking booleans value
        {
          super.display();
          System.out.println("Name of lecturer =" +getLecturername());
          System.out.println("Level of course =" +getLevel());
          System.out.println("Credit of course =" +getCredit());
          System.out.println("Starting date of course =" +getStartingDate());
          System.out.println("Completion date of course =" +getCompletionDate());
          System.out.println("Number of Assessments of course =" +getNumberofAssessments());
        }
        else //if not registered
        {
            super.display();
        }
    }
}
    
        
    
 
        
        
            
        
        
        
        
        
        
    
    
    
    
    

    
        
    
       
   

   
