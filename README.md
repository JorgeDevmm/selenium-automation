# Selenium WebDriver Automation

Este proyecto surge como iniciativa de autoaprendizaje para estructurar un framework de automatización funcional con Selenium, Cucumber y Gradle, priorizando la modularidad, trazabilidad y compatibilidad real entre navegadores y entornos.

---

## 🧩 Datos técnicos

- Se eligió **JUnit 4** por su compatibilidad directa con `@RunWith(Cucumber.class)` y ejecución confiable desde consola.
- Se modularizó la arquitectura en capas, aplicando el patrón Page Object Model:
---

## 📦 Dependencias utilizadas

| Dependencia         | Propósito técnico                                  |
|---------------------|----------------------------------------------------|
| `selenium-java:4.35.0`       | Motor de automatización web                  |
| `cucumber-java`, `cucumber-junit` | Soporte para BDD con JUnit 4               |
| `webdrivermanager`           | Gestión automática de drivers               |
| `junit:4.13.2`               | Motor de pruebas compatible con Cucumber    |
| `testng`                     | Incluido para pruebas complementarias       |

---

## 📐 Convenciones adoptadas

- Los **localizadores** se definen exclusivamente en la capa `Page`.
- La clase `BasePage` contiene métodos reutilizables como `click`, `writeText`, `navigateTo`.
- `DriverFactory` encapsula la lógica de inicialización por navegador y modo (`incognito`, `headless`, etc.).

---

## 🧠 Punto de vista técnico

Este proyecto refleja una arquitectura defensiva y escalable, pensada para entornos reales donde la trazabilidad, la modularidad y la compatibilidad son prioritarias. Se evita el acoplamiento innecesario entre capas y se documenta cada decisión técnica para facilitar el mantenimiento y evolución del framework.