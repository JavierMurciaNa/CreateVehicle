package ModelsAndParts;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class Motors {
    String name;
    String type;
    int horsepw;
    float weigth;

    public Motors(String name, String type, int horsepw, float weigth) {
        this.name = name;
        this.type = type;
        this.horsepw = horsepw;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsepw() {
        return horsepw;
    }

    public void setHorsepw(int horsepw) {
        this.horsepw = horsepw;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }
    
}
