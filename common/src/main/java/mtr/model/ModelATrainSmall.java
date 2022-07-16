package mtr.model;

public class ModelATrainSmall extends ModelATrain {

	public ModelATrainSmall(boolean isAel) {
		super(isAel);
	}

	@Override
	protected int[] getWindowPositions() {
		return isAel? new int[]{-78, -52, -26, 0, 26, 52, 78} : new int[]{-80, 0, 80};
	}

	@Override
	protected int[] getDoorPositions() {
		return isAel? new int[]{-120, 120} : new int[]{-120, -40, 40, 120};
	}

	@Override
	protected int[] getEndPositions() {
		return new int[]{-144, 144};
	}

}
