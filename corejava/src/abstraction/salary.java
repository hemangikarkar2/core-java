package abstraction;

class salary  extends Employee{
		 private double salary;
		
		 public salary(String n, String add, int id,double salary) {
			super(n, add, id);
			setSalary(salary);
			// TODO Auto-generated constructor stub
		}
		
		public void mailCheck() {
			
			System.out.println("[salary]:-Within mailCheck of Salary class ");
		      System.out.println("[salary]:-Salary of Mailing check to " + getName()
		      + " with salary :- " +salary);
		 
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double newsalary) {
			if(newsalary >0.0) {
				salary = newsalary;
			}
			
		}
		public void ComputePay(double newsalary) {
			System.out.println("[salary] :-Computing salary for"+getName());
			newsalary = (salary/12);
			System.out.println("[salary] :-Computing salary for"+newsalary);
			
		}
		
		

	}


