/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInput;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 * Note: this class could be static. This will save typing time. 
 */
public class UserInput {
    
	//Fields:___________________________________________

    private final Scanner input;
    private ArrayList<String> inputList; 

	//Constructors:_____________________________________

	public UserInput() {
		// TODO Auto-generated constructor stub
                this.input = new Scanner(System.in);
                this.inputList = new ArrayList<>();
	}//End C:*
        
        
	//When a number with a decimal is desirable
	public double promptDoubleUser(){
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
	public String promptStringUser(){
		boolean continueInput = true;
		String userStr = " ";

		do{
			try{

				System.out.println("Enter a word please");
				userStr = input.next();
                                userStr = userStr.toLowerCase();
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
        
        public ArrayList<String> promptStringSentinel(){
		boolean continueInput = true;
		String userStr;

		do{
			try{
                                
				System.out.println("Enter multiple words please. Type end to finish");
				userStr = input.next();
                                userStr = userStr.toLowerCase();
                                if(userStr.equals("end")){
                                    continueInput = false;
                                }//End I:*
                                inputList.add(userStr);
				
			}//End TRY:*
			catch (InputMismatchException ex){
				System.out.println("Not a sequence of letters!");
				input.nextLine();
			}//End C:*

		}//End D:*
		while(continueInput);

		return inputList;
	}//End M:*


	//When looking for whole numbers
	public int promptIntUser(){
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
			}//End CAT:*

		}//End D:*
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
				int uInput = this.promptIntUser();
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
			double uInput = this.promptDoubleUser();
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
			int ask = this.promptIntUser();
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
