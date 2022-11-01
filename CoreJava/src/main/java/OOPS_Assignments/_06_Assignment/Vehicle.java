package assignment_6;

public abstract class Vehicle {
  public String regNumber="APG536389";
 public Vehicle(String regNumber) {
	
	
}

public abstract int getNumberOfWheels();

 public String getRegNumber() {
		return regNumber;
	}
 
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Vehicle other = (Vehicle) obj;
//	if (regNumber == null) {
//		if (other.regNumber != null)
//			return false;
//	} else if (!regNumber.equals(other.regNumber))
//		return false;
//	return true;
//}




}


