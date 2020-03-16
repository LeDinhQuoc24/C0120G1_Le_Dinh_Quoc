package Bai_7_CleanCode.BaiTap;

import java.util.Scanner;

public class Tennis_Pham_Thai_Cuong {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên điểm vận động viên 1");
            int m_score1 = sc.nextInt();
            System.out.println("Nhập tên điểm vận động viên 2");
            int m_score2 = sc.nextInt();
            System.out.println(getScore(m_score1, m_score2));;
        }
    }
    public static String getScore(int m_score1, int m_score2) {
        String score = "";
        int tempScore=0;
        if (m_score1==m_score2)
        {
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
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            score = check(m_score1) + "-" + check((m_score2));
        }
        return score;
    }
    public static String check(int m_score) {
        switch (m_score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return "Error";
    }
}

