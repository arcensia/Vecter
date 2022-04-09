package aaa;

public class Statistics {
	
	int id;
	int passnum;
	int fallnum;
	int totalnum;
	float percent;
	
	public Statistics(int id, int passnum, int fallnum) {
		super();
		this.id = id;
		this.passnum = passnum;
		this.fallnum = fallnum;
		this.totalnum = passnum+fallnum;
		this.percent = (passnum/totalnum)*100;
		}

	@Override
	public String toString() {
		return "Statistics [id=" + id + ", passnum=" + passnum + ", fallnum=" + fallnum + ", totalnum=" + totalnum
				+ ", percent=" + percent + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassnum() {
		return passnum;
	}

	public void setPassnum(int passnum) {
		this.passnum = passnum;
	}

	public int getFallnum() {
		return fallnum;
	}

	public void setFallnum(int fallnum) {
		this.fallnum = fallnum;
	}

	public int getTotalnum() {
		return totalnum;
	}

	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	
	
}
