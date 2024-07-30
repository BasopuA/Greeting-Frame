/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


/**
 *
 * @author anele
 */
public class Greetings extends JFrame
{
    //panels
    private JPanel nameP;
    private JPanel surnameP;
    private JPanel nameAndSurnameP;
    private JPanel greetingAreaP;
    private JPanel headingP;
    private JPanel buttonsP;
    private JPanel mainP;
    
//labels
    private JLabel headingLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    
//textFields
    private JTextField nameField;
    private JTextField surnameField;
    private JTextArea greetingsArea;
    
//buttons
    private JButton greetButton ;
    private JButton clearButton;
    private JButton exitButton;
    
    public Greetings()
    {
        
//configure GUI
        setTitle("greetings");
        setLayout(new BorderLayout());
        setSize(300,350);
        setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//creating the panels
        nameP = new JPanel(new FlowLayout());
        surnameP = new JPanel(new FlowLayout());
        nameAndSurnameP = new JPanel(new GridLayout(2,1));
        greetingAreaP = new JPanel(new FlowLayout());
        greetingAreaP.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
        buttonsP = new JPanel(new FlowLayout());
        mainP = new JPanel(new BorderLayout());
        headingP = new JPanel(new FlowLayout( FlowLayout.CENTER));
        headingP.setBorder(new BevelBorder(BevelBorder.RAISED));
        
//creating labels
        headingLabel = new JLabel("Greeting App");
        nameLabel = new JLabel("Name: ");
        surnameLabel = new JLabel("Surname: ");
        
//creating text fields
        nameField = new JTextField(20);
        surnameField = new JTextField(20);
        
//creating text area
        greetingsArea = new JTextArea(40,50);
        greetingsArea.setEditable(false);
        greetingsArea.setText("Hello[name] [surname]");
        
//creating buttons
        greetButton = new JButton("Greet");
        clearButton = new JButton("Clear");
        exitButton = new JButton("exit");
        
//add name and surname label text field to the panel
        nameP.add(nameLabel);
        nameP.add(nameField);
        surnameP.add(surnameLabel );
        surnameP.add(surnameField);
       
//add name and surname to the collective panel
       nameAndSurnameP.add(nameP);
       nameAndSurnameP.add(surnameP);
       
// adding area
       greetingAreaP.add(greetingsArea);
       
//adding buttons
       buttonsP.add(greetButton);
       buttonsP.add(clearButton);
       buttonsP.add(exitButton);
       
//adding all the panel to the main panel
       mainP.add(nameAndSurnameP,BorderLayout.NORTH);
       mainP.add(greetingAreaP,BorderLayout.CENTER);
       mainP.add(buttonsP,BorderLayout.SOUTH);
       
//adding the main panel tothe frame's panel
       add(headingLabel,BorderLayout.NORTH);
       add(mainP,BorderLayout.CENTER);
        
     setVisible(true);
     
    }
    
}
