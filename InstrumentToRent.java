
/**
 * The InstrumentToRent class is a subclass of the Instrument class.
 * This class has five attributes.
 * @author (Aditya Chandra Shrestha)
 * @version (17.0.1)
 */
public class InstrumentToRent extends Instrument
{
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    
    
    //Creating a Constructor
    public InstrumentToRent(String instrumentName, int charge)
    {
        super(instrumentName);
        this.chargePerDay = charge;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
    }
    
    
    //This is Setters method
    public void setchargePerDay(int chargePerDay)
    {
        this.chargePerDay = chargePerDay;
    }
    
    public void setdateOfRent(String dateOfRent)
    {
        this.dateOfRent = dateOfRent;
    }
    
    public void setdateOfReturn(String dateOfReturn)
    {
        this.dateOfReturn = dateOfReturn;
    }
    
    public void setnoOfDays(int noOfDays)
    {
        this.noOfDays = noOfDays;
    }
    
    public void setisRented(boolean isRented)
    {
        this.isRented = isRented;
    }
    
    
    //Getters method
    public int getchargePerDay()
    {
        return chargePerDay;
    }
    
    public String getdateOfRent()
    {
        return dateOfRent;
    }
    
    public String getdateOfReturn()
    {
        return dateOfReturn;
    }
    
    public int getnoOfDays()
    {
        return noOfDays;
    }
    
    public boolean getisRented()
    {
        return isRented;
    }
    
    
    //This is the Method to rent instruments
    public void rentInstrument(String customerName, String customerMobileNumber, int PANNumber, String dateOfRent, String dateOfReturn, int noOfDays)
    {
        if(this.isRented == true)
        {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Mobile Number: " + customerMobileNumber);
            System.out.println("PAN Number: " + PANNumber);
            System.out.println("This instrument isn't available for rent");
        }
        else
        {
            this.setcustomerName(customerName);
            this.setcustomerMobileNumber(customerMobileNumber);
            this.setPANNumber(PANNumber);
            this.dateOfRent = dateOfRent;
            this.dateOfReturn = dateOfReturn;
            this.noOfDays = noOfDays;
            this.isRented = true;
            System.out.println("Instrument has been rented by: ");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Mobile Number: " + customerMobileNumber);
            System.out.println("PAN Number: " + PANNumber);
            System.out.println("Rented Date: " + dateOfRent);
            System.out.println("Return Date: " + dateOfReturn);
            System.out.println("Number of Days: " + noOfDays);
            System.out.println("Total charge: " + this.chargePerDay * this.noOfDays);
        }
    }
    
    
    //This is the Method to to return the instruments
    public void returnInstrument()
    {
        if(this.isRented == false)
        {
            System.out.println("This instrument has not been rented");
        }
        else
        {
            this.setcustomerName("");
            this.setcustomerMobileNumber("");
            this.setdateOfRent("");
            this.setdateOfReturn("");
            this.setnoOfDays(0);
            this.setPANNumber(0);
            this.setisRented(false);
            System.out.println("Thankyou, the instrument has been returned.");
        }
    }
    
    
    //This is Display method that has the same signature as the display method parent class
    public void display()
    {
        super.display();
        if(this.isRented == true)
        {
            System.out.println("This instrument has already been rented");
            System.out.println("Rented Date" + this.dateOfRent);
            System.out.println("Return Date" + this.dateOfReturn);
        }
        else
        {
            System.out.println("This instrument is available.");
        }
    }
}
