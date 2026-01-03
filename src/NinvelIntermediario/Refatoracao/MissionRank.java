package NinvelIntermediario.Refatoracao;

public enum MissionRank {
    S ("Impossible", 10),
    A ("Hard", 8),
    B ("Normal", 6),
    C ("Easy", 4),
    D ("Very Easy", 2),;

    private String rankDescription;
    private int difficultyLevel;

    MissionRank(String rankDescription, int difficultyLevel) {
        this.rankDescription = rankDescription;
        this.difficultyLevel = difficultyLevel;
    }
}
