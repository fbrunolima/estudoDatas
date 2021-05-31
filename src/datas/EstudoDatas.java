package datas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class EstudoDatas {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date x1 = new Date();
		
		System.out.println(sdf2.format(y1));
		System.out.println();
		System.out.println(sdf2.format(x1));
		System.out.println();
		System.out.println(sdf2.format(y2));
		
		
		
		sc.close();
	}

}
