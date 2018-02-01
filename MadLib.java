import java.util.Scanner;

public class MadLib {
	private MadLibStory story;
	private String[] userInputs;

	private class MadLibStory {
		public String content;
		public String[] partsOfSpeech;

		public MadLibStory() {
			this.content = "Hello %s";
			this.partsOfSpeech = new String[1];
			this.partsOfSpeech[0] = "noun";
		}
	}

	public MadLib() {
		this.story = new MadLibStory();
		this.userInputs = new String[this.story.partsOfSpeech.length];
	}

	public void play() {
		this.collectInput();
		this.print();
	}

	private void collectInput() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < this.story.partsOfSpeech.length; i++) {
			System.out.print("Give me a " + this.story.partsOfSpeech[i] + " ");
			this.userInputs[i] = sc.next();
		}
	}

	private void print() {
		String finalStory = String.format(this.story.content, this.userInputs);
		System.out.println(finalStory);
		System.out.println("Thank you, come again!");
	}
}
