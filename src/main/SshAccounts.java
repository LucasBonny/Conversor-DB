package main;

public class SshAccounts {
	
	private String id;
	private String byid;
	private String categoriaid;
	private String limite;
	private String bycredit;
	private String login;
	private String senha;
	private String mainid;
	private String expira;
	private String lastview;
	private String status;
	private String valormensal;
	private String notificado;
	private String whatsapp;
	private String uuid;
	private String deviceid;
	
	public SshAccounts(String id, String byid, String categoriaid, String limite, String bycredit, String login,
			String senha, String mainid, String expira, String lastview, String status, String valormensal,
			String notificado, String whatsapp, String uuid, String deviceid) {
		this.id = id;
		this.byid = byid;
		this.categoriaid = categoriaid;
		this.limite = limite;
		this.bycredit = bycredit;
		this.login = login;
		this.senha = senha;
		this.mainid = mainid;
		this.expira = expira;
		this.lastview = lastview;
		this.status = status;
		this.valormensal = valormensal;
		this.notificado = notificado;
		this.whatsapp = whatsapp;
		this.uuid = uuid;
		this.deviceid = deviceid;
	}
	
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getByid() {
		return byid;
	}
	public void setByid(String byid) {
		this.byid = byid;
	}
	public String getCategoriaid() {
		return categoriaid;
	}
	public void setCategoriaid(String categoriaid) {
		this.categoriaid = categoriaid;
	}
	public String getLimite() {
		return limite;
	}
	public void setLimite(String limite) {
		this.limite = limite;
	}
	public String getBycredit() {
		return bycredit;
	}
	public void setBycredit(String bycredit) {
		this.bycredit = bycredit;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	public String getExpira() {
		return expira;
	}
	public void setExpira(String expira) {
		this.expira = expira;
	}
	public String getLastview() {
		return lastview;
	}
	public void setLastview(String lastview) {
		this.lastview = lastview;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "INSERT INTO `ssh_accounts` (`id`, `byid`, `categoriaid`, `limite`,"
				+ " `bycredit`, `login`, `senha`, `mainid`, `expira`, `lastview`,"
				+ " `status`, `valormensal`, `whatsapp`, `deviceid`, `deviceativo`, "
				+ "`uuid`, `notificado`) VALUES "
				+ id + "," + byid + "," + categoriaid + "," + limite + "," 
				+ bycredit + "," + login + "," + senha + "," + mainid + "," 
				+ expira + "," + lastview + "," + status + ","
				+ valormensal + "," + whatsapp + ", NULL, NULL," + uuid + ", 'nao');";
	}
	
}
