/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
/**
 * Подключаем класс событий
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Объявляем класс с модификатором public
 */
public class Otdel {
	/**
	 * Для создания основного контейнера для приложения используем контейнер JFrame
	 */
	private JFrame frame;
	/**
	 * Объявляем поля ввода JTextField.
	 * textField - Для отображения значения всей площади комнаты.
	 * textField_1 - Для отображения значения свободного места в комнате.
	 */
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Вызываем конструктор
	 */
	public Otdel() {
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
		frame.setTitle("Отделочник");
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту.
		 */
		frame.setBounds(100, 100, 450, 300);
		/**
		 * Указываем операцию, которая будет произведена при закрытии окна.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Создаём простые компоненты класса JLabel
		 */
		JLabel label = new JLabel("Общая площадь");
		JLabel label_1 = new JLabel("Свободная площадь");
		/**
		 * Создаём простые компоненты класса JTextField
		 */
		textField_1 = new JTextField();
		textField = new JTextField();
		/**
		 * Указываем количество символов в строке
		 */
		textField_1.setColumns(10);
		textField.setColumns(10);
		/**
		 * Создаём простой компонент button класса JButton
		 */
		JButton button = new JButton("Сохранить");
		/**
		 * Добавляем слушателя к кнопке button с помощью вызова addActionListener
		 */
		button.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода —
			 * actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Вызываем метод для сохранения данных в файл
				 */
				SaveInFile();
			}
		});
		/**
		 * Создаём простой компонент button_1 класса JButton
		 */
		JButton button_1 = new JButton("В меню");
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
				 * Скрываем окно "Отделочник"
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
		groupLayout.setHorizontalGroup(groupLayout
				.createParallelGroup(
						Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(label)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(button))
						.addContainerGap(319, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(335, Short.MAX_VALUE)
						.addComponent(button_1).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(label)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(label_1)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE).addComponent(button)
						.addGap(24).addComponent(button_1).addContainerGap()));
		/**
		 * Привязка размещения элементов к панели
		 */
		frame.getContentPane().setLayout(groupLayout);
	}
	/**
	 * Метод для сохранения в файл
	 */
	private void SaveInFile() {
		/**
		 * Создаем экземпляр класса SaveFile
		 */
		SaveFile sf = new SaveFile();
		/**
		 * Вызываем метод PSaveInFile
		 */
		sf.PSaveInFile();
	}
	/**
	 * Метод для обновления текстовых полей при открытии окна "Отделочник"
	 */
	private void UpdateTextFields() {
		/**
		 * Заполняем поле textField в окне "Отделочник" получая значения через геттер
		 * getAllArea()
		 */
		textField.setText(String.valueOf(Formula.getAllArea()));
		/**
		 * Заполняем поле textField_1 в окне "Отделочник" получая значения через геттер
		 * getFreeArea()
		 */
		textField_1.setText(String.valueOf(Formula.getFreeArea()));
	}
	/**
	 * Публичный метод для установки в окне "Планировщик" значения setVisible
	 */
	public void Visiable(boolean arg) {
		frame.setVisible(arg);
		UpdateTextFields();
	}
	/**
	 * Публичный метод для инициализации окна "Планировщик"
	 */
	public void init(boolean arg) {
		initialize(arg);
	}
}
