package collage.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    Project(){
        setSize(1540,850);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2=i1.getImage().getScaledInstance(1500, 750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        JMenuBar mb= new JMenuBar();
        JMenu newInformation= new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo= new JMenuItem("New Faculty Information");
        facultyInfo.setForeground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem StudentInfo= new JMenuItem("New Student Information");
        StudentInfo.setForeground(Color.WHITE);
        StudentInfo.addActionListener(this);
        newInformation.add(StudentInfo);
        
        
        //Details
        JMenu details= new JMenu("View details");
        details.setForeground(Color.GREEN); 
        mb.add(details);
        
        JMenuItem facultydetails= new JMenuItem("View faculty details");
        facultydetails.setForeground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails= new JMenuItem("View Student details");
        studentdetails.setForeground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        
        //Leave
        JMenu leave= new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        JMenuItem facultyLeave= new JMenuItem("faculty Leave");
        facultyLeave.setForeground(Color.WHITE);
        leave.add(facultyLeave);
        
        JMenuItem studentLeave= new JMenuItem("Student Leave");
        studentLeave.setForeground(Color.WHITE);
        leave.add(studentLeave);
        
        //Leave Details
        
        JMenu leaveDetails= new JMenu("Leave Details");
        leaveDetails.setForeground(Color.GREEN);
        mb.add(leaveDetails);
        
        JMenuItem facultyLeavedetails= new JMenuItem("faculty Leave Details");
        facultyLeavedetails.setForeground(Color.WHITE);
        leaveDetails.add(facultyLeavedetails);
        
        JMenuItem studentLeavedetails= new JMenuItem("Student Leave Details");
        studentLeavedetails.setForeground(Color.WHITE);
        leaveDetails.add(studentLeavedetails);
        
        //Exam
         JMenu Exam= new JMenu("Examination");
        Exam.setForeground(Color.BLUE);
        mb.add(Exam);
        
        JMenuItem Examinationdetails= new JMenuItem("Exam Details");
        Examinationdetails.setForeground(Color.WHITE);
        Exam.add(Examinationdetails);
        
        JMenuItem entermarks= new JMenuItem("Enter Marks");
        entermarks.setForeground(Color.WHITE);
        Exam.add(entermarks);
        
        //update info.
         JMenu Updateinfo= new JMenu("Update details");
        Updateinfo.setForeground(Color.GREEN);
        mb.add(Updateinfo);
        
        JMenuItem UpdatefacultyInfo= new JMenuItem("Update Faculty Details");
        UpdatefacultyInfo.setForeground(Color.WHITE);
        Updateinfo.add(UpdatefacultyInfo);
        
        JMenuItem UpdatestudentInfo= new JMenuItem("Update Student Details");
        UpdatestudentInfo.setForeground(Color.WHITE);
        Updateinfo.add(UpdatestudentInfo);
        
        //fee
        
        JMenu fee= new JMenu("Fee details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem FeeStructure= new JMenuItem("Fee Structure");
        FeeStructure.setForeground(Color.WHITE);
        fee.add(FeeStructure);
        
        JMenuItem feeform= new JMenuItem("Student Fee Form");
        feeform.setForeground(Color.WHITE);
        fee.add(feeform);
        
        //Utility
        JMenu utility= new JMenu("Utility");
        utility.setForeground(Color.GREEN);
        mb.add(utility);
        
        JMenuItem notepad= new JMenuItem("Notepad");
        notepad.setForeground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc= new JMenuItem("Calculator");
        calc.setForeground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        //exit
         JMenu exit= new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        mb.add(exit);
        
        JMenuItem ex= new JMenuItem("Exit");
        ex.setForeground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
 
        
        setJMenuBar(mb);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String msg=e.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception a){
                
            }
        }
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception a){
                
            }
        }else if(msg.equals("New Faculty Information")){
            new AddTeacher();
        }
        else if(msg.equals("New Student Information")){
            new AddStudent();
        }
        else if (msg.equals("View faculty details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student details")) {
            new StudentDetails();
        }
    }
    
    public static void main(String[] args){
        new Project();
    }
    
}
