package co.edu.itm.campusparty.servlet;

import co.edu.itm.campusparty.persistence.CampuseroDao;
import co.edu.itm.campusparty.persistence.EquipoDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InfoCampuseroServlet")
public class InfoEquipoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println((new EquipoDao()).consultarEquipoPorCampusero("1"));
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
