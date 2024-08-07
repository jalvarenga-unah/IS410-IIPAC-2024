SELECT 
h.tipo,
 h.numero_habitacion, 
 SUM( h.precio_por_noche ) AS suma_precios,
 AVG(h.precio_por_noche) AS promedio_reservas
FROM reservas AS r
INNER JOIN habitaciones AS h
ON r.habitacion_id = h.id 
WHERE r.estado = 'confirmada'
GROUP BY h.tipo, h.numero_habitacion
ORDER BY  SUM( h.precio_por_noche ) DESC
-- LIMIT 2