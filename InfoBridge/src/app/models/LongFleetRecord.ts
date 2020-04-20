import {ShortVesselRecord} from './ShortVesselRecord';

export class LongFleetRecord {
  fleetID: number;
  fleetName: string;
  flagCommanderID: number;
  operationalRange: number;
  enduarance: number;
  vesselRecords: ShortVesselRecord[];
  baseID: number;
  baseName: string;
  flagshipID: number;
  gpslocation: string;
}
