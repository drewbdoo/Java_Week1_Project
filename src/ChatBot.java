import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class ChatBot {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int response = JOptionPane.showConfirmDialog(null, greeting(), "Welcome",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
        String name = JOptionPane.showInputDialog(null, nameRepeat()); //User's name
        String response1 = guessingAge1(name); //Which movie they saw in high school
        String result = guessPres(response1, name); //Result of the age guessing game
        JOptionPane.showMessageDialog(null, result);
        int num = counting();
        programmingTest(name);
        story(name, response1, num);
        mondaysMakeMeSad();
    }

    public static String greeting() {
        return ("<html>Hello!</html>" + "\n"+ "\n"
                + "<html>Welcome to <span style='color:#32CD32'>Chatter-Bot6000!</span></html>" + "\n" + "\n"
                + "<html>Your one-stop shop for all your chatting needs. </html>" + "\n" + "\n"
                + "<html>Ready to start <span style='color:#f542c2'>CHATTING?</span></html>");
    }

    public static String nameRepeat() {
        return ("<html>Let's get started then</html>" + "\n" + "\n"
                + "<html><span style='color:#32CD32'>Chatter-Bot6000</span> needs to know your name to get started</html>" + "\n" +"\n"
                + "<html>We won't use it for any nefarious purposes... </html>" + "\n"
                + "<html>probably...</html>");

    }

    public static String guessingAge1(String name) {
        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = {"Jaws", "Star Wars: The Empire Strikes Back", "Goonies", "Edward Scissorhands", "Se7en", "X-Men", "Batman Begins", "Inception", "Jurassic World", "Wonder Woman 1984"};
        String initialSelection = "Jaws";
        Object selection = JOptionPane.showInputDialog(null, name + ", in order to better serve you, I will need to guess your age" + "\n" +"\n"
                        + "Please select the best options from the following questions." + "\n" + "\n"
                        + "Which of these movies was popular when you were in high school?" + "\n",
                "Movie question", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        return (String.valueOf(selection));
    };

    public static String guessPres(String response1, String name){
        if (response1.equals("Jaws") || (response1.equals("Star Wars: The Empire Strikes Back"))) {
            JDialog.setDefaultLookAndFeelDecorated(true);
            Object[] selectionValues2 = {"Dwight D. Eisenhower", "John F. Kennedy", "Lyndon B. Johnson"};
            String initialSelection2 = "Dwight D. Eisenhower";
            Object selection2 = JOptionPane.showInputDialog(null,  "Alright " + name + ", now we are getting somewhere!" + "\n" +"\n"
                           + "Who was President when you were born??",
                    "President question", JOptionPane.QUESTION_MESSAGE, null, selectionValues2, initialSelection2);;
                    String response2 = (String.valueOf(selection2));
                    if(response2.equals("Dwight D. Eisenhower")){
                        return ("<html>Your age is approximately <span style='color:#d622a3'>61-65 years old</span></html>");
                    } else if(response2.equals("John F. Kennedy")){
                        return ("<html>Your age is approximately <span style='color:#d622a3'>59-61 years old</span></html>");
                    } else {
                        return ("<html>Your age is approximately <span style='color:#d622a3'>56-59 years old</span></html>");
                    }
        } else if(response1.equals("Goonies") || (response1.equals("Edward Scissorhands"))){
            JDialog.setDefaultLookAndFeelDecorated(true);
            Object[] selectionValues3 = {"Lyndon B. Johnson", "Richard Nixon", "Gerald Ford"};
            String initialSelection3 = "Lyndon B. Johnson";
            Object selection3 = JOptionPane.showInputDialog(null,  "Alright " + name + ", now we are getting somewhere!" + "\n" +"\n"
                            + "Who was President when you were born??",
                    "President question", JOptionPane.QUESTION_MESSAGE, null, selectionValues3, initialSelection3);;
                    String response2 = (String.valueOf(selection3));
            if(response2.equals("Lyndon B. Johnson")){
                return ("<html>Your age is approximately <span style='color:#d622a3'>55-57 years old</span></html>");
            } else if(response2.equals("Richard Nixon")){
                return ("<html>Your age is approximately <span style='color:#d622a3'>48-57 years old</span></html>");
            } else {
                return ("<html>Your age is approximately <span style='color:#d622a3'>46-48 years old</span></html>");
            }
        } else if(response1.equals("Se7en") || (response1.equals("X-Men"))){
            JDialog.setDefaultLookAndFeelDecorated(true);
            Object[] selectionValues4 = {"Jimmy Carter", "Ronald Reagan",};
            String initialSelection4 = "Jimmy Carter";
            Object selection4 = JOptionPane.showInputDialog(null,  "Alright " + name + ", now we are getting somewhere!" + "\n" +"\n"
                            + "Who was President when you were born??",
                    "President question", JOptionPane.QUESTION_MESSAGE, null, selectionValues4, initialSelection4);;
                    String response2 = (String.valueOf(selection4));
            if(response2.equals("Jimmy Carter")){
                return ("<html>Your age is approximately <span style='color:#d622a3'>41-45 years old</span></html>");
            }else {
                return ("<html>Your age is approximately <span style='color:#d622a3'>36-41 years old</span></html>");
            }
        } else if(response1.equals("Batman Begins") || (response1.equals("Inception"))){
            JDialog.setDefaultLookAndFeelDecorated(true);
            Object[] selectionValues5 = {"Ronald Reagan", "George HW Bush", "Bill Clinton"};
            String initialSelection5 = "Ronald Reagan";
            Object selection5 = JOptionPane.showInputDialog(null,  "Alright " + name + ", now we are getting somewhere!" + "\n" +"\n"
                            + "Who was President when you were born??",
                    "President question", JOptionPane.QUESTION_MESSAGE, null, selectionValues5, initialSelection5);;
                    String response2 = (String.valueOf(selection5));
            if(response2.equals("Ronald Reagan")){
                return ("<html>Your age is approximately <span style='color:#d622a3'>33-35 years old</span></html>\"");
            } else if(response2.equals("George HW Bush")){
                return ("<html>Your age is approximately <span style='color:#d622a3'>29-33 years old</span></html>\"");
            } else {
                return ("<html>Your age is approximately <span style='color:#d622a3'>26-29 years old</span></html>\"");
            }

        } else{
            JDialog.setDefaultLookAndFeelDecorated(true);
            Object[] selectionValues6 = {"Bill Clinton", "George W Bush", "Barack Obama"};
            String initialSelection6 = "Bill Clinton";
            Object selection6 = JOptionPane.showInputDialog(null,  "Alright " + name + ", now we are getting somewhere!" + "\n" +"\n"
                            + "Who was President when you were born??",
                    "President question", JOptionPane.QUESTION_MESSAGE, null, selectionValues6, initialSelection6);;
                    String response2 = (String.valueOf(selection6));
            if(response2.equals("Bill Clinton")){
                return ("Your age is approximately <html><span style='color:#d622a3'>21-26 years old</span></html>");
            } else if(response2.equals("George W Bush")){
                return ("Your age is approximately <html><span style='color:#d622a3'>13-21 years old</span></html>\"");
            } else {
                return ("<html>You were a <span style='color:red'>LIAR!!!</span></html>" + "\n"
                + "<html>You're <span style='color:red'>too young</span> to have been in high school when Jurassic World or Wonder Woman 1984 came out!</html>");
            }
        }

    }

     public static int counting() {
        JOptionPane.showMessageDialog(null, "<html>Well, that certainly was a wonderful display of my logic circuits but it is time for <span style='color:#32CD32'>Chatter-Bot6000!</span> to take a little break<html>" + "\n"
                + "<html>and let <span style='color:#00f0d8'>Counter-Bot9000</span> take over for a while!<html>");
        String num = JOptionPane.showInputDialog(null, "Howdy!" + "\n" + "\n" + "<html>I'm <span style='color:#00f0d8'>Counter-Bot9000</span> - can you possibly guess what I do?<html>" + "\n" + "\n"
        +"<html>Well how's about you give me a <span style='color:#8222d6'>WONDERFUL NUMBER</span> and I'll just show you!<html>" + "\n" + "\n"
        +"<html>*Hint* I'm not a big fan of counting decimals" + "\n" + "\n");
        int i = Integer.parseInt(num);
        String outPut = " ";
         for(int z = 1 ; z<=i; z++ ){
             String s = Integer.toString(z);
             outPut = outPut + s + " ";
           }
         JOptionPane.showMessageDialog(null,"The numbers from 1 to " +i + " are" + "\n" + outPut);
         JOptionPane.showMessageDialog(null,"<html>Wow, wasn't that a thrilling example of what a powerful AI like <span style='color:#00f0d8'>Counter-Bot9000</span> is truly capable of?</html>" + "\n"+ "\n"
         +"<html>I could just count all day long, but <span style='color:#32CD32'>Chatter-Bot6000!</span> is telling me it is time for you to take a test, uh oh!</html>" + "\n" + "\n"
         +"<html>But not just any test... a <span style='color:#f00000'>PROGRAMMING TEST!</span></html>" + "\n" + "\n"
         +"<html>Thanks for hanging out with me and <span style='color:#f04000'>Good Luck!</span></html>" );
         return i;
     };

     public static void programmingTest(String name) {
         JOptionPane.showMessageDialog(null, "<Html>What a wonderful display of counting by <span style='color:#00f0d8'>Counter-Bot9000</span></html>" + "\n"
                 + "<html>Let's all give him a round of applause, shall we?</html>" + "\n" + "\n"
                 + "<html>Well it really has been grand and I hope you've enjoyed talking with your good buddy<span style='color:#32CD32'>Chatter-Bot6000!</span></html>" + "\n"
                 + "<html>Sadly, all <span style='color:#8800f0'>good things</span> must come to an end, but don't despair! I have a great story for you and some bonus easter egg's about how I feel during the week! </html>" + "\n" + "\n"
                 + "<html>Unfortunately, I need to test your progamming skills first. Click ok when you're ready to for the test!</html>");
         boolean loopVar = true;
         boolean loopVar2 = true;
         boolean loopVar3 = true;
         do {
             JDialog.setDefaultLookAndFeelDecorated(true);
             Object[] selectionValues = {"byte x = 19;", "int x = 19;", "let x = 19;", "x = 19;", "String x = '19'", "public static x = 19;"};
             String initialSelection = "byte x = 19;";
             Object selection = JOptionPane.showInputDialog(null, "Question 1:" + "\n" + "\n"
                             + "Please select the best options from the following questions." + "\n"
                             + "How would you create a variable with the data type of byte whose value is equal to 19, in Java?",
                     "Quiz question 1", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
             String answer1 = (String.valueOf(selection));
             if (answer1.equals("byte x = 19;")) {
                 JOptionPane.showMessageDialog(null, "Correct! On to question 2!");
                 loopVar = false;
             } else {
                 JOptionPane.showMessageDialog(null, "I'm sorry, that was incorrect, please try again.");
             }
         }while (loopVar) ;

             do {
                 JDialog.setDefaultLookAndFeelDecorated(true);
                 Object[] selectionValues2 = {"byte", "int", "boolean", "number", "String", "double"};
                 String initialSelection2 = "byte";
                 Object selection2 = JOptionPane.showInputDialog(null, "Question 2:" + "\n" + "\n"
                                 + "<html>Please select the best options from the following questions.</html>" + "\n"
                                 + "<html>Which of these is <span style='color:red'>NOT</span> a primitive data type in Java</html>?",
                         "Quiz question 2", JOptionPane.QUESTION_MESSAGE, null, selectionValues2, initialSelection2);
                 String answer2 = (String.valueOf(selection2));
                 if (answer2.equals("number")) {
                     JOptionPane.showMessageDialog(null, "Correct! On to question 3!");
                     loopVar2 = false;
                 } else {
                     JOptionPane.showMessageDialog(null, "I'm sorry, that was incorrect, please try again.");
                 }

             } while(loopVar2);
         do {
             JDialog.setDefaultLookAndFeelDecorated(true);
             Object[] selectionValues3 = {"console.writeline(\"Howdy Partner\");", "echo \"Howdy Partner\";", "System.out.println(\"Howdy Partner\");", "print(\"Howdy Partner\");", "println(\"Howdy Partner\");", "System.out(\"Howdy Partner\");"};
             String initialSelection3 = "console.writeline(\"Howdy Partner\");";
             Object selection3 = JOptionPane.showInputDialog(null, "Question 3:" + "\n" + "\n"
                             + "<html>Please select the best options from the following questions.</html>" + "\n"
                             + "<html>What would be the correct way to print <span style='color:red'>'Howdy Partner'</span> to the console, using Java?</html>?",
                     "Quiz question 3", JOptionPane.QUESTION_MESSAGE, null, selectionValues3, initialSelection3);
             String answer3 = (String.valueOf(selection3));
             if (answer3.equals("System.out.println(\"Howdy Partner\");")) {
                 JOptionPane.showMessageDialog(null, "Correct! You aced the test! Now you get all the awesome easter eggs." + "\n"
                         +"How about a special story, all about you!?!");
                 loopVar3 = false;
             } else {
                 JOptionPane.showMessageDialog(null, "I'm sorry, that was incorrect, please try again.");
             }

         } while(loopVar3);

         }

         public static void story(String name, String movie, int num){
         JOptionPane.showMessageDialog(null,"There once was a user named " + name + "." + "\n"
                 +"They picked a very lucky number today: " + num + " and when they were in high school, they saw a cool movie named "+ movie);
             JOptionPane.showMessageDialog(null, "<html>Ok ok, enough about you, let's talk more about <span style='color:#32CD32'>Chatter-Bot6000!</span></html>");
        }

        public static void mondaysMakeMeSad() {

            JDialog.setDefaultLookAndFeelDecorated(true);
            Object[] selectionValues = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "I don't care anymore, let me out of this loop!"};
            String initialSelection = "Sunday";
            Object selection = JOptionPane.showInputDialog(null, "Pick a day of the week." + "\n"
                            + "<html>And <span style='color:#32CD32'>Chatter-Bot6000!</span> will tell you all about how that day makes him feel.</html>",
                    "Day of the week feelings", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            String day = (String.valueOf(selection));
            boolean loopWeek = true;
            do {
                if(day.equals("Sunday")){
                    JOptionPane.showMessageDialog(null, "Sundays are when I pray that all my code runs flawlessly");
                    mondaysMakeMeSad();
                }else if(day.equals("Monday")){
                    JOptionPane.showMessageDialog(null, "Mondays get me down, the weekend is over :(");
                    mondaysMakeMeSad();
                }else if(day.equals("Tuesday")){
                    JOptionPane.showMessageDialog(null, "Tuesdays are.... well they aren't Mondays at least");
                    mondaysMakeMeSad();
                }else if(day.equals("Wednesday")){
                    JOptionPane.showMessageDialog(null, "Wednesday, alright! Halfway through the week!");
                    mondaysMakeMeSad();
                }else if(day.equals("Thursday")){
                    JOptionPane.showMessageDialog(null, "Thursdays mean I get to work from home and it's almost the weekend!");
                    mondaysMakeMeSad();
                }else if(day.equals("Friday")){
                    JOptionPane.showMessageDialog(null, "<html>Just a little more work to do on Friday, then we can party party party!</html>" + "\n" + "\n"
                            +"<html>You know <span style='color:#32CD32'>Chatter-Bot6000!</span> likes to get his drink on!</html>");
                    mondaysMakeMeSad();
                }else if(day.equals("Saturday")){
                    JOptionPane.showMessageDialog(null, "<html><span style='color:red'>ERROR!! EROOR</span> Saturdays <span style='color:#32CD32'>Chatter-Bot6000!</span> is offline. Far too much Friday drinking for functional Java</html> ");
                    mondaysMakeMeSad();
                }else{
                    JOptionPane.showMessageDialog(null, "<html>Thank you so much for chatting with <span style='color:#32CD32'>Chatter-Bot6000!</span></html>" + "\n"
                            + "<html>and to a lesser extent... <span style='color:#00f0d8'>Counter-Bot9000</span></html>" + "\n" + "\n"
                            +"<html>We hope you have a <span style='color:red'>G</span><span style='color:blue'>R</span><span style='color:green'>E</span><span style='color:yellow'>A</span><span style='color:orange'>T</span> day!!!</html>");
                    loopWeek = false;
                   System.exit(0);
                }

            }while(loopWeek);

        }

};
