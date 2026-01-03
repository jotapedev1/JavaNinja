package NinvelIntermediario.Encapsulamento;

public enum MissionRank {
    D ("Fácil demais", 2),
    C ("Fácil", 4),
    B ("Normal", 6),
    A ("Difícil", 8),
    S ("Impossível", 10);

    private String RankDesc;
    private int Difficulty;

    //criando construtor para todos os itens exiberem as informações abaixo
    MissionRank(String RankDesc, int Dificultty){
        this.RankDesc = RankDesc;
        this.Difficulty = Dificultty;
    }

    //GETTERS e SETTERS pois as infos são privadas
    public String getRankDesc() {
        return RankDesc;
    }

    public void setRankDesc(String rankDesc) {
        RankDesc = rankDesc;
    }

    public int getDifficulty() {
        return Difficulty;
    }

    public void setDifficulty(int difficulty) {
        Difficulty = difficulty;
    }
}
