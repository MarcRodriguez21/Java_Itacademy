DROP SCHEMA IF EXISTS `Cul_dAmpolla`;
CREATE SCHEMA `Cul_dAmpolla` DEFAULT CHARACTER SET utf8 ;
USE `Cul_dAmpolla` ;

CREATE TABLE IF NOT EXISTS direccion (
  id_direccion INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  calle VARCHAR(45) NOT NULL,
  numero INT NOT NULL,
  piso INT NULL,
  puerta INT NULL,
  ciudad VARCHAR(45) NOT NULL,
  codi_postal INT NOT NULL,
  pais VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS Proveedor (
  idProveedor INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Nombre VARCHAR(45) NOT NULL,
  direccion_id INT NOT NULL,  
  Telefono VARCHAR(45) NOT NULL,
  Fax VARCHAR(45) NOT NULL,
  NIF VARCHAR(45) NOT NULL UNIQUE,
  FOREIGN KEY (direccion_id) REFERENCES direccion(id_direccion)
);

CREATE TABLE IF NOT EXISTS marca (
  id_marca INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  proveedor_id INT NOT NULL,
  FOREIGN KEY (proveedor_id) REFERENCES Proveedor(idProveedor)
);

CREATE TABLE gafas (
  Idgafas INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  marca_id INT NOT NULL,
  Nombre VARCHAR(45) NOT NULL,
  Graduacion DECIMAL(2,2) NOT NULL,
  Montura SET('flotante', 'pasta', 'metálica') NOT NULL,
  ColorMontura VARCHAR(15) NOT NULL,
  ColorCristales VARCHAR(45) NOT NULL,
  Precio DECIMAL(6,2) NOT NULL,
  FOREIGN KEY (marca_id) REFERENCES marca(id_marca)
);

CREATE TABLE empleado (
  idEmpleado INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(45) NOT NULL
);

CREATE TABLE cliente (
  idCliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(45) NOT NULL,
  direccion_id INT NOT NULL,
  Telefono VARCHAR(14) NOT NULL,
  Correo_electronico VARCHAR(110) NOT NULL,
  FechaRegistro DATETIME NOT NULL,
  RecomendacionCliente INT NULL,
  VentaEmpleado INT NULL,
  FOREIGN KEY (`RecomendacionCliente`) REFERENCES `cliente` (`idCliente`),
  FOREIGN KEY (`VentaEmpleado`) REFERENCES `empleado` (`idEmpleado`),
  FOREIGN KEY (direccion_id) REFERENCES direccion(id_direccion)
);

CREATE TABLE venta (
  idVenta INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  EmpleadoID INT NOT NULL,
  ClienteID INT NOT NULL,
  GafasID INT NOT NULL,
  FOREIGN KEY (`EmpleadoID`) REFERENCES `empleado` (`idEmpleado`),
  FOREIGN KEY (`ClienteID`) REFERENCES `cliente` (`idCliente`),
  FOREIGN KEY (`GafasID`) REFERENCES `gafas` (`Idgafas`)
);
