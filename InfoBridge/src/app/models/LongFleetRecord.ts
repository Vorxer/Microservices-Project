import {ShortVesselRecord} from './ShortVesselRecord';

export class LongFleetRecord {
  fleetID: number;
  fleetName: string;
  flagCommanderID: number;
  operationalRange: number;
  endurance: number;
  public vesselRecords: ShortVesselRecord[];
  baseID: number;
  baseName: string;
  flagshipID: number;
  gpslocation: string;


}
