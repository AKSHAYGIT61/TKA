package hw_for_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		List<Player> RCB_Team = new ArrayList<>();
		RCB_Team.add(new Player("Virat Kohli", "RCB", 18, 4, 8004));
		RCB_Team.add(new Player("Faf du Plessis", "RCB", 13, 0, 4571));
		RCB_Team.add(new Player("Rajat Patidar", "RCB", 97, 0, 1254));
		RCB_Team.add(new Player("Glenn Maxwell", "RCB", 32, 37, 2771));
		RCB_Team.add(new Player("Mohammed Siraj", "RCB", 73, 93, 108));
		RCB_Team.add(new Player("Yash Dayal", "RCB", 11, 28, 5));
		RCB_Team.add(new Player("Cameron Green", "RCB", 42, 16, 707));
		RCB_Team.add(new Player("Will Jacks", "RCB", 29, 2, 230));
		RCB_Team.add(new Player("Dinesh Karthik", "RCB", 19, 0, 4842));
		RCB_Team.add(new Player("Mahipal Lomror", "RCB", 4, 1, 530));
		RCB_Team.add(new Player("Akash Deep", "RCB", 12, 10, 20));

		List<Player> GT_Team = new ArrayList<>();
		GT_Team.add(new Player("Shubman Gill", "GT", 7, 0, 3216));
		GT_Team.add(new Player("Rashid Khan", "GT", 19, 149, 543));
		GT_Team.add(new Player("Sai Sudharsan", "GT", 23, 0, 1034));
		GT_Team.add(new Player("David Miller", "GT", 10, 0, 2922));
		GT_Team.add(new Player("Rahul Tewatia", "GT", 14, 32, 1013));
		GT_Team.add(new Player("Shahrukh Khan", "GT", 9, 0, 426));
		GT_Team.add(new Player("Mohit Sharma", "GT", 18, 131, 62));
		GT_Team.add(new Player("Umesh Yadav", "GT", 15, 144, 178));
		GT_Team.add(new Player("Spencer Johnson", "GT", 45, 9, 2));
		GT_Team.add(new Player("R. Sai Kishore", "GT", 1, 13, 26));
		GT_Team.add(new Player("Sandeep Warrier", "GT", 63, 9, 5));

		List<Player> RR_Team = new ArrayList<>();
		RR_Team.add(new Player("Sanju Samson", "RR", 11, 0, 4411));
		RR_Team.add(new Player("Yashasvi Jaiswal", "RR", 64, 0, 1608));
		RR_Team.add(new Player("Jos Buttler", "RR", 63, 0, 3582));
		RR_Team.add(new Player("Riyan Parag", "RR", 87, 6, 1173));
		RR_Team.add(new Player("Shimron Hetmyer", "RR", 18, 0, 1210));
		RR_Team.add(new Player("R. Ashwin", "RR", 99, 180, 800));
		RR_Team.add(new Player("Yuzvendra Chahal", "RR", 3, 205, 54));
		RR_Team.add(new Player("Trent Boult", "RR", 18, 121, 85));
		RR_Team.add(new Player("Sandeep Sharma", "RR", 20, 137, 52));
		RR_Team.add(new Player("Avesh Khan", "RR", 21, 65, 35));
		RR_Team.add(new Player("Dhruv Jurel", "RR", 16, 0, 347));

		List<Player> SRH_Team = new ArrayList<>();
		SRH_Team.add(new Player("Pat Cummins", "SRH", 30, 62, 439));
		SRH_Team.add(new Player("Travis Head", "SRH", 62, 2, 860));
		SRH_Team.add(new Player("Abhishek Sharma", "SRH", 4, 11, 1376));
		SRH_Team.add(new Player("Heinrich Klaasen", "SRH", 45, 0, 998));
		SRH_Team.add(new Player("Nitish Kumar Reddy", "SRH", 22, 3, 303));
		SRH_Team.add(new Player("Aiden Markram", "SRH", 94, 2, 941));
		SRH_Team.add(new Player("Abdul Samad", "SRH", 54, 0, 577));
		SRH_Team.add(new Player("Bhuvneshwar Kumar", "SRH", 15, 181, 312));
		SRH_Team.add(new Player("T. Natarajan", "SRH", 44, 65, 15));
		SRH_Team.add(new Player("Mayank Markande", "SRH", 17, 34, 40));
		SRH_Team.add(new Player("Shahbaz Ahmed", "SRH", 7, 19, 471));

		Map<String, List<Player>> ipl_2026_db = new HashMap();
		ipl_2026_db.put("RCB", RCB_Team);
		ipl_2026_db.put("RR", RR_Team);
		ipl_2026_db.put("GT", GT_Team);
		ipl_2026_db.put("SRH", SRH_Team);

		for (String Team : ipl_2026_db.keySet()) {
			System.out.println(Team + ": Team list:---> " + ipl_2026_db.get(Team));
		}
		System.out.println();
		for (String Team : ipl_2026_db.keySet()) {
			System.out.println();
			System.out.println(Team + ": Team list:---> " + ipl_2026_db.get(Team));

			for (Player team_name : ipl_2026_db.get(Team)) {
				String player_name = team_name.getName();
				for (int i = 0; i < player_name.length(); i++) {
					System.out.println(player_name.charAt(i));
				}
			}
		}

	}

}
