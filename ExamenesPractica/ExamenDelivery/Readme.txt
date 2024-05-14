Una empresa de reparto de comida rápida necesita un programa de gestión de pedidos que le premita realizar las
siguientes funciones:

Crear un nuevo pedido
Marcar un pedido como entregado
Listar los pedidos pendientes
Listar los pedido entregados

1- Los pedidos cuentan con un ID autoincrementable, un cliente, una lista de productos y un repartidor.
Cuando se crea un pedido se le asigna un repartidor aleatorio que se encuentre disponible.
Cuando el pedido se entrega, el repartidor se libera.

2- Los clientes tienen un nombre y una dirección de entrega.

3- Los repartidores cuentan con un nombre y una disponibilidad para realizar un pedido. Estos pueden:
ir en bicicleta, lo que aumenta el precio del pedido en un 1%.
ir en moto, aumentando el total en del pedido en un 2%.
ir a pie.

4- La empresa cuenta con tres tipos de productos:
Burritos. Con un valor de 6.5. Cuando un cliente compra un burrito se le regala un pin.
Hamburguesas. Valor 8.9. Cuando un cliente pide una hamburguesa se le regala una gorra.
Kebab. Precio = 4.5
Pizza. Precio = 7.9.

5- Cuando ya no existan repartidores disponibles se arrojará una excepcion que muestre un mensaje de error
y no permita crear un nuevo pedido.
6- No se podrá crear un pedido que no tenga cliente ni productos. Puedes manejarlo con una excepción o una validación.