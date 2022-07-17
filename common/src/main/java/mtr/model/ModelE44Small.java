package mtr.model;

public class ModelE44Small extends ModelE44 {

	@Override
	protected int[] getWindowPositions() {
		return new int[]{-30, 0, 30};
	}

	@Override
	protected int[] getDoorPositions() {
		return new int[]{-64, 64};
	}

	@Override
	protected int[] getEndPositions() {
		return new int[]{-96, 96};
	}

}
