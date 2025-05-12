package decorator;

public class Queijo extends IngredienteDecorator {

	public Queijo(Ingrediente ingrediente) {
		super(ingrediente);
	}
	
	public Queijo() {
		super(null);
	}
	
	@Override
	public String imprimeIngrediente() {
		String ingredientes = "Queijo";
		
		if(super.ingrediente != null)
			ingredientes += ", " + super.ingrediente.imprimeIngrediente();
		
		return ingredientes;
	}
	
	@Override
	public double valorDoIngrediente() {
		double valor = 0.75;
		
		if(super.ingrediente != null)
			valor += super.ingrediente.valorDoIngrediente();
		
		return valor;
	}

}
