package Day_6;

enum KnowledgeLevel {
    BEGINNER,
    ADVANCED,
    PROFESSIONAL,
    MASTER;

    // Static method to return KnowledgeLevel based on score
    public static KnowledgeLevel fromScore(int score) {
        if (score >= 0 && score <= 3) {
            return BEGINNER;
        } else if (score >= 4 && score <= 6) {
            return ADVANCED;
        } else if (score >= 7 && score <= 9) {
            return PROFESSIONAL;
        } else if (score == 10) {
            return MASTER;
        } else {
            throw new IllegalArgumentException("Invalid score: " + score);
        }
    }
}

public class KnowledgeTest {
    public static void main(String[] args) {
        // Testing boundary conditions
        int[] testScores = {0, 3, 4, 6, 7, 9, 10, -1, 11};

        for (int score : testScores) {
            try {
                KnowledgeLevel level = KnowledgeLevel.fromScore(score);
                System.out.println("Score: " + score + " → Level: " + level);
            } catch (IllegalArgumentException e) {
                System.out.println("Score: " + score + " → " + e.getMessage());
            }
        }
    }
}

