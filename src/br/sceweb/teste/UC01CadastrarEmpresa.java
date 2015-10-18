package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	@BeforeClass
	public static void etUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		//89.424.232/001-80
		empresa.setNomeDaEmpresa("ACME");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("ACME Inc");
		empresa.setEndereco("National St");
		empresa.setTelefone("5551234");

	}
	/**
	 * obj - verificar o comportamento do sistema na inclusão de uma empresa
	 * com sucesso
	 * */
	@Test
	public void CT01UC01FBCadastra_com_sucesso() {
		assertEquals(1, empresaDAO.adiciona(empresa));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
