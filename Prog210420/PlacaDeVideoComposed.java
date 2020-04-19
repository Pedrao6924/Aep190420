package Prog210420.Prog210420;

import java.util.ArrayList;
import java.util.List;

public class PlacaDeVideoComposed implements PlacaDeVideo{
	
	private List<PlacaDeVideo> placaDeVideo = new ArrayList<>();
	
	public void addPlacaDeVideo(PlacaDeVideo placaDeVideo){
		this.placaDeVideo.add(placaDeVideo);
	}
	
	public int cudaCores(){
		return placaDeVideo.stream().map(udp -> udp.cudaCores()).reduce(atual, total) -> total + atual).get();
	}

}
