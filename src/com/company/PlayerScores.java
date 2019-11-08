package com.company;

public class PlayerScores {
    private int score;
    private int levelCompleted;
    private int bonus;

    public PlayerScores() {
    }

    public PlayerScores(int score, int levelCompleted, int bonus) {
        this.score = score;
        this.levelCompleted = levelCompleted;
        this.bonus = bonus;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevelCompleted() {
        return levelCompleted;
    }

    public void setLevelCompleted(int levelCompleted) {
        this.levelCompleted = levelCompleted;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
