
package pick.an.element;
import java.util.Scanner;
/**
 *
 * @author Henry
 */
public class PickAnElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
   System.out.println("Choose an element: Earth, Water, Wind, Fire");//Displays ELEMENT choices
        String color = user.next();//Allows user to select ELEMENT

if ("Earth".equals(color)) {//Checks what ELEMENT was entered
System.out.println("Signs: Taurus, Virgo and Capricorn\n" +
"Earth people are grounded, practical, disciplined and focused."
        + " They like instruction, rules, and results combined with dependable routine. "
        + "They are also super organized and clean. In short, earth people are such perfectionists, "
        + "they are always ready to take on any job or task themselves just to ensure it’s done properly. "
        + "Even then, earth people don’t feel like they—or anything they do—is ever good enough.\n" +
"\n" +
"While earth people have few friends, they are unwaveringly loyal to those they do have. "
        + "Earth people are very monogamous when it comes to relationships. "
        + "They refuse to engage in idle chitchat, and above all, earth people are deeply "
        + "connected—as you might have guessed—to the earth");//Prints out the character of the ELEMENT

}else if ("Water".equals(color)) {//Checks what ELEMENT was entered
    System.out.println("Signs: Cancer, Scorpio and Pisces\n" +
"Water people are emotional, intuitive, deeply creative, empathetic, spiritual and psychic. "
            + "Water allows people to emotionally connect with others. And yet, water people are so "
            + "sensitive that they often have a hard time unplugging from life’s chaos. "
            + "Consequently, many water people suffer from addiction as they grapple for distraction from life’s pain. "
            + "Thus, water people tend to be secretive and private.\n" +
"\n" +
"It is important then, for water people to learn how to hone emotions through meditation and see the value in water. "
            + "Water is real. Water makes us vulnerable and it makes us human. It connects us with spirit and with soul. "
            + "If you want to achieve a happy, balanced, and beautiful life… you need water");//Prints out the character of the ELEMENT
    
}else if ("Wind".equals(color)) {//Checks what ELEMENT was entered
System.out.println("Signs: Gemini, Libra and Aquarius\n" +
"Air people are brilliant, curious, independent, talkative (they literally fill the air with words), observant, "
        + "and entertaining, but they are also impractical and restless. Air people are intellectuals always on a "
        + "quest for new information.\n" +
"\n" +
"And while air people have an enormous propensity to develop new ideas and tell stories (they are perhaps the best "
        + "storytellers), they have a hard time truly connecting emotionally to others, even though they want nothing "
        + "more than to be completely understood. It’s crucial, then, for air people to learn how to give weight to "
        + "their words and tap into the earth and be grounded.");//Prints out the character of the ELEMENT

}else if ("Fire".equals(color)) {//Checks what ELEMENT was entered
System.out.println("Signs: Aries, Leo and Sagittarius\n" +
"Fire people are enthusiastic, impulsive, inspirational, humorous, dramatic and fun. "
        + "They are natural performers. While fire people easily swing from one extreme to the other, "
        + "it is important to remember that fire people speak and act straight from the heart. "
        + "They deliver everything with passion.\n" +
"\n" +
"And yet, fire people easily grow self-conscious when they speak before thinking (which happens fairly often). "
        + "So, it is dire for fire people to learn to communicate that they are merely being pushy out of a desire "
        + "to help. The fire person’s challenge is to learn to tame the “fiery beast” inside and create balance by "
        + "drawing from the three other elements: water, earth and air.");//Prints out the character of the ELEMENT
}
else{//If users selection is null or mispelled, it will print out message
System.out.println("You did not enter an element, or you mispelled it (Case sensitive");//Tells user the possible errorS
}
}
}
