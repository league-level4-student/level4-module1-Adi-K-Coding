package _05_Enum_Stuff;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope h = new _00_Horoscope();
		Zodiac[] options = { Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO, Zodiac.VIRGO,
				Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES };

		int input = JOptionPane.showOptionDialog(null, "Choose a zodiac sign", "Custom Buttons", 0, -1, null, options,
				0);
		if (input > -1) {
			Zodiac choice = options[input];
			h.display(choice);
		}

		
	}

	void display(Zodiac horoscope) {
		switch (horoscope) {
		case ARIES:
			JOptionPane.showMessageDialog(null,
					"Sticks and stones may break your bones, but names will never hurt you, Aries.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null,
					"Emotionally speaking, things might get tense for you today as others demonstrate a rather selfish attitude, Taurus.");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "You might be quite stirred by the general energy today, Gemini.");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Move in for the kill today, Cancer. Don't stop until you succeed.");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null,
					"Now is the perfect time to say something you've been meaning to say for quite a while, Leo.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Your opinions might be the focus of conversation all day, Virgo");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "Your sensitive heart may be touched by anger today, Libra.");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "You might feel a great deal of physical power today, Scorpio.");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "The train is headed out, so you'd better hop on, Sagittarius.");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null,
					"Jump into action with energy today, Capricorn. Order others around and delegate tasks for a change.");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null,
					"Guard your heart well today, Aquarius. It's a prime target for the abrasive words being tossed around.");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null,
					"A position involving power and authority is opening up, and you're the perfect one for the job, Pisces.");
			break;
		default:
			System.out.println("Something went wrong :(");
			break;
		}
	}
}
