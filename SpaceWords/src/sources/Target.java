package sources;

public class Target {
	Enemy target = null;
	String key;
	
	public Target(Enemy e) {
		target = e;
		target.isTarget();
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public Enemy getTarget() {
		return target;
	}
	
	public boolean targetSuccess() {
		if(Character.toString(target.getEnemy().charAt(0)).equalsIgnoreCase(key)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(target.getEnemy().length() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void destroy() {
		if(target.getEnemy().length() > 0) {
			target.hit();
		}
	}
	
	
}
