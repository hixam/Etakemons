package Entidades;

/**
 * Created by hicham.az on 09/12/2016.
 */
public class User {
    int totalPokemons,punctuacionTotal;
    String name;
    String apellidos;
    String Nick;
    String Email;

    public User() {
    }

    public User(int totalPokemons, int punctuacionTotal, String name, String apellidos, String nick, String email, String password) {
        this.totalPokemons = totalPokemons;
        this.punctuacionTotal = punctuacionTotal;
        this.name = name;
        this.apellidos = apellidos;
        Nick = nick;
        Email = email;
        Password = password;
    }



    public int getTotalPokemons() {
        return totalPokemons;
    }

    public void setTotalPokemons(int totalPokemons) {
        this.totalPokemons = totalPokemons;
    }

    public int getPunctuacionTotal() {
        return punctuacionTotal;
    }

    public void setPunctuacionTotal(int punctuacionTotal) {
        this.punctuacionTotal = punctuacionTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String nick) {
        Nick = nick;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    String Password;
}
