package DoPost;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Dopost
 */
public class Dopost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dopost() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter traVe = response.getWriter();
        traVe.append("<div><h1>Bạn vừa gửi yêu cầu dạng Get, đây là kết quả:</h1></div>");
        String noiDungHTML = "<form method=\"POST\" action=\"/DoPost/Dopost\""
                + "<label>Họ: </label>"
                + "<input type=\"text\" name=\"fname\" style=\"width: 100%; padding: 5px; margin-bottom: 10px;\">\r\n"
                + "<label>Tên: </label>"
                + "<input type=\"text\" name=\"lname\" style=\"width: 100%; padding: 5px; margin-bottom: 10px;\">\r\n"
                + "<input type=\"submit\" value=\"Gửi đi\">\r\n"
                + "</form>";
        traVe.append(noiDungHTML);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        PrintWriter traVe = response.getWriter();
        traVe.append("<div><h1>Bạn vừa gửi yêu cầu dạng Post, đây là kết quả:</h1></div>");
        traVe.append("<div");
        traVe.append("<label>Họ: </label>")
                .append("<span>").append(firstName).append("</span><br>");
        traVe.append("<label>Tên: </label>")
                .append("<span>").append(lastName).append("</span><br>");
        traVe.append("</div>");
    }

}
