package pack3;

class pixel extends point {
	private String coul;
	public pixel(double abs, double ord ,String coul) {
		super(abs, ord);
		nomObjet="pixel";
		this.coul=coul;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"couleur="+this.coul;
	}

}
