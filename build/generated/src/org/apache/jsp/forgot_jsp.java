package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body \n");
      out.write("            {\n");
      out.write("                background-image: url(https://images.pexels.com/photos/326279/pexels-photo-326279.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940);\n");
      out.write("                background-repeat:no-repeat;\n");
      out.write("                background-size:1350px;\n");
      out.write("                \n");
      out.write("            .middle\n");
      out.write("            {\n");
      out.write("               \n");
      out.write("                height: 700px;\n");
      out.write("            }\n");
      out.write("          \n");
      out.write("            .div01\n");
      out.write("            {\n");
      out.write("                border-radius:25px;\n");
      out.write("                height:600px;\n");
      out.write("                width: 400px;\n");
      out.write("                background-color:white;\n");
      out.write("                margin-top:0px;\n");
      out.write("                margin-left: 300px;\n");
      out.write("                font-size:20px;\n");
      out.write("                float:left;\n");
      out.write("            }\n");
      out.write("            .div01 a\n");
      out.write("            {\n");
      out.write("                padding: 10px 30px;\n");
      out.write("                float:left;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");

            String email=request.getParameter("uname");
           String ques=request.getParameter("psw");
           
           try
           {
	
               String myUrl="jdbc:mysql://localhost/acadview";
		//step 1:
		Class.forName("com.mysql.jdbc.Driver");
      		//step 2:
		Connection conn=DriverManager.getConnection(myUrl,"root","");
                String query=("Select Email,ques,password from signup where Email= '"+email+"' and ques='"+ques+"'");
                
		//step 3:
		Statement st=conn.createStatement();
		//step 4:
		ResultSet rs =st.executeQuery(query);
		if(rs.next())
                {
                    String ps = rs.getString("password");
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.html\">SWIGGY CLONE!</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li><a href=\"index.html\">HOME</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<div id=\"LI\"class=\"collapse\">\n");
      out.write("<navclass=\"navbarnavbar-default\">\n");
      out.write("<divclass=\"container-fluid\">\n");
      out.write("<divclass=\"navbar-header\">\n");
      out.write("<aclass=\"navbar-brand\"href=\"#\"><IFRAME SRC='LI.HTML' WIDTH ='1366' HEIGHT ='450'></IFRAME></a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("       <div class=\"container\">\n");
      out.write("           \n");
      out.write("       <div class=\"middle\">\n");
      out.write("           <div class=\"div3\">\n");
      out.write("                <p style=\"color: red;font-size: 35px;height: 50px;width:400px;background-color: whitesmoke;margin-top: 0;text-align: center;border-bottom-right-radius:  40px;\">Forgot password</p>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"div01\">\n");
      out.write("                    <img src=\"data:image/jpeg;base64,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\" style=\"height: 120;width:120;margin-top:20px;margin-left:110;\">\n");
      out.write("                    <h3 style=\"margin-left:60px;color: white;\">\n");
      out.write("                        Password is ");
 out.print(rs.getString("password")); 
      out.write("\n");
      out.write("                    </h3>\n");
      out.write("                  \n");
      out.write("               </div>\n");
      out.write("        </div>\n");
      out.write("      </div> \n");
      out.write("    \n");
      out.write("       ");

}

    else
{
        
      out.write("\n");
      out.write("                    <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.html\">SWIGGY CLONE!</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li><a href=\"index.html\">HOME</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<div id=\"LI\"class=\"collapse\">\n");
      out.write("<navclass=\"navbarnavbar-default\">\n");
      out.write("<divclass=\"container-fluid\">\n");
      out.write("<divclass=\"navbar-header\">\n");
      out.write("<aclass=\"navbar-brand\"href=\"#\"><IFRAME SRC='LI.HTML' WIDTH ='1366' HEIGHT ='450'></IFRAME></a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("       <div class=\"container\">\n");
      out.write("           \n");
      out.write("       <div class=\"middle\">\n");
      out.write("           <div class=\"div3\">\n");
      out.write("                <p style=\"color: red;font-size: 35px;height: 50px;width:400px;background-color: whitesmoke;margin-top: 0;text-align: center;border-bottom-right-radius:  40px;\">Forgot password</p>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"div01\">\n");
      out.write("                    <img src=\"data:image/jpeg;base64,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\" style=\"height: 120;width:120;margin-top:20px;margin-left:110;\">\n");
      out.write("                    <h3 style=\"margin-left:60px;color: white;\">\n");
      out.write("                        Wrong email or code!                    </h3>\n");
      out.write("                  \n");
      out.write("               </div>\n");
      out.write("        </div>\n");
      out.write("      </div> \n");
      out.write("    \n");
      out.write("       ");

           }
           st.close();
		}
		catch(Exception e){
			System.out.println("Got an exception! ");
			System.out.println(e.getMessage());
		}
           
        
      out.write("\n");
      out.write("           \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
