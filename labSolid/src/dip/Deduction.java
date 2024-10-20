package dip;

public class Deduction implements InterfaceDeduction {
    public float calc(float amount, int deductionPercentage) {
        return (amount * deductionPercentage) / 100;
    }
}
