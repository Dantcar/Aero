CREATE SCHEMA "TESTE"
  AUTHORIZATION postgres;

GRANT ALL ON SCHEMA "DAC" TO postgres;
GRANT ALL ON SCHEMA "DAC" TO public;
COMMENT ON SCHEMA "DAC"
  IS 'standard public schema';

use SCHEMA teste
CREATE TABLE "custinf"

(    
   "CUST_ID" INT not null primary key,
       -- GENERATED ALWAYS AS IDENTITY
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