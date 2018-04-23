import java.util.LinkedList;

public class Story {
	String story;
	int storyPoint;
	LinkedList<Task>task = new LinkedList<Task>();
	public Story(String story, int storyPoint) {
		super();
		this.story = story;
		this.storyPoint = storyPoint;
	}
	public void addTask(Task task){
		this.task.add(task);
	}
	
}
