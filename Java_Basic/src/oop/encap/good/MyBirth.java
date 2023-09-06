package oop.encap.good;

public class MyBirth {

	/*
	# ���� ����: ������ ��ȣ�� �������� ����ϴ�
	oop ��� �� �ϳ�. 

	- �ܺο��� ���� ������ ������ �� ������ ��������� private ������ ����.
	 */

	private int year;
	private int month;
	private int day;

	/*
	- ���� ������ �����Ϳ� ���� ������ �ɾ ������ ��ȣ�ϴ� ���� ����������
		private�� �����ߴ��� ������ ���� ��ü�� �Ұ��������ϴ�.

	- ���� �������� ��ȿ���� ������ �� �ִ� ����� ���Ե�
		�޼��带 ����Ͽ� �������� ������ ����ϵ��� �����ϴµ�,
		�� �� ����ϴ� �޼��带 getter / setter �޼����� �θ��ϴ�.

	# setter method

     1. setter�� ������ ������ ���� �����ϱ� ���� �޼��� �Դϴ�.

     2. �޼��� ���ο� ������ ��ȿ�� ���� ������ �ۼ��Ͽ�
      ������ �����͸� ��������� �����Ű��, ���������ڴ�
      public���� �����Ͽ� �ܺο��� ������ ����� �� �ְ� �մϴ�.

     3. �޼��� �̸��� �Ϲ������� set + ��������̸� ���� �����մϴ�.

	 */

	public void setYear(int year) {
		if(year < 1900 || year > 2023) {
			System.out.println("�߸��� ���� �Է��Դϴ�.");
		} else {
			this.year = year;
		}
	}

	/*
    # getter method

    1. getter�� ������ ������ ���� ������ �� ����ϴ� �޼����Դϴ�.

    2. setter�� ���������� public������ ���� �ܺο� �޼��带 �����ϰ�,
     �̸��� �Ϲ������� get + ��������̸� ���� �����մϴ�.
	 */

	public int getYear(String pw) {
		if(pw.equals("aaa1111!")) {
			return this.year;
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			return 0;
		}
	}

	/*
    - month�� day�� setter / getter �޼��带 �����ϼ���.
    - month: 1 ~ 12
    - day: 1 ~ 31
    - getter �޼���� ���� ��й�ȣ �� ���� �˻� ����
     �ٷ� return �Ӽ��� �� �ּ���.
	 */

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("�߸��� �� �Է��Դϴ�.");
		}else {
			this.month = month;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		if(day > 31 || day < 1) {
			System.out.println("�߸��� �� �Է��Դϴ�.");
		}else {
			if(this.month == 0) {
				System.out.println("���ڸ� �Է��ϱ� ���ؼ��� �� �Է��� ����Ǿ�� �մϴ�.");
				return;
			}
			if(!isValidateMonth(day)) {
				System.out.println("���� ���� ���ڰ� �ùٸ��� �ʽ��ϴ�.");
				return;
			}
			this.day = day;
		}
	}

	public int getDay() {
		return day;
	}

	public void birthInfo() {
		// year, month, day �� �� �� �ϳ��� ����� ���� ���õ��� �ʴٸ�
		// ����� �� ���� �ʰڴ�.\
		if(this.year == 0 || this.month == 0 || this.day == 0) {
			System.out.println("��¥ �ʵ� �߿� �ʱ�ȭ ���� ���� �����Ͱ� �ֽ��ϴ�.");
			return;
		} 
		
		System.out.printf("�� ������ %d�� %d�� %d�� �Դϴ�.\n"
				, this.year, this.month, this.day);
	}

	public boolean isValidateMonth(int day) {
		// �� ���� ������ ���ڰ� ������ �Ǿ� �ִ����� �Ǻ��ϴ� �޼���
		switch(this.month) {
		case 2:
			if(day > 28) {
				return false;
			}
		case 4: case 6: case 9: case 11:
			if(day > 30) {
				return false;
			}
		default:
			return true;
		}
	}

	/*
	 - �����Ϳ� �����͸� �ٷ�� �������� �޼������ �ϳ��� ���� �̷��� ��������
	 ĸ��ȭ ��� �մϴ�. (encapsulation)
	 �����Ϳ� �� �����͸� �ٷ�� ������ �ϳ��� ���� ���� �����ϰ� ���� �����ϱ� ���� �Դϴ�.
	 */
}