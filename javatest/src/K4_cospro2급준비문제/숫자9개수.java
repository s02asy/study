package K4_cospro2���غ���;

import java.util.Arrays;

public class ����9���� {

	public static void main(String[] args) {
		
		 int mine[][] = {
                 {0,9,0},
                 {9,0,9},
                 {0,0,9}
           };
           
           
           // �� mine�迭�� ���� 0�� �ڸ��� ���ڸ� �����ҷ����Ѵ�.
           // �����Ҽ��ڴ� �ֺ� 8������ �˻��� 9�� ������ ���������.
           
           
           // ��) �Ʒ��� ���� ��� 
           
           /*
              {2,9,2},
              {9,4,9},
              {1,3,9}
           
            */
                    //�� �� �� �� �ϵ� �ϼ� ���� ����
           int dx[] = {1, 0, -1, 0, 1, 1, -1, -1};
           int dy[] = {0, 1, 0, -1, 1, -1,  1, -1};
           
           int ii = 0;
           int ji = 0;
           for(int i = 0; i < 3; i++) {
              for(int j = 0; j < 3; j++) {
                  int cnt = 0;
                 boolean check = false;
                 if(mine[i][j] == 0) {
                    ii = i;
                    ji = j;
                    check = true;
                    if(check == true) {
                       for(int k = 0; k < dx.length; k++) {
                          i = ii;
                          j = ji;
                          i = i + dx[k];
                          j = j + dy[k];
                          if(i > -1 && i < 3 && j < 3 && j > -1 && mine[i][j] == 9) {
                             cnt++;
                          }
                       }
                       i = ii;
                       j = ji;
                       mine[i][j] = cnt;
                    }
                 }
              }
           }
           for(int i = 0; i < 3; i++) {
              System.out.println(Arrays.toString(mine[i]));
           }
	}

}
