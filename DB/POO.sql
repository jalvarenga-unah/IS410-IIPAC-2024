-- crear una base de datos 
 CREATE DATABASE facturacion_poo;

-- seleccionar la base de datos con la que voy a trabajar
USE facturacion_poo;


-- eliminar una tabla
DROP TABLE clientes;

-- Crear nuestra primera Tabla

-- Tabal de clientes: id, nombre, rtn, telefono, direccion

-- nomenclatura para creación de tablas: nombres deben ser en plural y minusculas y los nombres de los campos en singular

CREATE TABLE clientes ( 
 cliente_id int NOT NULL AUTO_INCREMENT, 			
 nombre varchar(100) NOT NULL, 
 correo varchar(150), 
 rtn varchar(20) UNIQUE NOT NULL comment 'Numero de registro fiscal de HND',	
 estado enum('activo','inactivo') DEFAULT 'activo' COMMENT 'Estado del cliente y solo puede ser activo o inactivo',  
 fecha_creacion datetime,
 PRIMARY KEY (cliente_id)
 );
 
 -- TAREA: CREAR LAS TABLAS DE FACTURA Y PRODUCTO
 
 
 
 