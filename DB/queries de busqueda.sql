

-- SELECT 
-- reservas.id AS reserva_id, 
-- reservas.cliente_id, 
-- reservas.habitacion_id, 
-- reservas.estado,
-- clientes.nombre,
-- clientes.telefono,
-- clientes.email,
-- habitaciones.numero_habitacion
--  FROM reservas
--  INNER JOIN clientes 
-- 	ON reservas.cliente_id = clientes.id
-- INNER JOIN habitaciones
-- 	ON reservas.habitacion_id = habitaciones.id
-- WHERE reservas.cliente_id = 3;

-- WHERE reservas.estado = 'confirmada';

-- SELECT id, nombre, email FROM clientes
-- WHERE id = 1;




SELECT 
reservas.id AS reserva_id, 
reservas.cliente_id, 
reservas.habitacion_id, 
reservas.estado,
clientes.nombre,
clientes.telefono,
clientes.email,
habitaciones.numero_habitacion,
reservas.fecha_entrada
 FROM reservas
 INNER JOIN clientes 
	ON reservas.cliente_id = clientes.id
INNER JOIN habitaciones
	ON reservas.habitacion_id = habitaciones.id
WHERE reservas.fecha_entrada 
BETWEEN '2024-07-01' AND '2024-08-01'


-- TODO: ordenamiento, agrupacion y funciones de suma y promedio

