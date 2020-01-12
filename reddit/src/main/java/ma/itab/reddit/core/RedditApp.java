package ma.itab.reddit.core;

import java.util.List;
import java.util.Scanner;

public class RedditApp {
    public static void main(String[] args) {
        String u1 = "mehdi";
        String u2 = "mohamed";
        String post1 = "Eheu, fides!";
        String post2 = "Orgia de salvus cannabis, gratia bursa!";
        RedditService redditService = new RedditService();
        Post p1 = new Post(u1,post1);
        Post p2 = new Post(u2,post2);
        redditService.addPost(p1);
        redditService.addPost(p2);
        p1.addLike();
        p1.addLike();
        p1.addLike();

        p2.addDlike();
        p2.addDlike();
        p2.addDlike();

        p2.addLike();
        p2.addLike();
        p2.addLike();
        p2.addLike();

        Scanner  sc = new Scanner(System.in);

        List<Post> allpost = redditService.getAllPosts();

        for (Post p : allpost) {
            System.out.println(p.getNbLike());
        }


        System.out.println(p1.getUser() +" a posté : "+ p1.getTxt());
        System.out.println(p2.getUser() +" : "+ p2.getTxt());
    }
}
