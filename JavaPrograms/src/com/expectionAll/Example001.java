package com.expectionAll;

public class Example001 {

	public static void main(String[] args) {


		try {
			
			
			String str = null;
			
			int length = str.length();
			
			System.out.println(length);
			String s = "abc";
			int i = Integer.parseInt(s);
			System.out.println(i);

			int[] a = new int[2];

			a[0] = 2;
			a[1] = 1;
			a[2] = 2;
			System.out.println(a[2]);
			
			int n = 3;

			int m = 0;

			int ans = n / m;
			System.out.println(ans);

			System.out.println("*******************");

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (Throwable e) {
			System.out.println(e.getCause());
		}

//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//		catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
//		finally {
//
//			System.out.println("I am in");
//
//			System.out.println("I am in");
//			System.out.println("I am in");
//		}

	}

}
