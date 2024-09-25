import java.util.*;

class Untitled {
	public static void main(String[] args) {
		System.out.println("Welcome fearless Dungeon Master! To your helpful guide!");
		System.out.println("Press 0 for NPC Naming");
		System.out.println("Press 1 for Wilderness encounter");
		System.out.println("Press 2 for calculating challenge rating");
		System.out.print("Pick your poison: ");
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		if (user == 0) {
			raceName();}
		if (user == 1) {
			encounter();}
		if (user == 2) {
			challenge();}}
	public static void raceName() {
		Scanner input = new Scanner(System.in);
		//For each name both Male and Female have 20 names but Surnames, clans, or something like that have 10 that are combined later on. Example Theo Amblecrown
		//Origin for these selected Surnames for humans come from Tehyrian/Chondathan and Illuskan
		String humanMale [] = {"Theo", "Aeson", "Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn", "Randal", "Bor", "Pavel", "Sergor", "Grigor", "Fodel", "Glar", "Igan", "Kosef", "Pavel"};
		String humanFemale [] = {"Arveene", "Esvele", "Jhessail", "Kerri", "Lureene", "Miri", "Rowan", "Shandri", "Tesseie", "Alethra", "Kara", "Katernin", "Mara", "Natali", "Olma", "Tana", "Thola", "Nulara", "Selise", "Immith"};
		String humanSurname [] = {"Amblecrown", "Buckman", "Dundragon", "Evenwood", "Greycastle", "Tallstag", "Brightwood", "Helder", "Hornraven", "Lackman"};
		//Elves use family names with meaning
		String elfMale [] = {"Adran", "Aelar", "Aramil", "Arannis", "Berrian", "Carric", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Immeral", "Ivellios", "Mindartis", "Paelias", "Peren", "Quarion", "Soveliss", "Thamior", "Theren"};
		String elfFemale [] = {"Adrie", "Althaea", "Anastrianna", "Birel", "Caelynn", "Drusilia", "Felosial", "Ielenia", "Keyleth", "Leshanna", "Lia", "Meriele", "Naivara", "Quelenna", "Sariel", "Silaqui", "Theirastra", "Thia", "Valanthe", "Xanaphia"};
		String elfFamily [] = {"Amakiir (Gemflower)", "Amastacia (Starflower)", "Galanodel (Moonwhisper)", "Holimion (Diamonddew)", "Ilphelkiir (Gemblossom)", "Liadon (Silverfrond)", "Meliamne (Oakenheel)", "Nailo (Nightbreeze)", "Siannodel (Moonbrook)", "Xiloscient (Goldpetal)"};
		//Dwarves us clan names.
		String dwarfMale [] = {"Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Harbek", "Kildrak", "Morgran", "Rangrim", "Taklinn", "Thorin", "Tordek", "Travok"};
		String dwarfFemale [] = {"Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth", "Finellen", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Liftrasa", "Mardred", "Torbera", "Vistra", "Riswynn", "Falkrunn"};
		String dwarfClan [] = {"Balderk", "Battlehammer", "Brawnanvil", "Dankil", "Fireforge", "Frostbeard", "Gorunn", "Holderhek", "Ironfist", "Loderr"};
		//Halflings use family names
		String halflingMale [] = {"Alton", "Ander", "Corrin", "Eldon", "Errich", "Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn", "Perrin", "Reed", "Roscoe", "Wellby", "Teret", "Zalmin", "Norwrick", "Elras"};
		String halflingFemale [] = {"Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", "Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna", "Jillie", "Kelalyn"};
		String halflingFamily [] = {"Brushgather", "Goodbarrell", "Greenbottle", "High-Hill", "Hilltopple", "Leagallow", "Tealeaf", "Thorngage", "Tosscobble", "Underbough"};
		//Gnomes use clan names
		String gnomeMale [] = {"Alston", "Alvyn", "Boddynock", "Brocc", "Burgell", "Dimble", "Eldon", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo", "Gimble", "Glim", "Jebeddo", "Namfoodle", "Orryn", "Seebo", "Warryn", "Zook"};
		String gnomeFemale [] = {"Bimpnottin", "Breena", "Caramip", "Carlin", "Donella", "Ella", "Ellyjobell", "Ellywick", "Lilli", "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda", "Orla", "Roywyn", "Shamil", "Tana", "Waywocket"};
		String gnomeClan [] = {"Beren", "Daergel", "Folkor", "Garrick", "Nackle", "Murnig", "Ningel", "Timbers", "Turen", "Raulnor"};
		//Dragonborn uses clan names
		String dragonbornMale [] = {"Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh", "Heskan", "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed", "Patrin", "Rhogar", "Shamash", "Shedinn", "Durnehviir", "Mirmulnir", "Vulthuryol", "Shalrid", "Odahviing"};
		String dragonbornFemale [] = {"Akra", "Biri", "Daar", "Farideh", "Harann", "Havilar", "Jheri", "Kava", "Korinn", "Mishann", "Nala", "Perra", "Raiann", "Viinturuth", "Surina", "Thava", "Nahagliiv", "Tirrhok", "Shalrid", "Ember"};
		String dragonbornClan [] = {"Clethtinthiallor", "Daardendrian", "Delmirev", "Drachedandion", "Fenkenkabradon", "Kepeshkomilik", "Kimbatuul", "Myastan", "Nemmonis", "Turnuroth"};
		//teiflings don't carry a last name
		String tieflingMale [] = {"Akmenos", "Amnon", "Barakas", "Damakos", "Ekemon", "Iados", "Kairon", "Leucis", "Melech", "Mordai", "Morthos", "Pelaios", "Skamos", "Therai", "Ernon", "Iamir", "Kyxes", "Shazire", "Nephus", "Amthos"};
		String tieflingFemale [] = {"Akta", "Anakis", "Bryseis", "Criella", "Damaia", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia", "Orianna", "Phelaia", "Rieta", "Salista", "Afza", "Inkaria", "Nithza", "Riyola", "Zabis", "Natcyra"};
		
		//prompt user
		System.out.println("Choose your Race and Gender (Male or Female)");
		System.out.println("0 for Human, 1 for Elf, 2 for Dwarf, 3 for Halfling, ");
		System.out.print("4 for Gnome, 5 for Dragonborn, " + "and 6 for Tiefling: ");
		int race = input.nextInt();
		System.out.print("Now pick gender (0 for Male and 1 for Female): ");
		
		int gender = input.nextInt();
		//calculates a random name
		int result = (int) (Math.random() * 20);
		//Calculates random last name if applicable
		
		int resultLast = (int) (Math.random() * 10);
		//Human
		if (race == 0){
			if(gender == 0){
				System.out.println(humanMale[result] + " " + humanSurname[resultLast]);}
			else if(gender == 1){
				System.out.println(humanFemale[result] + " " + humanSurname[resultLast]);
			}}
		//Elf
		if (race == 1){
			if(gender == 0){
				System.out.println(elfMale[result] + " " + elfFamily[resultLast]);}
			else if(gender == 1){
				System.out.println(elfFemale[result] + " " + elfFamily[resultLast]);
			}}
		//Dwarf
		if (race == 2){
			if(gender == 0){
				System.out.println(dwarfMale[result] + " " + dwarfClan[resultLast]);}
			else if(gender == 1){
				System.out.println(dwarfFemale[result] + " " + dwarfClan[resultLast]);}}
		//Halfling
		if (race == 3){
			if(gender == 0){
				System.out.println(halflingMale[result] + " " + halflingFamily[resultLast]);}
			else if(gender == 1){
				System.out.println(halflingFemale[result] + " " + halflingFamily[resultLast]);}}
		//Gnome
		if (race == 4){
			if(gender == 0){
				System.out.println(gnomeMale[result] + " " + gnomeClan[resultLast]);}
			else if(gender == 1){
				System.out.println(gnomeFemale[result] + " " + gnomeClan[resultLast]);}}
	//Dragonborn
		if (race == 5){
			if(gender == 0){
				System.out.println(dragonbornMale[result] + " " + dragonbornClan[resultLast]);}
			else if(gender == 1){
				System.out.println(dragonbornFemale[result] + " " + dragonbornClan[resultLast]);}}
		//Tiefling
		if (race == 6){
			if(gender == 0){
				System.out.println(tieflingMale[result]);}
			else if(gender == 1){
				System.out.println(tieflingFemale[result]);}}}
	public static void encounter() {
		Scanner input = new Scanner(System.in);
		//calculates amount of encounters.
		
		//gives number of encounters and what time it starts
	String[] time = {"One encounter in the morning (dawn to noon)", "One encounter in the morning (dawn to noon)", "One encounter in the evening (dusk to midnight)", "One encounter at night (midnight to morning)"};
		int num = 1;
		int wilderness = (int) (Math.random() * 8 + 1);
		for (int i = 0; i < num; i++){
			int event = (int) (Math.random() * 4);
			if(wilderness == 1 ){
				System.out.println(time[event]);}
			if(wilderness == 2){
				System.out.println(time[event]);}
			if(wilderness == 3){
				System.out.println(time[event]);}
			if(wilderness == 4){
				System.out.println(time[event]);}
		if(wilderness == 5 || wilderness == 6){
		wilderness = (int) (Math.random() * 4 + 1);
			num = 3;
		}	
		if(wilderness == 7 || wilderness == 8){
			System.out.println("No random encounter");
		return;}}
		//Determine if it snows
		int tundra = (int) (Math.random() * 20 + 1);
		int blizzard = (int) (Math.random() * 20 + 2);
		if (blizzard >= wilderness) {
			int snowStorm1 = (int) (Math.random() * 4 + 1);
			int snowStorm2 = (int) (Math.random() * 4 + 1);
			System.out.println("The blizzard starts " + snowStorm1 + " hour(s) before the encounter.");
			System.out.println("And the blizzard ends " + snowStorm2 + " hour(s) after the encounter");}
		String wildernessEncounter [] = {"Yeti", "Goliath werebear (Easy)", "Crag cats (Easy)", "Coldlight walker (Medium)", "Ice troll (Hard)", "Frost Druid and friends (Medium)", "Chardalyn berserkers (Hard)", "Frost giant riding a mammoth (Deadly)", "Battlehammer dwarves (Easy)", "Arveiaturace (ancient white dragon) (Deadly)", "Snowy owlbear (Easy)", "Gnolls (Medium)", "Orcs of the Many-Arrows tribe (pg 112) (Hard)", "Goliath party of 4 (Medium)", "Chwinga (Easy)", "Awakened beast (Easy)", "Icewind kobolds (Easy)", "Humans (Easy)", "Heard of beasts (Easy)", "Perytons (Medium)"};
		//Awakened beast array
		String awakenedBeast [] = {"Polar bear", "Arctic fox", "Snowshoe hare", "Snowy owl", "Reindeer (Use Elk stat block) with glow-in-the-dark antlers that emit a dim light in a 10-foot radius", "Woolly rhinoceros", "Saber-toothed tiger", "Wolf"};
		//Frost Druid and Friends encounter for what "friends" the druid has.
		String friends [] = {"Awakened tree (Coniferous only)", "Awakened Mountain goat", "Awakened reindeer (use elk stat block) with glow-in-the-dark antlers that emit dim light in a 10-foot radius", "Awakened walrus"};
		String goliathChallenge [] = {"Tug o' War", "Hand Standing", "Shrub Pulling", "Boulder Roll"};
		//Array for "Heard of beasts" in the Sea of Moving Ice
		String herdSoMI [] = {"Killer whales", "Seals", "Walruses"};
		//Array for "Heard of beasts" in the Tundra"
		String herdTundra [] = {"Elk", "Mammomths", "reindeer"};
		//Each Reghed Tribe and their attitude towards the party. Multiple because of a more likely chance of getting one than the other.
		String reghedTribe [] = {"Bear (Attitude: Indifferent)", "Bear (Attitude: Indifferent)", "Bear (Attitude: Indifferent)", "Bear (Attitude: Indifferent)", "Bear (Attitude: Indifferent)", "Elk (Attitude: Indifferent)", "Elk (Attitude: Indifferent)", "Elk (Attitude: Indifferent)", "Elk (Attitude: Indifferent)", "Elk (Attitude: Indifferent)", "Elk (Attitude: Indifferent)", "Elk (Attitude: Indifferent)", "Elk (Attitude: Indifferent)", "Tiger (Attitude: Hostile)", "Tiger (Attitude: Hostile)", "Tiger (Attitude: Hostile)", "Tiger (Attitude: Hostile)", "Wolf (Attitude: Hostile)", "Wolf (Attitude: Hostile)", "Wolf (Attitude: Hostile)",};
		//encounter
		for (int t = 0; t < num; t = t + 2){
			System.out.print("If you want herd of beasts input 0 if not input 1: ");
			int herdB = input.nextInt();
			if (herdB == 0){
				System.out.print("Is the encounter in The Sea of Moving Ice (0) or in the Tundra (1): ");
				int place = input.nextInt();
				
				//Sea of Moving Ice heard
				if (place == 0){
					int herd = (int) (Math.random() * 6);	
					if(herd == 0){
						int killerWhales = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + killerWhales + " Killer Whales");}
					if(herd == 1 || herd == 2 || herd == 3){
						int seals = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + seals + " Seals");}
					if(herd == 4 || herd == 5){
						int walruses = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + walruses + " Walruses");}}
				//Tundra herd
				else if(place == 1){
					int herd = 4;	
					if(herd == 0 || herd == 1){
						int elk = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + elk + " Elk");}
					if(herd == 2 || herd == 3){
						int mammoth = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + mammoth + " Mammoths");}
					if(herd == 4 || herd == 5){
						int reindeer = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						int glowingReindeer = 0;
						int j = 6;
						for (int i = 0; i < (reindeer - 1); i++){
							if(i % j == 0){
								glowingReindeer++;}}
						System.out.println("There are a total of: " + reindeer + " reindeer");
						System.out.println("With " + glowingReindeer + " among the total that have glowing antlers.");}}
				return;}
			int creatures = (int) (Math.random() * 20);
			System.out.println("Your wilderness encounter is: " + wildernessEncounter[creatures]);
			//Awakened beast encounter to determine what beast it is.
			if (creatures == 15) {
				int beast = (int) (Math.random() * 8 + 1);
				System.out.println("Awakened Beast is a " + awakenedBeast[beast]);
				System.out.println("If you want to choose one instead here is a reference: ");
				for (int row = 0; row < awakenedBeast.length; row++) {
					System.out.print(awakenedBeast[row] + " / ");}
				System.out.println();}
			//Battlehammer dwaves
			if (creatures == 8) {
				int dwarf = (int) (Math.random() * 6 + 1);
				System.out.println("There are a total of " + dwarf + " Battlehammer dwarf or dwarves.");}
			//Chardalyn Berserker encounter
			if (creatures == 6) {
				int berserker = (int) (Math.random() * 4 + 1);
				System.out.println("There are a total of " + berserker + " Chardalyn Berserker(s).");}
			//Crag cat encounter
			if (creatures == 2) {
				int cragCat = (int) (Math.random() * 4 + 1);
				System.out.println("There are a total of " + cragCat + " Crag Cat(s).");}
			//Frost Druid and Friends
			if (creatures == 5) {
				int totalFriends = (int) (Math.random() * 4 + 1);
				System.out.println("There are a total of " + totalFriends + " friend(s).");
				System.out.print("The druid friends are: ");
				for (int i = 0; i < totalFriends; i++){
					int druidFriends = (int) (Math.random() * 4);
					System.out.print(friends[druidFriends] + ", ");}}
			//Gnolls
			if (creatures == 11) {
				int gnolls = (int) (Math.random() * 4 + 4);
				System.out.println("There are a total of " + gnolls + " Gnoll(s).");}
			if (creatures == 13){
				int goliathParty = (int) (Math.random() * 2);
				if (goliathParty == 0){
					System.out.println("They come from the Thuunlakalaga clan from Wyrmdoom Crag (see pg 166)");}
				else if (goliathParty == 1){
					System.out.println("They come from the Akannathi clan from Skytower shelter (see pg 166) (pg 109 for challenges)");
					int challenge = (int) (Math.random() * 4);
					System.out.println("The challenge is: " + goliathChallenge[challenge]);}}
			if (creatures == 18 || herdB == 0){
				System.out.print("Is the encounter in The Sea of Moving Ice (0) or in the Tundra (1): ");
				int place = input.nextInt();
				
				//Sea of Moving Ice heard
				if (place == 0){
					int herd = (int) (Math.random() * 6);	
					if(herd == 0){
						int killerWhales = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + killerWhales + " Killer Whales");}
					if(herd == 1 || herd == 2 || herd == 3){
						int seals = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + seals + " Seals");}
					if(herd == 4 || herd == 5){
						int walruses = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + walruses + " Walruses");}}
				//Tundra herd
				else if(place == 1){
					int herd = 4;	
					if(herd == 0 || herd == 1){
						int elk = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + elk + " Elk");}
					if(herd == 2 || herd == 3){
						int mammoth = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						System.out.println("There are a total of: " + mammoth + " Mammoths");}
					if(herd == 4 || herd == 5){
						int reindeer = ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1)) + ((int) (Math.random() * 6 + 1));
						int glowingReindeer = 0;
						int j = 6;
						for (int i = 0; i < (reindeer - 1); i++){
							if(i % j == 0){
								glowingReindeer++;}}
						System.out.println("There are a total of: " + reindeer + " reindeer");
						System.out.println("With " + glowingReindeer + " among the total.");}}}
			//human encounter. Either hunters or Reghed nomads depending on area of encounter
			if (creatures == 17){
				System.out.println("Is the encounter in the Sea of Moving Ice? (input 0 if so if not input 1): ");
				int human = input.nextInt();
				if (human == 0){
					int hunters = (int) Math.random() * 6 + 5;
					System.out.println("There are a total of " + hunters + " hunters hunting either seals, walruses, or whales.");
				}
				else if(human != 0){
					int nomad = (int) Math.random() * 6 + 5;
					int tribal = (int) Math.random() * 20;
					System.out.println("There are a total of " + nomad + " Reghed nomads from the " + reghedTribe[tribal]+ " tribe.");}}
			//Determines what type of yeti
			if (creatures == 0){
				int yetiType = (int) Math.random() * 6;
				if (yetiType == 0 || yetiType == 1 || yetiType == 2){
					int total = (int) Math.random() * 4 + 1;
					System.out.println("There are a total of " + total + " Yetis.");}
				else if (yetiType == 3 || yetiType == 4){
					System.out.println("The type is an Abominable Yet! (Hard)");}
				else if (yetiType == 5){
					System.out.println("It's just a Yeti Tyke (Easy");}}
			return;}
	}
	
	public static void challenge() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many players are there: ");
		int player = input.nextInt();
		double total1 = 0;
		double total2 = 0;
		//takes the total level of each player, totals it up, and then averages it.
		for (int i = 0; i < player; i++){
			System.out.print("Input a character's level: ");
			double level = input.nextInt();
			total1 = total1 + level;}
		double average = total1 / player;
		System.out.print("How many monsters are there: ");
		double monster = input.nextInt();
	//takes each challenge rating (CR) and totals it up
		for (int i = 0; i < monster; i++){
			System.out.print("Input the monster's CR: ");
			double cr = input.nextInt();
			total2 = total2 + cr;}
		int result = (int) ((average / total2) * 10);
		System.out.println(result);
		if (result <= 4)
			System.out.println("Deadly");
		 else if(result < 8 && result > 4){
			System.out.println("Hard");}
		 else if(result >= 8 && result <= 12){
			System.out.println("Medium");}
			else if(result > 12){
			System.out.println("Easy");}
		return;
	}
}