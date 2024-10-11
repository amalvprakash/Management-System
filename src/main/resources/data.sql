-- Create the database if it doesn't exist
IF NOT EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'Products')
BEGIN
    CREATE TABLE Products (
        id INT IDENTITY(1,1) PRIMARY KEY,
        product_id VARCHAR(10) NOT NULL UNIQUE,
        name NVARCHAR(100) NOT NULL,
        price DECIMAL(10, 2) NOT NULL
    );
END

IF NOT EXISTS (SELECT * FROM sys.triggers WHERE name='trgGenerateProductId')
BEGIN

  CREATE TRIGGER trgGenerateProductId
ON [productdb].[dbo].[product]
AFTER INSERT
AS
BEGIN
    SET NOCOUNT ON;
    UPDATE [productdb].[dbo].[product]
    SET product_id = 'PROD' + RIGHT('0000' + CAST(id AS NVARCHAR(4)), 4)
    WHERE id IN (SELECT id FROM inserted);
END
END