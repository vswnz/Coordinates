
/**
 * Plotter.  A small program that just makes a coordinate and then prints it out.
 *
 * @author Bill Viggers
 * @version 15-Nov-22
 */
public class Plotter
{
    Coordinate point;

    public Plotter()
    {
        point = new Coordinate();  // make new object by running its constructor
        point.x=5;  // set x value for point
        point.y=7;  // set y value for point
        System.out.println("Coordinate location is: "+point.x+","+point.y);
    } // end Plotter constructor
}
