public class Class implements Jugador {

	public void getPuntos() {
		return this._puntos;
	}

	public void setPuntos(Object aPuntos) {
		this._puntos = aPuntos;
	}

	public void ganarPuntos(int aPuntos) {
		throw new UnsupportedOperationException();
	}

	public void getExperiencia() {
		return this._experiencia;
	}

	public void setExperiencia(Object aExperiencia) {
		this._experiencia = aExperiencia;
	}

	public void ganarExperiencia(int aExperiencia) {
		throw new UnsupportedOperationException();
	}
}