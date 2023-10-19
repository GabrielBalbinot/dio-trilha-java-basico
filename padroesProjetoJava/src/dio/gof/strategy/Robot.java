package dio.gof.strategy;

public class Robot {
	
	private Behavior behavior;
	
	public void setehavior(Behavior behavior) {
		this.behavior = behavior;
	}
	
	public void move() {
		behavior.move();
	}

}
