/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class EmployeeWage {

	/**
	 * Check Employee is
	 *Present or Absent
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int)(Math.random()*2);
		System.out.println(random);
		if(random==1) {
			System.out.println("Employee is Present");
		}else
		{
			System.out.println("Employee is Absent");
		}

	}

}
