boolean winner = false;
String playerOneGoes, playerTwoGoes;

int playerOneScore = 0;
int playerTwoScore = 0;
int scoreGap;

while (!winner) {

    println "This round choices are: ";
    String entry = System.console().readLine();

    playerOneGoes = entry.substring(0, 1);
    playerTwoGoes = entry.substring(1, 2);

    System.out.println("P1 picked:" + playerOneGoes + " P2 picked:" + playerTwoGoes);

    if (playerOneGoes == playerTwoGoes) {
        System.out.println "SNAP";
    } else {
        if (playerOneGoes == "r" && playerTwoGoes == "s" ||
                playerOneGoes == "p" && playerTwoGoes == "r" ||
                playerOneGoes == "s" && playerTwoGoes == "p") {
            System.out.println "P1 WINS THIS ROUND";
            playerOneScore++;
        } else {
            System.out.println "P2 WINS THIS ROUND";
            playerTwoScore++;
        }
    }
    scoreGap = playerOneScore - playerTwoScore;
    if (scoreGap == 3) {
        System.out.println("PLAYER ONE WINS");
        winner = true;
    }
    if (scoreGap == -3) {
        System.out.println("PLAYER TWO WINS");
        winner = true;
    }
}	
	