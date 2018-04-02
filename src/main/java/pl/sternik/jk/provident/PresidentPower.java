package pl.sternik.jk.provident;

public class PresidentPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 60000;
	}

	@Override
	protected String getRoleName() {
		return "Prezes Providenta";
	}
}