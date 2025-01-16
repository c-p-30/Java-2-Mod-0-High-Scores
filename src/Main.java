//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("AAA", 10000);
        player1.setInitials("AAA");
        player1.setScore(10000);
        System.out.println("Name \t  Initials \tScore");
        System.out.println("Player 1\t" + player1.getInitials() + "\t\t" + player1.getScore());
        }
    }
