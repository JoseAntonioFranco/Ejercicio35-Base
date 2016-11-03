import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que implementa el listener de los botones del Buscaminas.
 * De alguna manera tendrá que poder acceder a la ventana principal.
 * Se puede lograr pasando en el constructor la referencia a la ventana.
 * Recuerda que desde la ventana, se puede acceder a la variable de tipo ControlJuego
 * @author jesusredondogarcia
 *
 */
public class ActionBoton implements ActionListener{

	VentanaPrincipal ventana;
	ControlJuego juego;
	int i;
	int j;
	

	
	
	public ActionBoton(VentanaPrincipal ventana, ControlJuego juego, int i, int j) {
		super();
		this.ventana = ventana;
		this.juego = juego;
		this.i = i;
		this.j = j;
	}




	/**
	 *Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(juego.abrirCasilla(i, j)) {
			ventana.mostrarNumMinasAlrededor(i, j);
			ventana.actualizarPuntuacion();
			if (juego.esFinJuego()) {
				ventana.mostrarFinJuego(false);
			}
		}else {
			ventana.mostrarFinJuego(true);
		}
	}

}
