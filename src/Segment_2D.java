

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
	public Point_2D[] getAllPoints() {
		Point_2D[] points = new Point_2D[2];
		points[0] = _p1;
		points[1] = _p2;

		return points;
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

//	@Override
//	public boolean contains(Point_2D ot) {
//		double m=(this._p1.y()-this._p2.y())/(this._p1.x()-this._p2.x());
//		double b=this._p1.y()-m*this._p1.x();
//		if(_p1.x()==_p2.x()&&ot.x()==_p1.x()) {
//
//				return true;
//		}
//		else if(_p1.y()==_p2.y()&&ot.y()==_p1.y())
//			return true;
//		else if(m*ot.x()+b==ot.y())
//			return true;
//		return false;
//		}
//
@Override
public boolean contains(Point_2D ot) {
	if(_p1.distance(ot)+_p2.distance(ot)==_p1.distance(_p2))
		return true;
	return false;
}
	@Override
	public String toString() {
		String ans = _p1.toString() + "," + _p2.toString();
		return ans;
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
		_p1.move(vec);
		_p2.move(vec);

	}

	@Override
	public GeoShape copy() {
		Segment_2D copy = new Segment_2D(this._p1,this._p2);
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