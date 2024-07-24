-- use facturacion_poo;

-- Sentencias o querys 

/*
PALABRAS RESEVADAS:
SELECT
FROM
WHERE => condición que deben cumplir los registos
LIMIT
ORDER BY
GROUP BY

* => all (todos)

*/


-- insertar datos
-- NOW(): devuelve la fecha y hora del servidor

--  INSERT INTO clientes 
--  ( nombre, correo, rtn, estado, fecha_creacion ) -- YYYY/mm/dd HH:mm:i
--  VALUE
--  ( "FULANO DE TAL", "fdetal@unah.edu.hn", "48793472", 2, NOW()  );



-- entre el SELECT Y FROM, puedo visualizar todas las columnas o solo las que yole indique
 SELECT * FROM clientes; -- me devuelve toda la información de la tbla clientes

use facturacion_poo;
-- select con una condicion
-- SELECT * FROM clientes WHERE nombre = 'juan';
SELECT * FROM clientes WHERE nombre like '%juan%';


-- eliminar el registro
DELETE FROM clientes WHERE cliente_id = 2;


-- actualizar un registro

UPDATE clientes 
SET estado = 1, correo = "fdetal@unah.hn", fecha_actualiza = NOW()
WHERE cliente_id = 5;


-- todos los registros con RTN con guiones
-- nombre, rtn, estado

-- modificar la estructura de una tabla
-- ALTER TABLE clientes DROP COLUMN fecha_actuliza; -- DROP ELIMINA UNA COLUMNA

-- ALTER TABLE clientes ADD COLUMN fecha_actualiza DATETIME; -- ADD AGREGA UNA COLUMNA
