import java.util.Arrays;


public class SprintBacklog {
	Story currentStory;
	Task []doo =new Task [20];
	Task []doing=new Task[20];
	Task done;
	
	public void addStoryToSprint(Story story){
		if(currentStory==null){
			currentStory=story;
		}
		for(int i=0;i<story.task.size();i++){
			doo[i]=story.task.get(i);
		}
	}
	public void addToDoing(){
		//we can take user intput over here showing all the task and than typing which one to add to the doing
		//But for time being i m extracting the last taks in the story
		if(doo.length!=0){
			doing[doing.length+1]=doo[0];
//			doo=ArrayUtils.remove(doo, doo[0]);
		}else{
			System.out.println("No More Task are in do.");
		}
	}
	
}
