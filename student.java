import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

class Register implements ActionListener {
    JFrame f;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JButton b1, b2, b3;
    JLabel l1, l2, l3, l4, l5, l6, l7, label1, label2, label3;;
    JPasswordField pf1, pf2;
    JRadioButton r1, r2;
    ButtonGroup bg;
    String s6;

 Register(){
 f= new JFrame();
 f.setTitle("Registration Form");
 f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 JPanel p1=new JPanel();
 p1.setBounds(0,0,800,800);
 p1.setBackground(new Color(204,255,255));
 JPanel p2=new JPanel();
 p2.setBounds(800,0,800,800);
 p2.setBackground(new Color(0,204,204));
 p2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
 label1=new JLabel("REGISTRATION");
 label1.setBounds(75,275,400,100);
 label1.setFont(new Font("Showcard Gothic",Font.PLAIN,50));
 label2=new JLabel("FORM");
 label2.setBounds(125,375,300,100);
 label2.setFont(new Font("Showcard Gothic",Font.PLAIN,50));
 label3=new JLabel("REGISTER YOURSELF!!");
 label3.setBounds(950,25,300,100);
 label3.setFont(new Font("Showcard Gothic",Font.PLAIN,24));
 l1=new JLabel("Username");
 l1.setBounds(900,125,150,30);
 l1.setForeground(Color.WHITE);
 l1.setFont(new Font("Calibri",Font.BOLD,22));
 tf1=new JTextField();
 tf1.setBounds(1075,125,150,20);
 tf1.setBorder(null);
 l2=new JLabel("Gender:");
 l2.setBounds(900,175,150,30);
 l2.setForeground(Color.WHITE);
 l2.setFont(new Font("Calibri",Font.BOLD,22));
 r1=new JRadioButton("Male");
 r1.setBounds(1075,175,100,30);
 r1.setBackground(new Color(0,204,204));
 r1.setFont(new Font("Calibri",Font.BOLD,16));
 r1.setForeground(Color.WHITE);
 r2=new JRadioButton("Female");
 r2.setBounds(1075,200,100,30);
 r2.setBackground(new Color(0,204,204));
 r2.setFont(new Font("Calibri",Font.BOLD,16));
 r2.setForeground(Color.WHITE);
 bg=new ButtonGroup();
 bg.add(r1);bg.add(r2);
 l3=new JLabel("Set Password");
 l3.setBounds(900,250,150,30);
 l3.setForeground(Color.WHITE);
 l3.setFont(new Font("Calibri",Font.BOLD,22));
 pf1=new JPasswordField();
 pf1.setBounds(1075,250,150,20);
 pf1.setBorder(null);
 l7=new JLabel("Confirm Password");
 l7.setBounds(900,300,175,30);
 l7.setForeground(Color.WHITE);
 l7.setFont(new Font("Calibri",Font.BOLD,22));
 pf2=new JPasswordField();
 pf2.setBounds(1075,300,150,20);
 pf2.setBorder(null);
 l4=new JLabel("Mobile No");
 l4.setBounds(900,350,150,30);
 l4.setForeground(Color.WHITE);
 l4.setFont(new Font("Calibri",Font.BOLD,22));
 tf3=new JTextField();
 tf3.setBounds(1075,350,150,20);
 tf3.setBorder(null);
 l5=new JLabel("Parent Name");
 l5.setBounds(900,400,150,30);
 l5.setForeground(Color.WHITE);
 l5.setFont(new Font("Calibri",Font.BOLD,22));
 tf4=new JTextField();
 tf4.setBounds(1075,400,150,20);
 tf4.setBorder(null);
 l6=new JLabel("Email Address");
 l6.setBounds(900,450,150,30);
 l6.setForeground(Color.WHITE);
 l6.setFont(new Font("Calibri",Font.BOLD,22));
 tf5=new JTextField();
 tf5.setBounds(1075,450,150,20);
 tf5.setBorder(null);
 b1=new JButton("Submit");
 b1.setBounds(975,550,75,25);
 b1.addActionListener(this);
 b2 = new JButton("Clear");
 b2.setBounds(1075,550,75,25);
 b2.addActionListener(this);
 f.add(tf1);f.add(tf3);f.add(tf4);f.add(tf5);f.add(pf1);f.add(p
f2);f.add(label1);f.add(label2);f.add(label3);f.add(l1);f.add(l2);f.
add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(r1);f.add(r2);f
.add(b1);f.add(b2);f.add(p1);f.add(p2);
 f.setExtendedState(f.getExtendedState() |
JFrame.MAXIMIZED_BOTH);
 f.setSize(1400,800);
 f.setLayout(null);
 f.setVisible(true);
 }

 public void actionPerformed(ActionEvent e) {
 String str = e.getActionCommand();
 if (str=="Submit"){
 String s1=tf1.getText();String s3=tf3.getText();String
s4=tf4.getText();String s5=tf5.getText();String
s7=pf1.getText();String s8=pf2.getText();
 if (r1.isSelected()){
 s6=r1.getText();
 }
 if (r2.isSelected()){
 s6=r2.getText();
 }
 if((s1==null)||(s3==null)||(s4.equals(""))||(s5.equals(""))||(s6=
=null)||(s7.equals(""))||(s8.equals(""))){
 JFrame f1=new JFrame();
 JOptionPane.showMessageDialog(f1,"Please make
sure you filled all details
completely!!","Warning",JOptionPane.WARNING_MESSAGE);
 }
 else if(!s7.equals(s8)){
 JFrame f2=new JFrame();

 JOptionPane.showMessageDialog(f2,"Passwords
does not
match!!","Warning",JOptionPane.WARNING_MESSAGE);
 }
 else{
 try{
 File fi=new File("pass.txt");
 FileWriter fw=new FileWriter(fi,true);
 fw.write(s1+"\n");
 fw.write(s7+"\n");
 fw.close();}
 catch(Exception el){}

 tf1.setText(null);tf3.setText(null);tf4.setText(null);tf5.setText(n
ull);pf1.setText(null);pf2.setText(null);
 bg.clearSelection();
 f.dispose();
 new Login();
 }
 }
 else {
 tf1.setText(null);tf3.setText(null);tf4.setText(null);tf5.setText(n
ull);pf1.setText(null);pf2.setText(null);
 bg.clearSelection();
 }
 }
}

class Login implements ActionListener {
    JFrame f;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JPasswordField pf1;
    JButton b1, b2, b3;
    JLabel l1, l2, l3, l4, l5, l6, label1, label2, label3, label4, label5;
    JRadioButton r1, r2;
    ButtonGroup bg;
    String s6;
    JTextArea area;

 Login(){
 f= new JFrame();
 f.setTitle("Welcome");
 f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 JPanel p1=new JPanel();
 p1.setBounds(0,0,800,800);
 p1.setBackground(new Color(204,255,255));
 JPanel p2=new JPanel();
 p2.setBounds(800,0,800,800);
 p2.setBackground(new Color(0,204,204));
 p2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
 label1=new JLabel("SCHOOL");
 label1.setBounds(100,175,300,100);
 label1.setFont(new Font("Showcard Gothic",Font.PLAIN,50));
 label2=new JLabel("MANAGEMENT");
 label2.setBounds(100,275,400,100);
 label2.setFont(new Font("Showcard Gothic",Font.PLAIN,50));
 label3=new JLabel("SYSTEM");
 label3.setBounds(100,375,300,100);
 label3.setFont(new Font("Showcard Gothic",Font.PLAIN,50));
 label4=new JLabel("Register now if you are a new user...");
 label4.setBounds(920,500,400,100);
 label4.setFont(new Font("Calibri",Font.PLAIN,24));
 label5=new JLabel("Login Portal");
 label5.setBounds(1020,50,400,100);
 label5.setFont(new Font("Showcard Gothic",Font.PLAIN,24));
 l1=new JLabel("Username");
 l1.setBounds(925,200,150,20);
 l1.setFont(new Font("Calibri",Font.BOLD,22));
 l1.setForeground(Color.WHITE);
 tf1=new JTextField();
 tf1.setBounds(1050,200,150,20);
 tf1.setBorder(null);
 l2=new JLabel("Password");
 l2.setBounds(925,300,150,20);
 l2.setFont(new Font("Calibri",Font.BOLD,22));
 l2.setForeground(Color.WHITE);
 pf1=new JPasswordField();
 pf1.setBounds(1050,300,150,20);
 pf1.setBorder(null);
 b1=new JButton("Login");
 b1.setBounds(1050,400,75,25);
 b1.addActionListener(this);
 b2=new JButton("Register");
 b2.setBounds(1025,600,125,25);
 b2.addActionListener(this);
 f.add(tf1);f.add(pf1);f.add(label1);f.add(label2);f.add(label3);f.a
dd(label4);f.add(label5);f.add(l1);f.add(l2);f.add(b1);f.add(b2);f.add(p
1);f.add(p2);
 f.setExtendedState(f.getExtendedState() |
JFrame.MAXIMIZED_BOTH);
 f.setSize(1400,800);
 f.setLayout(null);
 f.setVisible(true);
 }

 public void actionPerformed(ActionEvent e) {
 String str = e.getActionCommand();
 String s1=tf1.getText();
 if(str=="Login"){
 s6=pf1.getText();
 if((s1.equals(""))||(s6.equals(""))){
 JFrame f2=new JFrame();
 JOptionPane.showMessageDialog(f2,"Invalid
credentials","Warning",JOptionPane.WARNING_MESSAGE);
 }
 else{
 try{
 File fi=new File("pass.txt");
 BufferedReader br = new
BufferedReader(new FileReader(fi));
 int i=0;
 String s,t;
 while((s=br.readLine()) != null){
 t=br.readLine();
 if((s1.equals(s))&&(s6.equals(t))){
 i=1;
 f.dispose();
 new Course();
 }
 }
 br.close();
 if(i==0){
 JFrame f1=new JFrame();

 JOptionPane.showMessageDialog(f1,"Incorrect Username or
Password!!","Warning",JOptionPane.WARNING_MESSAGE);
 }
 }catch(Exception ea){}
 }
 }
 else {
 f.dispose();
 new Register();
 }
 }

    public static void main(String[] args) {
        new Login();
    }
}

class Course implements ActionListener {
    JFrame f;
    JPanel p1;
    JLabel l1, l2;
    JTextField tf1;
    JRadioButton r1, r2, r3, r4, r5;
    JButton b1, b2, b3;
    JTextArea area;

 Course(){
 f=new JFrame("Course Registration");
 p1=new JPanel();
 p1.setBounds(0,0,1400,800);
 f.setExtendedState(f.getExtendedState() |
JFrame.MAXIMIZED_BOTH);
 f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 p1.setBackground(new Color(0,204,204));
 area=new JTextArea(5,20);
 area.setEditable(false);
 area.setBounds(50,400,750,250);
 area.setFont(new Font("Calibri",Font.PLAIN,18));
 l1=new JLabel("ADD STUDENTS TO COURSES:");
 l1.setBounds(50,50,400,100);
 l1.setFont(new Font("Showcard Gothic",Font.PLAIN,24));
 l2=new JLabel("Student Name");
 l2.setBounds(50,150,150,30);
 l2.setFont(new Font("Calibri",Font.BOLD,22));
 l2.setForeground(Color.WHITE);
 tf1=new JTextField();
 tf1.setBounds(200,150,150,20);
 tf1.setBorder(null);
 r1=new JRadioButton("English");
 r1.setBounds(50,220,150,30);
 r1.setBackground(new Color(0,204,204));
 r1.setFont(new Font("Calibri",Font.BOLD,22));
 r1.setForeground(Color.WHITE);
 r2=new JRadioButton("Maths");
 r2.setBounds(200,220,150,30);
 r2.setBackground(new Color(0,204,204));
 r2.setFont(new Font("Calibri",Font.BOLD,22));
 r2.setForeground(Color.WHITE);
 r3=new JRadioButton("Physics");
 r3.setBounds(350,220,150,30);
 r3.setBackground(new Color(0,204,204));
 r3.setFont(new Font("Calibri",Font.BOLD,22));
 r3.setForeground(Color.WHITE);
 r4=new JRadioButton("Chemistry");
 r4.setBounds(500,220,150,30);
 r4.setBackground(new Color(0,204,204));
 r4.setFont(new Font("Calibri",Font.BOLD,22));
 r4.setForeground(Color.WHITE);
 r5=new JRadioButton("Computer");
 r5.setBounds(650,220,150,30);
 r5.setBackground(new Color(0,204,204));
 r5.setFont(new Font("Calibri",Font.BOLD,22));
 r5.setForeground(Color.WHITE);
 b1=new JButton("Display");
 b1.setBounds(225,300,75,25);
 b1.addActionListener(this);
 b2=new JButton("Register");
 b2.setBounds(50,300,125,25);
 b2.addActionListener(this);
 b3=new JButton("Logout");
 b3.setBounds(1000,90,125,25);
 b3.addActionListener(this);
 f.add(l1);f.add(l2);f.add(tf1);f.add(r1);f.add(r2);f.add(r3);f.add(r
4);f.add(r5);f.add(area);f.add(b1);f.add(b2);f.add(b3);f.add(p1);
 f.setSize(1400,800);
 f.setLayout(null);
 f.setVisible(true);
 }

 public void actionPerformed(ActionEvent e) {
 String str = e.getActionCommand();
 String s2,s3,s4,s5,s6;
 if(str=="Register"){
 String s1=tf1.getText();
 try{
 File fi=new File("details.txt");
 FileWriter fw=new FileWriter(fi,true);
 fw.write("Registered courses of student
"+s1+"\n");
 int i=0;
 if(r1.isSelected()){
 s2=r1.getText();fw.write(s2);i=1;
 }
 if(r2.isSelected()){
 if(i==0){
 s3=r2.getText();fw.write(s3);i=1;
 }
 else{
 s3=r2.getText();fw.write(" , "+s3);
 }
 }
 if(r3.isSelected()){
 if(i==0){
 s4=r3.getText();fw.write(s4);i=1;
 }
 else{
 s4=r3.getText();fw.write(" , "+s4);
 }
 }
 if(r4.isSelected()){
 if(i==0){
 s5=r4.getText();fw.write(s5);i=1;
 }
 else{
 s5=r4.getText();fw.write(" , "+s5);
 }
 }
 if(r5.isSelected()){
 if(i==0){
 s6=r5.getText();fw.write(s6);i=1;
 }
 else{
 s6=r5.getText();fw.write(" , "+s6);
 }
 }
 fw.write("\n");
 fw.close();}
 catch(Exception el){}
 tf1.setText(null);r1.setSelected(false);r2.setSelected(false);r3.se
tSelected(false);r4.setSelected(false);r5.setSelected(false);
 }
 else if(str=="Display"){
 area.setText("");
 try{
 File fi=new File("details.txt");
 BufferedReader br = new BufferedReader(new
FileReader(fi));
 String s,t;
 while((s=br.readLine()) != null){
 t=br.readLine();
 area.append(s+"\n");
 area.append(t+"\n\n");
 }
 br.close();
 }catch(Exception eq){}
 }
 else{
 f.dispose();
 new Login();
 }
 }
}