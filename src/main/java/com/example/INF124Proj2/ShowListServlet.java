package com.example.INF124Proj2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "ShowList", value = "/ShowList")
public class ShowListServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/"
                    + "demo", "root", "Carlos3239");
            Statement stmt = con.createStatement();
            String sql = "SELECT name, email FROM emails";
            ResultSet rs = stmt.executeQuery(sql);

            PrintWriter writer = resp.getWriter();
            writer.println("<html> <body>");

            while(rs.next() ){
//                out.println(rs.getString("id"));
                //out.println("<img src  = "+rs.getString("file")+" width = \"190 px\" >\n");
//                out.println(rs.getString("img_id"));
                //out.println("</br>");

            }
            writer.println("</body> </html>");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
