package IS; //название пакета

import java.awt.*; // импорт пакета
import java.awt.event.*; //импорт пакета
import javax.swing.*; //импорт пакета

public class CalculatorApp { //класс, который запускает калькулятор

	public static void main(String[] args) throws InterruptedException { //метод, который запускает калькулятор
		Calculator calc = new Calculator();  //создание объекта типа Calculator
		calc.setVisible(true);  //задание видимости калькулятора

	}

}


class Calculator extends JFrame  { //класс калькулятора
	 JLabel label1, label2, label3, label4; //объявление объектов типа JLabel
	 JButton bDean, bCathedra, bExecute ; //объявление объектов тип JButton
	 JTextField textField1, textField2, textField3, textField4;  //объявление объектов типа JTexTfield
	 JPanel panel; //объявление объекта типа JPanel
	 
	public Calculator() throws InterruptedException { //конструктор класса Calculator
		super("Calculator");  //название окна калькулятора
		setBounds(370, 300, 250, 100); //задание размера и расположения окна
		
		label1 = new JLabel("Выберите роль пользователя"); //создание объекта
		bCathedra = new JButton("Зав. кафедрой"); //создание объекта
		bDean = new JButton("Декан"); //создание объекта
		
		panel = new JPanel(new FlowLayout());  //создание объекта и выдача ему менеджера компановки 
		panel.add(label1); //добавление объекта на панель
		panel.add(bCathedra); //добавление объекта на панель
		panel.add(bDean); //добавление объекта на панель
		
		add(panel); //добавление панели в окно
		
		bCathedra.addActionListener(new ActionListener() { //добавить слушателя к кнопке

			@Override //переопределение метода
			public void actionPerformed(ActionEvent arg0) { //указать, что случится при нажатии кнопки
				panel.removeAll(); //очистить панель
				
				
				setBounds(630, 390, 630, 200); //задание размера и расположения окна
				
				label1 = new JLabel("Введите количество учеников"); //создание объекта
				label2 = new JLabel("Введите количество учеников на руководителя (от 1 до 5)"); //создание объекта
				label3 = new JLabel("Введите количество свободных руководителей с кафедры"); //создание объекта
				label4 = new JLabel("Результат");//создание объекта
				
				textField1 = new JTextField("", 2); //создание объекта
				textField2 = new JTextField("", 2); //создание объекта
				textField3 = new JTextField("", 2); //создание объекта
				textField4 = new JTextField("", 55); //создание объекта
				
				bExecute = new JButton("Провести расчёт");//создание объекта
				bExecute.addActionListener(new ActionListener() { //добавить слушателя к кнопке

					@Override //переопределение метода
					public void actionPerformed(ActionEvent arg0) { //указать, что случится при нажатии кнопки
						doCount(); //вызов метода для расчёта
						
					}
					
				});
				
				
				panel.add(label1); //добавление объекта на панель
				panel.add(textField1); //добавление объекта на панель
				panel.add(label2); //добавление объекта на панель
				panel.add(textField2); //добавление объекта на панель
				panel.add(label3); //добавление объекта на панель
				panel.add(textField3); //добавление объекта на панель
				panel.add(label4); //добавление объекта на панель
				panel.add(textField4); //добавление объекта на панель
				panel.add(bExecute);//добавление объекта на панель
				
			}
			
		});
		
		bDean.addActionListener(new ActionListener() { //добавить слушателя к кнопке

			@Override //переопределение метода
			public void actionPerformed(ActionEvent e) { //указать, что случится при нажатии кнопки
				panel.removeAll(); //очистить панель
				panel.revalidate(); //поместить  контейнер как недействительный и выполнить компоновку контейнера.
				setBounds(630, 390, 250, 120); //задание размера и расположения окна
				
				label1 = new JLabel("Введите название кафедры"); //создание объекта
				textField1 = new JTextField("", 20); //создание объекта
				bExecute = new JButton("Далее"); //создание объекта
				
				panel.add(label1); //добавление объекта на панель
				panel.add(textField1); //добавление объекта на панель
				panel.add(bExecute); //добавление объекта на панель
				
				bExecute.addActionListener(new ActionListener() { //добавить слушателя к кнопке

					@Override //переопределение метода
					public void actionPerformed(ActionEvent arg0) { //указать, что случится при нажатии кнопки
						panel.removeAll(); //очистить панель
						
						
						setBounds(630, 390, 630, 200); //задание размера и расположения окна
						
						label1 = new JLabel("Введите количество учеников"); //создание объекта
						label2 = new JLabel("Введите количество учеников на руководителя (от 1 до 5)"); //создание объекта
						label3 = new JLabel("Введите количество свободных руководителей с кафедры"); //создание объекта
						label4 = new JLabel("Результат");//создание объекта
						
						textField1 = new JTextField("", 2); //создание объекта
						textField2 = new JTextField("", 2); //создание объекта
						textField3 = new JTextField("", 2);//создание объекта
						textField4 = new JTextField("", 55); //создание объекта
						
						bExecute = new JButton("Провести расчёт"); //создание объекта
						bExecute.addActionListener(new ActionListener() { //добавить слушателя к кнопке

							@Override //переопределение метода
							public void actionPerformed(ActionEvent arg0) { //указать, что случится при нажатии кнопки
								doCount(); //вызов метода для расчёта
								
							}
							
						});
						
						panel.add(label1);  //добавление объекта на панель
						panel.add(textField1);  //добавление объекта на панель
						panel.add(label2);  //добавление объекта на панель
						panel.add(textField2);  //добавление объекта на панель
						panel.add(label3);  //добавление объекта на панель
						panel.add(textField3);  //добавление объекта на панель
						panel.add(label4); //добавление объекта на панель
						panel.add(textField4);  //добавление объекта на панель
						panel.add(bExecute); //добавление объекта на панель
						
					}
					
				});
			}
			
		});
	}

	
	public void doCount(){ //метод для расчёта
		int totalStudents = 0, studentsPerTeacher = 0, freeCathedraTeachers = 0; //объявление переменных, значение которых вводит пользователь
		int requiredTotalTeachers = 0, requiredCathedraTeachers = 0, requiredNonCathedraTeachers = 0; //объявление переменных, которые будут выведены
		
		try { //сделать что-то, что может вызвать исключение
			totalStudents = Integer.parseInt(textField1.getText()); //считать значение переменной с текстовой строки
			if(totalStudents < 0) //при выполнении условиия
				throw new Exception(); //вызвать исключение
			
			studentsPerTeacher = Integer.parseInt(textField2.getText()); //считать значение переменной с текстовой строки
			if(!(studentsPerTeacher >= 1 && studentsPerTeacher <= 5)) //при выполнении условиия
				throw new Exception(); //вызвать исключение
			
			freeCathedraTeachers = Integer.parseInt(textField3.getText()); //считать значение переменной с текстовой строки
			if(freeCathedraTeachers < 0) //при выполнении условиия
				throw new Exception(); //вызвать исключение
		}
		catch(Exception e) { //что сделать при поимке исключения
			totalStudents = 0; //приравнять значение переменной к 0
			textField1.setText(""); //очистить содержимое текстовой строки
			
			studentsPerTeacher = 0; //приравнять значение переменной к 0
			textField2.setText(""); //очистить содержимое текстовой строки
			
			freeCathedraTeachers = 0; //приравнять значение переменной к 0
			textField3.setText(""); //очистить содержимое текстовой строки
			
			textField4.setText("Ошибка ввода"); //изменить содержимое текстовой строки
			return; //возврат из метода
		}
		
		requiredTotalTeachers = totalStudents / studentsPerTeacher; //вычисление количества требуемых руководителей
		if(totalStudents % studentsPerTeacher != 0) //если количество требуемых руководителей не целое
			requiredTotalTeachers++; //увеличить значение переменной на 1
		
		if(requiredTotalTeachers <= freeCathedraTeachers) //если общее количество требуемых руководителей меньше либо равно количеству свободных руководителей с кафедры
			requiredCathedraTeachers = requiredTotalTeachers; //то требуемое количество руководителей с кафедры равно общему количеству требуемых руководителей (в таком случаеколичество руководителей не с кафедры равно 0)
		else { //иначе
			requiredCathedraTeachers = freeCathedraTeachers; //количество требуемых руководителей с кафедры равно количеству свободных руководителей с кафедры
			requiredNonCathedraTeachers = requiredTotalTeachers - freeCathedraTeachers; //количество требуемых руководителей не с кафедры равно разности общего количества требуемых руководителей и количества свободных руководителей с кафедры
		}
		textField4.setText("Необходимы дипломные руководители в количестве " + requiredTotalTeachers + " чел.: " + requiredCathedraTeachers + " чел. с кафедры и " + requiredNonCathedraTeachers + " чел. не с кафедры."); //вывод результата
	}
	
}
