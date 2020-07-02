import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Vector {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public double lengthV()
    {
        return Math.sqrt(Math.pow(getX2()-getX1(), 2)+Math.pow(getY2()-getY1(), 2));
    }

    public Vector minusVector(Vector vector1, Vector vector2) {
        double x2 = vector2.getX2()-vector2.getX1()+vector1.getX1();
        double y2 = vector2.getY2()-vector2.getY1()+vector1.getY1();
        double x1 = vector1.getX2();
        double y1 = vector1.getY2();
        Vector vector3 = new Vector(x1, y1, x2, y2);
        return vector3;
    }

    public Vector sumVector(Vector vector1, Vector vector2) {

        double x1 = vector1.getX2();
        double y1 = vector1.getY2();
        double x2 = vector2.getX2()-vector2.getX1()+vector1.getX2();
        double y2 = vector2.getY2() - vector2.getY1()+vector1.getY2();
        Vector vector3 = new Vector(x1, y1, x2, y2);
        return vector3;
    }
}
