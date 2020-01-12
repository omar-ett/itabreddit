package ma.itab.reddit.web;

import ma.itab.reddit.core.Post;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Post> posts = new ArrayList<Post>();

        posts.add(new Post("mehdi","1er poste"));
        posts.add(new Post("Bilal","Je veux aller chez moi"));
        req.setAttribute("posts",posts);
        req.getRequestDispatcher("jsp/homePage.jsp").forward(req,resp);

    }
}
