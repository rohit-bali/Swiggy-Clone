package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.io.PrintWriter;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div style=\"margin-top:10vw;margin-left: 36vw;\">\n");
      out.write("      <h1 style=\"margin-left: 5.0vw;font-size: 2.0vw;\">Your Cart</h1>\n");
      out.write("           \n");
      out.write("               <tr>\n");
      out.write("                   <th>Item Name</th>\n");
      out.write("                   <th>Quantity</th>\n");
      out.write("                   <th>Price</th>\n");
      out.write("               </tr>\n");
      out.write("              \n");
      out.write("       ");
 try{
           PrintWriter pw=response.getWriter();
           double sum=0;
          String myUrl="jdbc:mysql://localhost/acadview";
		//step 1:
		Class.forName("com.mysql.jdbc.Driver");
      		//step 2:
		Connection conn=DriverManager.getConnection(myUrl,"root","");
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
                   st.executeQuery("select dishes,Price from order12 where itm_no="+str[i]+"");
                   rs=st.getResultSet();
                   while(rs.next()){
                       String nameVal=rs.getString("dishes");
                       //System.out.print(nameVal);
                       int c=rs.getInt("Price");
           
               sum+=c;
               System.out.print(sum);
               int q=1;
               count++;
      out.write("\n");
      out.write("               <tr><td>");
      out.print( rs.getString("dishes"));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(q);
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( rs.getInt("Price"));
      out.write("</td>\n");
      out.write("               </tr>\n");
      out.write("               ");

              }}
      out.write("\n");
      out.write("              <tr style=\"font-size: 1.75vw;font-weight: bolder;\">\n");
      out.write("                  <td>Total</td>\n");
      out.write("                  <td>");
      out.print( count);
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( sum);
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              ");
 }}
               catch(Exception e){System.out.print(e);
      out.write("\n");
      out.write("           \n");
      out.write("           <form method=\"post\"><input type=\"submit\" value=\"Checkout\" style=\"margin-left: 5.0vw;font-size: 2.0vw;border: solid;background: transparent;\" formaction=\"post.jsp\"></form>\n");
      out.write("       </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
