/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;
/**
 * Объявляем класс с модификатором public
 */
public class Formula {
	/**
	 * Экземпляр класса Planir
	 */
	private Planir plframe;
	/**
	 * Объявляем приватные статические переменные.
	 * FreeArea - значение свободной площади в комнате. 
	 * AllArea - значение всей площади комнаты.
	 */
	private static float FreeArea;
	private static float AllArea;
	/**
	 * Вызываем конструктор
	 */
	public Formula(Planir someframe) {
		this.plframe = someframe;
	}
	/**
	 * Приватный метод для расчёта свободной площади в комнате
	 * @return 
	 */
	private String FormulaFree(float area, float width, float length) {
		/**
		 * Присваиваем переменной AllArea значение переменной area
		 */
		AllArea = area;
		/**
		 * Выполняем расчёт свободной площади в комнате
		 */
		FreeArea = area - width * length;
		/**
		 * Если значение свободной площади(FreeArea) в комнате меньше нуля(что является
		 * логической ошибкой), то присваиваем значение свободной площади(FreeArea) к
		 * нулю.
		 */
		if (FreeArea < 0)
			FreeArea = 0;
		/**
		 * Вызываем метод FillTextField_3 для заполнения в форме планировщик поля
		 * textField_3 значением FreeArea
		 */
		//FillTextField_3(FreeArea);
		return String.valueOf(FreeArea);
	}
	/**
	 * Публичный метод для вызова приватного метода FormulaFree.
	 * @return 
	 */
	public String PFormula(String area, String width, String length) {
			FormulaFree(Float.parseFloat(area), Float.parseFloat(width), Float.parseFloat(length));
			return String.valueOf(FreeArea);
	}
	/**
	 * Метод для заполнения в форме планировщик поля textField_3 значением FreeArea
	 */
	private void FillTextField_3(float FreeArea) {
		plframe.settextField_3(String.valueOf(FreeArea));
	}
	/**
	 * Геттер для получения значения свободной площади в комнате.
	 */
	public static float getFreeArea() {
		return FreeArea;
	}
	/**
	 * Геттер для получения значения всей площади в комнате.
	 */
	public static float getAllArea() {
		return AllArea;
	}
}
