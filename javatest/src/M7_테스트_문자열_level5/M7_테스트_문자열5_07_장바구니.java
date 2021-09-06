package M7_Å×½ºÆ®_¹®ÀÚ¿­_level5;

import java.util.Arrays;

public class M7_Å×½ºÆ®_¹®ÀÚ¿­5_07_Àå¹Ù±¸´Ï {
	public static void main(String[] args) {
		String itemData = "1001/°í·¡¹ä,1002/»õ¿ì±ø,1003/Ä­ÃÝ";
		String userData = "3001/ÀÌ¸¸¼ö,3002/±èÃ¶¹Î,3003/ÀÌ¿µÈñ";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1002\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		//¹®Á¦1) È¸¿øº° ¾ÆÀÌÅÛ ±¸¸Å¸ñ·Ï Ãâ·Â 
		//¿¹) ÀÌ¸¸¼ö==> °í·¡¹ä3,Ä­ÃÝ1 / ±èÃ¶¹Î ==> °í·¡¹ä1 / ÀÌ¿µÈñ ==> °í·¡¹ä1,»õ¿ì±ø2
		String itemtemp_1[] = itemData.split(",");
		String itemtemp_2[][] = new String[itemtemp_1.length][];
		String usertemp_1[] = userData.split(",");
		String usertemp_2[][] = new String[usertemp_1.length][];
		String carttemp_1[] = cartData.split("\n");
		String carttemp_2[][] = new String[carttemp_1.length][];
		for(int i = 0; i < itemtemp_1.length; i++) {
			itemtemp_2[i] = itemtemp_1[i].split("/");
			usertemp_2[i] = usertemp_1[i].split("/");
		}
		for(int i = 0; i < carttemp_1.length; i++) {
			carttemp_2[i] = carttemp_1[i].split("/");
		}
		for(int i = 0; i < usertemp_2.length; i++) {
			System.out.print(usertemp_2[i][1] + " ==> ");
			int check[] = new int[itemtemp_2.length];
			int cnt = 0;
			for(int j = 0; j < itemtemp_2.length; j++) {
				for(int k = 0; k < carttemp_2.length; k++) {
					if(usertemp_2[i][0].equals(carttemp_2[k][0]) && itemtemp_2[j][0].equals(carttemp_2[k][1])) {
						check[j] += 1;
					}
				}
				if(check[j] != 0) {
					cnt += 1;
					if(cnt > 1 && cnt <= 3) {
						System.out.print(",");
					}
					System.out.print(itemtemp_2[j][1] + "" + check[j]);
				}
			}
			if(i < itemtemp_1.length - 1) {
				System.out.print(" / ");
			}
		}
		System.out.println();
		//¹®Á¦2) ¾ÆÀÌÅÛº°·Î ±¸ÀÔÇÑ È¸¿øÀÌ¸§ Ãâ·Â 
		//¿¹) °í·¡¹ä==> ÀÌ¸¸¼ö,±èÃ¶¹Î,ÀÌ¿µÈñ / »õ¿ì±ø==> ÀÌ¿µÈñ / Ä­ÃÝ==> ÀÌ¸¸¼ö
		for(int i = 0; i < itemtemp_2.length; i++) {
			System.out.print(itemtemp_2[i][1] + " ==> ");
			boolean check[] = new boolean[usertemp_2.length];
			int cnt = 0;
			for(int j = 0; j < usertemp_2.length; j++) {
				for(int k = 0; k < carttemp_2.length; k++) {
					if(itemtemp_2[i][0].equals(carttemp_2[k][1]) && usertemp_2[j][0].equals(carttemp_2[k][0])) {
						if(check[j] == false) {
							check[j] = true;
							cnt += 1;
							if(cnt > 1 && cnt <= 3) {
								System.out.print(",");
							}
							System.out.print(usertemp_2[j][1]);
						}
					}
				}
			}
			if(i < itemtemp_1.length - 1) {
				System.out.print(" / ");
			}
		}
	}
}