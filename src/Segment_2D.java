

/**
 * This class represents a 2D segment on the plane,
 * Ex4: you should implement this class!
 * @author I2CS
 *
 */
public class Segment_2D implements GeoShape {
	private Point_2D _p1;
	private Point_2D _p2;

	public Segment_2D(Point_2D a, Point_2D b) {
		this._p1=a;
		this._p2=b;

	}
	public Segment_2D(Segment_2D t1) {
		this._p1=t1.get_p1();
		this._p2=t1.get_p2();
	}

	public Point_2D get_p1() {
		return this._p1;

	}
	public Point_2D get_p2() {
		return this._p2;
	}

	@Override
	public boolean contains(Point_2D ot) {
		double m=(this._p1.y()-this._p2.y())/(this._p1.x()-this._p2.x());
		double b=this._p1.y()-m*this._p1.x();
	if(m*ot.x()+b==ot.y())
		return true;
	return false;
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {


		System.out.println(2*(_p1.distance(_p2)));
		return 2*(_p1.distance(_p2));

	}


	@Override
	public void translate(Point_2D vec) {
		this._p1=new Point_2D(this._p1.x()+vec.x(),this._p1.y()+vec.y());
		this._p2=new Point_2D(this._p2.x()+vec.x(),this._p2.y()+vec.y());

	}

	@Override
	public GeoShape copy() {
		GeoShape copy = new Segment_2D(this._p1,this._p2);
		return copy;
	}

	@Override
	public void scale(Point_2D center, double ratio) {
		_p1.scale(center,ratio);
		_p2.scale(center,ratio);

	}

	@Override
	public void rotate(Point_2D center, double angleDegrees) {
	_p1.rotate(center,angleDegrees);
	_p1.rotate(center,angleDegrees);

	}


}