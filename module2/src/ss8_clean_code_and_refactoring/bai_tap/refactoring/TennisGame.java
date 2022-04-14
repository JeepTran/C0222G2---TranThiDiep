package ss8_clean_code_and_refactoring.bai_tap.refactoring;

import java.util.Scanner;

public class TennisGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Play1 score:");
        int play1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Play2 score:");
        int play2 = Integer.parseInt(scanner.nextLine());
        System.out.println(getResult(play1, play2));
    }

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final String ZERO_CALL = "Love";
    public static final String ONE_CALL = "Fifteen";
    public static final String TWO_CALL = "Thirty";
    public static final String THREE_CALL = "Forty";

    public static String getResult(int play1Score, int play2Score) {
        String result = "";
        if (play1Score == play2Score) {
            result = getDraw(play1Score);
        } else if (play1Score >= 4 || play2Score >= 4) {
            result = getAdvantage(play1Score, play2Score);
        } else {
            result = getScoreCall(play1Score) + "-" + getScoreCall(play2Score);
        }
        return result;
    }

    private static String getScoreCall(int score) {
        switch (score) {
            case ZERO:
                return ZERO_CALL;
            case ONE:
                return ONE_CALL;
            case TWO:
                return TWO_CALL;
            case THREE:
                return THREE_CALL;
            default:
                return "Invalid score!";
        }
    }

    private static String getAdvantage(int play1Score, int play2Score) {
        int variance = play1Score - play2Score;
        if (variance == 1) {
            return "Advantage player1";
        } else if (variance == -1) {
            return "Advantage player2";
        } else if (variance >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getDraw(int playerScore) {
        switch (playerScore) {
            case ZERO:
                return ZERO_CALL + "-All";
            case ONE:
                return ONE_CALL + "-All";
            case TWO:
                return TWO_CALL + "-All";
            case THREE:
                return THREE_CALL + "-All";
            default:
                return "Deuce";
        }
    }
}
