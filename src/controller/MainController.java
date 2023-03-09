package controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.03.05   Mahsa.Hadiyan
 */
@WebServlet("/main.do")
public class MainController extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service");
        resp.getWriter().println("SERVICE METHOD");
    }
}
