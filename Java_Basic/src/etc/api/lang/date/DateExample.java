package etc.api.lang.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("===========================");
		
		//���� ��¥ ���� ��� (��, ��, ��)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//���� �ð� ���� ���(��, ��, ��)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		//���� ��¥�� �ð� ���� ��� (��, ��, ��, ��, ��, ��)
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		//Ư�� ��¥�� �ð� ���� ���
		LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
		System.out.println("beginDate: " + beginDate);
		
		//��, ��, �� ���� ����
		int year = localDateTime.getYear();
		System.out.println("year: " + year);
		
		//���� ������ �� ����
		int monthValue = localDateTime.getMonthValue();
		System.out.println("monthValue: " + monthValue);
		
		//���� ������ �� ���� (Month ��� ������ Ÿ�� �� �ϳ�)
		Month month = localDateTime.getMonth();
		System.out.println("month: " + month);
		
		int dayValue = localDateTime.getDayOfMonth();
		System.out.println("dayValue: " + dayValue);
		
		//���� (������ Ÿ�� ����)
		DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
		System.out.println("dayOfWeek: " + dayOfWeek);
		
		System.out.println("===============================");
		
		//�������κ��� 3�� ��
		LocalDateTime returnDate = localDateTime.plusDays(3);
		System.out.println(returnDate);
		
		//�������κ��� 1�� 2���� 7�� ��
		LocalDateTime d1 = localDateTime
										.plusYears(1)
										.plusMonths(2)
										.plusDays(7);
		System.out.println(d1);
		
		//�������κ��� 9���� 23�� ��
		LocalDateTime d2 = localDateTime.minusMonths(9).minusDays(23);
		System.out.println(d2);
		
		//���� ��¥ ����
		LocalDate b = LocalDate.of(2020, 12, 30);
		
		LocalDate f = LocalDate.of(2022, 9, 14);
		
		long between = ChronoUnit.YEARS.between(b, f);
		System.out.println("between: " + between);
		
		System.out.println("=========================");
		
		//��¥ ���� �����ϱ�
		System.out.println(localDateTime);
		
		DateTimeFormatter dtf 
			= DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		
		System.out.println(localDateTime.format(dtf));
	}
}