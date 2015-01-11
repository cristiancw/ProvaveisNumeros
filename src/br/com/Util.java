package br.com;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Utilitários.
 * 
 * @author Cristiancw
 * 
 */
public class Util {

	private final static String DIA_MES_ANO_4 = "dd/MM/yyyy";

	/**
	 * Transforma um objeto <code>LocalDate</code> em uma <code>String</code> amigavél com o padrão comum. Ex.: 01/01/2001.
	 * 
	 * @param data
	 * @return uma string com a data formatada
	 */
	public static String format(LocalDate data) {
		DateTimeFormatter format = DateTimeFormat.forPattern(DIA_MES_ANO_4);
		return data.toString(format);
	}

	/**
	 * Transforma os números passados em um objeto <code>LocalDate</code> em uma <code>String</code> amigavél com o padrão comum. Ex.: 01/01/2001.
	 * 
	 * @param dia
	 * @param mes
	 * @param ano
	 * @return uma string com a data formatada
	 */
	public static String format(int dia, int mes, int ano) {
		LocalDate data = new LocalDate(ano, mes, dia);
		DateTimeFormatter format = DateTimeFormat.forPattern(DIA_MES_ANO_4);
		return data.toString(format);
	}

	/**
	 * Transforma um objeto <code>String</code> no padrão amigavél dd/MM/yyyy em um <code>LocalDate</code>.
	 * 
	 * @param data
	 * @return um objeto LocalDate
	 */
	public static LocalDate format(String data) {
		DateTimeFormatter format = DateTimeFormat.forPattern(DIA_MES_ANO_4);
		return format.parseLocalDate(data);
	}
}
