<%-- 
    Document   : series
    Created on : May 28, 2025, 12:15:20 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Daftar Series</title>
</head>
<body>
<h1>Series</h1>
<%
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/content", "root", "");

    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Series");

    while (rs.next()) {
        int id = rs.getInt("id");
        String title = rs.getString("title");
        String genre = rs.getString("genre");
        String sinopsis = rs.getString("sinopsis");

        // Hitung rata-rata rating
        PreparedStatement ps = conn.prepareStatement("SELECT AVG(rating) FROM Review WHERE series_id = ?");
        ps.setInt(1, id);
        ResultSet avgResult = ps.executeQuery();
        double avgRating = 0;
        if (avgResult.next()) avgRating = avgResult.getDouble(1);
%>
    <div style="border:1px solid gray; padding:10px; margin:10px;">
        <h2><%= title %></h2>
        <p><strong>Genre:</strong> <%= genre %></p>
        <p><strong>Sinopsis:</strong> <%= sinopsis %></p>
        <p><strong>Rata-rata Rating:</strong> <%= String.format("%.2f", avgRating) %></p>

        <!-- Form Tambah Review -->
        <form action="addReview.jsp" method="post">
            <input type="hidden" name="series_id" value="<%= id %>"/>
            Nama: <input type="text" name="reviewer"/><br/>
            Rating (1-5): <input type="number" name="rating" min="1" max="5"/><br/>
            Komentar: <textarea name="comment"></textarea><br/>
            <input type="submit" value="Kirim Review"/>
        </form>
    </div>
<%
    }
    conn.close();
%>
</body>
</html>
