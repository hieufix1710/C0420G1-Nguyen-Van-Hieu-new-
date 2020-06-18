package clearcode_and_refactoring.baiTap.Refactoring;


import java.util.ArrayList;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore = 0;
        if (m_score1 == m_score2) {
            switch (m_score1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = m_score1;
                else {
                    score += "-";
                    tempScore = m_score2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        int player1Score=16;
        int player2Score=14;
        int highestScore = Math.max(player1Score,player2Score);
        int m_score1 = 0;
        int m_score2 = 0;
        for (int i = 0; i < highestScore; i++) {
            if (i < player1Score)
                m_score1 += 1;
            if (i < player2Score)
                m_score2 += 1;
        }
        System.out.println(TennisGame.getScore("Huy","Thinh",m_score1,m_score2));
        ArrayList test = new ArrayList();
        test.clear();
        test.remove(0);
    }

}