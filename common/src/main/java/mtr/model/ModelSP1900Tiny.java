package mtr.model;

public class ModelSP1900Tiny extends ModelSP1900 {

	public ModelSP1900Tiny(boolean isC1141A) {
		super(isC1141A);
	}

	@Override
	protected int[] getWindowPositions() {
		return new int[]{-32, 32};
	}

	@Override
	protected int[] getDoorPositions() {
		return new int[]{-64, 0, 64};
	}

	@Override
	protected int[] getEndPositions() {
		return new int[]{-96, 96};
	}

}
