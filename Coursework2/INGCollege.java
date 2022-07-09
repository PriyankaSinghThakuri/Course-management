/**
 * Write a description of class INGCollege here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class INGCollege implements ActionListener
{
    //Declaration of ArrayList
    ArrayList<Course>alist =  new ArrayList<Course>();

    private JFrame First_Frame,Second_Frame;

    private JPanel First_Panel,Second_Panel;

    private JLabel Title_1,courseid_1,coursename_1,Duration_1,Level,Credit,NumofAssessments,courseleader_1,Lecturername,StartingDate_1,CompletionDate_1,Title_2,courseid_2,
    coursename_2,Duration_2,Prerequisite,courseleader_2,Instructorname,StartingDate_2,CompletionDate_2,ExamDate;

    private JTextField Courseid_Field1,Coursename_Field1,Duration_Field1,Level_Field,Credit_Field,NumofAssessments_Field,Courseleader_Field1,Lecturername_Field,Courseid_Field2,
    Coursename_Field2,Duration_Field2,Prerequisite_Field,Courseleader_Field2,Instructorname_Field;

    private JButton Change_1,Add_1,Register_1,Display_1,Clear_1,Change_2,Add_2,Register_2,Remove,Display_2,Clear_2;

    private JComboBox Year_1,Month_1,Day_1,Year_2,Month_2,Day_2,Year_3,Month_3,Day_3,Year_4,Month_4,Day_4,Year_5,Month_5,Day_5;

    private static INGCollege ing = new INGCollege();

    //Academic course object
    private static AcademicCourse academic; 

    //Non-AcademicCourse object
    private static NonAcademicCourse nonacademic;

    private String Academic_id,Academic_Name,Academic_Duration,Academic_Level,Academic_Credit,Academic_NumofAssessments,NonAcademic_id,NonAcademic_Name,NonAcademic_Duration,
    NonAcademic_Prerequisite,RegisterAcademic_id,RegisterAcademic_Leader,Register_Lecturer,Register_startingDate,Register_completionDate,RegisterNonAcademic_id,
    RegisterNonAcademic_Leader,Register_Instructor,Register_startingDate2,Register_completionDate2,Register_ExamDate;

    private int A_Duration,A_NumofAssessments,NA_Duration;

    private JOptionPane msg_Add1,msg_Add2;

    public void FirstForm()
    {
        First_Frame = new JFrame("Academic Course");
        First_Frame.setLayout(null);
        First_Frame.setResizable(false);
        First_Frame.setBounds(200,100,870,990);

        First_Panel = new JPanel();
        First_Panel.setLayout(null);
        Color c = new Color(255,255,158);
        First_Panel.setBackground(c);
        First_Panel.setBounds(30,250,400,310);

        Font F1 = new Font("Times New Roman",Font.BOLD,40);
        Font F2 = new Font("Times New Roman",Font.PLAIN,20);
        Font F3 = new Font("Arial",Font.PLAIN,12);

        //Title--> Academic Course

        Title_1 = new JLabel("Academic Course");
        Title_1.setBounds(250,50,800,85);
        Title_1 .setFont(F1);
        First_Frame.add(Title_1);

        //JButton for changing for Non-Academic Course
        Change_1 = new JButton("Change for Non-Academic Course");
        Change_1.setBounds(440,190,350,45);
        Change_1.setFont(F2);
        First_Frame.add(Change_1);
        Change_1.addActionListener(this);

        //Jlabel --> Course ID of Academic Course
        courseid_1 = new JLabel("Course ID  :");
        courseid_1.setBounds(28,10,150,25);
        courseid_1.setFont(F2);
        First_Panel.add(courseid_1);

        //JText field of CourseID
        Courseid_Field1 = new JTextField();
        Courseid_Field1.setBounds(170,8,200,33);
        First_Panel.add(Courseid_Field1);

        //Jlabel --> Course Name of Academic Course
        coursename_1 = new JLabel("Course Name :");
        coursename_1.setBounds(28,50,150,25);
        coursename_1.setFont(F2);
        First_Panel.add(coursename_1);

        //JText field of Course Name
        Coursename_Field1 = new JTextField();
        Coursename_Field1.setBounds(170,50,200,33);
        First_Panel.add(Coursename_Field1);

        //Jlabel --> Duration of Academic Course
        Duration_1 = new JLabel("Duration :");
        Duration_1.setBounds(28,90,150,25);
        Duration_1.setFont(F2);
        First_Panel.add(Duration_1);

        //JText field of Duration
        Duration_Field1 = new JTextField();
        Duration_Field1.setBounds(170,90,200,33);
        First_Panel.add(Duration_Field1);

        //Jlabel --> Level of Academic Course
        Level = new JLabel("Level :");
        Level.setBounds(28,130,150,25);
        Level.setFont(F2);
        First_Panel.add(Level);

        //JText field of Level
        Level_Field = new JTextField();
        Level_Field.setBounds(170,130,200,33);
        First_Panel.add(Level_Field);

        //Jlabel --> Credit of Academic Course
        Credit = new JLabel("Credit :");
        Credit.setBounds(28,170,150,25);
        Credit.setFont(F2);
        First_Panel.add(Credit);

        //JText field of Credit
        Credit_Field = new JTextField();
        Credit_Field.setBounds(170,170,200,33);
        First_Panel.add(Credit_Field);

        //Jlabel --> Number of assessments of Academic Course
        NumofAssessments = new JLabel("Number of Assessments :");
        NumofAssessments.setBounds(28,210,200,25);
        NumofAssessments.setFont(F2);
        First_Panel.add(NumofAssessments);

        //JText field of Number of Assessments
        NumofAssessments_Field = new JTextField();
        NumofAssessments_Field.setBounds(250,210,100,33);
        First_Panel.add(NumofAssessments_Field);

        //JButton to Add Academic Course
        Add_1 = new JButton("Add Course for Academic Course");
        Add_1.setBounds(28,260,330,40);
        Add_1.setFont(F2);
        First_Panel.add(Add_1);
        Add_1.addActionListener(this);

        //Jlabel --> Course Leader of Academic Course
        courseleader_1 = new JLabel("Course Leader  :");
        courseleader_1.setBounds(440,260,150,25);
        courseleader_1.setFont(F2);
        First_Frame.add(courseleader_1);

        //JText field of Course Leader
        Courseleader_Field1 = new JTextField();
        Courseleader_Field1.setBounds(590,260,200,33);
        First_Frame.add(Courseleader_Field1);

        //Jlabel --> Lecturer Name of Academic Course
        Lecturername = new JLabel("Lecturer Name  :");
        Lecturername.setBounds(440,300,150,25);
        Lecturername.setFont(F2);
        First_Frame.add(Lecturername);

        //JText field of Lecturer Name
        Lecturername_Field = new JTextField();
        Lecturername_Field.setBounds(590,300,200,33);
        First_Frame.add(Lecturername_Field);

        //JLabel for StartingDate of Academic Course
        StartingDate_1 = new JLabel("Starting Date   :");
        StartingDate_1.setBounds(440,348,190,25);
        StartingDate_1.setFont(F2);
        First_Frame.add(StartingDate_1);

        //JComboBox
        String[] years = {"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
                "2014","2015","2016","2017","2018","2019","2020","2021"};
        Year_1 = new JComboBox(years);
        Year_1.setBounds(590,348,55,30);
        Year_1.setFont(F3);
        First_Frame.add(Year_1);

        //JComboBox
        String[] month = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        Month_1 = new JComboBox(month);
        Month_1.setBounds(652,348,70,30);
        Month_1.setFont(F3);
        First_Frame.add(Month_1);

        //JComboBox,
        String[] day = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28",
                "29","30","31"};
        Day_1 = new JComboBox(day);
        Day_1.setBounds(732,348,53,30);
        Day_1.setFont(F3);
        First_Frame.add(Day_1);

        //JLabel for CompletionDate of Academic Course
        CompletionDate_1 = new JLabel("Completion Date :");
        CompletionDate_1.setBounds(440,388,190,25);
        CompletionDate_1.setFont(F2);
        First_Frame.add(CompletionDate_1);

        //JComboBox
        String[] years2 = {"1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
                "2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
        Year_2 = new JComboBox(years2);
        Year_2.setBounds(590,388,55,30);
        Year_2.setFont(F3);
        First_Frame.add(Year_2);

        //JComboBox
        String[] month2 = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        Month_2 = new JComboBox(month2);
        Month_2.setBounds(652,388,70,30);
        Month_2.setFont(F3);
        First_Frame.add( Month_2);

        //JComboBox,
        String[] day2 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28",
                "29","30","31"};
        Day_2 = new JComboBox(day2);
        Day_2.setBounds(732,388,53,30);
        Day_2.setFont(F3);
        First_Frame.add( Day_2);

        //JButton to Register Academic Course
        Register_1 = new JButton("Register Academic Course");
        Register_1.setBounds(440,438,350,40);
        Register_1.setFont(F2);
        First_Frame.add(Register_1);
        Register_1.addActionListener(this);

        //JButton to Display Academic Course
        Display_1 = new JButton("Display");
        Display_1.setBounds(480,498,130,40);
        Display_1.setFont(F2);
        First_Frame.add(Display_1);
        Display_1.addActionListener(this);

        //JButton to Clear Academic Course
        Clear_1 = new JButton("Clear");
        Clear_1.setBounds(630,498,130,40);
        Color cc = new Color(255,83,73);
        Clear_1.setBackground(cc);
        Clear_1.setFont(F2);
        First_Frame.add(Clear_1);
        Clear_1.addActionListener(this);

        First_Frame.add(First_Panel);
        First_Frame.setBounds(200,100,810,660);
        First_Frame.setVisible(true);
    }

    public void SecondForm()
    { 
        Second_Frame = new JFrame("Non-Academic Course");
        Second_Frame.setLayout(null);
        Second_Frame.setResizable(false);
        Second_Frame.setBounds(200,100,870,990);

        Second_Panel = new JPanel();
        Second_Panel.setLayout(null);
        Color c = new Color(255,255,158);
        Second_Panel.setBackground(c);
        Second_Panel.setBounds(30,250,400,310);

        Font F1 = new Font("Times New Roman",Font.BOLD,40);
        Font F2 = new Font("Times New Roman",Font.PLAIN,20);
        Font F3 = new Font("Arial",Font.PLAIN,12);

        //Title--> Non-Academic Course

        Title_2 = new JLabel("Non-Academic Course");
        Title_2.setBounds(250,50,800,85);
        Title_2 .setFont(F1);
        Second_Frame.add(Title_2);

        //JButton for changing for Academic Course
        Change_2 = new JButton("Change for Academic Course");
        Change_2.setBounds(440,190,350,45);
        Change_2.setFont(F2);
        Change_2.addActionListener(this);
        Change_2.setActionCommand("back");
        Second_Frame.add(Change_2);

        //Jlabel --> Course ID of NonAcademic Course
        courseid_2 = new JLabel("Course ID  :");
        courseid_2.setBounds(28,10,150,25);
        courseid_2.setFont(F2);
        Second_Panel.add(courseid_2);

        //JText field of CourseID
        Courseid_Field2 = new JTextField();
        Courseid_Field2.setBounds(170,8,200,33);
        Second_Panel.add(Courseid_Field2);

        //Jlabel --> Course Name of NonAcademic Course
        coursename_2 = new JLabel("Course Name :");
        coursename_2.setBounds(28,50,150,25);
        coursename_2.setFont(F2);
        Second_Panel.add(coursename_2);

        //JText field of Course Name
        Coursename_Field2 = new JTextField();
        Coursename_Field2.setBounds(170,50,200,33);
        Second_Panel.add(Coursename_Field2);

        //Jlabel --> Duration of NonAcademic Course
        Duration_2 = new JLabel("Duration :");
        Duration_2.setBounds(28,90,150,25);
        Duration_2.setFont(F2);
        Second_Panel.add(Duration_2);

        //JText field of Duration
        Duration_Field2 = new JTextField();
        Duration_Field2.setBounds(170,90,200,33);
        Second_Panel.add(Duration_Field2);

        //Jlabel --> Prerequisite
        Prerequisite = new JLabel("Prerequisite :");
        Prerequisite.setBounds(28,130,150,25);
        Prerequisite.setFont(F2);
        Second_Panel.add(Prerequisite);

        //JText field of Prerequisite of NonAcademic Course
        Prerequisite_Field = new JTextField();
        Prerequisite_Field.setBounds(170,130,200,33);
        Second_Panel.add(Prerequisite_Field);

        //JButton to Add Non-Academic Course
        Add_2 = new JButton("Add Course for Non-Academic Course");
        Add_2.setBounds(28,185,350,40);
        Add_2.setFont(F2);
        Second_Panel.add(Add_2);
        Add_2.addActionListener(this);

        //JButton to Remove Non-Academic Course
        Remove = new JButton("Remove Non-Academic Course");
        Remove.setBounds(28,240,350,40);
        Remove.setFont(F2);
        Second_Panel.add(Remove);
        Remove.addActionListener(this);

        //Jlabel --> Course Leader of NonAcademic Course
        courseleader_2 = new JLabel("Course Leader  :");
        courseleader_2.setBounds(440,260,150,25);
        courseleader_2.setFont(F2);
        Second_Frame.add(courseleader_2);

        //JText field of Course Leader
        Courseleader_Field2 = new JTextField();
        Courseleader_Field2.setBounds(590,260,200,33);
        Second_Frame.add(Courseleader_Field2);

        //Jlabel --> Instructor Name of NonAcademic Course
        Instructorname = new JLabel("Instructor Name  :");
        Instructorname.setBounds(440,300,150,25);
        Instructorname.setFont(F2);
        Second_Frame.add(Instructorname);

        //JText field of Instructor Name
        Instructorname_Field = new JTextField();
        Instructorname_Field.setBounds(590,300,200,33);
        Second_Frame.add(Instructorname_Field);

        //JLabel for StartingDate of NonAcademic Course
        StartingDate_2 = new JLabel("Starting Date   :");
        StartingDate_2.setBounds(440,348,190,25);
        StartingDate_2.setFont(F2);
        Second_Frame.add(StartingDate_2);

        //JComboBox
        String[] years3 = {"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
                "2014","2015","2016","2017","2018","2019","2020","2021"};
        Year_3 = new JComboBox(years3);
        Year_3.setBounds(590,348,55,30);
        Year_3.setFont(F3);
        Second_Frame.add(Year_3);

        //JComboBox
        String[] month3 = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        Month_3 = new JComboBox(month3);
        Month_3.setBounds(652,348,70,30);
        Month_3.setFont(F3);
        Second_Frame.add(Month_3);

        //JComboBox,
        String[] day3 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28",
                "29","30","31"};
        Day_3 = new JComboBox(day3);
        Day_3.setBounds(732,348,53,30);
        Day_3.setFont(F3);
        Second_Frame.add(Day_3);

        //JLabel for CompletionDate of NonAcademic Course
        CompletionDate_2 = new JLabel("Completion Date :");
        CompletionDate_2.setBounds(440,388,190,25);
        CompletionDate_2.setFont(F2);
        Second_Frame.add(CompletionDate_2);

        //JComboBox
        String[] years4 = {"1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
                "2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
        Year_4 = new JComboBox(years4);
        Year_4.setBounds(590,388,55,30);
        Year_4.setFont(F3);
        Second_Frame.add(Year_4);

        //JComboBox
        String[] month4 = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        Month_4 = new JComboBox(month4);
        Month_4.setBounds(652,388,70,30);
        Month_4.setFont(F3);
        Second_Frame.add(Month_4);

        //JComboBox,
        String[] day4 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28",
                "29","30","31"};
        Day_4 = new JComboBox(day4);
        Day_4.setBounds(732,388,53,30);
        Day_4.setFont(F3);
        Second_Frame.add(Day_4);

        //JLabel for ExamDate
        ExamDate= new JLabel("Exam Date :");
        ExamDate.setBounds(440,428,190,25);
        ExamDate.setFont(F2);
        Second_Frame.add(ExamDate);

        //JComboBox
        String[] years5 = {"1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
                "2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
        Year_5 = new JComboBox(years5);
        Year_5.setBounds(590,428,55,30);
        Year_5.setFont(F3);
        Second_Frame.add(Year_5);

        //JComboBox
        String[] month5 = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        Month_5 = new JComboBox(month5);
        Month_5.setBounds(652,428,70,30);
        Month_5.setFont(F3);
        Second_Frame.add(Month_5);

        //JComboBox,
        String[] day5 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28",
                "29","30","31"};
        Day_5 = new JComboBox(day5);
        Day_5.setBounds(732,428,53,30);
        Day_5.setFont(F3);
        Second_Frame.add(Day_5);

        //JButton to Register Non-Academic Course
        Register_2 = new JButton("Register Non-Academic Course");
        Register_2.setBounds(440,468,350,40);
        Register_2.setFont(F2);
        Second_Frame.add(Register_2);
        Register_2.addActionListener(this);

        //JButton to Display NonAcademic Course
        Display_2 = new JButton("Display");
        Display_2.setBounds(480,518,130,40);
        Display_2.setFont(F2);
        Second_Frame.add(Display_2);
        Display_2.addActionListener(this);

        //JButton to Clear NonAcademic Course
        Clear_2 = new JButton("Clear");
        Clear_2.setBounds(630,518,130,40);
        Color cc = new Color(255,83,73);
        Clear_2.setBackground(cc);
        Clear_2.setFont(F2);
        Second_Frame.add(Clear_2);
        Clear_2.addActionListener(this);

        Second_Frame.add(Second_Panel);
        Second_Frame.setBounds(400,200,810,660);
        Second_Frame.setVisible(true);
    }

    public static void main(String args[])
    {
        ing.FirstForm();
    }

    public void clearData1()
    {
        //setting null value to the field
        Courseid_Field1.setText("");
        Coursename_Field1.setText("");
        Duration_Field1.setText("");
        Level_Field.setText("");
        Credit_Field.setText("");
        NumofAssessments_Field.setText("");
        Courseleader_Field1.setText("");
        Lecturername_Field.setText("");
    }

    public void clearData2()
    {
        //setting null value to the field
        Courseid_Field2.setText("");
        Coursename_Field2.setText("");
        Duration_Field2.setText("");
        Prerequisite_Field.setText("");
        Courseleader_Field2.setText("");
        Instructorname_Field.setText("");
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == Change_1)
        {
            SecondForm();

        }
        else if(e.getSource() == Change_2)
        {
            Second_Frame.dispose();
            First_Frame.toFront();
        }

        //Adding Course for AcademicCourse
        else if(e.getSource() == Add_1)
        {
            try{
                if(Courseid_Field1.getText().isEmpty()|| Coursename_Field1.getText().isEmpty()|| Duration_Field1.getText().isEmpty() || Level_Field.getText().isEmpty() ||
                Credit_Field.getText().isEmpty() ||NumofAssessments_Field.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(First_Frame,"Fill all the text fields","Error!",JOptionPane.ERROR_MESSAGE); 
                }
                else{

                    Academic_id = Courseid_Field1.getText();
                    Academic_Name = Coursename_Field1.getText();
                    Academic_Duration = Duration_Field1.getText();
                    A_Duration = Integer.parseInt(Academic_Duration);

                    Academic_Level = Level_Field.getText();

                    Academic_Credit = Credit_Field.getText();

                    Academic_NumofAssessments = NumofAssessments_Field.getText();
                    A_NumofAssessments = Integer.parseInt(Academic_NumofAssessments);

                    boolean isDuplicate=false;
                    for(Course dup_1:alist)
                    {
                        if(dup_1.getCourseID().equals(Academic_id))
                        {
                            isDuplicate=true;
                            break;
                        }
                    }

                    if(isDuplicate==false){ 
                        if(Integer.parseInt(Academic_Duration)<1 || Integer.parseInt(Academic_NumofAssessments)<1)
                        {//checking for negative input
                            JOptionPane.showMessageDialog(First_Frame,"Please input valid values in the field !!","Error!",JOptionPane.ERROR_MESSAGE);
                        }

                        else{//Calling the Constructor of Academic Course class
                            academic = new AcademicCourse(Academic_id,Academic_Name,A_Duration,Academic_Level,Academic_Credit,A_NumofAssessments);

                            //creating arraylist
                            alist.add(academic);

                            int check=JOptionPane.showConfirmDialog(First_Frame,"Do you want to add Course for Academic Course ?","Academic Course",JOptionPane.YES_NO_OPTION);
                            if(check==0){//0-represents yes option.
                                //messageDialog
                                msg_Add1 = new JOptionPane();
                                msg_Add1.showMessageDialog(First_Frame,"The Course for Academic Course has been added","Message",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(First_Frame,"Given CourseID is already in the list. List size: "+alist.size());
                    }
                }
            }catch(NumberFormatException exn){
                JOptionPane.showMessageDialog(First_Frame,"Enter valid input","Error!",JOptionPane.ERROR_MESSAGE);
            }
        }

        //Adding Course for Non-AcademicCourse
        else if(e.getSource() == Add_2)
        {
            try{
                if(Courseid_Field2.getText().isEmpty()|| Coursename_Field2.getText().isEmpty() || Duration_Field2.getText().isEmpty() || Prerequisite_Field.getText().isEmpty()) 
                {
                    JOptionPane.showMessageDialog(Second_Frame,"Fill all the text fields","Error!",JOptionPane.ERROR_MESSAGE); 
                }
                else{

                    NonAcademic_id = Courseid_Field2.getText();
                    NonAcademic_Name = Coursename_Field2.getText();
                    NonAcademic_Duration = Duration_Field2.getText();
                    NA_Duration = Integer.parseInt(NonAcademic_Duration);

                    NonAcademic_Prerequisite = Prerequisite_Field.getText();

                    boolean isDuplicate=false;
                    for(Course dup_2:alist)
                    {
                        if(dup_2.getCourseID().equals(NonAcademic_id))
                        {
                            isDuplicate=true;
                            break;

                        }
                    }
                    if(isDuplicate==false){

                        if(NA_Duration<1){//checking for negative input
                            JOptionPane.showMessageDialog(Second_Frame,"Please input valid values in the field !!","Error!",JOptionPane.ERROR_MESSAGE);
                        }

                        else{//Calling the Constructor of non-Academic Course
                            nonacademic = new NonAcademicCourse(NonAcademic_id,NonAcademic_Name,NA_Duration,NonAcademic_Prerequisite);

                            //creating arraylist
                            alist.add(nonacademic);

                            int check=JOptionPane.showConfirmDialog(Second_Frame,"Do you want to add Course for Academic Course ?","Non-Academic Course",JOptionPane.YES_NO_OPTION);
                            if(check==0){//0-represents yes option.
                                //messageDialog
                                msg_Add2 = new JOptionPane();
                                msg_Add2.showMessageDialog(Second_Frame,"The Course for Non-Academic Course has been added","Message",JOptionPane.INFORMATION_MESSAGE);
                            } 
                        }
                    }

                    else
                    {
                        JOptionPane.showMessageDialog(Second_Frame,"Given CourseID is already in the list. List size: "+alist.size());
                    }
                }
            }catch(NumberFormatException ef){//if error handle here
                JOptionPane.showMessageDialog(Second_Frame,"Enter valid input","Error!",JOptionPane.ERROR_MESSAGE);
            }
        }

        //Registration of Academic Course
        else if (e.getSource() == Register_1)
        {
            try{

                RegisterAcademic_id = Courseid_Field1.getText();

                RegisterAcademic_Leader = Courseleader_Field1.getText();

                Register_Lecturer = Lecturername_Field.getText();

                //for startingDate
                String years = (Year_1.getSelectedItem()).toString();
                String month = (Month_1.getSelectedItem()).toString();
                String day = (Day_1.getSelectedItem()).toString();
                Register_startingDate = years + month + day;

                //For completionDate
                String years2 = (Year_2.getSelectedItem()).toString();
                String month2 = (Month_2.getSelectedItem()).toString();
                String day2 = (Day_2.getSelectedItem()).toString();
                Register_completionDate = years2 + month2 + day2;

                boolean Registercourseid = false;
                //Comparison of courseID
                for(Course var1 : alist)
                {
                    if(var1.getCourseID().equals(RegisterAcademic_id))
                    {
                        Registercourseid = true;
                        if(var1 instanceof AcademicCourse)
                        {
                            academic = (AcademicCourse)var1;

                            if(RegisterAcademic_id.equals("")|| RegisterAcademic_Leader.equals("") || Register_Lecturer.equals("")){//checking for null values
                                JOptionPane.showMessageDialog(First_Frame,"Please fill up the missing field!","Warning!",JOptionPane.WARNING_MESSAGE);
                            }  
                            else{
                                //If the academic course is already registered
                                if(academic.getIsRegistered() == true) 
                                {
                                    System.out.println();
                                    System.out.println("--------Academic Course Registration Message----------");
                                    System.out.println();
                                    JOptionPane.showMessageDialog(First_Frame,"Sorry,Academic Course has been already registered","Error!",JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                                else if(academic.getIsRegistered() == false)
                                {
                                    System.out.println();
                                    System.out.println("--------Academic Course Registration Message----------");
                                    academic.Register(RegisterAcademic_Leader,Register_Lecturer,Register_startingDate,Register_completionDate);
                                    System.out.println();
                                    JOptionPane.showMessageDialog(First_Frame,"Congratulations,The Academic Course has been registered successfully","Message",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                        }
                    }
                }
                if(alist.isEmpty())
                {
                    JOptionPane.showMessageDialog(First_Frame, "Academic course is not added","Error",JOptionPane.ERROR_MESSAGE);

                }

                else if(!Registercourseid)
                {
                    JOptionPane.showMessageDialog(First_Frame,"CourseID is not same, please! check it out.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(First_Frame,"You have left the field empty!","Error!",JOptionPane.ERROR_MESSAGE);
            }
        }

        //Registration of Non-academic Course
        else if (e.getSource() == Register_2)
        {
            try{
                RegisterNonAcademic_id = Courseid_Field2.getText();

                RegisterNonAcademic_Leader = Courseleader_Field2.getText();

                Register_Instructor = Instructorname_Field.getText();

                //For startingDate
                String years3 = (Year_3.getSelectedItem()).toString();
                String month3 = (Month_3.getSelectedItem()).toString();
                String day3 = (Day_3.getSelectedItem()).toString();
                Register_startingDate2 = years3 + month3 + day3;

                //For completionDate
                String years4 = (Year_4.getSelectedItem()).toString();
                String month4 = (Month_4.getSelectedItem()).toString();
                String day4 = (Day_4.getSelectedItem()).toString();
                Register_completionDate2 = years4 + month4 + day4;

                //For ExamDate
                String years5 = (Year_5.getSelectedItem()).toString();
                String month5 = (Month_5.getSelectedItem()).toString();
                String day5 = (Day_5.getSelectedItem()).toString();
                Register_ExamDate = years5 + month5 + day5;

                boolean Registercourseid = false;

                //Comparison of courseID
                for(Course var2 : alist)
                {
                    if(var2.getCourseID().equals(RegisterNonAcademic_id))
                    {
                        Registercourseid = true;
                        if(var2 instanceof NonAcademicCourse)
                        {
                            nonacademic = (NonAcademicCourse)var2;

                            if(RegisterNonAcademic_id.equals("")|| RegisterNonAcademic_Leader.equals("") || Register_Instructor.equals("")){//checking for null values
                                JOptionPane.showMessageDialog(Second_Frame,"Please fill up the missing field!","Warning!",JOptionPane.WARNING_MESSAGE);
                            }  
                            else{
                                //if the non-academic course is already registered
                                if(nonacademic.getIsRegistered() == true)
                                {
                                    System.out.println();
                                    System.out.println("--------Non-Academic Course Registration Message----------");
                                    System.out.println();
                                    JOptionPane.showMessageDialog(Second_Frame,"Sorry,Non-Academic Course has been already registered","Error!",JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                                else if(nonacademic.getIsRegistered() == false)
                                {
                                    System.out.println();
                                    System.out.println("--------Non-Academic Course Registration Message----------");
                                    nonacademic.Register(RegisterNonAcademic_Leader,Register_Instructor,Register_startingDate2,Register_completionDate2,Register_ExamDate);
                                    System.out.println();
                                    JOptionPane.showMessageDialog(Second_Frame,"Congratulations,The Non-Academic Course has been registered successfully","Message",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                        }
                    }
                }
                if(alist.isEmpty())
                {
                    JOptionPane.showMessageDialog(Second_Frame, "Academic course is not added","Error",JOptionPane.ERROR_MESSAGE);
                }

                else if(!Registercourseid)
                {
                    JOptionPane.showMessageDialog(Second_Frame,"CourseID is not same, please! check it out.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException ea){
                JOptionPane.showMessageDialog(Second_Frame,"You have entered the wrong value\n or have left the field empty!","Error!",JOptionPane.ERROR_MESSAGE);
            } 
        }

        //Remove for Non-Academic Course
        else if(e.getSource() == Remove)
        {
            RegisterNonAcademic_id = Courseid_Field2.getText();

            for(Course var3:alist)
            {
                if(var3.getCourseID().equals(RegisterNonAcademic_id))
                {
                    if(var3 instanceof NonAcademicCourse)
                    {
                        nonacademic = (NonAcademicCourse) var3 ;
                    }

                    if(nonacademic.getIsRemoved()==true)
                    {
                        System.out.println();
                        System.out.println("--------Non-Academic Course Removing Message----------");
                        nonacademic.Remove();
                        System.out.println();
                        JOptionPane.showMessageDialog(Second_Frame, "NonAcademicCourse is already removed");
                        break;
                    }

                    else if(nonacademic.getIsRemoved()==false)
                    {
                        System.out.println();
                        System.out.println("--------Non-Academic Course Removing Message----------");
                        nonacademic.Remove();
                        System.out.println();
                        JOptionPane.showMessageDialog(Second_Frame, "Non_academicCourse is removed sucessfully");

                    }
                } 
            }
        }

        //Display for AcademicCourse
        else if(e.getSource() == Display_1)
        {
            //If the academic course is not added and not registered
            if(alist.isEmpty())
            {
                JOptionPane.showMessageDialog(First_Frame,"No records found to display !","Message",JOptionPane.INFORMATION_MESSAGE);//if no records found
            }
            else
            {
                for(Course list1: alist)
                {
                    if (list1 instanceof AcademicCourse){
                        academic = (AcademicCourse) list1;

                        //calling display method from another class
                        academic.Display();
                    }
                }
            }
        }

        //Display for Non-Academic Course
        else if(e.getSource() == Display_2)
        {

            //If the non-academic course is not added and registered
            if(alist.isEmpty())
            {
                JOptionPane.showMessageDialog(Second_Frame,"No records found to display !","Message",JOptionPane.INFORMATION_MESSAGE);//if no records found
            }
            else{
                for(Course list2: alist)
                {
                    if (list2 instanceof NonAcademicCourse){
                        nonacademic = (NonAcademicCourse) list2;

                        //calling display method from another class
                        nonacademic.Display();
                    }
                }
            }
        }

        //Clear for AcademicCourse
        else if(e.getSource() == Clear_1)
        {
            if(Courseid_Field1.getText().equals("")&&
            Coursename_Field1.getText().equals("")&&
            Duration_Field1.getText().equals("")&&
            Level_Field.getText().equals("")&&
            Credit_Field.getText().equals("")&&
            NumofAssessments_Field.getText().equals("")&&
            Courseleader_Field1.getText().equals("")&&
            Lecturername_Field.getText().equals(""))
            { //condition for null value
                JOptionPane.showMessageDialog(First_Frame,"You don't have any values to clear.","Message",JOptionPane.INFORMATION_MESSAGE); //display message
            }
            else{
                //confirm dialog for clearing value
                int clearConfirmation=JOptionPane.showConfirmDialog(First_Frame,"Do you want to clear the values?","Clear",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(clearConfirmation==0)
                { //if Yes option clear data        
                    clearData1(); // clearing data method 
                    JOptionPane.showMessageDialog(First_Frame,"Values has been cleared successfully !!.","Message",JOptionPane.INFORMATION_MESSAGE); //information display
                }
            }
        }

        //Clear for Non-AcademicCourse
        else if(e.getSource() == Clear_2)
        {
            if(Courseid_Field2.getText().equals("")&&
            Coursename_Field2.getText().equals("")&&
            Duration_Field2.getText().equals("")&&
            Prerequisite_Field.getText().equals("")&&
            Courseleader_Field2.getText().equals("")&&
            Instructorname_Field.getText().equals(""))
            {
                JOptionPane.showMessageDialog(Second_Frame,"You don't have any values to clear.","Message",JOptionPane.INFORMATION_MESSAGE); //display message
            }
            else{
                //confirm dialog for clearing value
                int clearConfirmation=JOptionPane.showConfirmDialog(Second_Frame,"Do you want to clear the values?","Clear",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(clearConfirmation==0)
                { //if Yes option clear data        
                    clearData2(); // clearing data method 
                    JOptionPane.showMessageDialog(Second_Frame,"Values has been cleared successfully !!.","Message",JOptionPane.INFORMATION_MESSAGE); //information display
                }
            }
        }
    }
}