package com.example.INF124Proj2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet(name = "MainServlet", value = "")
public class MainServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        if (session.isNew()){
            String userId = String.valueOf(ThreadLocalRandom.current().nextInt());
            session.setAttribute("UserID", userId);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/hello-servlet");
            requestDispatcher.include(request, response);
        }
        PrintWriter writer = response.getWriter();
        writer.write("<html> <body> <h1> This is the main/sign servlet</h1> </body> </html>");
        RequestDispatcher rd = request.getRequestDispatcher("/AllProducts");
        rd.include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
