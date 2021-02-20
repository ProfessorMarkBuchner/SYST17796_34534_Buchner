/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 * Note: this class could be static. This will save typing time. 
 */
class UserInput {
    
	//Fields:___________________________________________


	//Constructors:_____________________________________

	public UserInput() {
		// TODO Auto-generated constructor stub
	}//End C:*


	public UserInput(UserInput input) {
		// TODO Auto-generated constructor stub
	
	}//End C:*

	//When a number with a decimal is desirable
	public double promptDoubleUser(Scanner input){
		boolean continueInput = true;
		double userNum = 0.0;

		do{
			try{

				System.out.println("Enter a double like 3.0");
				userNum = input.nextDouble();
				continueInput = false;
			}
			catch (InputMismatchException ex){
				System.out.println("Not a double!");
				input.nextLine();
			}

		}
		while(continueInput);


		return userNum;
	}//End M:*


	//For word use cases
	public String promptStringUser(Scanner input){
		boolean continueInput = true;
		String userStr = " ";

		do{
			try{

				System.out.println("Enter a word please");
				userStr = input.next();
				continueInput = false;
			}
			catch (InputMismatchException ex){
				System.out.println("Not a sequence of letters!");
				input.nextLine();
			}//End C:*

		}//End D:*
		while(continueInput);

		return userStr;
	}//End M:*


	//When looking for whole numbers
	public int promptIntUser(Scanner input){
		boolean continueInput = true;
		int userNum = 0;

		do{
			try{

				System.out.println("Enter a integer like 3");
				userNum = input.nextInt();
				continueInput = false;
			}
			catch (InputMismatchException ex){
				System.out.println("Not a Integer!");
				input.nextLine();
			}

		}
		while(continueInput);


		return userNum;

	}//End M:*

	
	//Validate the users integer that they typed in the prompt
		public int getWholeNums(){
			//Setup
			int result = 0;
			boolean flag = true;
			//Repeat
			while(flag){
				//Ask
				int uInput = this.promptIntUser(new Scanner(System.in));
				//Check
				if(uInput > 0){
					result = uInput;
					flag = false;
				}//End I:*
			}//End W:*
			//Copy
			return result;
		}//End M:*



	//When the decimal number needs to be non-negative 
	public double getWholeDubs(){
		//Setup
		double result = 0;
		boolean flag = true;
		//Repeat
		while(flag){
			//Ask
			double uInput = this.promptDoubleUser(new Scanner(System.in));
			//Check
			if(uInput > 0){
				result = uInput;
				flag = false;
			}//End I:*
		}//End W:*
		//Copy
		return result;
	}//End M:*


	//Need: name, id, actype, annual rate, local date
	//Make sure the users number is either 1 or 2 (only options).
	public int validateAcType(){
		//Setup
		int uChoice = 0;
		boolean flag = true;
		//Repeat
		while(flag){
			//Ask
			int ask = this.promptIntUser(new Scanner(System.in));
			//Check
			if(ask >=1 && ask <= 2){
				uChoice = ask;
				flag = false;
			}//End I:*
		}//End W:*
		//Copy
		return uChoice;
	}//End M:*


}//End Class:*
