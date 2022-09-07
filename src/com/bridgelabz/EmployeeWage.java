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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int)(Math.random()*2);
		System.out.println(random);
		final int WagesPerHours = 20;
		final int totalWorkingHrs = 8;
		int dailyWages = 0;
		if(random==1) {
			System.out.println("Employee is Present");
			dailyWages = WagesPerHours*totalWorkingHrs;
			System.out.println("Employee Daily Wages"+dailyWages);
		}else
		{
			System.out.println("Employee is Absent");
		}

	}

}
