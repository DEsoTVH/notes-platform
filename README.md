API de notas en evolución, enfocada en buenas prácticas, aprendizaje continuo y arquitectura limpia.

# Notes Platform – Backend API

## 🧠 Visión del proyecto

**Notes Platform** es una API backend moderna para gestión de notas personales, diseñada como un producto real y escalable.

Este proyecto no es un ejercicio ni una demo: es una plataforma en evolución continua, pensada para crecer en funcionalidades, calidad técnica y buenas prácticas de ingeniería de software.

El objetivo es construir **la mejor aplicación de notas posible**, priorizando:

* Código limpio y mantenible
* Arquitectura moderna
* Seguridad
* Escalabilidad
* Preparación para entornos reales (empresas, producción, cloud)

---

## 🧩 Qué resuelve

La plataforma permite a los usuarios:

* Crear notas
* Listar notas
* Editar notas
* Eliminar notas
* (Próximamente) autenticarse y gestionar sus propios datos

---

## 🛠️ Stack tecnológico

### Backend

* Java 21 (LTS)
* Spring Boot 3.x
* Spring Web (REST API)
* Spring Data JPA
* Spring Security
* Hibernate

### Infraestructura

* PostgreSQL
* Docker & Docker Compose

### Herramientas

* Maven
* Postman (testing manual)
* IntelliJ IDEA

---

## 🏗️ Arquitectura

El proyecto sigue una arquitectura en capas:

```
Controller → Service → Domain → Persistence
```

* **Controller**: expone endpoints REST
* **Service**: contiene la lógica de negocio
* **Domain**: modelos del dominio
* **Persistence**: acceso a datos (JPA)

Esta separación permite:

* Escalabilidad
* Testeo
* Mantenimiento a largo plazo

---

## 🚀 Endpoints actuales

### Obtener notas

```
GET /api/notes
```

### Crear nota

```
POST /api/notes
Content-Type: application/json

{
  "title": "Mi nota",
  "content": "Contenido de la nota"
}
```

---

## 🧭 Roadmap del proyecto

### ✅ Fase 1 – Fundamentos (actual)

* [x] API REST básica
* [x] Arquitectura Controller–Service
* [x] CRUD inicial de notas
* [x] Testing con Postman

### 🔜 Fase 2 – Persistencia

* [ ] Integración con PostgreSQL
* [ ] Repositorios JPA
* [ ] Migraciones de base de datos

### 🔐 Fase 3 – Seguridad

* [ ] Spring Security
* [ ] Autenticación con JWT
* [ ] Usuarios y roles

### 🧪 Fase 4 – Calidad

* [ ] Tests unitarios (JUnit)
* [ ] Tests de integración
* [ ] Manejo global de errores

### 📦 Fase 5 – Producción

* [ ] Dockerización completa
* [ ] Variables de entorno
* [ ] Documentación OpenAPI / Swagger

### ☁️ Fase 6 – Escalabilidad

* [ ] Preparación para cloud
* [ ] Observabilidad básica
* [ ] Buenas prácticas de microservicios

---

## 🎯 Objetivo profesional

Este proyecto es parte de un plan de crecimiento como **Backend Developer**, enfocado en:

* Tecnologías actuales
* Buenas prácticas reales de la industria
* Preparación para roles senior y semi-senior

---

## 👤 Autor

**Sebastián Flores**
Backend Developer – Java / Spring Boot

---

> Este proyecto evoluciona constantemente. Cada mejora representa aprendizaje aplicado a un contexto real.
