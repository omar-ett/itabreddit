package ma.itab.reddit.core;

import java.security.PrivateKey;

public class Post {
    private String user;
    private String txt;
    private int nbLike;

    public int getNbLike() {
        return nbLike;
    }

    public void setNbLike(int nbLike) {
        this.nbLike = nbLike;
    }

    public int addLike(){
        return nbLike+=1;
            }
    public int addDlike(){
        return nbLike-=1;
    }



    public Post(String user, String txt) {
        this.user = user;
        this.txt = txt;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
