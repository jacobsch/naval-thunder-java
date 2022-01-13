package fleet;

public class Ship {
	String name;
	String classType;
	int classTypeModifier;

	int hull;
	int speed;
	String fc = "JPN";
	int cmd;
	int av;
	int sav;
	int crewRating;
	int aa;
	int asw;

	protected Battery[] mainBatteries;
	protected Battery[] secondaryBatteries;
	protected Torpedo[] torpedos;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getClassTypeModifier() {
		return classTypeModifier;
	}

	public void setClassTypeModifier() {
		switch (this.getClassType()) {
			case "Battleship":
				this.classTypeModifier = 6;
				break;
			case "Fast Battleship":
			case "Battlecruiser":
			case "Fleet Carrier":
				this.classTypeModifier = 7;
				break;
			case "Heavy Cruiser":
			case "Light Cruiser":
			case "Escort Carrier":
				this.classTypeModifier = 8;
				break;
			case "Destroyer":
			case "Destroyer Escort":
				this.classTypeModifier = 10;
				break;
			default:
				System.out.println("Error! Illegal Ship CLass Type\nsetClassTypeModifier failsafe");
				this.classTypeModifier = 10;
				break;
		}

	}

	public int getHull() {
		return hull;
	}

	public void setHull(int hull) {
		this.hull = hull;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getFc() {
		return fc;
	}

	public void setFc(String fc) {
		this.fc = fc;
	}

	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public int getAv() {
		return av;
	}

	public void setAv(int av) {
		this.av = av;
	}

	public int getSav() {
		return sav;
	}

	public void setSav(int sav) {
		this.sav = sav;
	}

	public int getCrewRating() {
		return crewRating;
	}

	public void setCrewRating(int crewRating) {
		this.crewRating = crewRating;
	}

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	public int getAsw() {
		return asw;
	}

	public void setAsw(int asw) {
		this.asw = asw;
	}

	public Ship(String name, String classType, int hull, int speed, String fc, int cmd, int av, int sav, int crewRating, int aa, int asw, Battery[] mainBatteries, Battery[] secondaryBatteries, Torpedo[] torpedoes) {
		this.name = name;
		this.classType = classType;
		setClassTypeModifier();
		this.hull = hull;
		this.speed = speed;
		this.fc = fc;
		this.cmd = cmd;
		this.av = av;
		this.sav = sav;
		this.crewRating = crewRating;
		this.aa = aa;
		this.asw = asw;
		this.mainBatteries = mainBatteries;
		this.secondaryBatteries = secondaryBatteries;
		this.torpedos = torpedoes;
	}
}

