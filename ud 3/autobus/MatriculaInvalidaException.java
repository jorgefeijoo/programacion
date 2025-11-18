/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package autobus;

/**
 *
 * @author jorgi
 */
public class MatriculaInvalidaException extends Exception {
    private String valorInvalido;
    public MatriculaInvalidaException(String valorInvalido) {
        this.valorInvalido = valorInvalido;
    }

    public String getValorInvalido() {
        return this.valorInvalido;
    }

    @Override
    public String getMessage() {
        return "La matricula es invalida. La matricula introducida fue "+this.valorInvalido;
    }

}
