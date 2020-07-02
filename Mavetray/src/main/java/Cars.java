import java.awt.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Cars {

    static Logger logger = Logger.getLogger(Cars.class.getName());


    private int ageManufacture;
    private String brend;
    private Color color;

    public Cars(int ageManufacture, String brend, Color color) throws NoColorException
    {
        this.ageManufacture = ageManufacture;
        this.brend = brend;
        if(color == Color.red) throw new NoColorException("Nu este asa culoare");
            else this.color = color;
        PropertyConfigurator.configure("log4j.properties");
    }





    public void getAgeManufacture() {

        logger.info(ageManufacture);
    }

    public void getBrend()
    {
        logger.info(brend);
    }


}
