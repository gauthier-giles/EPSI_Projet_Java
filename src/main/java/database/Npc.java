package database;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table (name ="npc")

public class Npc {

    @GeneratedValue (strategy=GenerationType.AUTO)
    @Id
    @Column (name ="id_ennemy")
    private int id_ennemy;

    @Column(name = "name_ennemy")
    private String name_ennemy;

    @Column(name = "type_ennemy")
    private String type_ennemy;

    @Column(name = "health_ennemy")
    private int health_ennemy;

    @Column(name = "power_ennemy")
    private int power_ennemy;

    public int getId_ennemy() {
        return id_ennemy;
    }

    public void setId_ennemy(int id_ennemy) {
        this.id_ennemy = id_ennemy;
    }

    public String getName_ennemy() {
        return name_ennemy;
    }

    public void setName_ennemy(String name_ennemy) {
        this.name_ennemy = name_ennemy;
    }

    public String getType_ennemy() {
        return type_ennemy;
    }

    public void setType_ennemy(String type_ennemy) {
        this.type_ennemy = type_ennemy;
    }

    public int getHealth_ennemy() {
        return health_ennemy;
    }

    public void setHealth_ennemy(int health_ennemy) {
        this.health_ennemy = health_ennemy;
    }

    public int getPower_ennemy() {
        return power_ennemy;
    }

    public void setPower_ennemy(int power_ennemy) {
        this.power_ennemy = power_ennemy;
    }
}
