package oop.final_constant;

public class Earth {

	/*
    # ��� (constant)
    
    - ����� ������ �Һ��� ���Դϴ�. ���� ��𿡼� ������ �ϴ���
     ���� ���� ���;� �ϸ�, ���� ���� ���� �Ұ����ؾ� �մϴ�.
     
    - ���� �ڹٿ����� ����� ������ �� static, final�� ���ÿ� ����մϴ�.
    */
	
	final static double RADIUS = 6400;
		
	static final double SURFACE_AREA;
	
	static {
		SURFACE_AREA = RADIUS * RADIUS * Math.PI * 4;
	}
	
}