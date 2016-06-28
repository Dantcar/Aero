CREATE TABLE DAC.custinf

(    
   "CUST_ID" SERIAL not null primary key,
        
       -- (START WITH 1, INCREMENT BY 1),   
   "FNAME" VARCHAR(50),     
   "LNAME" VARCHAR(50),
   "ADDR" VARCHAR(100),
   "SUBURB" VARCHAR(20),
   "PCODE" INTEGER,  
   "PHONE" INTEGER,
   "MOB" INTEGER,    
   "EMAIL" VARCHAR(100),
   "COMM" VARCHAR(450)    
);