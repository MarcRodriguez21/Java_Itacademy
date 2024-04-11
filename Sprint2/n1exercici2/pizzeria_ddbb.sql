DROP SCHEMA IF EXISTS pizzeria;
CREATE SCHEMA pizzeria;

USE pizzeria;

-- CREATION OF TABLE PROVINCIAS
CREATE TABLE provincias(
    id_provincia INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(80)
);

-- CREATION OF TABLE LOCALIDAD
CREATE TABLE localidades(
    id_localitat INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(80),
    provincia_id INT,
    FOREIGN KEY (provincia_id) REFERENCES provincias(id_provincia)
);

-- CREATION OF TABLE CLIENTE 
CREATE TABLE cliente(
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(45),
    apellido VARCHAR(60),
    tef VARCHAR(15),
    direccion VARCHAR(100),
    c_postal VARCHAR(6),
    localidad_id INT,
    provincia_id INT,
    FOREIGN KEY (localidad_id) REFERENCES localidades(id_localitat),
    FOREIGN KEY (provincia_id) REFERENCES provincias(id_provincia)
);

-- CREATION OF TABLE PIZZERIA
CREATE TABLE pizzeria(
    id_pizzeria INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(40),
    localidad_id INT,
    provincia_id INT,
    FOREIGN KEY (localidad_id) REFERENCES localidades(id_localitat),
    FOREIGN KEY (provincia_id) REFERENCES provincias(id_provincia)
);

-- CREATION OF TABLE COMANDA
CREATE TABLE comanda(
    id_comanda INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id INT,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    envio SET('domicilio','recogida'),
    cantidad_pizza INT,
    cantidad_hamburguesas INT,
    cantidad_bebidas INT,
    precio_total INT,
    pizzeria_id INT,
    localidad_id INT,
    provincia_id INT,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id_cliente),
    FOREIGN KEY (pizzeria_id) REFERENCES pizzeria(id_pizzeria),
    FOREIGN KEY (localidad_id) REFERENCES localidades(id_localitat),
    FOREIGN KEY (provincia_id) REFERENCES provincias(id_provincia)
);
-- CREATION OF TABLE HAMBURGUESA
CREATE TABLE hamburguesa(
    id_hamburguesa INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(45),
    descripcion TEXT,
    imagen VARCHAR(10),
    precio INT
);

-- CREATION OF TABLE BEBIDA
CREATE TABLE bebida(
    id_bebida INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(45),
    descripcion TEXT,
    imagen VARCHAR(10),
    precio INT
);

-- CREATION OF TABLE CATEGORIA
CREATE TABLE categoria(
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(30)
);

-- CREATION OF TABLE PIZZA
CREATE TABLE pizza(
    categoria_id INT,
    id_pizza INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(45),
    descripcion TEXT,
    imagen VARCHAR(10),
    precio INT,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id_categoria)
);
    
-- CREATION OF TABLE EMPLEADO
CREATE TABLE empleado(
    id_empleado INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(40),
    apellido VARCHAR(40),
    NIF VARCHAR(10),
    tef VARCHAR(12),
    cargo SET('repartidor','cocinero'),
    pizzeria_id INT,
    reparto_id INT,
    FOREIGN KEY (pizzeria_id) REFERENCES pizzeria(id_pizzeria)
);

-- CREATION OF TABLE REPARTO
CREATE TABLE reparto(
    id_reparto INT PRIMARY KEY AUTO_INCREMENT,
    salida TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    comanda_id INT,
    FOREIGN KEY (comanda_id) REFERENCES comanda(id_comanda)
);
