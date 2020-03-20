SET FOREIGN_KEY_CHECKS=0;
delete from Officer;
delete from Vessel;
delete from ShipClass;
SET FOREIGN_KEY_CHECKS=1;

insert into ShipClass 
(ID, name, displacement, standardLength, beam, draft, flankSpeed, cruiseSpeed, operationalRange, complement)
values
#ID Name       displ    Length  beam   draft   fSpeed  cSpeed  range, complement)    
(1,'Yorktown' ,25500   ,246    ,25     ,7.9    ,32.5   ,32.5   ,12500  ,2217),
(2,'Yamato'	  ,72000   ,263	   ,38.9   ,10.4   ,27	   ,16     ,7200   ,2767),
(3,'Takao'	  ,11350   ,203.7  ,20.4   ,20.4   ,35.5   ,14     ,8500   ,773 ),
(4,'Town'     ,13386   ,187    ,19.8   ,6.89   ,35.25  ,13     ,5300   ,750),
(5,'Z23'      ,2543    ,127    ,12     ,4.38   ,36     ,19     ,2600   ,321);

insert into Vessel
(ID, name, VRN, shipClass_ID, availableRange, enduarance, combatReaddinesssRating)
values
#ID, name,          VRN,       SC,  aRange,  endr   crr
(1   ,'Yorktown'    ,'CV-5'    ,1   ,10000   ,100	,95),
(2   ,'Enterprise'  ,'CV-6'    ,1   ,7000    ,80	,80),
(3   ,'Hornet'      ,'CV-8'    ,1   ,9000    ,85	,95),
(4   ,'Yamato'      ,'BBY-01'  ,2   ,6000    ,120	,95),
(5   ,'Musashi'     ,'BBY-02'  ,2   ,4500    ,80	,60),
(6   ,'Takao'     	,'CA-01'   ,3   ,7000    ,80	,80),
(7   ,'Atago'     	,'CA-02'   ,3   ,6500    ,67	,80),
(8   ,'Chokai'     	,'CA-03'   ,3   ,8000    ,70	,70),
(9   ,'Maya'     	,'CA-04'   ,3   ,5500    ,60	,60),
(10  ,'Sheffield'  	,'CL-01'   ,4   ,4000    ,75	,70),
(11  ,'Belfast'  	,'CL-02'   ,4   ,3000    ,60	,90),
(12  ,'Edinburgh'  	,'CL-03'   ,4   ,3500    ,70	,90),
(13  ,'Z-23' 	 	,'DD-01'   ,5   ,1750    ,40	,95),
(14  ,'Z-24' 	 	,'DD-02'   ,5   ,2200    ,45	,80),
(15  ,'Z-25' 	 	,'DD-02'   ,5   ,2500    ,45	,90),
(16  ,'Z-26' 	 	,'DD-03'   ,5   ,1900    ,43	,70),
(17  ,'Z-27' 	 	,'DD-04'   ,5   ,1500    ,25	,90),
(18  ,'Z-28' 	 	,'DD-05'   ,5   ,2000    ,40	,80),
(19  ,'Z-29' 	 	,'DD-06'   ,5   ,2000    ,38	,90),
(20  ,'Z-30' 	 	,'DD-07'   ,5   ,2600    ,50	,90);


insert into Officer
(ID, name, rank, vessel_ID)
values
#ID, name, 		 rank, vessel_ID
(1  ,'Ernest D. McWhorter' 		,'Captain' 				, 1),
(2  ,'George D. Murray' 		,'Captain' 				, 2),
(3  ,'Marc A. Mitscher' 		,'Captain' 				, 3),
(4  ,'Gihachi Takayanagi' 		,'Captain' 				, 4),
(5  ,'Kaoru Arima' 				,'Captain' 				, 5),
(6  ,'Ando Takashi ' 			,'Captain' 				, 6),
(7  ,'Sada Ken’ichi' 			,'Captain' 				, 7),
(8  ,'Tanaka Jo ' 				,'Captain' 				, 8),
(9  ,'Oe Ranji' 				,'Captain' 				, 9),
(10 ,'John Inglis' 				,'Captain' 				, 10),
(11 ,'G A Scott' 				,'Captain' 				, 11),
(12 ,'David Beaty' 				,'Captain' 				, 12),
(13 ,'Hans Erdmenger' 			,'Captain' 				, 13),
(14 ,'Alfred Schulze-Hinrichs' 	,'Captain' 				, 14),
(15 ,'Hans Erdmenger' 			,'Captain' 				, 15),
(16 ,'Gottfried Pönitz' 		,'Captain' 				, 16),
(17 ,'Karl Smidt' 				,'Captain' 				, 17),
(18 ,'Hans Erdmenger' 			,'Lieutenant Commander' , 18),
(19 ,'Curt Rechel' 				,'Lieutenant Commander' , 19),
(20 ,'Friedrich T. Schmidt'		,'Lieutenant Commander' , 20);

UPDATE Vessel
    SET commandingOfficer_ID = (case when ID = 1  then 1
									 when ID = 2  then 2
                                     when ID = 3  then 3
                                     when ID = 4  then 4
                                     when ID = 5  then 5
                                     when ID = 6  then 6
                                     when ID = 7  then 7
                                     when ID = 8  then 8
                                     when ID = 9  then 9
                                     when ID = 10 then 10
                                     when ID = 11 then 11
                                     when ID = 12 then 12
                                     when ID = 13 then 13
                                     when ID = 14 then 14
                                     when ID = 15 then 15
                                     when ID = 16 then 16
                                     when ID = 17 then 17
                                     when ID = 18 then 18
                                     when ID = 19 then 19
                                     when ID = 20 then 20
									 end);
									
select * from Vessel;

