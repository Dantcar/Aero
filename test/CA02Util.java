/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */


import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Control.Util;



/**
 *
 * @author deciodecarvalho
 */
public class CA02Util {
    private static String dt;
    public CA02Util() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    //dt = new Date();
    dt = "23/21/2016";
    
    }
    
    @Test
    public void formataDataTeste() throws Exception{
       
        assertNotNull(Util.formataData(dt));
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
