export class OperationUpdateBody {

  constructor(duration: string, status: string, location: string, log: string) {
    this.duration = duration;
    this.status = status;
    this.location = location;
    this.log = log;
  }

   duration: string;
   status: string;
   location: string;
   log: string;
}
