package Labs.Lab1;

public class SoccerWrapper {

	public static class Sports {
		private String name;
		private int players;
		public String testValue; //DO NOT DELETE THIS
		
		public Sports(String name, int players) {
			this.name = name;
			this.players = players;
		}
		
		public String getName() {
			return name;
		}
		
		public int getPlayers() {
			return players;
		}
		
		
		
		public String printTeamMembers() {
			return "Each team has " + getPlayers() + " players in " + getName();
		}
		
		//DO NOT DELETE THIS
		public void setTestValue() {
			testValue = printTeamMembers();
		}
	}

	public static class Soccer extends Sports {
		
		public Soccer(String name, int players) {
			super(name, players);
		}

		/*TODO ADD OVERWRITTEN METHODS HERE*/

        @Override
        public String getName(){
            return "Overwritten " + super.getName() ;
        }

        @Override
        public int getPlayers(){
            return super.getPlayers() / 2;
        }

        @Override
        public String printTeamMembers(){
            return "Each team has " + getPlayers() + " players in " + getName();
        }
		
	}

    public static void main(String[] args) {
        Sports sports = new Sports("Football", 53);
        Soccer soccer = new Soccer("Soccer", 22);

        System.out.println(soccer.getName());
        System.out.println(soccer.getPlayers());
        System.out.println(soccer.printTeamMembers());

        System.out.println(sports.getName());
        System.out.println(sports.getPlayers());
        System.out.println(sports.printTeamMembers());
    }
}

