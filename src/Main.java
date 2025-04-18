public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int jugador1, int jugador2) {
        String score = "";
        int tempScore=0;

        if (jugador1 == jugador2) {
            score = scores_iguales(jugador1);
        }
        else if (jugador1 >=4 || jugador2 >=4)
        {
            score = jugadorconventaja(jugador1, jugador2);
        }
        else
        {
            score = puntuación(jugador1, jugador2, score);

        }
    return score;
    }

    private static String puntuación(int m_score1, int m_score2, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = m_score1;
            else { score +="-"; tempScore = m_score2;}
            switch(tempScore)
            {
                case 0:
                    score +="Love";
                    break;
                case 1:
                    score +="Fifteen";
                    break;
                case 2:
                    score +="Thirty";
                    break;
                case 3:
                    score +="Forty";
                    break;
            }
        }
        return score;
    }

    private static String jugadorconventaja(int m_score1, int m_score2) {
        String score;
        int minusResult = m_score1 - m_score2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String scores_iguales(int m_score1) {
        String score;
        switch (m_score1)
        {
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
        return score;
    }
}