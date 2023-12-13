import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class DemoPaper extends JFrame implements ActionListener {

    private JLabel batch,name,rollNo,dept;
    private JTextField nameF,rollNoF,deptF;
    private JComboBox batchBox;
    private JButton addStudent,searchStudent;
    private ArrayList<Student> studentsList;

    public DemoPaper(){
        this.setTitle("OOP Final Paper");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,400,400);
        this.setLayout(new GridLayout(5,2,10,10));

        studentsList = new ArrayList<>();

        batch = new JLabel("Batch");
        name = new JLabel("Name");
        rollNo = new JLabel("Roll NO");
        dept = new JLabel("Department");

        String[] batches = {"19","20","21","22"};
        batchBox = new JComboBox(batches);
        nameF = new JTextField();
        rollNoF = new JTextField();
        deptF = new JTextField();

        addStudent = new JButton("Add Student");
        searchStudent = new JButton("Search Student");
        addStudent.addActionListener(this);
        searchStudent.addActionListener(this);

        this.add(batch);
        this.add(batchBox);
        this.add(rollNo);
        this.add(rollNoF);
        this.add(name);
        this.add(nameF);
        this.add(dept);
        this.add(deptF);
        this.add(addStudent);
        this.add(searchStudent);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addStudent){
            addStudent();
        }
        if(e.getSource() == searchStudent){
            searchStudent();
        }

    }

    private void addStudent(){
        String batch = batchBox.getSelectedItem().toString();
        String name = nameF.getText();
        String rollNo = rollNoF.getText();
        String dept = deptF.getText();
        LocalDateTime dt = LocalDateTime.now();

        Student student = new Student(batch,name,rollNo,dept,dt);
        studentsList.add(student);

        nameF.setText("");
        rollNoF.setText("");
        deptF.setText("");

        try{
            FileOutputStream file = new FileOutputStream("Data.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeObject(studentsList);
            output.close();
            JOptionPane.showMessageDialog(this,"Student data has been saved into Data.txt");

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private void searchStudent(){
        String rollNo = JOptionPane.showInputDialog(this,"Enter Roll Number to Search ");
        try{
            FileInputStream file = new FileInputStream("Data.txt");
            ObjectInputStream input = new ObjectInputStream(file);

            ArrayList<Student> list = (ArrayList<Student>) input.readObject();

            for(int i = 0; i < list.size();i++){
                if(rollNo.equalsIgnoreCase(list.get(i).rollNo)){

                    JOptionPane.showMessageDialog(this,"Found!!"+"\nBatch :"+list.get(i).batch+"\nName :"+list.get(i).name
                    +"\nRoll No :"+list.get(i).rollNo+"\nDept :"+list.get(i).dept+"\nTime :"+list.get(i).dt);
                    return;
                }
            }
            JOptionPane.showMessageDialog(this,"Not Found!!");
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Form form = new Form();
    }
}
class Student implements Serializable{
    String batch;
    String name;
    String rollNo;
    String dept;
    LocalDateTime dt;
    public Student(String batch,String name,String rollNo,String dept,LocalDateTime dt){
        this.name = name;
        this.dept = dept;
        this.batch = batch;
        this.rollNo = rollNo;
        this.dt = dt;
    }
}
