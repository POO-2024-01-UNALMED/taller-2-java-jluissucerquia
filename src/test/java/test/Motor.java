package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;

	void cambiar Registro(int registro)
	{
		this.registro = registro;
	}

	void asignarTipo(String tipo)
	{
		if(tipo == "electrico" || tipo == "gasolina")
		{
			this.tipo = tipo;
		}
	}
}