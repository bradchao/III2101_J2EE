package tw.brad.j2ee;

public class Brad20 {
	private int x, y;
	public Brad20(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}
	public int add() {return x + y;}
}
