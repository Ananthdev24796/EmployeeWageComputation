/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class EmployeeWage {

	/**UC1
	 * Check Employee is
	 *Present or Absent
	 */
	
  /*UC2
   * Calculate Daily
   *Employee Wage - Assume Wage per Hour is 20 - Assume Full Day Hour is 8
   */
	
	/*UC3
	 * Add Part time
	 *Employee & Wage
	 * 
	 */
	/*uc4
	 * partTimeWorkingHrs
	 */
	/*
	 * UC5
	 * Calculating Wages
	 *for a Month
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int WagesPerHours = 20;
		final int totalWorkingHrs = 8;
		int dailyWages = 0;
		int partTimeWorkingHrs = 4;
		 int totalWrkDays =20;
		 int totalWages=0;
		 for(int day = 1 ; day<=totalWrkDays;day++) {
		int random = (int)(Math.random()*3);
		System.out.println(random);
		
		switch (random) {
		case 1:
			System.out.println("Employee is Present");
			dailyWages = WagesPerHours*totalWorkingHrs;
			System.out.println("Employee Daily Wages"+dailyWages);
			totalWages = totalWages+dailyWages;
			System.out.println(totalWages);
			break;
		case 2:
			System.out.println("Employee is Present");
			dailyWages = WagesPerHours*partTimeWorkingHrs;
			System.out.println("PartTimeEmployee Daily Wages"+dailyWages);
			totalWages = totalWages+dailyWages;
			System.out.println(totalWages);
			break;
			
		case 0:
			System.out.println("Employee is Absent");
		}
		

	}
	}

}
