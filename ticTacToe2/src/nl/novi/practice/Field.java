package nl.novi.practice;

public class Field {
    // velden // atributen
    private String token;
    private boolean isOccupied;


    // Constructors
    public Field(String token) {
        this.token = token;
        isOccupied = false;
    }

    // methoden
    public void setToken(String token) {
        if (isOccupied == false) {
            this.token = token;
        }
        isOccupied = true;
    }

    public String getToken() {
        return token;
    }

}
