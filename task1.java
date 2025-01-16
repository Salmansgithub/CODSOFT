import java.util.*;

class task1 {
public static void main(String args[]) {
int sysno, userguess, attempts, totalAttempts, roundswon; 
float score;
Scanner sc = new Scanner(System.in);
Random random = new Random();
System.out.println("Let's start the game!");
roundswon = 0;
totalAttempts = 0;

while (true) {
sysno = random.nextInt(100) + 1;
userguess = 0;
attempts = 0;

while (userguess != sysno) {
System.out.println("enter your guess:");
userguess = sc.nextInt();
attempts++;

if (userguess < sysno) 
{
System.out.println("too low!");
} 
else if (userguess > sysno) 
{
System.out.println("too high!");
} 
else 
{
 System.out.println("that's a good guess!");
 roundswon++;
 totalAttempts += attempts;
 }
 }

System.out.print("Would you like to play again? ");
if (!sc.next().equalsIgnoreCase("yes")) 
{
 break;
 }
 }
score=roundswon+(totalAttempts/2);
System.out.println("\nGame Over!");
System.out.println("rounds won: " + roundswon);
System.out.println("total attempts: " + totalAttempts);
System.out.println("your total score: " +score);
}
}