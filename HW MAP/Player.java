package hw_for_Map;

public class Player {
	   private String name, team_name;
	   private int Jersey_no, wickets, runs;;

		Player(String pn, String tn, int jn, int w, int r) {
			name = pn;
			team_name = tn;
			Jersey_no = jn;
			wickets = w;
			runs = r;
		}

   @Override
		public String toString() {
			return "Player [name=" + name + ", team_name=" + team_name + ", Jersey_no=" + Jersey_no + ", wickets="
					+ wickets + ", runs=" + runs + "]";
		}

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public String getTeam_name() {
	return team_name;
   }

   public void setTeam_name(String team_name) {
	this.team_name = team_name;
   }

   public int getJersey_no() {
	return Jersey_no;
   }

   public void setJersey_no(int jersey_no) {
	Jersey_no = jersey_no;
   }

   public int getWickets() {
	return wickets;
   }

   public void setWickets(int wickets) {
	this.wickets = wickets;
   }

   public int getRuns() {
	return runs;
   }

   public void setRuns(int runs) {
	this.runs = runs;
   }
   
   
}
