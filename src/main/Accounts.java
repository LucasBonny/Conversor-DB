package main;

public class Accounts {

	private String id;
	private String nome;
	private String contato;
	private String login; 
	private String token; 
	private String mb; 
	private String senha; 
	private String byid; 
	private String mainid; 
	private String accesstoken; 
	private String valorusuario; 
	private String valorrevenda; 
	private String idtelegram; 
	private String tempo; 
	private String tokenvenda; 
	private String acesstokenpaghiper; 
	private String formadepag; 
	private String tokenpaghiper; 
	private String whatsapp;
	

	public Accounts(String id, String nome, String contato, String login, String token, String mb, String senha,
			String byid, String mainid, String accesstoken, String valorusuario, String valorrevenda, String idtelegram,
			String tempo, String tokenvenda, String acesstokenpaghiper, String formadepag, String tokenpaghiper,
			String whatsapp) {
		this.id = id;
		this.nome = nome;
		this.contato = contato;
		this.login = login;
		this.token = token;
		this.mb = mb;
		this.senha = senha;
		this.byid = byid;
		this.mainid = mainid;
		this.accesstoken = accesstoken;
		this.valorusuario = valorusuario;
		this.valorrevenda = valorrevenda;
		this.idtelegram = idtelegram;
		this.tempo = tempo;
		this.tokenvenda = tokenvenda;
		this.acesstokenpaghiper = acesstokenpaghiper;
		this.formadepag = formadepag;
		this.tokenpaghiper = tokenpaghiper;
		this.whatsapp = whatsapp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getMb() {
		return mb;
	}
	public void setMb(String mb) {
		this.mb = mb;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getByid() {
		return byid;
	}
	public void setByid(String byid) {
		this.byid = byid;
	}
	public String getMainid() {
		return mainid;
	}
	public void setMainid(String mainid) {
		this.mainid = mainid;
	}
	public String getAccesstoken() {
		return accesstoken;
	}
	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}
	public String getValorusuario() {
		return valorusuario;
	}
	public void setValorusuario(String valorusuario) {
		this.valorusuario = valorusuario;
	}
	public String getValorrevenda() {
		return valorrevenda;
	}
	public void setValorrevenda(String valorrevenda) {
		this.valorrevenda = valorrevenda;
	}
	public String getIdtelegram() {
		return idtelegram;
	}
	public void setIdtelegram(String idtelegram) {
		this.idtelegram = idtelegram;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public String getTokenvenda() {
		return tokenvenda;
	}
	public void setTokenvenda(String tokenvenda) {
		this.tokenvenda = tokenvenda;
	}
	public String getAcesstokenpaghiper() {
		return acesstokenpaghiper;
	}
	public void setAcesstokenpaghiper(String acesstokenpaghiper) {
		this.acesstokenpaghiper = acesstokenpaghiper;
	}
	public String getFormadepag() {
		return formadepag;
	}
	public void setFormadepag(String formadepag) {
		this.formadepag = formadepag;
	}
	public String getTokenpaghiper() {
		return tokenpaghiper;
	}
	public void setTokenpaghiper(String tokenpaghiper) {
		this.tokenpaghiper = tokenpaghiper;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	@Override
	public String toString() {
		
		return "INSERT INTO `accounts` (`id`, `nome`, `contato`, `login`, "
				+ "`token`, `mb`, `senha`, `byid`, `mainid`, `accesstoken`"
				+ ", `valorusuario`, `valorrevenda`, `idtelegram`, `tempo`,"
				+ " `tokenvenda`, `acesstokenpaghiper`, `formadepag`, "
				+ "`tokenpaghiper`, `whatsapp`) VALUES "
				+ id + "," + nome + "," + contato + "," + login + "," 
				+ token + "," + mb + "," + senha + "," + byid + "," 
				+ mainid + "," + accesstoken + "," + valorusuario + ","
				+ valorrevenda + "," + idtelegram + "," + tempo + ","
				+ tokenvenda + "," + acesstokenpaghiper + "," + formadepag + "," 
				+ tokenpaghiper + "," + whatsapp + ");";
		
		} 
	
	
}
