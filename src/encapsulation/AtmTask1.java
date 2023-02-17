package encapsulation;

public class AtmTask1 {

		private int Accno;
		private String Name;
		private int Password;
		
		public void setAccno(int setAccno)
		{
			this.Accno=setAccno;
		}
		public void setName(String setName)
		{
			this.Name=setName;
		}
		public void setPassword(int setPassword) 
		{
			this.Password=setPassword;
		}
		
		public int getAccno()
		{
			return Accno;
		}
		public String getName()
		{
			return Name;
		}
		public int getPassword()
		{
			return Password;
		}	
	

}
