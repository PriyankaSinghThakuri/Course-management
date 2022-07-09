/**
 * Course class is super class.
 * It consist of common attributes and methods which is used by sub class.
 * @author (Priyanka Singh Thakuri)
 */
public class Course
{
        // class level variable
        private String courseID;
        private String coursename;
        private String courseLeader;
        private int duration;
    
        
        //constructor of Course class
        public Course(String courseID, String coursename, int duration)
        {
            //This keyword represent class level variable
            this.courseID= courseID;
            this.coursename= coursename;
            this.duration= duration;
            courseLeader="";
        }
        
        //method to get courseID
        public String getCourseID()
        {
            return this.courseID;
        }
        
        //method to get coursename
        public String getCoursename()
        {
            return this.coursename;
        }
        
        //method to get duration 
        public int getDuration()
        {
            return this.duration;
        }
        
        //method to get courseLeader
        public String getCourseLeader()
        {
            return this.courseLeader;
        }
        
        //method to set courseLeader
        public void setCourseLeader(String courseLeader)
        {
            this.courseLeader=courseLeader;
            
        }
        
        //method to display entire information of course
        public void display()
        {
            /*
             * condition applied
             * display courseLeader only if it is not empty. 
             * get methods are called to display value.
            */
           
            if(courseLeader !="")
            {
                System.out.println("Name of courseLeader=" +getCourseLeader());
            }
            
                //display compulsory
                System.out.println("ID of course=" +getCourseID());
                System.out.println("Name of course=" +getCoursename());
                System.out.println("Duration of course=" +getDuration());
                
        }
}
        
        
             
        
        
        

        
        
        
        
        
        
        
    
