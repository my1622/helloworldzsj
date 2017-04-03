
public abstract class BaseOper {
	private String sInput;

	private int sResut;
	
	public String getsInput() {
		return sInput;
	}
	public void setsInput(String sInput) {
		this.sInput = sInput;
	}
	public int getisResut() {
		return sResut;
	}
	public void setiOutput(int sResut) {
		this.sResut = sResut;
	}
	public abstract int lxtos();

}
