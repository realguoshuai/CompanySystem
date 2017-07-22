package org.lc.person;

public class TechStaff extends Staff {
	private String characteristic;// 性格
	// TODO

	@Override
	public void work() {
		// TODO Auto-generated method stub

	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	@Override
	public void authority() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "TechStaff [characteristic=" + characteristic + ", toString()=" + super.toString() + "]";
	}

}
