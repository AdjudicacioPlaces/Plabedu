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
	private static JSONObject jsonObject;

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
		List<Plazas> list = new ArrayList<>();
		list = ModeloPlaza.getPlazas();
		request.setAttribute("listPlaza", list);
		RequestDispatcher myDispatcher=request.getRequestDispatcher("/Formulari.jsp");
		myDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String llinatge1 = request.getParameter("llinatge1");
		String llinatge2 = request.getParameter("llinatge2");
		String selectedOption = request.getParameter("catProfessional");
		PrintWriter salida = response.getWriter();
		salida.println("<html><body>");
		salida.println("Nom: " + nom + "<br/>" + "Primer llinatge: " + llinatge1 + "<br/>" + "Segon llinatge: "
				+ llinatge2 + "<br/>" + "Opció seleccionada: " + selectedOption);
		salida.println("</body></html");
	}

}
