package Prog210420.Prog210420;

public class AdapterPlacaDeVideo implements PlacaDeVideo{
	

	private PlacaDeVideoAlternativa placa;
	
	public AdapterPlacaDeVideo(PlacaDeVideoAlternativa placa) {
		this.placa=placa;
	}
	
	public int cudaCores() {
		return placa.quanticCores();
	}
}
