package com.dinuras.vessel.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.boot.convert.DurationFormat;

import javax.persistence.*;
import java.time.*;

@Data
@Entity
public class Vessel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID;


    @OneToOne(cascade = CascadeType.ALL)
    Officer commandingOfficer;

    @JoinColumn
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    ShipClass shipClass;

    Integer availableRange;
    Integer enduarance;
    Integer combatReaddinesssRating;

    //Duration duration;




}
