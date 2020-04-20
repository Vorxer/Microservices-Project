export class VesselUpdateBody {
  constructor(availableRange: number, enduarance: number, combatReaddinesssRating: number) {
    this.availableRange = availableRange;
    this.combatReadinessRating = combatReaddinesssRating;
    this.endurance = enduarance;
  }

  availableRange: number;
  endurance: number;
  combatReadinessRating: number;
}
