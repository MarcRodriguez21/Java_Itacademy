DROP SCHEMA IF EXISTS `Cul_dAmpolla`;
CREATE SCHEMA `Cul_dAmpolla` DEFAULT CHARACTER SET utf8 ;
USE `Cul_dAmpolla` ;

CREATE TABLE IF NOT EXISTS Proveedor (
  idProveedor INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Nombre VARCHAR(45) NOT NULL,
  Direccion VARCHAR(80) NOT NULL,  
  Telefono VARCHAR(45) NOT NULL,
  Fax VARCHAR(45) NOT NULL,
  NIF VARCHAR(45) NOT NULL UNIQUE
);

CREATE TABLE gafas (
  IdMarca INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  ProveedorID INT NOT NULL,
  Nombre VARCHAR(45) NOT NULL,
  Graduacion DECIMAL(2,2) NOT NULL,
  Montura SET('flotante', 'pasta', 'metálica') NOT NULL,
  ColorMontura VARCHAR(15) NOT NULL,
  ColorCristales VARCHAR(45) NOT NULL,
  Precio DECIMAL(6,2) NOT NULL,
  FOREIGN KEY (`ProveedorID`) REFERENCES `Proveedor` (`idProveedor`)
);

CREATE TABLE empleado (
  idEmpleado INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(45) NOT NULL
);

CREATE TABLE cliente (
  idCliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(45) NOT NULL,
  DireccionPostal VARCHAR(80) NOT NULL,
  Telefono VARCHAR(14) NOT NULL,
  Correo_electronico VARCHAR(110) NOT NULL,
  FechaRegistro DATETIME NOT NULL,
  RecomendacionCliente INT NULL,
  VentaEmpleado INT NULL,
  FOREIGN KEY (`RecomendacionCliente`) REFERENCES `cliente` (`idCliente`),
  FOREIGN KEY (`VentaEmpleado`) REFERENCES `empleado` (`idEmpleado`)
);

CREATE TABLE venta (
  idVenta INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  EmpleadoID INT NOT NULL,
  ClienteID INT NOT NULL,
  GafasID INT NOT NULL,
  FOREIGN KEY (`EmpleadoID`) REFERENCES `empleado` (`idEmpleado`),
  FOREIGN KEY (`ClienteID`) REFERENCES `cliente` (`idCliente`),
  FOREIGN KEY (`GafasID`) REFERENCES `gafas` (`IdMarca`)
);
