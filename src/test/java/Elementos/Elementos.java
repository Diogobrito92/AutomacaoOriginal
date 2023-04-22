package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.xpath(
			"/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By btnParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoCelular = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCPF = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p > span:nth-child(1)");

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getBtnParavoce() {
		return btnParaVoce;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoCelular() {
		return campoCelular;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCPF() {
		return campoCPF;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}

	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}
}
