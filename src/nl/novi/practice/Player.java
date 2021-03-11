package nl.novi.practice;

public class Player {
    //velden
    private String name;
    private String token;
    private int score;

    //constructors//attributen
    public Player(String name, String token){
        this.name = name;
        this.token = token;
        this.score = 0;
    }

    //methodes//functies
    public int getScore(){
        return score;
    }
    public String getName() {
        return name;
    }
    public String getToken(){
        return token;
    }
    public void setScore(int extraPoints){
        score = score + extraPoints;
    }
    public void addScore(){
        score++;
    }
    public void getScore(int score) {
        this.score += score;
    }
}
