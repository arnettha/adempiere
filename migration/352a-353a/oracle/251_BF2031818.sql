-- Jul 31, 2008 9:16:30 PM COT
-- [ 2031818 ] AD_Element.ColumnName length should be 30
UPDATE AD_Column SET FieldLength=30,Updated=TO_DATE('2008-07-31 21:16:30','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=11819
;

ALTER TABLE A_RegistrationAttribute MODIFY ColumnName NVARCHAR2(30) DEFAULT  NULL 
;

UPDATE AD_Column SET FieldLength=30,Updated=TO_DATE('2008-07-31 21:16:46','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=4017
;

ALTER TABLE AD_Process_Para MODIFY ColumnName NVARCHAR2(30) DEFAULT  NULL 
;

UPDATE AD_Column SET FieldLength=30,Updated=TO_DATE('2008-07-31 21:17:04','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=2602
;

ALTER TABLE AD_Element MODIFY ColumnName NVARCHAR2(30) DEFAULT  NULL 
;

UPDATE AD_Column SET FieldLength=30,Updated=TO_DATE('2008-07-31 21:17:22','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=116
;

ALTER TABLE AD_Column MODIFY ColumnName NVARCHAR2(30) DEFAULT  NULL 
;

