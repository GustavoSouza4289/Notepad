package br.com.gustavosouza.notepad.model;

/**
 * Created by logonrm on 18/08/2017.
 */

public class Nota {

    private String id;
    private String titulo;
    private String texto;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
