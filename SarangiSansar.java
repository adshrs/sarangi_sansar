 
/**
 * Sarangi Sansar
 *
 * @author (Aditya Chandra Shrestha)
 * @version (1.1)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class SarangiSansar implements ActionListener
{
    JFrame frame;
    JPanel panel1, panel2, panel3, panel4;
    JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8, textField9, textField10, textField11, textField12, textField13, textField14, textField15;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16, label17, label18, label19, label20, label21, label22, label23, label24, label25, label26;
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12;
    JComboBox<String> comboBox1,comboBox2, comboBox3, comboBox4, comboBox5, comboBox6, comboBox7, comboBox8, comboBox9;
    
    String day[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
    String month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String year[] = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};

    
    public SarangiSansar()
    {
        frame = new JFrame("Sarangi Sansar");
        
                
        
        //Titles of the panels
        label1 = new JLabel();
        label1.setText("Sarangi Sansar");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD, 40));
        label1.setForeground(Color.white);
        
        label2 = new JLabel();
        label2.setText("Instrument to Rent");
        label2.setBounds(190, 0, 200, 20);
        label2.setFont(new Font("Arial", Font.BOLD, 20));
        label2.setForeground(new Color(0x82a0b3));
        
        label3 = new JLabel();
        label3.setText("Instrument to Sell");
        label3.setBounds(190, 0, 200, 20);
        label3.setFont(new Font("Arial", Font.BOLD, 20));
        label3.setForeground(new Color(0x82a0b3));
        
        label4 = new JLabel();
        label4.setText("Return the Instrument");
        label4.setBounds(90, 0, 220, 20);
        label4.setFont(new Font("Arial", Font.BOLD, 20));
        label4.setForeground(new Color(0x82a0b3));
        
        
        //contents of Instrument to Rent Panel(panel2)
        label5 = new JLabel();
        label5.setText("Add Instrument to Rent:");
        label5.setBounds(15, 45, 200, 15);
        label5.setFont(new Font("Arial", Font.BOLD, 15));
        label5.setForeground(new Color(0x474747));
        
        label6 = new JLabel();
        label6.setText("Instrument Name:");
        label6.setBounds(15, 82, 150, 15);
        label6.setFont(new Font("Arial", Font.PLAIN, 15));
        label6.setForeground(new Color(0x474747));
        
        label7 = new JLabel();
        label7.setText("Charge Per Day:");
        label7.setBounds(15, 116, 150, 15);
        label7.setFont(new Font("Arial", Font.PLAIN, 15));
        label7.setForeground(new Color(0x474747));
        
        label8 = new JLabel();
        label8.setText("Rent the Instrument:");
        label8.setBounds(15, 203, 150, 15);
        label8.setFont(new Font("Arial", Font.BOLD, 15));
        label8.setForeground(new Color(0x474747));
        
        label9 = new JLabel();
        label9.setText("Customer Name:");
        label9.setBounds(15, 235, 150, 15);
        label9.setFont(new Font("Arial", Font.PLAIN, 15));
        label9.setForeground(new Color(0x474747));
        
        label10 = new JLabel();
        label10.setText("Customer Phone:");
        label10.setBounds(15, 269, 150, 15);
        label10.setFont(new Font("Arial", Font.PLAIN, 15));
        label10.setForeground(new Color(0x474747));
        
        label11 = new JLabel();
        label11.setText("Customer PAN Number:");
        label11.setBounds(15, 303, 200, 15);
        label11.setFont(new Font("Arial", Font.PLAIN, 15));
        label11.setForeground(new Color(0x474747));
        
        label12 = new JLabel();
        label12.setText("Rent Date:");
        label12.setBounds(15, 353, 100, 15);
        label12.setFont(new Font("Arial", Font.PLAIN, 15));
        label12.setForeground(new Color(0x474747));

        label13 = new JLabel();
        label13.setText("Return Date:");
        label13.setBounds(15, 387, 100, 15);
        label13.setFont(new Font("Arial", Font.PLAIN, 15));
        label13.setForeground(new Color(0x474747));
        
        label14 = new JLabel();
        label14.setText("No. of Renting Days:");
        label14.setBounds(15, 437, 200, 15);
        label14.setFont(new Font("Arial", Font.PLAIN, 15));
        label14.setForeground(new Color(0x474747));
        
        label15 = new JLabel();
        label15.setText("Instrument Name:");
        label15.setBounds(15, 471, 150, 15);
        label15.setFont(new Font("Arial", Font.PLAIN, 15));
        label15.setForeground(new Color(0x474747));
        
        
        textField1 = new JTextField();
        textField1.setBounds(210, 80, 200, 23);
        textField1.setFont(new Font("Arial", Font.PLAIN, 13));
        
        textField2 = new JTextField();
        textField2.setBounds(210, 113, 200, 23);
        textField2.setFont(new Font("Arial", Font.PLAIN, 13));   
        
        textField3 = new JTextField();
        textField3.setBounds(210, 232, 200, 23);
        textField3.setFont(new Font("Arial", Font.PLAIN, 13));
        
        textField4 = new JTextField();
        textField4.setBounds(210, 266, 200, 23);
        textField4.setFont(new Font("Arial", Font.PLAIN, 13));
        
        textField5 = new JTextField();
        textField5.setBounds(210, 300, 200, 23);
        textField5.setFont(new Font("Arial", Font.PLAIN, 13));

        textField6 = new JTextField();
        textField6.setBounds(210, 433, 200, 23);
        textField6.setFont(new Font("Arial", Font.PLAIN, 13));
        
        textField7 = new JTextField();
        textField7.setBounds(210, 467, 200, 23);
        textField7.setFont(new Font("Arial", Font.PLAIN, 13));
        
        
        button1 = new JButton();
        button1.setBounds(15, 150, 90, 28);
        button1.setText("Add");
        button1.setFocusable(false);
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        button1.setBackground(Color.lightGray);
        button1.setBorder(BorderFactory.createEtchedBorder());
        button1.addActionListener(this);
        
        button2 = new JButton();
        button2.setBounds(115, 150, 90, 28);
        button2.setText("Display");
        button2.setFocusable(false);
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        button2.setBackground(Color.lightGray);
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.addActionListener(this);
        
        button3 = new JButton();
        button3.setBounds(215, 150, 90, 28);
        button3.setText("Clear");
        button3.setFocusable(false);
        button3.setFont(new Font("Arial", Font.BOLD, 12));
        button3.setBackground(Color.lightGray);
        button3.setBorder(BorderFactory.createEtchedBorder());
        button3.addActionListener(this);
        
        button4 = new JButton();
        button4.setBounds(15, 505, 90, 28);
        button4.setText("Rent");
        button4.setFocusable(false);
        button4.setFont(new Font("Arial", Font.BOLD, 12));
        button4.setBackground(Color.lightGray);
        button4.setBorder(BorderFactory.createEtchedBorder());
        button4.addActionListener(this);
        
        button5 = new JButton();
        button5.setBounds(115, 505, 90, 28);
        button5.setText("Clear");
        button5.setFocusable(false);
        button5.setFont(new Font("Arial", Font.BOLD, 12));
        button5.setBackground(Color.lightGray);
        button5.setBorder(BorderFactory.createEtchedBorder());
        button5.addActionListener(this);
        
        
        comboBox1 = new JComboBox<>(day);
        comboBox1.setBounds(210, 349, 70, 20);
        
        comboBox2 = new JComboBox<>(month);
        comboBox2.setBounds(305, 349, 90, 20);
        
        comboBox3 = new JComboBox<>(year);
        comboBox3.setBounds(420 , 349, 70, 20);
        
        comboBox4 = new JComboBox<>(day);
        comboBox4.setBounds(210, 383, 70, 20);
        
        comboBox5 = new JComboBox<>(month);
        comboBox5.setBounds(305, 383, 90, 20);
        
        comboBox6 = new JComboBox<>(year);
        comboBox6.setBounds(420, 383, 70, 20);
        
        //Contents of Instrument to Sell Panel(panel3)
        label16 = new JLabel();
        label16.setText("Add Instrument to Sell:");
        label16.setBounds(15, 45, 200, 15);
        label16.setFont(new Font("Arial", Font.BOLD, 15));
        label16.setForeground(new Color(0x474747));
        
        label17 = new JLabel();
        label17.setText("Instrument Name:");
        label17.setBounds(15, 82, 150, 15);
        label17.setFont(new Font("Arial", Font.PLAIN, 15));
        label17.setForeground(new Color(0x474747));
        
        label18 = new JLabel();
        label18.setText("Price:");
        label18.setBounds(15, 116, 150, 15);
        label18.setFont(new Font("Arial", Font.PLAIN, 15));
        label18.setForeground(new Color(0x474747));
        
        label19 = new JLabel();
        label19.setText("Sell the Instrument:");
        label19.setBounds(15, 203, 150, 15);
        label19.setFont(new Font("Arial", Font.BOLD, 15));
        label19.setForeground(new Color(0x474747));
        
        label20 = new JLabel();
        label20.setText("Customer Name:");
        label20.setBounds(15, 235, 150, 15);
        label20.setFont(new Font("Arial", Font.PLAIN, 15));
        label20.setForeground(new Color(0x474747));
        
        label21 = new JLabel();
        label21.setText("Customer Phone:");
        label21.setBounds(15, 269, 150, 15);
        label21.setFont(new Font("Arial", Font.PLAIN, 15));
        label21.setForeground(new Color(0x474747));
        
        label22 = new JLabel();
        label22.setText("Customer PAN Number:");
        label22.setBounds(15, 303, 200, 15);
        label22.setFont(new Font("Arial", Font.PLAIN, 15));
        label22.setForeground(new Color(0x474747));
        
        label23 = new JLabel();
        label23.setText("Selling Date:");
        label23.setBounds(15, 353, 100, 15);
        label23.setFont(new Font("Arial", Font.PLAIN, 15));
        label23.setForeground(new Color(0x474747));
        
        label24 = new JLabel();
        label24.setText("Discount Percent:");
        label24.setBounds(15, 437, 200, 15);
        label24.setFont(new Font("Arial", Font.PLAIN, 15));
        label24.setForeground(new Color(0x474747));
        
        label25 = new JLabel();
        label25.setText("Instrument Name:");
        label25.setBounds(15, 471, 150, 15);
        label25.setFont(new Font("Arial", Font.PLAIN, 15));
        label25.setForeground(new Color(0x474747));
        
        
        textField8 = new JTextField();
        textField8.setBounds(210, 80, 200, 23);
        textField8.setFont(new Font("Arial", Font.PLAIN, 13));
        
        textField9 = new JTextField();
        textField9.setBounds(210, 113, 200, 23);
        textField9.setFont(new Font("Arial", Font.PLAIN, 13));
        
        textField10 = new JTextField();
        textField10.setBounds(210, 232, 200, 23);
        textField10.setFont(new Font("Arial", Font.PLAIN, 13));
        
        textField11 = new JTextField();
        textField11.setBounds(210, 266, 200, 23);
        textField11.setFont(new Font("Arial", Font.PLAIN, 13));
        
        textField12 = new JTextField();
        textField12.setBounds(210, 300, 200, 23);
        textField12.setFont(new Font("Arial", Font.PLAIN, 13));

        textField13 = new JTextField();
        textField13.setBounds(210, 433, 200, 23);
        textField13.setFont(new Font("Arial", Font.PLAIN, 13));
        
        textField14 = new JTextField();
        textField14.setBounds(210, 467, 200, 23);
        textField14.setFont(new Font("Arial", Font.PLAIN, 13));
        
        
        button6 = new JButton();
        button6.setBounds(15, 150, 90, 28);
        button6.setText("Add");
        button6.setFocusable(false);
        button6.setFont(new Font("Arial", Font.BOLD, 12));
        button6.setBackground(Color.lightGray);
        button6.setBorder(BorderFactory.createEtchedBorder());
        button6.addActionListener(this);
        
        button7 = new JButton();
        button7.setBounds(115, 150, 90, 28);
        button7.setText("Display");
        button7.setFocusable(false);
        button7.setFont(new Font("Arial", Font.BOLD, 12));
        button7.setBackground(Color.lightGray);
        button7.setBorder(BorderFactory.createEtchedBorder());
        button7.addActionListener(this);
        
        button8 = new JButton();
        button8.setBounds(215, 150, 90, 28);
        button8.setText("Clear");
        button8.setFocusable(false);
        button8.setFont(new Font("Arial", Font.BOLD, 12));
        button8.setBackground(Color.lightGray);
        button8.setBorder(BorderFactory.createEtchedBorder());
        button8.addActionListener(this);
        
        button9 = new JButton();
        button9.setBounds(15, 505, 90, 28);
        button9.setText("Sell");
        button9.setFocusable(false);
        button9.setFont(new Font("Arial", Font.BOLD, 12));
        button9.setBackground(Color.lightGray);
        button9.setBorder(BorderFactory.createEtchedBorder());
        button9.addActionListener(this);
    
        button10 = new JButton();
        button10.setBounds(115, 505, 90, 28);
        button10.setText("Clear");
        button10.setFocusable(false);
        button10.setFont(new Font("Arial", Font.BOLD, 12));
        button10.setBackground(Color.lightGray);
        button10.setBorder(BorderFactory.createEtchedBorder());
        button10.addActionListener(this);
        
        
        comboBox7 = new JComboBox<>(day);
        comboBox7.setBounds(210, 349, 70, 20);
        
        comboBox8 = new JComboBox<>(month);
        comboBox8.setBounds(305, 349, 90, 20);
        
        comboBox9 = new JComboBox<>(year);
        comboBox9.setBounds(420 , 349, 70, 20);
        
        
        //Contents of Return the Instrument Panel(panel4)
        label26 = new JLabel();
        label26.setText("Instrument Name:");
        label26.setBounds(15, 45, 150, 15);
        label26.setFont(new Font("Arial", Font.PLAIN, 15));
        label26.setForeground(new Color(0x474747));
        
        textField15 = new JTextField();
        textField15.setBounds(155, 43, 200, 23);
        textField15.setFont(new Font("Arial", Font.PLAIN, 13));
        
        button11 = new JButton();
        button11.setBounds(15, 79, 90, 28);
        button11.setText("Return");
        button11.setFocusable(false);
        button11.setFont(new Font("Arial", Font.BOLD, 12));
        button11.setBackground(Color.lightGray);
        button11.setBorder(BorderFactory.createEtchedBorder());
        button11.addActionListener(this);
    
        button12 = new JButton();
        button12.setBounds(115, 79, 90, 28);
        button12.setText("Clear");
        button12.setFocusable(false);
        button12.setFont(new Font("Arial", Font.BOLD, 12));
        button12.setBackground(Color.lightGray);
        button12.setBorder(BorderFactory.createEtchedBorder());
        button12.addActionListener(this);
        
        
        //The panels
        panel1 = new JPanel();
        panel1.setBackground(new Color(0x82a0b3));
        panel1.setBounds(0, 0, 1500, 129);
        panel1.setLayout(new BorderLayout());
        panel1.add(label1);
        
        panel2 = new JPanel();
        panel2.setBackground(Color.white);
        panel2.setBounds(0, 135, 550, 700);
        panel2.setLayout(null);
        panel2.add(label2);
        panel2.add(label5);
        panel2.add(label6);
        panel2.add(label7);
        panel2.add(label8);
        panel2.add(label9);
        panel2.add(label10);
        panel2.add(label11);
        panel2.add(label12);
        panel2.add(label13);
        panel2.add(label14);
        panel2.add(label15);
        panel2.add(textField1);
        panel2.add(textField2);
        panel2.add(textField3);
        panel2.add(textField4);
        panel2.add(textField5);
        panel2.add(textField6);
        panel2.add(textField7);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(comboBox1);
        panel2.add(comboBox2);
        panel2.add(comboBox3);
        panel2.add(comboBox4);
        panel2.add(comboBox5);
        panel2.add(comboBox6);
        
        panel3 = new JPanel();
        panel3.setBackground(Color.white);
        panel3.setBounds(555, 135, 550, 700);
        panel3.setLayout(null);
        panel3.add(label3);
        panel3.add(label16);
        panel3.add(label17);
        panel3.add(label18);
        panel3.add(label19);
        panel3.add(label20);
        panel3.add(label21);
        panel3.add(label22);
        panel3.add(label23);
        panel3.add(label24);
        panel3.add(label25);
        panel3.add(textField8);
        panel3.add(textField9);
        panel3.add(textField10);
        panel3.add(textField11);
        panel3.add(textField12);
        panel3.add(textField13);
        panel3.add(textField14);
        panel3.add(button6);
        panel3.add(button7);
        panel3.add(button8);
        panel3.add(button9);
        panel3.add(button10);
        panel3.add(comboBox7);
        panel3.add(comboBox8);
        panel3.add(comboBox9);
        
        panel4 = new JPanel();
        panel4.setBackground(Color.white);
        panel4.setBounds(1110, 135, 390, 700);
        panel4.setLayout(null);
        panel4.add(label4);
        panel4.add(label26);
        panel4.add(textField15);
        panel4.add(button11);
        panel4.add(button12);
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
         
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1510, 800);
    }
    
    ArrayList<Instrument> instrumentList = new ArrayList<Instrument>();
    String instrumentName, customerName, customerPhoneNo;
    int chargePerDay, noOfRentingDays, customerPanNo;
    float price, discountPercent;
    boolean rent = false;
    boolean sell = false;
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == button1)
        {
            if(textField1.getText().equals("") || textField2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(frame, "There is nothing to add.", "Message", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                try
                {
                    this.instrumentName = (textField1.getText());
                    this.chargePerDay = Integer.parseInt(textField2.getText());
                    
                    int i;
                    
                    if(rent == false)
                    {
                        InstrumentToRent instrumentR= new InstrumentToRent(this.instrumentName, this.chargePerDay);
                        instrumentList.add(instrumentR);
                        
                        rent = true;
                        
                        JOptionPane.showMessageDialog(frame, "Your instrument " + instrumentName + " is added.");
                    }        
                    else if(rent == true)
                    {
                        for(i = 0; i < instrumentList.size() - 1;)
                        {
                            if(this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                            {
                                break;
                            }
                            else
                            {
                                i
                                ++;
                            }
                        }
                        if(!this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                        {
                            InstrumentToRent instrumentR = new InstrumentToRent(this.instrumentName, this.chargePerDay);
                            instrumentList.add(instrumentR);
                            
                            JOptionPane.showMessageDialog(frame, "Your instrument " + instrumentName + " is added.");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame, "The instrument " + instrumentName + " already exists", "Message", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame, "NumberFormat Exception: invalid input", "Message",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(ae.getSource() == button2)
        {
            InstrumentToRent instrumentR = new InstrumentToRent(this.instrumentName, this.chargePerDay);
            instrumentR.display();
        }
        else if(ae.getSource() == button3)
        {
            textField1.setText("");
            textField2.setText("");
        }
        
        else if(ae.getSource() == button6)
        {
            try
            {
                this.instrumentName = (textField8.getText());
                this.price = Integer.parseInt(textField9.getText());
                
                int i;
                
                if(sell == false)
                {
                    InstrumentToSell instrumentS= new InstrumentToSell(this.instrumentName, this.price);
                    instrumentList.add(instrumentS);
                    
                    sell = true;
                    
                    JOptionPane.showMessageDialog(frame, "Your instrument " + instrumentName + " is added.");
                }        
                else if(sell == true)
                {
                    for(i = 0; i < instrumentList.size() - 1;)
                    {
                        if(this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                        {
                            break;
                        }
                        else
                        {
                            i++;
                        }
                    }
                    if(!this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                    {
                        InstrumentToSell instrumentS = new InstrumentToSell(this.instrumentName, this.price);
                        instrumentList.add(instrumentS);
                        
                        JOptionPane.showMessageDialog(frame, "Your instrument " + instrumentName + " is added.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame, "The instrument " + instrumentName + " already exists", "Message", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }    
            catch (NumberFormatException n)
            {
                JOptionPane.showMessageDialog(frame, "NumberFormat Exception: invalid input", "Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(ae.getSource() == button7)
        {
            InstrumentToSell instrumentS = new InstrumentToSell(this.instrumentName, this.price);
            instrumentS.display();
        }
        else if(ae.getSource() == button8)
        {
            textField8.setText("");
            textField9.setText("");
        }
        
        else if(ae.getSource() == button4)
        {
            try
            {
                this.customerName = textField3.getText();
                this.customerPhoneNo = textField4.getText();
                this.customerPanNo = Integer.parseInt(textField5.getText());
                this.noOfRentingDays = Integer.parseInt(textField6.getText());
                this.instrumentName = textField7.getText();
                
                String dayOfRent = comboBox1.getSelectedItem().toString();
                String monthOfRent = comboBox2.getSelectedItem().toString();
                String yearOfRent = comboBox3.getSelectedItem().toString();
                String dateOfRent = dayOfRent + "/" + monthOfRent + "/" + yearOfRent;
                String dayOfReturn = comboBox4.getSelectedItem().toString();
                String monthOfReturn = comboBox5.getSelectedItem().toString();
                String yearOfReturn = comboBox6.getSelectedItem().toString();
                String dateOfReturn = dayOfReturn + "/" + monthOfReturn + "/" + yearOfReturn;
                
                int i;
                
                for(i = 0; i < instrumentList.size() - 1;)
                {
                    if(this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                    {
                        break;
                    }
                    else
                    {
                        i++;
                    }
                }
                if(this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                {
                    if(instrumentList.get(i) instanceof InstrumentToRent)
                    {
                        InstrumentToRent instrumentR = (InstrumentToRent)this.instrumentList.get(i); //Downcasting
                        instrumentR.rentInstrument(this.customerName, this.customerPhoneNo, this.customerPanNo, dateOfRent, dateOfReturn, this.noOfRentingDays);
                        
                        JOptionPane.showMessageDialog(frame, "The instrument has been rented by: "+this.customerName);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame, "The entered instrument is on the selling list.", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, "Not on the list", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException n)
            {
                JOptionPane.showMessageDialog(frame, "NumberFormat Exception: invalid input", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(ae.getSource() == button5)
        {
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField7.setText("");
        }
        
        else if(ae.getSource() == button11)
        {
            try
            {
                this.instrumentName = textField15.getText();
                
                int i;
                
                for(i = 0; i < instrumentList.size() - 1;)
                {
                    if(this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                    {
                        break;
                    }
                    else
                    {
                        i++;
                    }
                }
                if(this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                {
                    if(instrumentList.get(i) instanceof InstrumentToRent)
                    {
                        InstrumentToRent instrumentR = (InstrumentToRent)this.instrumentList.get(i);//Downcasting
                        instrumentR.returnInstrument();
                        
                        instrumentR.display();
                        
                        JOptionPane.showMessageDialog(frame, "The instrument has been returned.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame, "The entered instrument is on the selling list.", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, "Not on the list", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException n)
            {
                JOptionPane.showMessageDialog(frame, "NumberFormat Exception: invalid input", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(ae.getSource() == button12)
        {
            textField15.setText("");
        }
        
        else if(ae.getSource() == button9)
        {
            try
            {
                this.customerName = textField10.getText();
                this.customerPhoneNo = textField11.getText();
                this.customerPanNo = Integer.parseInt(textField12.getText());
                this.discountPercent = Integer.parseInt(textField13.getText());
                this.instrumentName = textField14.getText();
                
                String dayOfSale = comboBox7.getSelectedItem().toString();
                String monthOfSale = comboBox8.getSelectedItem().toString();
                String yearOfSale = comboBox9.getSelectedItem().toString();
                String dateOfSale = dayOfSale + "/" + monthOfSale + "/" + yearOfSale;
                
                int i;
                
                for(i = 0; i < instrumentList.size() - 1;)
                {
                    if(this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                    {
                        break;
                    }
                    else
                    {
                        i++;
                    }
                }
                if(this.instrumentName.equals(instrumentList.get(i).getinstrumentName()))
                {
                    if(instrumentList.get(i) instanceof InstrumentToSell)
                    {
                        InstrumentToSell instrumentS = (InstrumentToSell)this.instrumentList.get(i);//Downcasting
                        instrumentS.sellInstrument(this.customerName, this.customerPhoneNo, this.customerPanNo, dateOfSale, discountPercent);
                        
                        System.out.println("The instrument has been sold to: ");
                        instrumentS.display();
                        
                        JOptionPane.showMessageDialog(frame, "The instrument has been sold to: "+this.customerName);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame, "The entered instrument is on the renting list.", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, "Not on the list", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException n)
            {
                JOptionPane.showMessageDialog(frame, "NumberFormat Exception: invalid input", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(ae.getSource() == button10)
        {
            textField10.setText("");
            textField11.setText("");
            textField12.setText("");
            textField13.setText("");
            textField14.setText("");
        }
    }
    public static void main(String[] args)//main method
    {
        new SarangiSansar();
    }
}
