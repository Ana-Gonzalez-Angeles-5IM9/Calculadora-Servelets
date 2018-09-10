package operaciones;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   calculadora  extends   HttpServlet
{
public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
throws   ServletException,   IOException
    {
    double   num1,   num2,   result;
    int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    num1   =   Double.parseDouble(req.getParameter("ans"));
    num2   =   Double.parseDouble(req.getParameter("ans2"));
    operacion = Integer.parseInt(req.getParameter("op"));

    result   =   calcularRes(num1,num2,operacion);

    out.println("<html>");
    out.println("<head><title>Calculadora Ana</title>"
            + "<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"/>"
            + "</head>");
    out.println("<body>");
    out.println("<p class=\"res\">El resultado es:</p>");
    out.println("<p class=\"res\">"+  result   +"</p>");
    out.println("<a href=\"index.html\">Regresar</a>");
    out.println("</body>");
    out.println("</html>");
    out.close();
    }

    public   double   calcularRes(double   num1,   double   num2,   int   operacion)
    {
    double   result   =   0;

        switch   (operacion)
        {
        case   1:
            return   num1   +   num2;
        case   2:
            return   num1   -   num2;
        case   3:
            return   num1   *   num2;
        case   4:
            return   num1   /   num2;
        case 5:
            return  Math.abs(num1);
        case 6:
            return  Math.sin(num1);
        case 7:
            return  Math.cos(num1);
        case 8:
            return  Math.tan(num1);
        case 9:
            return   Math.asin(num1);
        case 10:
            return  Math.acos(num1);
        case 11:
            return Math.atan(num1);
        }

    return   result;
    }
}
 