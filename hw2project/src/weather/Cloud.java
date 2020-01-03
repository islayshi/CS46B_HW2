package weather;

public class Cloud {
	private float bottom = 0;
	private float top = 0;
	
	public Cloud(float bottom, float top) {
		this.bottom = bottom;
		this.top = top;
	}
	
	public float getHeight() {
		//returns a value which is top minue bottom
		float temp = 0;
		temp = top - bottom;
		return temp;
	}
	
	public String rain() {
		return "It is raining";
	}
}
