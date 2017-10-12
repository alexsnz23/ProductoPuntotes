/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jose_
 */
@WebServlet(name = "productoP", urlPatterns = {"/productoP"})
public class productoP extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int v1 = Integer.parseInt(request.getParameter("num1"));
        int v2 = Integer.parseInt(request.getParameter("num2"));
        int v3 = Integer.parseInt(request.getParameter("num3"));
        int v4 = Integer.parseInt(request.getParameter("num4"));
        
        response(response, calcPro(v1,v2,v3,v4));
        
    }
    
    private void response(HttpServletResponse resp, float res)
			throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1><center>EL RESULTADO ES: " +res+"</center></h1>");
        out.println("<center>");
        out.println("<form action=\"index.html\">");
        out.println("<input type=\"submit\" value=\"REGRESA\" />");
        out.println("</form>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        
    }
    
    public float calcPro(int nu1, int nu2, int nu3, int nu4) {
        float resul;
        int n1 = nu1;
        int n2 = nu2;
        int n3 = nu3;
        int n4 = nu4;
        
        resul = (float)((n1*n3) + (n2*n4));
        return resul;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
