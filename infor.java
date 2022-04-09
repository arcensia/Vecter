package aaa;

public class Information {
	
	int id;
	String name;
	String subject;
	int testid;
	
	

	public Information(int id, String name, String subject, int testid) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.testid = testid;
		}

	
	@Override
	public String toString() {
		return "Information [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
