//Example of Abstract -class
package abstraction;

public  abstract class Employee {
	
		private String name,address;
		private int id;
		
		public Employee(String n, String add,int id )
		{
			System.out.println("Construct Employee ");
			this.name= n;
			this.address=add;
			this.id=id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", address=" + address + "]";
		}
		 public void mailCheck() {
		      System.out.println("Employee Mailing a check to " + this.name + "and " + this.address);
		   }
		
	}

