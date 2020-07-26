package tn.projects.microservices.sample.dao;
public enum Keys {

	HELLOWORLD_ALL("helloworld:all"), 
	HELLOWORLD_DATA("helloworld:%s:data"), 
	HELLOWORLD_IDS("helloworld:ids");

	private String key;

	Keys(String key) {
		this.key = key;
	}

	public String key() {
		return key;
	}

	public String formated(String... value) {
		return String.format(key, (Object[])value);
	}
}