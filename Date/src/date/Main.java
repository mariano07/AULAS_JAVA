package date;
import java.util.Date;

import javax.swing.JOptionPane;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();	
			
			JOptionPane.showMessageDialog(null, date);
		}
	}
