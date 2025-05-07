-- Insertar direcciones
INSERT INTO addresses (id, street) VALUES
(1, 'Calle Principal 123'),
(2, 'Avenida Central 456'),
(3, 'Paseo del Prado 789'),
(4, 'Gran Vía 101'),
(5, 'Calle Mayor 202');

-- Insertar profesores
INSERT INTO professors (id, name) VALUES
(1, 'Dr. García López'),
(2, 'Dra. Martínez Ruiz'),
(3, 'Prof. Rodríguez Sánchez');

-- Insertar estudiantes
INSERT INTO students (id, name, address_id) VALUES
(1, 'Ana Pérez', 1),
(2, 'Carlos Gómez', 2),
(3, 'Laura Fernández', 3),
(4, 'Miguel Torres', 4),
(5, 'Elena Ramírez', 5);

-- Insertar cursos
INSERT INTO courses (id, title, professor_id) VALUES
(1, 'Programación Java', 1),
(2, 'Bases de Datos', 2),
(3, 'Arquitectura de Software', 1),
(4, 'Desarrollo Web', 3),
(5, 'Inteligencia Artificial', 2);

-- Insertar relaciones estudiante-curso
INSERT INTO students_courses (student_id, course_id) VALUES
(1, 1), -- Ana toma Programación Java
(1, 2), -- Ana toma Bases de Datos
(2, 1), -- Carlos toma Programación Java
(2, 3), -- Carlos toma Arquitectura de Software
(3, 2), -- Laura toma Bases de Datos
(3, 4), -- Laura toma Desarrollo Web
(4, 3), -- Miguel toma Arquitectura de Software
(4, 5), -- Miguel toma Inteligencia Artificial
(5, 4), -- Elena toma Desarrollo Web
(5, 5); -- Elena toma Inteligencia Artificial