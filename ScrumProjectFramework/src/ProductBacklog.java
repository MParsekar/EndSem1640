import java.util.LinkedList;

public class ProductBacklog {
	LinkedList<Story>stories=new LinkedList<Story>();
	public void addStory(Story userStory){
		stories.add(userStory);
	}
	public void printStories(){
		for(int i=0;i<stories.size();i++){
			System.out.println("Story: \t"+stories.get(i).story);
			System.out.println("Story Point: \t"+stories.get(i).storyPoint);
		}
	}
	public Story getStory(){
		Story storyTopPriority = null;
		int currentPriority=0;
		for(int i=0;i<this.stories.size();i++){
			if(stories.get(i).storyPoint>=currentPriority){
				storyTopPriority=stories.get(i);
				currentPriority=storyTopPriority.storyPoint;
			}
		}
		return storyTopPriority;
	}
}
