
public class Rectangle {
	
	private int aSide;
	private int bSide;
	
	public Rectangle(int aSide, int bSide) {
		this.aSide= aSide;
		this.bSide= bSide;
	}
	
	public Rectangle(int sides) {
		this.aSide= sides;
		this.bSide= sides;
	}
	public int getArea() {
		return aSide*bSide;
	}

	public String toString() {
		return  aSide + ", " + bSide + ": " + getArea();	
	}

	public int getaSide() {
		return aSide;
	}
	public int getbSide() {
		return bSide;
	}
	public void setSidesRect(int aSide, int bSide) {
		this.aSide = aSide;
		this.bSide = bSide;
	}
	public void setSidesCube(int sides) {
		this.aSide = sides;
		this.bSide = sides;
	}
	
	public boolean isBigger(Rectangle rectangle) {
		if (this.getArea() > rectangle.getArea()) {
			return true;
		}
		else return false;
	}
	
	public boolean sameSides(Rectangle rectangle) {
		if (this.aSide == rectangle.aSide && this.bSide == rectangle.bSide) {
			return true;
		}
		else if (this.aSide == rectangle.bSide && this.bSide == rectangle.aSide) {
			return true;
		}
		else return false;
	}
	
}	
