SET FOREIGN_KEY_CHECKS=0;
delete from CommandingAuthority;
delete from FleetRecord;
delete from Operation;
SET FOREIGN_KEY_CHECKS=1;

insert into FleetRecord
(fleetID, FlagshipID, flagCommanderID, fleetName)
values
(1, 4, 90129, 'Royal Navy Home Fleet'),
(2, 2, 12901, 'USS Enterprise Battlefleet'),
(3, 3, 23521, 'Attack  Fleet');

insert into CommandingAuthority
(ID, name)
values
(1,'Royal Navy Strategic Command'),
(2,'CINCLANT');


insert into Operation
(ID, duration, location, log, name, status, commandingAuthority_ID)
values
(1, 'Indefinite', 'English Channel, European Theatre', '', 'Defence of the Realm', '', 1),
(2, '3 Months', 'South China Sea,  South East Asia Theatre','', 'Strategic Placement 1', '', 2);

select * from FleetRecord;

UPDATE FleetRecord
    SET operation_ID = (case when fleetID = 1  then 1
						 when fleetID = 2  then 2
                         when fleetID = 3  then 2
                         end);
                         
select * from FleetRecord;


