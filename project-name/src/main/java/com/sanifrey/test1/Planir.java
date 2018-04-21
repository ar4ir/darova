/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
/**
 * Подключаем класс событий
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Planir {
	/**
	 * Для создания основного контейнера для приложения используем контейнер JFrame
	 */
	private JFrame frame;
	/**
	 * Объявляем поля ввода JTextField. 
	 * textField - Поле для ввода значения всей площади комнаты. 
	 * textField_1 - Поле для ввода значения ширины объекта.
	 * textField_2 - Поле для ввода значения длины объекта. 
	 * textField_3 - Поле для вывода значения свободной площади в комнате.
	 */
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Объявляем элементы для отображения текста. 
	 * label - Отображает "Введите площадь всей комнаты".
	 * lblNewLabel - Отображает "Параметры объекта". 
	 * label_1 - Отображает "Ширина". 
	 * label_2 - Отображает "Длина".
	 */
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel label_1;
	private JLabel label_2;
	/**
	 * Вызываем конструктор.
	 */
	public Planir() {
		/**
		 * Вызываем метод
		 */
		initialize(false);
	}
	/**
	 * Инициализируем компоненты фрейма
	 */
	private void initialize(boolean arg) {
		/**
		 * Создаем экземпляр класса JFrame
		 */
		frame = new JFrame();
		/**
		 * Отображаем окно
		 */
		frame.setVisible(arg);
		/**
		 * Устанавливаем название окна
		 */
		frame.setTitle("Планировщик");
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту.
		 */
		frame.setBounds(100, 100, 480, 313);
		/**
		 * Указываем операцию, которая будет произведена при закрытии окна.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Создаём простые компоненты класса JLabel
		 */
		label = new JLabel("Введите площадь всей комнаты");
		lblNewLabel = new JLabel("Параметры объекта");
		label_1 = new JLabel("Ширина");
		label_2 = new JLabel("Длина");
		/**
		 * Создаём простые компоненты класса JTextField
		 */
		textField = new JTextField();
		textField_1 = new JTextField();
		textField_2 = new JTextField();
		textField_3 = new JTextField();
		/**
		 * Указываем количество символов в строке
		 */
		textField.setColumns(10);
		textField_1.setColumns(10);
		textField_2.setColumns(10);
		textField_3.setColumns(10);
		/**
		 * Создаем экземпляр класса Formula
		 */
		final Formula fl = new Formula(this);
		/**
		 * Создаём простой компонент button_1 класса JButton
		 */
		JButton button_1 = new JButton("Расчёт свободной площади");
		/**
		 * Добавляем слушателя к кнопке button_1 с помощью вызова addActionListener
		 */
		button_1.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода —
			 * actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Вызываем метод getFormula
				 */
				fl.PFormula(gettextField(), gettextField_1(), gettextField_2());
			}
		});
		/**
		 * Создаём простой компонент button_2 класса JButton
		 */
		JButton button_2 = new JButton("В меню");
		/**
		 * Добавляем слушателя к кнопке button_1 с помощью вызова addActionListener
		 */
		button_2.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода —
			 * actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Скрываем окно "Планировщик"
				 */
				frame.setVisible(false);
			}
		});
		/**
		 * Создаём экземпляр класса
		 */
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		/**
		 * Размещение элементов на панели
		 */
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel).addComponent(label_1).addComponent(label_2)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup().addComponent(button_1).addGap(18)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
										.addComponent(button_2))
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addComponent(label)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(lblNewLabel).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(label_1).addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(label_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(52)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(button_1)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(30, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(button_2).addContainerGap()))));
		/**
		 * Привязка размещения элементов к панели
		 */
		frame.getContentPane().setLayout(groupLayout);
	}
	/**
	 * Геттер для получения значения из поля textField
	 */
	public String gettextField() {
		return textField.getText();
	}
	/**
	 * Геттер для получения значения из поля textField_1
	 */
	public String gettextField_1() {
		return textField_1.getText();
	}
	/**
	 * Геттер для получения значения из поля textField_2
	 */
	public String gettextField_2() {
		return textField_2.getText();
	}
	/**
	 * Публичный метод для заполнения поля textField_3
	 */
	public void settextField_3(String arg) {
		textField_3.setText(arg);
	}
	/**
	 * Публичный метод для указания значения для setVisiable в окне "Планировщик"
	 */
	public void Visiable(boolean arg) {
		frame.setVisible(arg);
	}
	/**
	 * Метод для создания окна "Планировщик"
	 */
	public void setinit(boolean arg) {
		initialize(arg);
	}
}
