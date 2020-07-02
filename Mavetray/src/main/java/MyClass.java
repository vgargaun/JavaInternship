import javax.security.auth.login.LoginException;
//import java.util.logging.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.awt.*;

public class MyClass {
    static Logger logger = Logger.getLogger(MyClass.class);
    public static void main(String[] args) throws NoColorException {
        //PropertyConfigurator.configure("log4j.properties");
        //logger.info("Hello");


        Cars car1 = new Cars(2010, "BMW", Color.black);
        try {
            Cars car2 = new Cars(2010, "BMW", Color.red);
        }
        catch (NoColorException e)
        {
            logger.info(e);
        }




        car1.getAgeManufacture();
        car1.getBrend();

    }
}
