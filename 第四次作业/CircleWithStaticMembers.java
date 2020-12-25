package fourth;

public class CircleWithStaticMembers {
	/** The radius of the circle */
	double radius;
	/** The number of object created */
	static int numberOfObjects = 0;
	
	/** Construct a circle with radius 1 */
	CircleWithStaticMembers_9_6(){
		radius = 1;
		numberOfObjects++;
	}
	
	/**Return numberOfObject */
	static int getNumberOfObject() {
		return numberOfObjects;
	}
	
	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}

}
