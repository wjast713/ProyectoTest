package es.unileon.prg.tema10.ejemplo;

public class Fecha {

		private int year;
		private int month;
		private int day;
	
		
		public int getYear() {
			return year;
		}


		public void setYear(int year) {
			this.year = year;
		}


		public int getMonth() {
			return month;
		}


		public void setMonth(int month) {
			this.month = month;
		}


		public int getDay() {
			return day;
		}


		public void setDay(int day) {
			this.day = day;
		}


		Fecha()
		{
			this.year = 1;
			this.month = 1;
			this.day = 1;
		}
}
