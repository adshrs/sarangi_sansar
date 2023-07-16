
/**
 * The InstrumentToSell class is a subclass of the Instrument class.
 * This class has four attributes. 
 * @author (Aditya Chandra Shrestha)
 * @version (17.0.1)
 */
public class InstrumentToSell extends Instrument
{
    private float price;
    private String sellDate;
    private float discountPercent;
    private boolean isSold;
    
    //Creating a Constructor
    public InstrumentToSell(String instrumentName, float price)
    {
        super(instrumentName);
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0.0f;
        this.isSold = false;
    }
    
    
    //This is Getters method
    public float getprice()
    {
        return price;
    }
    
    public String getsellDate()
    {
        return sellDate;
    }
    
    public float getdiscountPercent()
    {
        return discountPercent;
    }
    
    public boolean getisSold()
    {
        return isSold;
    }
    
    
    //This is Setters method
    public void setprice(float price)
    {
        if(this.getisSold() == false)
        {
            this.price = price; 
        }
        else
        {
            System.out.println("This instrument is already sold and it is not possible to change it's price");
        }
    }
    
    public void setsellDate(String sellDate)
    {
        this.sellDate = sellDate;
    }
    
    public void setdiscountPercent(float discountPercent)
    {
        this.discountPercent = discountPercent;
    }
    
    public void setisSold(boolean isSold)
    {
        this.isSold = isSold;
    }
    
    
    //This is the Method to sell instruments
    public void sellInstrument(String customerName, String customerMobileNumber, int PANNumber, String sellDate, float discountPercent)
    {
        if(this.getisSold() == true)
        {
            System.out.println("This instrument is sold out");
            System.out.println(customerName);
            System.out.println(customerMobileNumber);
            System.out.println(PANNumber);
        }
        else
        {
            this.setcustomerName(customerName);
            this.setcustomerMobileNumber(customerMobileNumber);
            this.setPANNumber(PANNumber);
            this.sellDate = sellDate;
            this.discountPercent = discountPercent;
            this.setprice(price-((discountPercent/100)*price));
        }
    }
    
    
    //This is Display method that has the same signature as the Display method in parent class
    public void display()
    {
        super.display();
        System.out.println("Discounted price of the instrument is Rs. " + this.getprice());
        
        if(this.getisSold() == true)
        {
            System.out.println("Customer Name:\"" + this.getcustomerName() + "\"");
            System.out.println("Customer Mobile Number:\"" + this.getcustomerMobileNumber() + "\"");
            System.out.println("Customer Pan Number:\"" + this.getPANNumber() + "\"");
            System.out.println("Sold Date" + this.sellDate);
        }
    }
}
