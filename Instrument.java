
/**
 * The Instrument class is the parent class to the two subclasses InstrumentToRent and InstrumentToSell.  
 * This class has five attributes.
 * @author (Aditya Chandra Shrestha)
 * @version (17.0.1)
 */
public class Instrument
{
    private static int instrumentID;
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int PANNumber;
    
    
    //Creating a Constructor
    public Instrument(String instrumentName)
    {
        this.instrumentName = instrumentName;
        instrumentID = ++instrumentID;
        this.customerName = "";
        this.customerMobileNumber = "";
        this.PANNumber = 0;
    }
    
    
    //This is Setters method
    public void setinstrumentID(int instrumentID)
    {
        this.instrumentID = instrumentID;
    }
    
    public void setinstrumentName(String instrumentName)
    {
        this.instrumentName = instrumentName;
    }
    
    public void setcustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    
    public void setcustomerMobileNumber(String customerMobileNumber)
    {
        this.customerMobileNumber = customerMobileNumber;
    }
    
    public void setPANNumber(int PANNumber)
    {
        this.PANNumber = PANNumber;
    }
    
    
    //This is Getters method
    public int getinstrumentID()
    {
        return instrumentID;
    }
    
    public String getinstrumentName()
    {
        return instrumentName;
    }
    
    public String getcustomerName()
    {
        return customerName;
    }
    
    public String getcustomerMobileNumber()
    {
        return customerMobileNumber;
    }
    
    public int getPANNumber()
    {
        return PANNumber;
    }
    
    
    //This is Display method
    void display()
    {
        //System.out.println("Instrument ID: " + instrumentID);
        System.out.println("Instrument Name: " + instrumentName);
        
        if(customerName.equals("") && customerMobileNumber.equals("") && PANNumber == 0)
        {
            System.out.println("The Customer's Name, Mobile Number and PAN Number are empty.");
        }
        else
        {
          System.out.println("Customer's Name: " + customerName);
          System.out.println("Customer's Mobile Number: " + customerMobileNumber);
          System.out.println("Customer's PAN Number: " + PANNumber);
        }
    }
}
