package BMI;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BMI
 */
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter traVe = response.getWriter();
        traVe.append("<div><h1>Bạn vừa gửi yêu cầu tính BMI, đây là kết quả:</h1></div>");
        String noiDungHTML = "<form method=\"POST\" action=\"/BMI/BMI\""
                + "<label>Cân Nặng(kg): </label>"
                + "<input type=\"text\" name=\"kg\" style=\"width: 100%; padding: 5px; margin-bottom: 10px;\">\r\n" 
                +"<label>Chiều cao(cm): </label>"
                + "<input type=\"text\" name=\"cm\" style=\"width: 100%; padding: 5px; margin-bottom: 10px;\">\r\n"
                + "<input type=\"submit\" value=\"Gửi đi\">\r\n"
                + "</form>";
        traVe.append(noiDungHTML);
    }
    protected String tinh(float CanNang,float ChieuCao) {
    	
    	float bmi = (float) (CanNang / Math.pow(ChieuCao, 2));
    	if (bmi < 18)
    	    return String.valueOf(("%-20.2f%s", bmi, "Underweight"));
    	else if (bmi < 25.0)
    		return String.valueOf(("%-20.2f%s", bmi, "Normal"));
    	else if (bmi < 30.0)
    		return String.valueOf(("%-20.2f%s", bmi, "Overweight"));
    	else
    		return String.valueOf(("%-20.2f%s", bmi, "Obese"));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        float CanNang = Float.parseFloat(request.getParameter("kg"));
        float ChieuCao = Float.parseFloat(request.getParameter("cm"));
        PrintWriter traVe = response.getWriter();
        traVe.append("<div><h1>Bạn vừa gửi yêu cầu  tính BMI đây là kết quả:</h1></div>");
        System.out.print(tinh(CanNang,ChieuCao));
        traVe.append(tinh(CanNang,ChieuCao));
    }


}
