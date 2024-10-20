package solid;

public class DeductionCalculator {
	
	 public float calculateDeduction(float initialAmount, int deductionPercentage) {
	        if (initialAmount > 35600) {
	            return (initialAmount * deductionPercentage + 4.5f) / 100;
	        } else {
	            return (initialAmount * deductionPercentage) / 100;
	        }
	    }

}
