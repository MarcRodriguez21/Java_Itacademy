-- ----------- Base de dades Universidad----------------
USE universidad;
-- 1.Retorna un llistat amb el primer cognom, segon cognom i el nom de tots els/les alumnes. El llistat haurà d'estar ordenat alfabèticament de menor a major pel primer cognom, segon cognom i nom.
SELECT apellido1 AS primer_apellido, apellido2 AS segundo_apellido, nombre
FROM persona
ORDER BY apellido1 ASC, apellido2 ASC, nombre ASC;

-- 2.Esbrina el nom i els dos cognoms dels alumnes que no han donat d'alta el seu número de telèfon en la base de dades.
SELECT apellido1 AS primer_apellido, apellido2 AS segundo_apellido, nombre
FROM persona
WHERE telefono IS NULL;

-- 3.Retorna el llistat dels alumnes que van néixer en 1999.
SELECT apellido1 AS primer_apellido, apellido2 AS segundo_apellido, nombre
FROM persona
WHERE fecha_nacimiento >= '1999-01-01' AND fecha_nacimiento < '2000-01-01';

-- 4.Retorna el llistat de professors/es que no han donat d'alta el seu número de telèfon en la base de dades i a més el seu NIF acaba en K.
SELECT apellido1 AS primer_apellido, apellido2 AS segundo_apellido, nombre
FROM persona
WHERE telefono IS NULL AND nif LIKE '%K' AND tipo = 'profesor';

-- 5.Retorna el llistat de les assignatures que s'imparteixen en el primer quadrimestre, en el tercer curs del grau que té l'identificador 7.
SELECT nombre AS nombre_asignatura
FROM asignatura
WHERE cuatrimestre = 1 AND id_grado = 7; 

-- 6.Retorna un llistat dels professors/es juntament amb el nom del departament al qual estan vinculats. El llistat ha de retornar quatre columnes, primer cognom, segon cognom, nom i nom del departament. El resultat estarà ordenat alfabèticament de menor a major pels cognoms i el nom.
SELECT p.nombre, p.apellido1, p.apellido2, d.nombre 
FROM persona p
JOIN profesor pr ON p.id = pr.id_profesor 
JOIN departamento d ON pr.id_departamento = d.id
WHERE tipo = 'profesor';

-- 7.Retorna un llistat amb el nom de les assignatures, any d'inici i any de fi del curs escolar de l'alumne/a amb NIF 26902806M.
SELECT p.nombre, p.nif, a.nombre, c.anyo_inicio, c.anyo_fin
FROM persona p
JOIN alumno_se_matricula_asignatura al ON p.id = al.id_alumno
JOIN asignatura a ON al.id_asignatura = a.id
JOIN curso_escolar c ON al.id_curso_escolar = c.id
WHERE p.nif = '26902806M';

-- 8.Retorna un llistat amb el nom de tots els departaments que tenen professors/es que imparteixen alguna assignatura en el Grau en Enginyeria Informàtica (Pla 2015).
SELECT DISTINCT d.nombre
FROM departamento d
JOIN profesor p ON d.id = p.id_departamento
JOIN asignatura a ON p.id_profesor = a.id_profesor
JOIN grado g ON a.id_grado = g.id
WHERE g.nombre = 'Grado en Ingeniería Informática (Plan 2015)';

-- 9.Retorna un llistat amb tots els alumnes que s'han matriculat en alguna assignatura durant el curs escolar 2018/2019.
SELECT DISTINCT p.nombre AS nombre_alumno, p.nif AS nif_alumno
FROM persona p
JOIN alumno_se_matricula_asignatura al ON p.id = al.id_alumno
JOIN curso_escolar c ON al.id_curso_escolar = c.id
WHERE c.anyo_inicio = '2018' AND c.anyo_fin = '2019';

----------- Resol les 6 següents consultes utilitzant les clàusules LEFT JOIN i RIGHT JOIN.

-- 1.Retorna un llistat amb els noms de tots els professors/es i els departaments que tenen vinculats. El llistat també ha de mostrar aquells professors/es que no tenen cap departament associat. El -- LListat ha de -- Retornar quatre columnes, nom del departament, primer cognom, segon cognom i nom del professor/a. El resultat estarà ordenat alfabèticament de menor a major pel nom del departament, cognoms i el nom.
SELECT d.nombre AS nombre_departamento, pe.apellido1 AS primer_apellido, pe.apellido2 AS segundo_apellido, pe.nombre AS nombre_profesor
FROM profesor p
JOIN persona pe ON p.id_profesor = pe.id
LEFT JOIN departamento d ON p.id_departamento = d.id
ORDER BY nombre_departamento, primer_apellido, segundo_apellido, nombre_profesor;

-- 2.Retorna un llistat amb els professors/es que no estan associats a un departament.
SELECT p.id_profesor, pe.nombre, pe.apellido1, pe.apellido2
FROM profesor p
JOIN persona pe ON p.id_profesor = pe.id
LEFT JOIN departamento d ON p.id_departamento = d.id
WHERE d.id IS NULL;

-- 3.Retorna un llistat amb els departaments que no tenen professors/es associats.
SELECT d.id, d.nombre AS nombre_departamento
FROM departamento d
LEFT JOIN profesor p ON d.id = p.id_departamento
WHERE p.id_departamento IS NULL;

-- 4.Retorna un llistat amb els professors/es que no imparteixen cap assignatura.
SELECT p.id_profesor, pe.nombre AS nombre_profesor, d.nombre AS nombre_departamento
FROM profesor p
JOIN departamento d ON p.id_departamento = d.id
JOIN persona pe ON p.id_profesor = pe.id
LEFT JOIN asignatura a ON p.id_profesor = a.id_profesor
WHERE a.id_profesor IS NULL;

-- 5.Retorna un llistat amb les assignatures que no tenen un professor/a assignat.
USE universidad;
SELECT a.id AS id_asignatura, a.nombre AS nombre_asignatura
FROM asignatura a
LEFT JOIN profesor p ON a.id_profesor = p.id_profesor
WHERE p.id_profesor IS NULL;

-- 6.Retorna un llistat amb tots els departaments que no han impartit assignatures en cap curs escolar.
SELECT DISTINCT d.id AS id_departamento, d.nombre AS nombre_departamento
FROM departamento d
LEFT JOIN profesor p ON d.id = p.id_departamento
LEFT JOIN asignatura a ON p.id_profesor = a.id_profesor
LEFT JOIN curso_escolar ce ON a.id = ce.id
WHERE ce.id IS NULL;


----------------- Consultes resum: 

-- 1.Retorna el nombre total d'alumnes que hi ha.
SELECT count(*) AS total_alumnos
FROM persona
WHERE tipo = 'alumno';

-- 2.Calcula quants alumnes van néixer en 1999.
SELECT count(*) AS total_alumnos
FROM persona
WHERE tipo = 'alumno' AND fecha_nacimiento >= '1999-01-01' AND fecha_nacimiento < '2000-01-01';

-- 3.Calcula quants professors/es hi ha en cada departament. El resultat només ha de mostrar dues columnes, una amb el nom del departament i una altra amb el nombre de professors/es que hi ha en aquest departament. El resultat només ha d'incloure els departaments que tenen professors/es associats i haurà d'estar ordenat de major a menor pel nombre de professors/es.
SELECT d.nombre AS nombre_departamento, COUNT(p.id_profesor) AS cantidad_profesores
FROM departamento d
LEFT JOIN profesor p ON d.id = p.id_departamento
GROUP BY d.nombre
ORDER BY cantidad_profesores DESC;

-- 4.Retorna un llistat amb tots els departaments i el nombre de professors/es que hi ha en cadascun d'ells. Tingui en compte que poden existir departaments que no tenen professors/es associats. Aquests departaments també han d'aparèixer en el llistat.
SELECT d.nombre AS nombre_departamento, COUNT(p.id_profesor) AS cantidad_profesores
FROM departamento d
LEFT JOIN profesor p ON d.id = p.id_departamento
GROUP BY d.nombre;

-- 5.Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun. Tingues en compte que poden existir graus que no tenen assignatures associades. Aquests graus també han d'aparèixer en el llistat. El resultat haurà d'estar ordenat de major a menor pel nombre d'assignatures.
SELECT g.nombre AS nombre_grado, COUNT(a.id) AS cantidad_asignaturas
FROM grado g
LEFT JOIN asignatura a ON g.id = a.id_grado
GROUP BY g.nombre
ORDER BY cantidad_asignaturas DESC;

-- 6.Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun, dels graus que tinguin més de 40 assignatures associades.
SELECT g.nombre AS nombre_grado, COUNT(a.id) AS cantidad_asignaturas
FROM grado g
LEFT JOIN asignatura a ON g.id = a.id_grado
GROUP BY g.nombre
HAVING COUNT(a.id) > 40
ORDER BY cantidad_asignaturas DESC;

-- 7.Retorna un llistat que mostri el nom dels graus i la suma del nombre total de crèdits que hi ha per a cada tipus d'assignatura. El resultat ha de tenir tres columnes: nom del grau, tipus d'assignatura i la suma dels crèdits de totes les assignatures que hi ha d'aquest tipus.
SELECT g.nombre AS nombre_grado, a.tipo, SUM(a.creditos) AS total_creditos
FROM grado g
LEFT JOIN asignatura a ON g.id = a.id_grado
GROUP BY g.nombre, a.tipo;

-- 8.Retorna un llistat que mostri quants alumnes s'han matriculat d'alguna assignatura en cadascun dels cursos escolars. El resultat haurà de mostrar dues columnes, una columna amb l'any d'inici del curs escolar i una altra amb el nombre d'alumnes matriculats.
SELECT ce.anyo_inicio, COUNT(DISTINCT a.id_alumno) AS num_alumnos_matriculados
FROM curso_escolar ce
LEFT JOIN alumno_se_matricula_asignatura a ON ce.id = a.id_curso_escolar
GROUP BY ce.anyo_inicio;


-- 9.Retorna un llistat amb el nombre d'assignatures que imparteix cada professor/a. El llstat ha de tenir en compte aquells professors/es que no imparteixen cap assignatura. El resultat mostrarà cinc columnes: id, nom, primer cognom, segon cognom i nombre d'assignatures. El resultat estarà ordenat de major a menor pel nombre d'assignatures.
SELECT p.id, p.nombre, p.apellido1, p.apellido2, COUNT(a.id_profesor) AS num_asignaturas
FROM persona p
LEFT JOIN profesor pr ON p.id = pr.id_profesor
LEFT JOIN asignatura a ON pr.id_profesor = a.id_profesor
WHERE p.tipo = 'profesor'
GROUP BY p.id, p.nombre, p.apellido1, p.apellido2
ORDER BY num_asignaturas DESC;

-- 10.Retorna totes les dades de l'alumne/a més jove.
SELECT DISTINCT *
FROM persona p
WHERE tipo = 'alumno'
ORDER BY fecha_nacimiento DESC 
LIMIT 1;

-- 11.Retorna un llistat amb els professors/es que tenen un departament associat i que no imparteixen cap assignatura.
SELECT p.id_profesor AS id_profesor, pe.nombre AS nombre_profesor, d.nombre AS nombre_departamento
FROM profesor p
JOIN persona pe ON p.id_profesor = pe.id
JOIN departamento d ON p.id_departamento = d.id
LEFT JOIN asignatura a ON p.id_profesor = a.id_profesor
WHERE a.id_profesor IS NULL;

