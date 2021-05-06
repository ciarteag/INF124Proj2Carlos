package com.example.INF124Proj2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "ProductDetail", value = "/ProductDetail")
public class ProductDetailServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //the product id we are searching for
        String productId = request.getParameter("id");
        FileWriter fileWriter = new FileWriter(getServletContext().getRealPath("/clickOnProducts.txt"), true);
        fileWriter.write("Product dsfdsfdsfdsf ");
        fileWriter.close();
        HttpSession session = request.getSession(true);
        String userId = (String) session.getAttribute("UserID");
//        fileWriter.write("Product "+ productId + " has been clicked on by " + userId +"\n");
//        fileWriter.close();

//            PrintWriter writer = response.getWriter();
//            writer.println("<html> <body>");
//            writer.println("<h1> product id: " + productId+ " user id: " + userId + "</h1>");


//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/"
//                    + "demo", "root", "zzzzzzzzzzzzzz");
//            Statement stmt = con.createStatement();
//            String sql = "SELECT productName, description, image, rating FROM products";
//            ResultSet rs = stmt.executeQuery(sql);
//
//            PrintWriter writer = response.getWriter();
//            writer.println("<html> <body>");
//            writer.println("<h1> test </h1>");
//
//            while (rs.next()){
//
//            }
//            writer.println("</body> </html>");
//
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
