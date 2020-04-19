package Prog210420.Prog210420;

public class Computador {
	
	
	private PlacaDeVideo placaDeVideo;
	
	public Computador(PlacaDeVideo placaDeVideo) {
		this.placaDeVideo=placaDeVideo;
	}
	public void contarCores() {
		System.out.println(placaDeVideo.cudaCores());
	}
}
