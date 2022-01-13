package fleet.american;

import fleet.Ship;
import fleet.Battery;
import fleet.Torpedo;

import java.util.Objects;

public class Benson extends Ship {

	public Benson(String name) {
		super(
				Objects.requireNonNullElse(name, "Benson"),
				"Destroyer",
				7,
				9,
				"RDR",
				8,
				4,
				1,
				0,
				3,
				1,
				new Battery[0],
				new Battery[2],
				new Torpedo[0]
		);
		this.secondaryBatteries[0] = new Battery(
				"5\"/38",
				1,
				2,
				new char[]{'F', 'P', 'S'},
				7,
				14,
				21,
				28,
				2,
				2
		);
		this.secondaryBatteries[1] = new Battery(
				"5\"/38",
				1,
				2,
				new char[]{'A', 'P', 'S'},
				7,
				14,
				21,
				28,
				2,
				2
		);
	}
}

