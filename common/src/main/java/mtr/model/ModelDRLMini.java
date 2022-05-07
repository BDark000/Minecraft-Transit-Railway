package mtr.model;

public class ModelDRLMini extends ModelDRL{
    @Override
    protected int[] getWindowPositions() {
        return new int[]{0};
    }

    @Override
    protected int[] getDoorPositions() {
        return new int[]{-80, 80};
    }

    @Override
    protected int[] getEndPositions() {
        return new int[]{-104, 104};
    }

    @Override
    protected int[] getBogiePositions() {
        return new int[]{0};
    }

}
