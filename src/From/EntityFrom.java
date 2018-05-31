/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package From;

/**
 *
 * @author Van-Giang
 */
public class EntityFrom {
    private String name ;
    private String image ;
    private String pirce ;

    public EntityFrom() {
    }

    public EntityFrom(String name, String image, String pirce) {
        this.name = name;
        this.image = image;
        this.pirce = pirce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPirce() {
        return pirce;
    }

    public void setPirce(String pirce) {
        this.pirce = pirce;
    }

    @Override
    public String toString() {
        return "EntityFrom{" + "name=" + name + ", image=" + image + ", pirce=" + pirce + '}';
    }
    
}
