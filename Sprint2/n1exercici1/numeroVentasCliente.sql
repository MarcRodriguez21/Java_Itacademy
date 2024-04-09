USE cul_dampolla;

select clienteid, nombre, count(clienteid) as NumeroVentas 
	from venta
	left join cliente on cliente.idCliente = venta.ClienteID
	where cliente.idcliente = 1 AND venta.fecharegistro BETWEEN  '2024-04-08' AND '2024-04-10'
	group by CLienteID;
