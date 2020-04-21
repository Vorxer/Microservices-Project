import {ShortFleetRecord} from './ShortFleetRecord';

export class OperationRecord {
    ID: number;
    name: string;
    fleetRecords: ShortFleetRecord[];
    commandingAuthorityName: string;
    duration: string;
    status: string;
    location: string;
    log: string;
    id: number;
}
