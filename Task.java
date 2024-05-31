package TOdolist;

public class Task {
	private String Title;
	private String description;
	private boolean completed;
	public Task(String Title,String description) {
		this.Title = Title;
		this.description = description;
		this.completed=false; //false by default
		
	}
	public String getTitle() {
		return Title;
	}
	public String getDescription() {
		return description;
	}
	public boolean iscompleted() {
		return completed;
	}
	public void Markcompleted() {
		this.completed=true;
	}

}
