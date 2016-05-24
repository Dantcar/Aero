/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programacao Orientada a Objetos - Avancada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package Control;
import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.EndCep;




public class Util {
    private static String vdia, vmes, vano;
    private static Date vhoje;
    public static ArrayList<model.EndCep> arrayEnd;
    public static String vEnd, vNum, vBairro, vCidade, vUf, vCep, vComplemento;
    /**
     * falta explicar a funcao do temCep
     */
    public static boolean temCep;
    private static ViaCEP vCEP;
    
    public Util() {
    vCEP = null;
    vEnd = null;
    vNum = null;
    vBairro = null;
    vCidade = null;
    vUf = null;
    vCep = null;
    vComplemento = null;
    }

    /**
     * Este método utilizara acesso ao banco para verificar pré-existência
     * de número de cpf durante cadastro de cliente.
     * @param cpf - do novo cliente
     * @return fakse se não existir
     * @return tre se existir 
     */
    public static boolean validaCPF2(String cpf){
        
        return true;
    }
    
    
    
    
    /**
     *
     * @param arg : Data completa
     * @return String da data no padrão dd/MM/yyyy
     */
    public static String DataFormatada(Date arg){
            String data="";
            vdia = arg.toString().substring(8,10);
            vmes = arg.toString().substring(4,7);
            vano = arg.toString().substring(24,28);
            
            if (vmes.equals("Jan")){
              vmes = "01";   
            }
            if (vmes.equals("Feb")){
              vmes = "02";   
            }
            if (vmes.equals("Mar")){
              vmes = "03";   
            }
            if (vmes.equals("Apr")){
              vmes = "04";   
            }
            if (vmes.equals("May")){
              vmes = "05";   
            }
            if (vmes.equals("Jun")){
              vmes = "06";   
            }
            if (vmes.equals("Jul")){
              vmes = "07";   
            }
            if (vmes.equals("Aug")){
              vmes = "08";   
            }
            if (vmes.equals("Sep")){
              vmes = "09";   
            }
            if (vmes.equals("Oct")){
              vmes = "10";   
            }
            if (vmes.equals("Nov")){
              vmes = "11";   
            }
            if (vmes.equals("Dec")){
              vmes = "12";   
            }
            
            data = vdia+"/"+vmes+"/"+vano;
        return data;
    }
    
    public static String reduzString(String msg){
        int tamanho = msg.length();
        if (tamanho>45){
            msg = "<html><font size='3'><strong>"+msg.substring(0, 76)
                    +"\n"+msg.substring(76, tamanho)+"</strong></font></html>";
        }
        return msg;
    }
    
    /**
	 * Converte uma String para um objeto Date. Caso a String seja vazia ou nula, 
	 * retorna null - para facilitar em casos onde formulários podem ter campos
	 * de datas vazios.
	 * @param data String no formato dd/MM/yyyy a ser formatada
	 * @return Date Objeto Date ou null caso receba uma String vazia ou nula
	 * @throws Exception Caso a String esteja no formato errado
	 */
	public static Date formataData(String data) throws Exception { 
		if (data == null || data.equals(""))
			return null;
               
                if (!ValidaCampos.validaData(data))
                        return null;
                
                Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date)formatter.parse(data);
        } catch (ParseException e) {            
            throw e;
        }
        return date;
	}
   
     /**
     * Converte uma String para um objeto Date. Caso a String seja vazia ou nula, 
     * retorna null - para facilitar em casos onde formulários podem ter campos
     * de datas vazios. 
     * @param arg0 String no formato dd/MM/yyyy a ser formatada
     * @return Date Objeto Date ou Nulo
     * @throws ParseException Caso a String esteja no formato errado
     */    
    public static Date retornaData(String arg0) throws ParseException{
        if (arg0==null|| arg0.equals(""))
            return null;
                       
        Date dt = null;
        
        try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dt = (java.util.Date)sdf.parse(arg0);
        } catch (ParseException e) {
            throw e;
        }
        return dt;
    }
                
    
    public static String DataFormatada1(Date arg){
            String data="";
            vdia = arg.toString().substring(8,10);
            vmes = arg.toString().substring(4,7);
            vano = arg.toString().substring(24,28);
            
            if (vmes.equals("Jan")){
              vmes = "01";   
            }
            if (vmes.equals("Feb")){
              vmes = "02";   
            }
            if (vmes.equals("Mar")){
              vmes = "03";   
            }
            if (vmes.equals("Apr")){
              vmes = "04";   
            }
            if (vmes.equals("May")){
              vmes = "05";   
            }
            if (vmes.equals("Jun")){
              vmes = "06";   
            }
            if (vmes.equals("Jul")){
              vmes = "07";   
            }
            if (vmes.equals("Aug")){
              vmes = "08";   
            }
            if (vmes.equals("Sep")){
              vmes = "09";   
            }
            if (vmes.equals("Oct")){
              vmes = "10";   
            }
            if (vmes.equals("Nov")){
              vmes = "11";   
            }
            if (vmes.equals("Dec")){
              vmes = "12";   
            }
            
            data = vdia+"/"+vmes+"/"+vano;
        return data;
    }
    public static String DataFormatadaS(String arg){
             if (!arg.equals(null)){
             } else {
                 return null;
            }
        
            String data;
            int inicio, fim;
            fim = arg.length();
            inicio = fim-4;
            //data = null;
            
            vdia = arg.substring(8,10);
            vmes = arg.substring(4,7);
            vano = arg.substring(inicio,fim);
            System.out.println(arg+"-"+vmes);
            if (vmes.equals("Jan")){
              vmes = "01";   
            }
            if (vmes.equals("Feb")){
              vmes = "02";   
            }
            if (vmes.equals("Mar")){
              vmes = "03";   
            }
            if (vmes.equals("Apr")){
              vmes = "04";   
            }
            if (vmes.equals("May")){
              vmes = "05";   
            }
            if (vmes.equals("Jun")){
              vmes = "06";   
            }
            if (vmes.equals("Jul")){
              vmes = "07";   
            }
            if (vmes.equals("Aug")){
              vmes = "08";   
            }
            if (vmes.equals("Sep")){
              vmes = "09";   
            }
            if (vmes.equals("Oct")){
              vmes = "10";   
            }
            if (vmes.equals("Nov")){
              vmes = "11";   
            }
            if (vmes.equals("Dec")){
              vmes = "12";   
            }
            
            data = vdia+"/"+vmes+"/"+vano;
        return data;
    }
    
     public static int DtAmericana(String arg){
         int data;
            int inicio, fim;
            fim = arg.length();
            inicio = fim-4;
            //data = null;
            
            vdia = arg.substring(8,10);
            vmes = arg.substring(4,7);
            vano = arg.substring(inicio,fim);
            System.out.println(arg+"-"+vmes);
            if (vmes.equals("Jan")){
              vmes = "01";   
            }
            if (vmes.equals("Feb")){
              vmes = "02";   
            }
            if (vmes.equals("Mar")){
              vmes = "03";   
            }
            if (vmes.equals("Apr")){
              vmes = "04";   
            }
            if (vmes.equals("May")){
              vmes = "05";   
            }
            if (vmes.equals("Jun")){
              vmes = "06";   
            }
            if (vmes.equals("Jul")){
              vmes = "07";   
            }
            if (vmes.equals("Aug")){
              vmes = "08";   
            }
            if (vmes.equals("Sep")){
              vmes = "09";   
            }
            if (vmes.equals("Oct")){
              vmes = "10";   
            }
            if (vmes.equals("Nov")){
              vmes = "11";   
            }
            if (vmes.equals("Dec")){
              vmes = "12";   
            }
            
            data = Integer.valueOf(vano+vmes+vdia);
         return data;
     }
     
     public static ArrayList retornaEndereco(String cep){
       EndCep objEndCep;
       objEndCep = new EndCep();  
       Pattern pattern = Pattern.compile("^[0-9]{5}-[0-9]{3}$");
       Matcher matcher = pattern.matcher(cep);
       String msg="";
       if (matcher.find()) {
            try {
                if (vCEP == null) {
                    vCEP = new ViaCEP(cep);
                } else {
                    if (!vCEP.getCep().equals(cep)) {
                        vCEP.buscar(cep);
                    } else {
                        JOptionPane.showMessageDialog(null, "O CEP já foi consultado, favor informar um CEP diferente!", "Aviso!", JOptionPane.WARNING_MESSAGE);
                    }
                } 
                msg = msg + "Gia: " + vCEP.getGia() +"\n";
               
                msg = msg + "Ibge: "+ vCEP.getIbge() + "\n";
                
                objEndCep.setEndereco(vCEP.getLogradouro());
                msg = msg + "Endereço: " + vCEP.getLogradouro() +"\n";
                
                objEndCep.setBairro(vCEP.getBairro());
                msg = msg + "Bairro: " + vCEP.getBairro() +"\n";
                
                objEndCep.setComplemento(vCEP.getComplemento());
                msg = msg + "Complemento: " + vCEP.getComplemento() +"\n";
                
                objEndCep.setCidade(vCEP.getLocalidade());
                msg = msg + "Localidade: " + vCEP.getLocalidade() +"\n";
                
                objEndCep.setUf(vCEP.getUf());
                vUf = vCEP.getUf();
               
                msg = msg + "UF: " + vCEP.getUf() +"\n";
                
                
            } catch (ViaCEPException ex) {
                String titulo = (ex.hasCEP() ? "Erro ao buscar o CEP " + ex.getCEP() + "!" : "Ocorreu um erro!");
                
                JOptionPane.showMessageDialog(null, ex.getMessage(), titulo, JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor informar um Cep válido!", "Aviso!", JOptionPane.WARNING_MESSAGE);
        }
       JOptionPane.showMessageDialog(null, "Funcionou!"+"\n"+msg, "Aviso!", JOptionPane.WARNING_MESSAGE);        
       
       
       return arrayEnd;
     }
     
     public static boolean VerificaEndereco(String cep){
       Pattern pattern = Pattern.compile("^[0-9]{5}-[0-9]{3}$");
       Matcher matcher = pattern.matcher(cep);
       String msg="";
       if (matcher.find()) {
            try {
                if (vCEP == null) {
                    vCEP = new ViaCEP(cep);
                } else {
                    if (!vCEP.getCep().equals(cep)) {
                        vCEP.buscar(cep);
                    } 
                } 
               
               //msg = msg + "Endereço: " + vCEP.getLogradouro() +"\n";
               //msg = msg + "Bairro: " + vCEP.getBairro() +"\n"; 
               //msg = msg + "Localidade: " + vCEP.getLocalidade() +"\n"; 
               //msg = msg + "UF: " + vCEP.getUf() +"\n"; 
                
                vEnd = vCEP.getLogradouro();
                vBairro = vCEP.getBairro();            
                vCidade = vCEP.getLocalidade();
                vUf = vCEP.getUf();
                  
            } catch (ViaCEPException ex) {
                String titulo = (ex.hasCEP() ? "Erro ao buscar o CEP " + ex.getCEP() + "!" : "Ocorreu um erro!");
                JOptionPane.showMessageDialog(null, ex.getMessage(), titulo, JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html><font face="+"Georgia "+"size="+"5 "+"color="+"Purple"+">Favor informar um Cep válido!</font></html>", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
       }
     
       // JOptionPane.showMessageDialog(null, "Funcionou!"+"\n"+msg, "Aviso!", JOptionPane.WARNING_MESSAGE);        
       
       return true;
     }
}


