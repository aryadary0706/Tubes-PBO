<%-- 
    Document   : addReview
    Created on : May 28, 2025, 12:05:49?AM
    Author     : user
--%>

<%@ page import="java.sql.*" %>
<%
    int seriesId = Integer.parseInt(request.getParameter("series_id"));
    String reviewer = request.getParameter("reviewer");
    int rating = Integer.parseInt(request.getParameter("rating"));
    String comment = request.getParameter("comment");

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/content", "root", "");

    PreparedStatement ps = conn.prepareStatement("INSERT INTO Review (series_id, reviewer, rating, comment) VALUES (?, ?, ?, ?)");
    ps.setInt(1, seriesId);
    ps.setString(2, reviewer);
    ps.setInt(3, rating);
    ps.setString(4, comment);
    ps.executeUpdate();

    conn.close();
    response.sendRedirect("series.jsp");
%>
