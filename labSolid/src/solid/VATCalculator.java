package solid;

public class VATCalculator {
	
	private static final float IVA_RATE = 0.21f;

	public float calculateVAT(float initialAmount, String code) {
	    if (Integer.parseInt(code) < 10) {
	        return 0;
	    }
	    return initialAmount * IVA_RATE;
	}

}
