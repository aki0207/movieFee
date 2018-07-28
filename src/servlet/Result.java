package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int age = -1;

		// リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		String gender = request.getParameter("gender");
		age = Integer.parseInt(request.getParameter("age"));
		String type = request.getParameter("type");

		// Calcクラスのインスタンスを生成
		Calc calc = new Calc();

		// 計算結果を代入
		int result = calc.movieFeeCalc(age, gender, type);

		request.setAttribute("result", result);

		getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/result.jsp").forward(request,
				response);

	}

}
