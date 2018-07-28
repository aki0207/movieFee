package servlet;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Calc {

	public static int movieFeeCalc(int pAge, String pGender,String pType) {
		// 現在の日時、曜日、時間をそれぞれで取得
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdfDay = new SimpleDateFormat("dd");
		String toDay = sdfDay.format(cal.getTime());

		SimpleDateFormat sdfWeek = new SimpleDateFormat("E");
		String toWeek = sdfWeek.format(cal.getTime());

		SimpleDateFormat sdfTime = new SimpleDateFormat("kk");
		int toTIme = Integer.parseInt(sdfTime.format(cal.getTime()));

		int movieFee = 0;

		// 年齢により料金が変動
		if (pAge > 22) {

			movieFee = 1800;

		} else if (pAge > 18 && pAge < 23) {

			movieFee = 1500;

		} else if (pAge > 15 && pAge < 19) {

			movieFee = 1200;

		} else if (pAge > 6 && pAge < 16) {

			movieFee = 1000;
		} else if (pAge > 0 && pAge < 7) {

			movieFee = 0;
		}
		//今日が1日なら割引
		if (toDay.equals("01") && movieFee > 1000) {

			movieFee = 1000;

			// 水曜で女性なら割引
		} else if (toWeek.equals("水") && pGender.equals("1") && movieFee > 1200) {

			movieFee = 1200;

			// 21時以降なら割引
		} else if (toTIme >= 21 && movieFee > 1500) {

			movieFee = 1500;

		}
		
		//3Dなら加算料金発生
		if (pType.equals("0")) {
			
			movieFee += 400;
			
		}
		
		return movieFee;

	}

}
