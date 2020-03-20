SET FOREIGN_KEY_CHECKS=0;
delete from VesselRecord;
delete from OperationalBase;
delete from Fleet;
SET FOREIGN_KEY_CHECKS=1;

insert into VesselRecord
(ID, vesselID, vesselName, VRN)
values
(1,  1,	'Yorktown'    ,'CV-5'    ),
(2,  2,	'Enterprise'  ,'CV-6'    ),
(3,  3,	'Hornet'      ,'CV-8'    ),
(4,  4,	'Yamato'      ,'BBY-01'  ),
(5,  5,	'Musashi'     ,'BBY-02'  ),
(6,  6,	'Takao'       ,'CA-01'   ),
(7,  7,	'Atago'       ,'CA-02'   ),
(8,  8,	'Chokai'      ,'CA-03'   ),
(9,  9,	'Maya'     	  ,'CA-04'   ),
(10, 10,'Sheffield'   ,'CL-01'   ),
(11, 11,'Belfast'  	  ,'CL-02'   ),
(12, 12,'Edinburgh'   ,'CL-03'   ),
(13, 13,'Z-23' 	 	  ,'DD-01'   ),
(14, 14,'Z-24' 	 	  ,'DD-02'   ),
(15, 15,'Z-25' 	 	  ,'DD-02'   ),
(16, 16,'Z-26' 	 	  ,'DD-03'   ),
(17, 17,'Z-27' 	 	  ,'DD-04'   ),
(18, 18,'Z-28' 	 	  ,'DD-05'   ),
(19, 19,'Z-29' 	 	  ,'DD-06'   ),
(20, 20,'Z-30' 	 	  ,'DD-07'   );


insert into OperationalBase
(ID, name)
values
(1,'HMNB Portsmouth'),
(2,'Yokosuka Naval Arsenal');
select * from OperationalBase;

insert into Fleet
(ID, GPSLocation, enduarance, flagCommanderID, flagshipID, name, operationalRange, base_ID)
values
(1, '50.8198° N, 1.0880° W', 150, 90129, 4, 'Royal Navy Home Fleet', 7000 ,1),
(2, '35.2815° N, 139.6722° E', 90, 12901, 2, 'USS Enterprise Battlefleet', 12000 ,2),
(3, '15.4881° N, 114.4048° E', 50, 23521, 3, 'Attack  Fleet', 5000 ,2);


UPDATE VesselRecord
    SET fleet_ID = (case when ID = 1  then 1
						 when ID = 2  then 2
                         when ID = 3  then 3
                         when ID = 4  then 1
                         when ID = 5  then 2
                         when ID = 6  then 1
                         when ID = 7  then 1
                         when ID = 8  then 2
                         when ID = 9  then 3
                         when ID = 10 then 2
                         when ID = 11 then 3
                         when ID = 12 then 3
                         when ID = 13 then 1
                         when ID = 14 then 1
                         when ID = 15 then 2
                         when ID = 16 then 2
                         when ID = 17 then 3
                         when ID = 18 then 3
                         when ID = 19 then 3
                         when ID = 20 then 3
						 end);
select * from VesselRecord;