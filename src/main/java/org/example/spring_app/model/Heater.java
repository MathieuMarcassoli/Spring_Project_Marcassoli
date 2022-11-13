package org.example.spring_app.model;


import javax.persistence.*;

@Entity
public class Heater {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable=false)
    private String name;

    private Long power;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Room room;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private HeaterStatus heaterStatus;

    public Heater(){
    }

    public Heater(Long id, String name, Long power, Room room, HeaterStatus heaterStatus) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.room = room;
        this.heaterStatus = heaterStatus;

    }

    public String getName() {
        return this.name;
    }


    public HeaterStatus getHeaterStatus() {
        return this.heaterStatus;
    }

    public Long getId() {
        return this.id;
    }

    public Room getRoom() {
        return room;
    }

    public Long getPower() {
        return power;
    }
}
