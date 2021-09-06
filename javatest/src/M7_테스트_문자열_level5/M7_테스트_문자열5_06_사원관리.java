package M7_�׽�Ʈ_���ڿ�_level5;

import java.util.Arrays;

public class M7_�׽�Ʈ_���ڿ�5_06_������� {
	public static void main(String[] args) {
		//[�μ�����]
		//[�μ���ȣ,�μ���,����]
		String[][] departmentData = { 
				{ "10", "ACCOUNTING", "NEW YORK" }, 
				{ "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, 
				{ "40", "OPERATIONS", "BOSTON" }, 
			};
		// [�������]
		// [��ȣ,�̸�,��å,���ӻ���ȣ,�Ի���,�޿�,Ŀ�̼�,�μ���ȣ]
		String[][] employeeData = { 
				{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },
				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" }
				};	
		
		// [���� ���]
		// [��� , �޿�MIN , �޿�MAX]
		int salaryGradeData[][] = { 
				{ 1, 700, 1200 }, // 1����̰� �޿� 700~1200 ����
				{ 2, 1201, 1400 }, 
				{ 3, 1401, 2000 }, 
				{ 4, 2001, 3000 },
				{ 5, 3001, 9999 } };

		// ����) # "DALLAS"���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ�Ͻÿ�.	
		System.out.println("����1");
		String departMentNumber = "";		
		for(int i = 0; i < departmentData.length; i++) {
			if(departmentData[i][2].equals("DALLAS")) {
				departMentNumber = departmentData[i][0];
			}
		}
		System.out.println(departMentNumber);	
		for(int i = 0; i  < employeeData.length; i++) {
			if(departMentNumber.equals(employeeData[i][7])) {
				System.out.println(Arrays.toString(employeeData[i]));
			}
		}
		System.out.println("------------------------------------------------");
		// ����) # ALLEN�� ���� �μ��� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ��ȸ�Ͻÿ�.
		System.out.println("����2");
		String depNum = "";
		for(int i=0; i<employeeData.length; i++) {
			if(employeeData[i][1].equals("ALLEN")) {
				depNum = employeeData[i][7];
			}
		}
		
		for(int i=0; i<employeeData.length; i++) {
			if(depNum.equals(employeeData[i][7])) {
				System.out.println(employeeData[i][1] + " : " + employeeData[i][7]);
			}
		}
		System.out.println("------------------------------------------------");
		// ����) # ��� ���޿����� �� ���� ���޿��� ���� ����� �����ȣ,�̸�,���޿� ��ȸ�Ͻÿ�.
		System.out.println("����3");
		int avgmoney = 0;
		int totalmoney = 0;
		for(int i = 0; i < employeeData.length; i++) {
			totalmoney += Integer.parseInt(employeeData[i][5]);
		}
		avgmoney = totalmoney / employeeData.length;
		for(int i = 0; i < employeeData.length; i++) {
			if(avgmoney < Integer.parseInt(employeeData[i][5]) + Integer.parseInt(employeeData[i][6])){
				System.out.println(employeeData[i][0] + " " + employeeData[i][1] + " " + (Integer.parseInt(employeeData[i][5]) + Integer.parseInt(employeeData[i][6])));
			}
		}
		System.out.println("------------------------------------------------");
		// ����) # �μ���ȣ�� 10�� ����߿��� �ִ�޿��� �޴� ����� ������ �޿��� �޴� ����� �����ȣ, 
		//			�̸��� ��ȸ�Ͻÿ�.
		System.out.println("����3");
		int max = 0;
		int id = 0;
		for(int i = 0; i < employeeData.length; i++) {
			if(departmentData[0][0].equals(employeeData[i][7])) {
				if(max < Integer.parseInt(employeeData[i][5]) + Integer.parseInt(employeeData[i][6])) {
					max = Integer.parseInt(employeeData[i][5]) + Integer.parseInt(employeeData[i][6]);
					id = i;
				}
			}
		}
		boolean check = false;
		for(int i = 0; i < employeeData.length; i++) {
			if(id != i && max == Integer.parseInt(employeeData[i][5]) + Integer.parseInt(employeeData[i][6])) {
				for(int j = 0; j < 2; j++) {
					System.out.print(employeeData[i][j] + " ");
				}
				System.out.println();
				check = true;
			}
		}
		if(check == false) {
			System.out.println("����.");
		}
		System.out.println("------------------------------------------------");
		// ����) # ��� ���̺��� ������ �ش� ����� �����ڸ��� �˻��Ͻÿ�
		System.out.println("����4");
		for(int i = 0; i < employeeData.length; i++) {
			System.out.print(employeeData[i][1] + " ");
			for(int j = 0; j < employeeData.length; j++) {
				if(employeeData[i][3].equals(employeeData[j][0])) {
					System.out.print(employeeData[j][1]);
					break;
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		// ����) # ��� ���̺��� �����, �ش� ����� �����ڸ�, �ش� ����� �������� �����ڸ��� �˻��Ͻÿ�
		System.out.println("����5");
		for(int i = 0; i < employeeData.length; i++) {
			System.out.print(employeeData[i][1] + " ");
			for(int j = 0; j < employeeData.length; j++) {
				if(employeeData[i][3].equals(employeeData[j][0])) {
					System.out.print(employeeData[j][1] + " ");
					for(int k = 0; k < employeeData.length; k++) {
						if(employeeData[j][3].equals(employeeData[k][0])) {
							System.out.print(employeeData[k][1]);
							break;
						}
					}
					break;
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		// ����) # 20�� �μ��� �̸��� �� �μ��� �ٹ��ϴ� ����� �̸��� ����Ͻÿ�.
		System.out.println("����6");
		for(int i = 0; i < employeeData.length; i++) {
			if(departmentData[1][0].equals(employeeData[i][7])) {
				System.out.print(departmentData[1][1] + " " + employeeData[i][1]);
				System.out.println();
			}
		}
		System.out.println("------------------------------------------------");
		// ����) # ��� ���̺��� MILLER ���� �ʰ� �Ի��� ����� ���, �̸�, �Ի����� �˻��Ͻÿ�.
		System.out.println("����7");
		String year[] = new String[3];
		String name = "MILLER";
		id = 0;
		for(int i = 0; i < employeeData.length; i++) {
			if(name.equals(employeeData[i][1])) {
				id = i;
			}
		}
		for(int i = 0; i < employeeData.length; i++) {
			if(i != id) {
				year = employeeData[i][4].split("-");
			}
			if(Integer.parseInt(year[2]) > 1982) {
				System.out.println(employeeData[i][0] + " " + employeeData[i][1] + " " + employeeData[i][4]);
			}else if(Integer.parseInt(year[2]) == 1982 && Integer.parseInt(year[1]) > 1) {
				System.out.println(employeeData[i][0] + " " + employeeData[i][1] + " " + employeeData[i][4]);
			}else if(Integer.parseInt(year[2]) == 1982 && Integer.parseInt(year[1]) == 1 && Integer.parseInt(year[0]) > 23) {
				System.out.println(employeeData[i][0] + " " + employeeData[i][1] + " " + employeeData[i][4]);
			}
		}
		System.out.println("------------------------------------------------");
		// ����) # ��� ���̺��� �μ��� �ִ� �޿��� �޴� ������� ���, �̸�, �μ��ڵ�, �޿��� �˻��Ͻÿ�.
		System.out.println("����8");
		for(int i = 0; i < departmentData.length; i++) {
			max = 0;
			System.out.print(departmentData[i][1] + " ");
			for(int j = 0; j < employeeData.length; j++) {
				if(departmentData[i][0].equals(employeeData[j][7])) {
					if(max < Integer.parseInt(employeeData[j][5]) + Integer.parseInt(employeeData[j][6])) {
						max = Integer.parseInt(employeeData[j][5]) + Integer.parseInt(employeeData[j][6]);
					}
				}
			}
			for(int k = 0; k < employeeData.length; k++) {
				if(departmentData[i][0].equals(employeeData[k][7])) {
					if(max == Integer.parseInt(employeeData[k][5]) + Integer.parseInt(employeeData[k][6])) {
						System.out.print(employeeData[k][0] + " " + employeeData[k][1] + " " + employeeData[k][7] + " " + employeeData[k][5] + " " + employeeData[k][6]);
					}
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		// ����) # salaryGrade�� 2����� ������� ��� �޿����� ���� �޴� ��� ������ �˻��Ͻÿ�.
		System.out.println("����9");
		int cnt = 0;
		int total = 0;
		for(int i = 0; i < employeeData.length; i++) {
			if(salaryGradeData[1][1] <= Integer.parseInt(employeeData[i][5]) + Integer.parseInt(employeeData[i][6]) && 
					salaryGradeData[1][2] >= Integer.parseInt(employeeData[i][5]) + Integer.parseInt(employeeData[i][6])) {
				total += Integer.parseInt(employeeData[i][5]) + Integer.parseInt(employeeData[i][6]);
				cnt += 1;
			}
		}
		int avg = total / cnt;
		for(int i = 0; i < employeeData.length; i++) {
			if(avg > Integer.parseInt(employeeData[i][5]) + Integer.parseInt(employeeData[i][6])) {
				for(int j = 0; j < employeeData[i].length; j++) {
					System.out.print(employeeData[i][j] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("------------------------------------------------");
	}
}