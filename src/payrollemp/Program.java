package payrollemp;

/**
 * This class +++ Insert class description here +++
 * @author Gabriel Montemayor
 */
public class Program 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Employee e1=new Employee("Evan",120,10);
        System.out.println("Employee earned "+ e1.CalculatePay());
        //System.out.println("Employee earned "+ e2.CalculatePay());
        Manager m1=new Manager("Stewart",100,20,1000);
            
        System.out.println("Manager earned "+m1.CalculatePay());
    }

}
