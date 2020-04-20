export class FleetUpdateBody {

  constructor(operationalRange: number, endurance: number, GPSLocation: string) {
    this.operationalRange = operationalRange;
    this.endurance = endurance;
    this.GPSLocation = GPSLocation;
  }

  operationalRange: number;
  endurance: number;
  GPSLocation: string;
}
