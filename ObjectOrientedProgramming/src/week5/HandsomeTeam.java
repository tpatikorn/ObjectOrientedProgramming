package week5;

import java.util.ArrayList;
import java.util.List;

import week4.Basketball;
import week4.Sport;

public class HandsomeTeam extends Team {
	PlayStyle ps;

	public HandsomeTeam(String name, Sport sport, List<Player> teamMembers) {
		super(name, sport, teamMembers);
		this.ps = PlayStyle.HANDSOME;
	}

	public int getAttack() {
		List<Player> playerList = this.getTeamMembers();
		int attack = 0;

		for (int p = 0; p < playerList.size(); p++) {
			Player player = playerList.get(p);
			if (player.getPlayStyle() == this.ps) {
				attack = attack + 1;
			}
		}
		return attack;
		// using filter & lambda
		// players = players.stream().filter((p) -> p.getPlayStyle() == this.ps);
	}

	public double getDefense(int i) {
		return -100.0 + i;
	}
	
	@Override
	public int getDefense() {
		return -100;
	}

	// จำนวนคนที่ PlayStyle ตรงกับ PlayStyle ps ที่ให้
	public int getDefense(PlayStyle ps) {
		List<Player> playerList = this.getTeamMembers();
		int defense = 0;

		for (int q = 0; q < playerList.size(); q++) {
			if (playerList.get(q).getPlayStyle() == ps) {
				defense = defense + 1;
			}
		}
		return defense;
	}
	
	
	public static void main(String args[]) {
		List<Player> playerList = new ArrayList<Player>();
		
		for(int i = 0; i < 30; i++) {
			double rnd = Math.random();
			if(rnd < 0.33333) {
				playerList.add(new Player("Pete"+i, null, null, PlayStyle.LUCK));	
				System.out.println("LUCK");
			} else if (rnd < 0.66666) {
				playerList.add(new Player("Pete"+i, null, null, PlayStyle.BEAUTIFUL));
				System.out.println("BEAUTIFUL");
			} else {
				playerList.add(new Player("Pete"+i, null, null, PlayStyle.HANDSOME));
				System.out.println("HANDSOME");
			}
		}
		HandsomeTeam t = new HandsomeTeam("Pete", new Basketball(), playerList);
		System.out.println(t.getAttack());
		System.out.println(t.getDefense(PlayStyle.HANDSOME));
		System.out.println(t.getDefense(PlayStyle.BEAUTIFUL));
		System.out.println(t.getDefense(PlayStyle.LUCK));
		System.out.println(t.getDefense());
		System.out.println(t.getDefense(2024));
	}
}
