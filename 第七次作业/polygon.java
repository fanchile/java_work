package siventh;
import java.util.ArrayList;
public class polygon {

	private ArrayList<MyPoint> array= new ArrayList<>();
	polygon(){
	}
	 
	public void setPoint(MyPoint p){
	    this.array.add(p);
	}

	public double Area(int pointNum) {
	    int i=0;
	    double temp=0;
	    for(; i <pointNum - 1;i++) {
	        temp += (this.array.get(i).getX() - this.array.get(i+1).getX())*(this.array.get(i).getY() + this.array.get(i+1).getY());
	    }
	    temp += (this.array.get(i).getX() - this.array.get(0).getX())*(this.array.get(i).getY() + this.array.get(0).getY());
	    if(temp < 0) temp = -temp;
	    return temp/2;
	}
	 
	public void out() {
	    for(int i =0 ;i < array.size();i++) {
	        System.out.print("(x:" + array.get(i).getX() +"y:" + array.get(i).getY() +")");
	 
	    }
	}
}
