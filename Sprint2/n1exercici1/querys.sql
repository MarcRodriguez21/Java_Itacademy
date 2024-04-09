USE cul_dampolla;
-- Llista el total de factures d'un client/a en un període determinat.
SELECT clienteid, nombre, count(clienteid) AS NumeroVentas 
	FROM venta
	LEFT JOIN cliente ON cliente.idCliente = venta.ClienteID
	WHERE cliente.idcliente = 1 AND venta.fechaventa BETWEEN  '2024-04-08' AND '2024-04-10'
	GROUP BY CLienteID;
    
-- Llista els diferents models d'ulleres que ha venut un empleat/da durant un any.
SELECT DISTINCT g.nombre AS nombre_modelo, e.nombre AS nombre_empleado
	FROM venta
	JOIN gafas g ON venta.GafasID = g.IdMarca
	JOIN empleado e ON venta.EmpleadoID = e.idEmpleado
	WHERE venta.fechaventa BETWEEN '2023-04-08' AND '2024-04-10' AND e.idEmpleado = 1;

-- Llista els diferents proveïdors que han subministrat ulleres venudes amb èxit per l'òptica.
SELECT DISTINCT p.nombre AS nombre_proveedor
	FROM venta v
	JOIN gafas g ON v.GafasID = g.IdMarca
	JOIN proveedor p ON g.ProveedorID = p.idProveedor;


