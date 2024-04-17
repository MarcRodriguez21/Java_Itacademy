USE tienda;

-- 1.LLista el nom de tots els productes que hi ha en la taula producto.
SELECT  p.nombre AS nombre_productos
FROM producto p;

-- 2.LLista els noms i els preus de tots els productes de la taula producto.
SELECT  p.nombre AS nombre_productos, p.precio AS precio
FROM producto p;

-- 3.LLista totes les columnes de la taula producto.
SELECT * FROM producto;

-- 4.LLista el nom dels productes, el preu en euros i el preu en dòlars estatunidencs (USD).
SELECT nombre, precio, precio * 0.85 
FROM producto;

-- 5.LLista el nom dels productes, el preu en euros i el preu en dòlars estatunidencs (USD). Utilitza els següents àlies per a les columnes: nom de producto, euros, dòlars.
SELECT nombre AS nombre_productos, precio AS precio_euros, precio * 0.85 AS precio_dolares
FROM producto;

-- 6.LLista els noms i els preus de tots els productes de la taula producto, convertint els noms a majúscula.
SELECT (upper(p.nombre)) AS nombre_productos, p.precio AS precio
FROM producto p;

-- 7.LLista els noms i els preus de tots els productes de la taula producto, convertint els noms a minúscula.
SELECT (LOWER(p.nombre)) AS nombre_productos, p.precio AS precio
FROM producto p;

-- 8.LLista el nom de tots els fabricants en una columna, i en una altra columna obtingui en majúscules els dos primers caràcters del nom del fabricant.
SELECT f.nombre AS nombre_fabricante, CONCAT(UPPER(SUBSTRING(f.nombre, 1, 2)), LOWER(SUBSTRING(f.nombre, 3))) AS nombre_modificado
FROM fabricante f;

-- 9.LLista els noms i els preus de tots els productes de la taula producto, arrodonint el valor del preu.
SELECT  p.nombre AS nombre_productos, ROUND(p.precio,2) AS precio
FROM producto p;

-- 10.LLista els noms i els preus de tots els productes de la taula producto, truncant el valor del preu per a mostrar-lo sense cap xifra decimal.
SELECT  p.nombre AS nombre_productos, ROUND(p.precio, 0) AS precio
FROM producto p;

-- 11.LLista el codi dels fabricants que tenen productes en la taula producto.
SELECT DISTINCT codigo_fabricante
FROM producto;

-- 12.LLista el codi dels fabricants que tenen productes en la taula producto, eliminant els codis que apareixen repetits.
SELECT DISTINCT f.codigo
FROM fabricante f
JOIN producto p ON f.codigo = p.codigo_fabricante;

-- 13.LLista els noms dels fabricants ordenats de manera ascendent.
SELECT f.nombre
FROM fabricante f
ORDER BY f.nombre ASC;

-- 14.LLista els noms dels fabricants ordenats de manera descendent.
SELECT f.nombre
FROM fabricante f
ORDER BY f.nombre DESC;

-- 15.LLista els noms dels productes ordenats, en primer lloc, pel nom de manera ascendent i, en segon lloc, pel preu de manera descendent.
SELECT f.nombre
FROM fabricante f
JOIN producto p ON f.codigo = p.codigo
ORDER BY f.nombre ASC, precio DESC;

-- 16.Retorna una llista amb les 5 primeres files de la taula fabricante.
SELECT *
FROM fabricante
LIMIT 5;

-- 17.Retorna una llista amb 2 files a partir de la quarta fila de la taula fabricante. La quarta fila també s'ha d'incloure en la resposta.
SELECT *
FROM fabricante
LIMIT 2 OFFSET 3;

-- 18.LLista el nom i el preu del producte més barat. (Utilitza solament les clàusules ORDER BY i LIMIT). NOTA: Aquí no podria usar MIN(preu), necessitaria GROUP BY.
SELECT nombre, precio
FROM producto
ORDER BY precio ASC LIMIT 1;
 
-- 19.LLista el nom i el preu del producte més car. (Utilitza solament les clàusules ORDER BY i LIMIT). NOTA: Aquí no podria usar MAX(preu), necessitaria GROUP BY.
SELECT nombre, precio
FROM producto 
ORDER BY precio DESC LIMIT 1;

-- 20.LLista el nom de tots els productes del fabricant el codi de fabricant del qual és igual a 2.
SELECT p.nombre
FROM producto p
JOIN fabricante f ON p.codigo_fabricante = f.codigo
WHERE f.codigo = 2;

-- 21.Retorna una llista amb el nom del producte, preu i nom de fabricant de tots els productes de la base de dades.
SELECT p.nombre AS nombre_producto, p.precio, f.nombre AS nombre_fabricante
FROM producto p
JOIN  fabricante f ON p.codigo_fabricante = f.codigo;

-- 22.Retorna una llista amb el nom del producte, preu i nom de fabricant de tots els productes de la base de dades. Ordena el resultat pel nom del fabricant, per ordre alfabètic.
SELECT p.nombre AS nombre_producto, p.precio, f.nombre AS nombre_fabricante
FROM producto p
JOIN  fabricante f ON p.codigo_fabricante = f.codigo
ORDER BY f.nombre ASC;

-- 23.Retorna una llista amb el codi del producte, nom del producte, codi del fabricador i nom del fabricador, de tots els productes de la base de dades.
SELECT p.codigo_fabricante AS codigo_producto, p.nombre AS nombre_producto, f.codigo AS codigo_fabricante, f.nombre AS nombre_fabricante
FROM producto p
JOIN  fabricante f ON p.codigo_fabricante = f.codigo;

-- 24.Retorna el nom del producte, el seu preu i el nom del seu fabricant, del producte més barat.
SELECT p.nombre AS nombre_producto, p.precio, f.nombre AS nombre_fabricante
FROM producto p
JOIN fabricante f ON p.codigo_fabricante = f.codigo
ORDER BY p.precio ASC LIMIT 1;

-- 25.Retorna el nom del producte, el seu preu i el nom del seu fabricant, del producte més car.
SELECT p.nombre AS nombre_producto, p.precio, f.nombre AS nombre_fabricante
FROM producto p
JOIN fabricante f ON p.codigo_fabricante = f.codigo
ORDER BY p.precio DESC LIMIT 1;

-- 26.Retorna una llista de tots els productes del fabricant Lenovo.
SELECT *
FROM producto p
JOIN fabricante f ON p.codigo_fabricante = f.codigo
WHERE f.nombre = 'Lenovo' ;

