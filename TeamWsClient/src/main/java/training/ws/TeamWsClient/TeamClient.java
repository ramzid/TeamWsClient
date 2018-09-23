package training.ws.TeamWsClient;

import java.util.Iterator;
import java.util.List;

import teamC.Player;
import teamC.Team;
import teamC.Teams;
import teamC.TeamsService;

/**
 * ramzi dridi
 *
 */
public class TeamClient 
{
    public static void main( String[] args )
    {
    	TeamsService service=new TeamsService();
  Teams port=  	service.getTeamsPort();
  port.geTeam("team1");
 List<Team> listTeam=port.geTeams();
 for (Team team : listTeam) {
	System.out.println("Roster count:"+team.getRosterCount()+"Team name:"+team.getName());
	for (Player player: team.getPlayers()) {
		System.out.println("Name: "+player.getName()+" nickName: "+player.getNickName());
		
	}
}
        
    }
}
