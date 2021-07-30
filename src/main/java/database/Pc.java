package database;


import javax.persistence.*;

@Entity
@Table(name ="pc")

public class Pc {

    @GeneratedValue()
    @Id
    @Column(name ="name_player")
    private String name_player;

    @Column(name = "information_player")
    private String information_player;

    @Column(name = "health_player")
    private int health_player;

    @Column(name = "power_player")
    private int power_player;


    public String getName_player() {
        return name_player;
    }

    public void setName_player(String name_player) {
        this.name_player = name_player;
    }

    public String getInformation_player() {
        return information_player;
    }

    public void setInformation_player(String information_player) {
        this.information_player = information_player;
    }

    public int getHealth_player() {
        return health_player;
    }

    public void setHealth_player(int health_player) {
        this.health_player = health_player;
    }

    public int getPower_player() {
        return power_player;
    }

    public void setPower_player(int power_player) {
        this.power_player = power_player;
    }
}
