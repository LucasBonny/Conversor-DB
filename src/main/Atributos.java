package main;

public class Atributos {
	private String id;
	private String valor;
	private String categoriaid;
	private String userid;
	private String byid;
	private String limite;
	private String limitetest;
	private String tipo;
	private String expira;
	private String subrev;
	private String suspenso;
	private String valormensal;
	private String notificado;
	
	public Atributos(String id, String valor, String categoriaid, String userid, String byid, String limite,
			String limitetest, String tipo, String expira, String subrev, String suspenso, String valormensal,
			String notificado) {
		this.id = id;
		this.valor = valor;
		this.categoriaid = categoriaid;
		this.userid = userid;
		this.byid = byid;
		this.limite = limite;
		this.limitetest = limitetest;
		this.tipo = tipo;
		this.expira = expira;
		this.subrev = subrev;
		this.suspenso = suspenso;
		this.valormensal = valormensal;
		this.notificado = notificado;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getCategoriaid() {
		return categoriaid;
	}
	public void setCategoriaid(String categoriaid) {
		this.categoriaid = categoriaid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getByid() {
		return byid;
	}
	public void setByid(String byid) {
		this.byid = byid;
	}
	public String getLimite() {
		return limite;
	}
	public void setLimite(String limite) {
		this.limite = limite;
	}
	public String getLimitetest() {
		return limitetest;
	}
	public void setLimitetest(String limitetest) {
		this.limitetest = limitetest;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getExpira() {
		return expira;
	}
	public void setExpira(String expira) {
		this.expira = expira;
	}
	public String getSubrev() {
		return subrev;
	}
	public void setSubrev(String subrev) {
		this.subrev = subrev;
	}
	public String getSuspenso() {
		return suspenso;
	}
	public void setSuspenso(String suspenso) {
		this.suspenso = suspenso;
	}
	public String getValormensal() {
		return valormensal;
	}
	public void setValormensal(String valormensal) {
		this.valormensal = valormensal;
	}
	public String getNotificado() {
		return notificado;
	}
	public void setNotificado(String notificado) {
		this.notificado = notificado;
	}
	@Override
	public String toString() {
		
		return "INSERT INTO `atribuidos` (`id`, `valor`, `categoriaid`, "
				+ "`userid`, `byid`, `limite`, `limitetest`, `tipo`, `expira`, "
				+ "`subrev`, `suspenso`, `valormensal`, `notificado`) VALUES "
				+ id + "," + valor + "," + categoriaid + "," + userid + "," 
				+ byid + "," + limite + "," + limitetest + "," + tipo + "," 
				+ expira + "," + subrev + "," + suspenso + ","
				+ valormensal + "," + notificado + ";";
	}
	
	

}
