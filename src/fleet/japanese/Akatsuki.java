package fleet.japanese;

import fleet.Battery;
import fleet.Ship;
import fleet.Torpedo;
import java.util.Objects;

public class Akatsuki extends Ship {
	public Akatsuki(String name) {
		super(
				Objects.requireNonNullElse(name, "Akatsuki"),
				"Destroyer",
				8,
				9,
				"JPN",
				8,
				4,
				1,
				0,
				4,
				1,
				new Battery[0],
				new Battery[2],
				new Torpedo[0]
				);
		this.secondaryBatteries[0] = new Battery(
				"5\"/50",
				2,
				1,
				new char[]{'F', 'P', 'S'},
				9,
				18,
				27,
				36,
				2,
				2
		);
		this.secondaryBatteries[1] = new Battery(
				"5\"/50",
				2,
				1,
				new char[]{'A', 'P', 'S'},
				9,
				18,
				27,
				36,
				2,
				2
		);
	}
}

