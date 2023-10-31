package hw_ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class hw_ch2 {
		public static void main(String[] args)throws IOException{
			
			//p.7
			System.out.println("請輸入一整數");
			
			BufferedReader br1 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			int num1 =Integer.parseInt(br1.readLine());
			
			if (num1==1){
				System.out.println("輸入的是1");
				System.out.println("選擇的是1");
			}
			
			System.out.println("結束處理");

			//p.8
			System.out.println("請輸入一整數");
			
			BufferedReader br2 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			int num2 =Integer.parseInt(br2.readLine());
			
			if (num2==1)
				System.out.println("輸入的是1");
				System.out.println("選擇的是1");
			
			System.out.println("結束處理");

			//p.10
			System.out.println("請輸入一整數");
			
			BufferedReader br3 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			int num3 =Integer.parseInt(br3.readLine());
			
			if (num3==1){
				System.out.println("輸入的是1");
			}
			else {
			System.out.println("選擇的是1以外的數字");
			}
			
			//p.12
			System.out.println("請輸入一整數");
			
			BufferedReader br4 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			int num4 =Integer.parseInt(br4.readLine());
			
			if (num4==1){
				System.out.println("輸入的是1");
			}
			else if(num4==2) {
				System.out.println("輸入的是2");
			}
			else {
			System.out.println("請輸入1或2");
			}
			
			
			//p.14
			System.out.println("請輸入一整數");
			
			BufferedReader br5 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			int num5 =Integer.parseInt(br5.readLine());
			
			switch(num5) {
			case 1:
			{
				System.out.println("輸入的是1");
				break;
			}
			case 2:{
				System.out.println("輸入的是2");
				break;
			}
			default:
			{
				System.out.println("請輸入1或2");
				break;
			}
			}
			
			//p.15
			System.out.println("請輸入一整數");
			
			BufferedReader br6 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			int num6 =Integer.parseInt(br6.readLine());
			
			switch(num6) {
			case 1:
			{
				System.out.println("輸入的是1");
			}
			case 2:{
				System.out.println("輸入的是2");
			}
			default:
			{
				System.out.println("請輸入1或2");
			}
			}
			
			//p.16
			System.out.println("請輸入a或b");
			
			BufferedReader br7 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			String str1 =br7.readLine();
			char letter1 = str1.charAt(0);
			
			switch(letter1) {
			case 'a':
			{
				System.out.println("輸入的是a");
				break;
			}
			case 'b':{
				System.out.println("輸入的是b");
				break;
			}
			default:
			{
				System.out.println("請輸入a或b");
				break;
			}
			}
			
			//p19
			System.out.println("請問你是男生嗎");
			System.out.println("請輸入Y或N");
			
			BufferedReader br8 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			String str2 =br8.readLine();
			char letter2 = str2.charAt(0);
			
			if(letter2=='Y'||letter2=='y') {
				System.out.println("你是男生啊!");
			}
			else if(letter2=='N'||letter2=='n') {
				System.out.println("妳是女生啊!");
			}
			else {
				System.out.println("請輸入Y或N");
			}
			
			//P.21
			System.out.println("請問要選哪條路線?");
			System.out.println("請輸入整數");
			
			BufferedReader br9 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			String str3 =br9.readLine();
			int res1 = Integer.parseInt(str3);
			
			char ans = (res1 == 1)?'A':'B';
			
			System.out.println("選擇了" + ans +"路線");
			
			//p.24
			for( int i1=1; i1<=5; i1++) {
				System.out.println("第"+i1+"次的迴圈");
			}
			System.out.println("迴圈結束");
			
			//p.26
			int i2=1;
			while(i2<=5) {
				System.out.println("第"+i2+"次的迴圈");
				i2++;
			}
			System.out.println("迴圈結束");
			
			//p.28
			int i3=1;
			while(i3<=5) {
				System.out.println("第"+i3+"次的迴圈");
				i3++;
			}
			while(i3<=5)
			System.out.println("迴圈結束");
			
			//p.30
			int i4,j;
			for(i4=0;i4<5;i4++) {
				for(j=0;j<3;j++) {
					System.out.println("i圈"+i4+".j是"+j);
				}
			}
			
			//p.32
			System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)");
			BufferedReader br10 = 
					new BufferedReader(new InputStreamReader(System.in));
			
			String str4 = br10.readLine();
			int res2 = Integer.parseInt(str4);
			
			for(int i5=1;i5<=10;i5++) {
				System.out.println("第"+i5+"次的處理");
				if(i5 == res2) {
					break;
				}
			}
			
			//p.34
			System.out.println("要跳過第幾次的處理呢?(1~10)");
			BufferedReader br11 =
					new BufferedReader(new InputStreamReader(System.in));
			
			String str5 = br11.readLine();
			int res3 = Integer.parseInt(str5);
			
			for(int i6=1;i6<=10;i6++) {
				if(i6==res3)
					continue;
					System.out.println("第"+i6+"次的處理。");
			}
			
			//p.39
			int[]test1;
			test1 = new int[5];
			
			test1[0]=80;
			test1[1]=60;
			test1[2]=22;
			test1[3]=50;
			test1[4]=75;
			
			for(int i7=0; i7<5;i7++) {
				System.out.println("第"+(i7+1)+"個人的分數是"+test1[i7]+"分");
			}
			
			//p.40
			int[] intArray = (int[])Array.newInstance(int.class,3);
			
			Array.set(intArray,0,123);
			Array.set(intArray,1,456);
			Array.set(intArray,2,789);
			
			System.out.println("intArray[0]="+ Array.get(intArray,0));
			System.out.println("intArray[1]="+ Array.get(intArray,1));
			System.out.println("intArray[2]="+ Array.get(intArray,2));
			
			//p.41
			int[]test2;
			test2 = new int[5];
			
			test2[0]=80;
			test2[1]=60;
			test2[2]=22;
			test2[3]=50;
			test2[4]=75;
			
			//test2[10]=75;
			
			for(int i8=0;i8<5;i8++) {
				System.out.println("第"+(i8+1)+"個人的分數是"+test2[i8]+"分");
			}
			
			//p.42
			int[]test3={80,60,22,50,75};
			
			for(int i9=0;i9<5;i9++) {
				System.out.println("第"+(i9+1)+"個人的分數是"+test3[i9]+"分");
			}
			
			//p.43
			int[]test4={80,60,22,50,75};
			
			for(int i10=0;i10<test4.length;i10++) {
				System.out.println("第"+(i10+1)+"個人的分數是"+test4[i10]+"分");
			}
			
			System.out.println("考試人數為"+test4.length+"人");
			
			//p.45
			BufferedReader br12 =
					new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("請輸入5個人的分數");
			int test5[] = new int[5];
			
			for(int i11=0;i11<test5.length;i11++) {
				String str6 = br12.readLine();
				test5[i11]=Integer.parseInt(str6);
			}
			
			for(int s=0;s<test5.length-1;s++) {
				for(int t=s+1; t<test5.length;t++) {
					if(test5[t]>test5[s]) {
						int tmp = test5[t];
						test5[t]=test5[s];
						test5[s]=tmp;
					}
				}
			}
			
			for(int i11=0;i11<test5.length;i11++) {
				System.out.println("第"+(i11+1)+"名的分數是"+test5[i11]);
			}
			
			//p.47
			BufferedReader br13 =
					new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("請輸入5個人的分數");
			Integer test6[] = new Integer[5];
			
			for(int i12=0;i12<test6.length;i12++)
			{
				String str7 = br13.readLine();
				test6[i12]=Integer.parseInt(str7);
			}
			
			Arrays.sort(test6,Collections.reverseOrder());
			
			for(int i12=0;i12<test6.length;i12++) {
				System.out.println("第"+(i12+1)+"名的分數是"+test6[i12]);
			}
			
			//p.49
			int[][]test7;
			test7 = new int[2][5];
			
			test7[0][0]=80;
			test7[0][1]=60;
			test7[0][2]=22;
			test7[0][3]=50;
			test7[0][4]=75;
			test7[1][0]=90;
			test7[1][1]=55;
			test7[1][2]=68;
			test7[1][3]=72;
			
			for(int i13=0;i13<test7[1].length;i13++) {
				System.out.println("第"+(i13+1)+"個人的國語是"+test7[0][i13]+"分");
				System.out.println("第"+(i13+1)+"個人的數學是"+test7[1][i13]+"分");
			}
		}

}
