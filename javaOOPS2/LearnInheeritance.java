package javaOOPS2;

public class LearnInheeritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Samsung s10 = new Samsung();
//		s10.PlayGames();
		
//		Apple s1 = new Apple();
//		s1.PlayGames(4);
		
		MobilePhone obj = new MobilePhone();
		obj.PlayGames();
		obj.PlayGames(4);
		obj.PlayGames();
	     }
	}
		class Samsung extends MobilePhone{
			void PlayGames() {
				System.out.println("samsung played");
			}
		}
		class Apple extends MobilePhone{
				
		}
		
		class MobilePhone{
			boolean hasHeadPhoneJack;
			String oses;
			int price;
			int dimen;
			void PlayGames() {
				System.out.println("Mobile played");
			}
			
			void PlayGames(int x) {
				for(int i = 0; i<x;i++) {
				System.out.println("Mobile played for "+ i);
			}
		}
		}
