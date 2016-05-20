/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */


import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import Control.ValidaCampos;



public class CA01ValidaCampos {
	static String cliente, CEP,CEP_ERRO;
	static boolean arg0,arg1,arg2;
        //static String nascimento;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	                                                                                                                                                                                                       
	@Test
	public void CT01UC01FB_Valida_Cliente() {
            cliente="Décio";
            //assertEquals(1,convenioDAO.adiciona(convenio))
            assertEquals(true,ValidaCampos.validaNome(cliente));
        }
	
        @Test
	public void CT01UC01FB_Valida_CEP() {
            CEP = "02845-080";
            CEP_ERRO = "I04211-040";
            assertEquals(true,ValidaCampos.validaCEP(CEP));
            assertEquals(false,ValidaCampos.validaCEP(CEP_ERRO));
	}
	
        @Test
	public void CT01UC01FB_Valida_Status() {
            arg0 = false;
            arg1 = false;
            arg2 = true;
            
            assertEquals(true,ValidaCampos.validaStatus(arg0, arg1, arg2));
            
	}

	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}



}


