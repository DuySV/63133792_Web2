package AboutMe;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AboutMe
 */
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String htmlContent = "<html><head><title>Duong Nhat Duy - CV</title></head><body>"
                + "<h1>Duong Nhat Duy</h1>"
                + "<p>Email: duy.dn.63cntt@ntu.edu.vn| Phone: 0898144607 "
                + "<h2>Sinh Vien</h2>"
                + "<li>Ngon Ngu Lap Trinh: Java, HTML, CSS</li>"
                + "<li>Tools: Eclipse IDE, Visual Studio Code</li>"
                + "</body></html>";

        // Send the HTML response
        response.getWriter().println(htmlContent);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
