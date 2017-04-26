
public class ObjMochila {
	double pi;
	double vi;
	Integer cd;
	
	
	
	public ObjMochila(double pi, double vi, Integer cd) {
		this.pi = pi;
		this.vi = vi;
		this.cd = cd;
	}

	/**
	 * @return the pi
	 */
	public double getPi() {
		return pi;
	}

	/**
	 * @param pi the pi to set
	 */
	public void setPi(double pi) {
		this.pi = pi;
	}
	/**
	 * @return the vi
	 */
	public double getVi() {
		return vi;
	}
	/**
	 * @param vi the vi to set
	 */
	public void setVi(double vi) {
		this.vi = vi;
	}
	/**
	 * @return the cd
	 */
	public Integer getCd() {
		return cd;
	}
	/**
	 * @param cd the cd to set
	 */
	public void setCd(Integer cd) {
		this.cd = cd;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Objeto  [peso=" + pi + ", valor=" + vi + ", cantidad=" + cd + "]";
	}
	
}
