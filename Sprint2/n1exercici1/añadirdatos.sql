----- EJEMPLO DE COMO AÑADIR DATOS A LAS TABLAS -------

-- Insertar datos de ejemplo en la tabla Proveedor
INSERT INTO Proveedor (Nombre, Direccion, Telefono, Fax, NIF) VALUES
('Proveedor1', 'Dirección 1', '123456789', '987654321', 'NIF123'),
('Proveedor2', 'Dirección 2', '987654321', '123456789', 'NIF456');

-- Insertar datos de ejemplo en la tabla gafas
INSERT INTO gafas (ProveedorID, Nombre, Graduacion, Montura, ColorMontura, ColorCristales, Precio) VALUES
(1, 'Gafas1', 1.25, 'flotante', 'Negro', 'Azul', 50.00),
(2, 'Gafas2', 2.00, 'pasta', 'Rojo', 'Verde', 60.00);

-- Insertar datos de ejemplo en la tabla empleado
INSERT INTO empleado (Nombre) VALUES
('Empleado1'),
('Empleado2');

-- Insertar datos de ejemplo en la tabla cliente
INSERT INTO cliente (Nombre, DireccionPostal, Telefono, Correo_electronico, FechaRegistro, RecomendacionCliente, VentaEmpleado) VALUES
('Cliente1', 'Dirección 1', '123456789', 'cliente1@example.com', NOW(), NULL, 1),
('Cliente2', 'Dirección 2', '987654321', 'cliente2@example.com', NOW(), NULL, 2);

-- Insertar datos de ejemplo en la tabla venta
INSERT INTO venta (EmpleadoID, ClienteID, GafasID) VALUES
(1, 1, 1),
(2, 2, 2);