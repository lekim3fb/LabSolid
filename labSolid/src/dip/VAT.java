package dip;

public class VAT implements InterfaceVAT {
	@Override
	public float calc(float amount) {
		return amount * 0.21f; // Ejemplo: 21% de IVA
	}
}
