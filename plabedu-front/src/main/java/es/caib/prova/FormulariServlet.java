package es.caib.prova;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

/**
 * Servlet implementation class FormulariServlet
 */
@WebServlet("/FormulariServlet")
public class FormulariServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormulariServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PDFGenerator.createPDF("Antonia", "Rivas");
		try {
			EmailSender.sendEmail();

		}catch(Exception e) {
			System.out.println("Error enviando email.");
			e.printStackTrace();
		}
		String nom = request.getParameter("nom");
		String llinatges = request.getParameter("llinatge1") + request.getParameter("llinatge2");
		String telefon = request.getParameter("telefon");
		String email = request.getParameter("email");
		PrintWriter salida = response.getWriter();
		salida.println("<html><body>");
		salida.println("Nom: " + nom + "<br/>" + "Llinatges: " + llinatges + "<br/>" + "Telèfon: " + telefon + "<br/>"
				+ "Email: " + email);
		salida.println("</body></html");
	}

}
