-- Insertar provincias
INSERT INTO provincias (nombre) VALUES ('Barcelona');
INSERT INTO provincias (nombre) VALUES ('Girona');

-- Insertar localidades de Barcelona
INSERT INTO localidades (nombre, provincia_id) VALUES ('Barcelona', 1); -- Barcelona está asociada a la provincia con id_provincia = 1
INSERT INTO localidades (nombre, provincia_id) VALUES ('Sabadell', 1);
INSERT INTO localidades (nombre, provincia_id) VALUES ('Terrassa', 1);
INSERT INTO localidades (nombre, provincia_id) VALUES ('Badalona', 1);
INSERT INTO localidades (nombre, provincia_id) VALUES ('Hospitalet de Llobregat', 1);

-- Insertar localidades de Girona
INSERT INTO localidades (nombre, provincia_id) VALUES ('Girona', 2); -- Girona está asociada a la provincia con id_provincia = 2
INSERT INTO localidades (nombre, provincia_id) VALUES ('Figueres', 2);
INSERT INTO localidades (nombre, provincia_id) VALUES ('Blanes', 2);
INSERT INTO localidades (nombre, provincia_id) VALUES ('Lloret de Mar', 2);
INSERT INTO localidades (nombre, provincia_id) VALUES ('Olot', 2);

-- INsertar clientes
INSERT INTO cliente (nombre, apellido, tef, direccion, c_postal, localidad_id, provincia_id) VALUES
('Juan', 'García', '123456789', 'Calle Mayor 1', '28001', 1, 1),
('María', 'López', '987654321', 'Avenida Principal 12', '28002', 2, 1),
('Pedro', 'Martínez', '654987321', 'Calle Secundaria 5', '28003', 3, 1),
('Laura', 'Sánchez', '147258369', 'Plaza Central 8', '28004', 4, 1),
('Carlos', 'Rodríguez', '369852147', 'Paseo del Parque 15', '28005', 5, 1),
('Ana', 'Fernández', '258369147', 'Avenida del Bosque 20', '28006', 6, 2),
('Sara', 'Pérez', '321654987', 'Calle Peatonal 3', '28007', 7, 2),
('Pablo', 'Gómez', '456789123', 'Avenida de las Flores 18', '28008', 8, 2),
('Elena', 'Díaz', '852369741', 'Calle de la Estación 22', '28009', 9, 2),
('Javier', 'Muñoz', '963258741', 'Calle del Sol 7', '28010', 10, 2);

-- Insertar pizzeria
INSERT INTO pizzeria (nombre, localidad_id, provincia_id) VALUES ('La Italiana', 1, 1);

-- Insertar comanda
INSERT INTO comanda (cliente_id, fecha, envio, cantidad_pizza, cantidad_hamburguesas, cantidad_bebidas, precio_total, pizzeria_id, localidad_id, provincia_id) 
VALUES (1, '2024-04-10 12:00:00', 'domicilio', 2, 0, 1, 25, 1, 1, 1),
       (2, '2024-04-10 12:15:00', 'recogida', 1, 1, 2, 30, 1, 1, 1),
       (3, '2024-04-10 12:30:00', 'domicilio', 3, 0, 0, 35, 1, 1, 1),
       (4, '2024-04-10 12:45:00', 'domicilio', 2, 1, 1, 28, 1, 1, 1),
       (5, '2024-04-10 13:00:00', 'recogida', 1, 0, 0, 12, 1, 2, 1),
       (6, '2024-04-10 13:15:00', 'domicilio', 2, 0, 1, 25, 1, 2, 1),
       (7, '2024-04-10 13:30:00', 'recogida', 2, 1, 0, 28, 1, 3, 1),
       (8, '2024-04-10 13:45:00', 'domicilio', 3, 1, 1, 35, 1, 4, 1),
       (9, '2024-04-10 14:00:00', 'recogida', 1, 0, 0, 12, 1, 4, 1),
       (10, '2024-04-10 14:15:00', 'domicilio', 2, 0, 1, 25, 1, 5, 1);
       
-- Insertar hamburguesa
INSERT INTO hamburguesa (nombre, descripcion, imagen, precio)
VALUES ('Hamburguesa clásica', 'Hamburguesa de carne de vaca, lechuga, tomate, cebolla y mayonesa', 'hamburguesa_clasica.jpg', 8),
       ('Hamburguesa BBQ', 'Hamburguesa de carne de vaca con salsa BBQ, cebolla caramelizada y bacon', 'hamburguesa_bbq.jpg', 10),
       ('Hamburguesa vegana', 'Hamburguesa de lentejas, champiñones y zanahoria, acompañada de salsa de aguacate', 'hamburguesa_vegana.jpg', 9);

-- Insertar bebida
INSERT INTO bebida (nombre, descripcion, imagen, precio)
VALUES ('Coca-Cola', 'Refresco de cola', 'cocacola.jpg', 2),
       ('Fanta', 'Refresco de naranja', 'fanta.jpg', 2),
       ('Agua mineral', 'Agua sin gas', 'agua_mineral.jpg', 1.5);

-- Insertar categoria
INSERT INTO categoria (nombre) VALUES ('Pizzas Clasicas'), ('Pizzas Premium'), ('Pizzas Veganas');

-- Insertar pizza
INSERT INTO pizza (categoria_id, nombre, descripcion, imagen, precio)
VALUES (1, 'Pizza Margarita', 'Salsa de tomate, mozzarella y albahaca', 'pizza_margarita.jpg', 10),
       (1, 'Pizza Pepperoni', 'Salsa de tomate, mozzarella y pepperoni', 'pizza_pepperoni.jpg', 12),
       (1, 'Pizza Vegetariana', 'Salsa de tomate, mozzarella, champiñones, pimientos y cebolla', 'pizza_vegetariana.jpg', 11),
       (1, 'Pizza Hawaiana', 'Salsa de tomate, mozzarella, jamón y piña', 'pizza_hawaiana.jpg', 13),
       (2, 'Pizza Cuatro Quesos', 'Salsa de tomate, mozzarella, gorgonzola, parmesano y provolone', 'pizza_cuatro_quesos.jpg', 14),
       (3, 'Pizza Vegana de Verduras Asadas', 'Salsa de tomate, mozzarella vegana, pimientos, calabacín, berenjena y cebolla', 'pizza_vegana_verduras.jpg', 12),
       (1, 'Pizza Barbacoa', 'Salsa barbacoa, mozzarella, pollo a la barbacoa, cebolla y maíz', 'pizza_barbacoa.jpg', 15),
       (2, 'Pizza Prosciutto e Funghi', 'Salsa de tomate, mozzarella, jamón y champiñones', 'pizza_prosciutto_e_funghi.jpg', 13);

-- Insertar empleado
INSERT INTO empleado (nombre, apellido, NIF, tef, cargo, pizzeria_id) 
VALUES ('José', 'López', '12345678A', '987654321', 'repartidor', 1),
       ('María', 'Martínez', '87654321B', '654987321', 'cocinero', 1),
       ('Carlos', 'García', '56781234C', '321654987', 'repartidor', 1),
       ('Laura', 'Fernández', '34567812D', '147258369', 'repartidor', 1),
       ('Ana', 'Pérez', '23456781E', '369852147', 'cocinero', 1);

-- Insertar reparto
INSERT INTO reparto (salida, comanda_id) 
VALUES ('2024-04-10 15:00:00', 1),
       ('2024-04-10 16:00:00', 3),
       ('2024-04-10 16:30:00', 4),
       ('2024-04-10 17:00:00', 6),
       ('2024-04-10 17:30:00', 8),
       ('2024-04-10 18:00:00', 10);
       