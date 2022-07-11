package randomClass;

import java.util.Random;

public class RandomEmailGenerator {

	public static void main(String[] args) {

		Random random = new Random();
		int randomNumber= random.nextInt(100);
		String listOfCharacters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int randomStringLength=10;
		int randomInt;
		StringBuffer randomString = new StringBuffer();
		char ch;
		for (int i = 0; i < randomStringLength; i++) {
			randomInt = random.nextInt(listOfCharacters.length());
			ch = listOfCharacters.charAt(randomInt);
			randomString.append(ch);
		}
		System.out.println(randomString.toString()+ randomNumber +"@email.com" );
		
	}

}
