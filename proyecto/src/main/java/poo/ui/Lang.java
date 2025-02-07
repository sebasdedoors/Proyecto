package poo.ui;


/**
 * La clase {@code Lang} define un conjunto de mensajes utilizados en la interfaz
 * de línea de comandos (CLI) para la gestión de una biblioteca virtual.
 * Esta clase sirve como base para definir mensajes en diferentes idiomas.
 *
 *     <li>{@code EXIT} - Mensaje de despedida al salir del sistema.</li>
 *     <li>{@code MENU} - Texto del menú principal.</li>
 *     <li>{@code INVALID} - Mensaje para opciones inválidas.</li>
 *     <li>{@code ADDBOOK} - Mensaje para solicitar el nombre del libro a agregar.</li>
 *     <li>{@code ADDUSER} - Mensaje para solicitar el nombre de un nuevo usuario.</li>
 *     <li>{@code NOBOOKS} - Mensaje cuando no hay libros en la lista.</li>
 *     <li>{@code NOUSERS} - Mensaje cuando no hay usuarios en la lista.</li>
 *     <li>{@code GOODBOOK} - Confirmación de que un libro fue agregado con éxito.</li>
 *     <li>{@code ERRBOOK} - Mensaje de error al agregar un libro.</li>
 *     <li>{@code GENERBOOK} - Solicitud del género del libro.</li>
 *     <li>{@code AGEBOOK} - Solicitud de la edad recomendada para el libro.</li>
 *     <li>{@code STATUSUSER} - Solicitud del estado del usuario.</li>
 *     <li>{@code GOODUSER} - Confirmación de que un usuario fue agregado con éxito.</li>
 *     <li>{@code ERRUSER} - Mensaje de error al agregar un usuario.</li>
 *     <li>{@code USER} - Etiqueta para el nombre del usuario.</li>
 *     <li>{@code STATUS} - Etiqueta para el estado del usuario.</li>
 *     <li>{@code TITLE} - Etiqueta para el título del libro.</li>
 *     <li>{@code GENER} - Etiqueta para el género del libro.</li>
 *     <li>{@code AGE} - Etiqueta para la edad recomendada del libro.</li>
 * </ul>
 *
 * <p>Esta clase está diseñada para ser extendida por clases específicas de idiomas,
 * que proporcionan valores concretos para estos mensajes en diferentes lenguajes.</p>
 *
 */
public class Lang {
    protected String EXIT;
    protected String MENU;
    protected String INVALID;
    protected String ADDBOOK;
    protected String ADDUSER;
    protected String NOBOOKS;
    protected String NOUSERS;
    protected String GOODBOOK;
    protected String ERRBOOK;
    protected String GENERBOOK;
    protected String AGEBOOK;
    protected String STATUSUSER;
    protected String GOODUSER;
    protected String ERRUSER;
    protected String USER;
    protected String STATUS;
    protected String TITLE;
    protected String GENER;
    protected String AGE;
}
