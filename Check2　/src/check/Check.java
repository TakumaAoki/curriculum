package check;

import constants.Constants;

public class Check extends Constants{

	public static void main(String[] args) {

		String firstName = "青木";
		String lastName = "拓磨";
		System.out.println(printName("printNameメソッド　→　" + firstName, lastName));


		Pet pet = new Pet(CHECK_CLASS_JAVA, CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robo = new RobotPet(CHECK_CLASS_R2D2, CHECK_CLASS_LUKE);
		robo.introduce();

	}

	public static String printName(String firstName, String lastName) {

		return firstName + lastName;

	}



}
