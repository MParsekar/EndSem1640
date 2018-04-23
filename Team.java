import java.util.LinkedList;

public class Team {
	final int TOTALTEAM_MEMBERS=8;
	LinkedList<TeamMember>teamMembers=new LinkedList<TeamMember>();
	public void addMemberToTeam(TeamMember person){
		if(TOTALTEAM_MEMBERS < teamMembers.size()){
			teamMembers.add(person);
		}	
		else {
			System.out.println("Error: Cannor Add More Member Team! Team is considting of "+teamMembers.size());
		}
	}
	public void printTeamDetails(){
		for(int i=0;i<=teamMembers.size();i++){
			System.out.println("Name: "+teamMembers.get(i).name);
			System.out.println("Role: "+teamMembers.get(i).role);
		}
	}
}
