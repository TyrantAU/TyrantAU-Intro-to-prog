
public class SeeYourStory {

	public static void main(String[] args) {
		GTerm gt = new GTerm(910, 1010);

		String charName = gt.getInputString("What is your characters name?");
		String companionName = gt.getInputString("If you had a dog, what would you call it?");

		int decisionOption = Integer.parseInt(gt.getInputString(
				"If faced with danger, would you: 1. Run or 2. Stand your ground? (Please enter a number 1 or 2.)"));
		int pathOption = Integer.parseInt(gt.getInputString("Which path will you take? Path 1 or 2?"));
		while (pathOption > 2 || pathOption <= 0) {
			pathOption = Integer.parseInt(gt.getInputString("Incorrect number, please enter a valid path"));
		}

		// Situation 1a
		if (pathOption == 1) {

			gt.setXY(290, 10);
			gt.setFontSize(25);
			gt.print("The Spooky Forest");

			gt.setXY(235, 50);
			gt.addImageIcon("SpookyForest.png");

			gt.setXY(20, 320);
			gt.setFontSize(13);
			gt.print("On one spooky friday night, " + charName
					+ " decided they wanted to explore the spooky woods of Misthill!");

			gt.setXY(20, 340);
			gt.print(charName + " stumbled upon a fork in the path ahead. There was 2 different paths, " + charName
					+ " stopped and ");
			gt.setXY(20, 360);
			gt.print("tried to make a decision, but they were indecisive!");

			gt.setXY(20, 380);
			gt.print("Eventually " + charName + " came to a decision they chose path " + pathOption
					+ " which seemed to be the least spooky out of the two.");

			gt.setXY(20, 400);
			gt.print(charName + "continued wandering through the spooky forest, " + charName
					+ " noticed the sound of a breaking twig in the distance.");

			gt.setXY(300, 430);
			gt.addImageIcon("scaredBoy.png");

			// Situation 2a
			if (decisionOption == 1) {

				gt.setXY(20, 650);
				gt.println(charName + " isn't very brave, " + charName
						+ " decides to run away to safety as fast as their legs can take them.");

				gt.setXY(20, 670);
				gt.println(charName + " goes back the way they came and never returned to the spooky forest again!");
			}

			else if (decisionOption == 2) {

				gt.setXY(20, 650);
				gt.println(charName + " stands their ground, they become curious as to what made the sound. " + charName
						+ " walks towards the sound.");

				gt.setXY(20, 670);
				gt.println(charName
						+ " gets closer to where the sound came from... as they gets closer, he finds a dog, it was playing with sticks.");

				gt.setXY(150, 690);
				gt.addImageIcon("dogStick.png");

				gt.setXY(20, 1100);
				gt.println(charName
						+ " lets out a sigh of relief as they were scared for nothing! But they were brave and faced his fears.");

				gt.setXY(20, 1120);
				gt.println(charName + " and" + companionName + " both walked out of the spooky forest together.");

			}

		}

		// Situation 1b
		if (pathOption == 2) {

			gt.setXY(270, 10);
			gt.setFontSize(25);
			gt.print("The Spooky Forest");

			gt.setXY(235, 50);
			gt.addImageIcon("SpookyForest.png");

			gt.setXY(20, 320);
			gt.setFontSize(13);
			gt.print("On one spooky friday night, " + charName
					+ " decided they wanted to explore the spooky woods of Misthill!");

			gt.setXY(20, 340);
			gt.print(charName + " stumbled upon a fork in the path ahead. There was 2 different paths, " + charName
					+ " stopped and ");
			gt.setXY(20, 360);
			gt.print("tried to make a decision, but they were indecisive!");

			gt.setXY(20, 380);
			gt.print("Eventually " + charName + " came to a decision they chose path " + pathOption
					+ " which seemed to be the least spooky out of the two.");

			gt.setXY(20, 400);
			gt.print(charName + "continued wandering through the spooky forest, " + charName
					+ " came upon a mysterious house.");

			gt.setXY(260, 420);
			gt.addImageIcon("mysteriousHouse.png");

			if (decisionOption == 1)
				;
			{

				gt.setXY(20, 710);
				gt.println(charName + " isn't very brave, " + charName
						+ " decides to run away to safety as fast as their legs can take them.");

				gt.setXY(20, 730);
				gt.println(charName + " goes back the way they came and never returned to the spooky forest again!");
			}
		

		if (decisionOption == 2)
			;
		{

			gt.setXY(20, 710);
			gt.println(
					charName + " stands their ground, they become curious as to what was insdie the mysterious house.");

			gt.setXY(20, 730);
			gt.println("as " + charName + " walks closer to the house, they hear a howl from inside the house.");
		}
	}

}
}
