package test1;

public class TV {
	private int Channel = 1;
	private int VoluomLevel = 1;
	private boolean on = false;
	public TV() {
	}
	public void turnon() {
		on=true;
	}
	public void turnoff() {
		on=false;
	}
	public void setChannel(int newChannel) {
		if(on = true && newChannel>=1 && newChannel<=200){
			Channel=newChannel;
		}
	}
	public void setVoluomLevel(int newVoluomLevel) {
		if(on = true && newVoluomLevel>=0 && newVoluomLevel<=100){
			VoluomLevel=newVoluomLevel;
		}
	}
	public void ChannelUp() {
		if(on = true && Channel>=1) {
			Channel--;
		}
	}
	public void ChannelDown() {
		if(on = true && Channel>=1) {
			Channel++;
		}
	}
	public void VoluomLevellUp() {
		if(on = true && VoluomLevel>=1) {
			VoluomLevel++;
		}
	}
	public void VoluomLevelDown() {
		if(on = true && VoluomLevel>=1) {
			VoluomLevel--;
		}
	}
}
