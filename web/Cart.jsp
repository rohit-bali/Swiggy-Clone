<%-- 
    Document   : Cart
    Created on : Nov 24, 2018, 12:15:58 PM
    Author     : Dell
--%>

<%@page import="controller.javaconnect"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div style="margin-top:10vw;margin-left: 36vw;">
      <h1 style="margin-left: 5.0vw;font-size: 2.0vw;">Your Cart</h1>
      <table>
               <tr>
                   <th>Item Name</th>
                   <th>Quantity</th>
                   <th>Price</th>
               </tr>
              
       <% 
           PrintWriter pw=response.getWriter();
           double sum=0;
           Connection conn=javaconnect.connectDb();
           Statement st=conn.createStatement();
           ResultSet rs;
           String[] str;
           str=request.getParameterValues("chk1");
           /*for(int i=0;i<sports.length;i++){
               System.out.print(sports[i]+" ");
           }*/
           float count=0;
           if(str!=null){
               for(int i=0;i<str.length;i++){
                   //System.out.print(sports[i]+" ");
                   st.executeQuery("select dishes,Price from order12 where ID="+str[i]+"");
                   rs=st.getResultSet();
                   while(rs.next()){
                       String nameVal=rs.getString("dishes");
                       //System.out.print(nameVal);
                       int c=rs.getInt("Price");
           
               sum+=c;
               System.out.print(sum);
               int q=1;
               count++;%>
               <tr><td><%= rs.getString("dishes")%></td>
                   <td><%=q%></td>
                   <td><%= rs.getInt("Price")%></td>
               </tr>
               <%
              }}%>
              <tr style="font-size: 1.75vw;font-weight: bolder;">
                  <td>Total</td>
                  <td><%= count%></td>
                  <td><%= sum%></td>
              </tr>
              <% }%>
      </table>
      <a href="index.html"><input type="submit" value="Checkout" style="margin-left: 5.0vw;font-size: 2.0vw;border: solid;background: transparent;">
          </a>
                </div>
    </body>
</html>

