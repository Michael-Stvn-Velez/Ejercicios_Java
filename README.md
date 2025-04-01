# 🚀 Proyecto Java - Equipo

Aplicación Java con ejecuciones independientes a través de métodos `main()` en paquetes separados.

## 📁 Estructura del Proyecto

```
src/
├── punto1/
│   └── Main.java
├── punto2/
│   └── Main.java
└── ...
.gitignore
README.md
```

## 🛠️ Requisitos

- Java JDK 11 o superior
- Git

## 🏁 Primeros Pasos

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/Michael-Stvn-Velez/Ejercicios_Java.git
   cd tu-proyecto
   ```

## 📝 Convenciones de Código

- **Paquetes**: Formato `puntoX` (ejemplos: `punto1`, `punto2`)
- **Clases**: PascalCase (`MiClase.java`)
- **Métodos**: camelCase (`calcularTotal()`)
- **Documentación**: Javadoc obligatorio para todas las clases y métodos públicos

  ```java
  /**
   * Descripción clara del propósito del método o clase
   * @param param1 Descripción del parámetro
   * @return Descripción del valor de retorno
   */
  ```

## 🔄 Flujo de Trabajo

1. **Crear una rama** para tu tarea:
   ```bash
   git checkout -b feature/punto3
   ```

2. **Compilar y probar** tu implementación:
   ```bash
   javac -d bin src/punto{n}/*.java
   java -cp bin puntoX.Main
   ```

3. **Hacer commit** con mensajes descriptivos:
   ```bash
   git add .
   git commit -m "feat(punto3): Agrega validación de entrada"
   ```

## 🔀 Proceso de Pull Request

1. **Sincronizar** tu rama con `main`:
   ```bash
   git pull origin main
   ```

2. **Publicar** tu rama:
   ```bash
   git push origin feature/punto3
   ```

3. **Crear un Pull Request** en GitHub con:
   - Descripción detallada del cambio implementado
   - Capturas de pantalla (si es aplicable)
   - Asignación de revisores

## 📚 Documentación

Generar la documentación JavaDoc:
```bash
javadoc -d docs -sourcepath src -subpackages punto1 punto2
```

Para visualizar la documentación, abrir `docs/index.html` en cualquier navegador.

## ✅ Buenas Prácticas

- ✔️ Verificar el funcionamiento del código antes de hacer commit
- ✔️ Mantener el README actualizado si se agregan nuevas dependencias
- ✔️ Utilizar issues para reportar bugs o proponer mejoras
- ✔️ Comentar adecuadamente el código para facilitar su comprensión

## 📧 Contacto

¿Preguntas o dudas? Escribe a [tu-email@dominio.com](mailto:tu-email@dominio.com)

---

✨ **¡Gracias por contribuir!** ✨