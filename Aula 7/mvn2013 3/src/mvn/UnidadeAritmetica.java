package mvn;

public class UnidadeAritmetica {
	
	/*** Descricao: Registrador de dado de entrada 1 */
	public static final int					IN1						= 0;
	
	/*** Descricao: Registrador de dado de entrada 2 */
	public static final int					IN2						= 1;
	
	/*** Descricao: Registrador de resultado */
	public static final int					OUT						= 2;
	
	/*** Descricao: Registrador de dado de entrada 1 */
	private static final String			REG_IN_1					= "IN1";
	
	/*** Descricao: Registrador de dado de entrada 2 */
	private static final String			REG_IN_2					= "IN2";
	
	/*** Descricao: Registrador de resultado */
	private static final String			REG_OUT						= "OUT";
	
	private static final String[]		REGISTERS_UA				= new String[]{
	REG_IN_1, REG_IN_2, REG_OUT};	
	
	/*** Registradores temporarios */
	private Registradores	registers;
	

	
	public UnidadeAritmetica() {
		registers = new Registradores(REGISTERS_UA.length);
	}
	
	public void salvaDado1(int word) {
		registers.getRegister(IN1).setValue(word);
	}
	
	public void salvaDado2(int word) {
		registers.getRegister(IN2).setValue(word);
	}
	
	public void soma() {
		registers.getRegister(OUT).setValue(registers.getRegister(IN1).toInt() + registers.getRegister(IN2).toInt());
	}
	
	public void subtrai() {
		registers.getRegister(OUT).setValue(registers.getRegister(IN1).toInt() - registers.getRegister(IN2).toInt());
	}
	
	public void multiplica() {
		registers.getRegister(OUT).setValue(registers.getRegister(IN1).toInt() * registers.getRegister(IN2).toInt());
	}
	
	public void divide() {
		registers.getRegister(OUT).setValue(registers.getRegister(IN1).toInt() / registers.getRegister(IN2).toInt());
	}
	
	public int getResultado() {
		return registers.getRegister(OUT).toInt();
	}
}