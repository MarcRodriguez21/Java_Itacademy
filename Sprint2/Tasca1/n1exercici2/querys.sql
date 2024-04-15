USE pizzeria;
-- ------------------------------------------------------------ --
-- Llista quants productes de categoria 'Begudes' s'han venut en una determinada localitat.
SELECT l.nombre AS localidad, SUM(cantidad_bebidas) AS cantidad_bebidas
FROM comanda c
JOIN localidades l ON c.localidad_id = l.id_localitat
WHERE l.id_localitat = 1
GROUP BY l.nombre;
-- ------------------------------------------------------------- --
-- Llista quantes comandes ha efectuat un determinat empleat/da.
 SELECT e.nombre AS Nombre, SUM(c.empleado_id) AS Ventas
 FROM comanda c
 JOIN empleado e ON c.empleado_id = e.id_empleado
 WHERE e.id_empleado = 1
 GROUP BY e.nombre
