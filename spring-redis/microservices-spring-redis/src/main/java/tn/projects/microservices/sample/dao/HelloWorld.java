package tn.projects.microservices.sample.dao;

/**
 * @author Mickael BARON
 */
public class HelloWorld {

	private long rid;

	private String message;

	private String startDate;
		
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public long getRid() {
		return rid;
	}

	public void setRid(long rid) {
		this.rid = rid;
	}
}
