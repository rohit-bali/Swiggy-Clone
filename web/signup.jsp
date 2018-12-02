<%-- 
    Document   : signup.jsp
    Created on : Nov 16, 2018, 12:03:58 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
           String email=request.getParameter("email");
           String psw=request.getParameter("psw");
           String psw_repeat=request.getParameter("psw-repeat");
           String ques=request.getParameter("ques");
           Connection conn=null;
           Statement st=null;
           ResultSet rs=null;
           try
             {
                String myUrl="jdbc:mysql://localhost/acadview";
		Class.forName("com.mysql.jdbc.Driver");      		
		conn=DriverManager.getConnection(myUrl,"root","");
                st=conn.createStatement();
                st.executeUpdate("insert into signup values('"+email+"','"+psw+"','"+psw_repeat+"','"+ques+"')");              
                out.println("<script>window.location.href='LOGIN.html';</script>");
            }
            catch(Exception e)
            {                
                out.println(e);   
            }
        %>
    </body>
</html>
