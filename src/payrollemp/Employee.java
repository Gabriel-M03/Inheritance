package payrollemp;

/**
 *
 * @author black
 */
public class Employee 
{

    /**
     * @return the name
     */
    public Employee(String givenName,double givenWage,int givenNumHours)
    {   
            name=givenName;
            hourlyWage=givenWage;
            numHours=givenNumHours;      
    }
    public String getName() 
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * @return the hourlyWage
     */
    public double getHourlyWage() 
    {
        return hourlyWage;
    }

    /**
     * @param hourlyWage the hourlyWage to set
     */
    public void setHourlyWage(double hourlyWage) 
    {
        this.hourlyWage = hourlyWage;
    }

    /**
     * @return the numHours
     */
    public int getNumHours() 
    {
        return numHours;
    }

    /**
     * @param numHours the numHours to set
     */
    public void setNumHours(int numHours) 
    {
        this.numHours = numHours;
    }
    public double CalculatePay() 
    {
            double pay=hourlyWage*numHours;
            return pay;
    }
    private String name;
    private double hourlyWage;
    private int numHours;
    
}
