
public class EncapsulationExample {
	
	/*
	 * Encapsultion is the process of wraping data into single unit and 
	 * restrict the access of object components to other classes
	 * through access modifiers,
	 * Ex: POJO class 
	 * 
	 */
	
	
	private int datamember1;
	private String datammber2;
	private double datamember3;
	private float datamember4;
	
	public int getDatamember1() {
		return datamember1;
	}
	public void setDatamember1(int datamember1) {
		this.datamember1 = datamember1;
	}
	public String getDatammber2() {
		return datammber2;
	}
	public void setDatammber2(String datammber2) {
		this.datammber2 = datammber2;
	}
	public double getDatamember3() {
		return datamember3;
	}
	public void setDatamember3(double datamember3) {
		this.datamember3 = datamember3;
	}
	public float getDatamember4() {
		return datamember4;
	}
	public void setDatamember4(float datamember4) {
		this.datamember4 = datamember4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + datamember1;
		long temp;
		temp = Double.doubleToLongBits(datamember3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(datamember4);
		result = prime * result
				+ ((datammber2 == null) ? 0 : datammber2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
 			return false;
		if (getClass() != obj.getClass())
			return false;
		EncapsulationExample other = (EncapsulationExample) obj;
		if (datamember1 != other.datamember1)
			return false;
		if (Double.doubleToLongBits(datamember3) != Double
				.doubleToLongBits(other.datamember3))
			return false;
		if (Float.floatToIntBits(datamember4) != Float
				.floatToIntBits(other.datamember4))
			return false;
		if (datammber2 == null) {
			if (other.datammber2 != null)
				return false;
		} else if (!datammber2.equals(other.datammber2))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EncapsulationExample [datamember1=" + datamember1
				+ ", datammber2=" + datammber2 + ", datamember3=" + datamember3
				+ ", datamember4=" + datamember4 + "]";
	}
	
	
	
	

}
