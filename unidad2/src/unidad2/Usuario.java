/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author Wonka
 */
public class Usuario {
    String nombre;
    String apellido;
    int edad;
    String hobby;
    String editorCod;
    String sistemOp;



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setEditorCod(String editorCod) {
        this.editorCod = editorCod;
    }

    public void setSistemOp(String sistemOp) {
        this.sistemOp = sistemOp;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", hobby='" + hobby + '\'' +
                ", editorCod='" + editorCod + '\'' +
                ", sistemOp='" + sistemOp + '\'' +
                '}';
    }
}
