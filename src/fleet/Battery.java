package fleet;

public class Battery {
	// battery layout
	String size;
	int guns;
	int turrets;
	char[] arcOfFire;

	// gun data
	int shortRange;
	int mediumRange;
	int longRange;
	int xtraLongRange;
	int pen;
	int dmg;

	public Battery(String size, int guns, int turrets, char[] arcOfFire, int shortRange, int mediumRange, int longRange, int xtraLongRange, int pen, int dmg) {
		this.size = size;
		this.guns = guns;
		this.turrets = turrets;
		this.arcOfFire = arcOfFire;
		this.shortRange = shortRange;
		this.mediumRange = mediumRange;
		this.longRange = longRange;
		this.xtraLongRange = xtraLongRange;
		this.pen = pen;
		this.dmg = dmg;
	}

	public Battery(Battery c) {
		this.size = c.size;
		this.guns = c.guns;
		this.turrets = c.turrets;
		this.arcOfFire = c.arcOfFire;
		this.shortRange = c.shortRange;
		this.mediumRange = c.mediumRange;
		this.longRange = c.longRange;
		this.xtraLongRange = c.xtraLongRange;
		this.pen = c.pen;
		this.dmg = c.dmg;
	}
}
