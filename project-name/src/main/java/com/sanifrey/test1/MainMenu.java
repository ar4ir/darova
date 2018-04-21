/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;
/**
 * Добавляем библиотеку для работы с асинхронными событиями
 */
import java.awt.EventQueue;
/**
 * Подключаем класс событий
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 * Подключаем библиотеку для работы с менеджером компоновки
 */
import java.awt.BorderLayout;

/**
 * Объявляем класс с модификатором public
 */
public class MainMenu {
	/**
	 * Для создания основного контейнера для приложения используем контейнер JFrame
	 */
	private JFrame frame;

	/**
	 * Запуск приложения
	 */
	public static void main(String[] args) {
		/**
		 * Объявляем, что это необходимо выполнять в главном потоке
		 */
		EventQueue.invokeLater(new Runnable() {
			/**
			 * Метод run
			 */
			public void run() {
				/**
				 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
				 * исключения try
				 */
				try {
					/**
					 * Создаём объект window
					 */
					MainMenu window = new MainMenu();
					/**
					 * Отображаем окно
					 */
					window.frame.setVisible(true);
					/**
					 * Исключение catch
					 */
				} catch (Exception e) {
					/**
					 * Обрабатываем исключение типа Exception e
					 */
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Вызываем конструктор
	 */
	public MainMenu() {
		/**
		 * Вызываем метод initialize для инициализации элементов фрейма
		 */
		initialize();
	}

	/**
	 * Инициализируем компоненты фрейма
	 */
	private void initialize() {
		/**
		 * Создаем экземпляр класса Otdel
		 */
		final Otdel ot = new Otdel();
		/**
		 * Создаем экземпляр класса Planir
		 */
		final Planir mp = new Planir();
		/**
		 * Создаём объект
		 */
		frame = new JFrame();
		/**
		 * Устанавливаем название окна
		 */
		frame.setTitle("Главное меню");
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту.
		 */
		frame.setBounds(100, 100, 450, 300);
		/**
		 * Указываем операцию, которая будет произведена при закрытии окна.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Создаём простой компонент btnNewButton класса JButton
		 */
		JButton btnNewButton = new JButton("Планировщик");
		/**
		 * Добавляем компонент btnNewButton на панель
		 */
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
		/**
		 * Создаём простой компонент btnNewButton_1 класса JButton
		 */
		JButton btnNewButton_1 = new JButton("Отделочник");
		/**
		 * Добавляем компонент btnNewButton_1 на панель
		 */
		frame.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		/**
		 * Добавляем слушателя к кнопке btnNewButton_1 с помощью вызова
		 * addActionListener
		 */
		btnNewButton_1.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода —
			 * actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Делаем видимым окно "Отделочник"
				 */
				ot.Visiable(true);
			}
		});
		/**
		 * Добавляем слушателя к кнопке btnNewButton с помощью вызова addActionListener
		 */
		btnNewButton.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода —
			 * actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Делаем видимым окно "Планировщик"
				 */
				mp.Visiable(true);
			}
		});
	}
}
