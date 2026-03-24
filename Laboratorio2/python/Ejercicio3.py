# Clase MiPunto
#
# @author Escobar Herbas Reynaldo Jair
# @version 1.0 24/03/2026
#
import math

class Vector3D:
    def __init__(self, x=0.0, y=0.0, z=0.0):
        """Constructor"""
        self.x = float(x)
        self.y = float(y)
        self.z = float(z)

    def __add__(self, otro):
        return Vector3D(self.x + otro.x, self.y + otro.y, self.z + otro.z)

    #(multiplicación por escalar)
    # a * r
    def __mul__(self, escalar):
        return Vector3D(escalar * self.x, escalar * self.y, escalar * self.z)

    # r * a (para permitir multiplicación por la izquierda)
    def __rmul__(self, escalar):
        return self.__mul__(escalar)

    # Sobrecarga del operador - (resta de vectores)
    def __sub__(self, otro):
        return Vector3D(self.x - otro.x, self.y - otro.y, self.z - otro.z)

    # Sobrecarga del operador unario - (negativo del vector)
    def __neg__(self):
        return Vector3D(-self.x, -self.y, -self.z)

    # Sobrecarga de abs()
    def __abs__(self):
        return math.sqrt(self.x**2 + self.y**2 + self.z**2)

    # Normalización: vector unitario
    def normalizar(self):
        magnitud = abs(self)
        if magnitud == 0:
            return Vector3D()  # vector nulo, no se puede normalizar
        return Vector3D(self.x / magnitud, self.y / magnitud, self.z / magnitud)

    # Producto escalar (dot product)
    def producto_escalar(self, otro):
        return self.x * otro.x + self.y * otro.y + self.z * otro.z

    # Producto vectorial (cross product)
    def producto_vectorial(self, otro):
        return Vector3D(
            self.y * otro.z - self.z * otro.y,
            self.z * otro.x - self.x * otro.z,
            self.x * otro.y - self.y * otro.x
        )

    # Perpendicularidad por diagonales iguales: |a + b| == |a - b|
    def es_perpendicular(self, otro):
        suma = self + otro
        resta = self - otro
        return math.isclose(abs(suma), abs(resta), rel_tol=1e-9)

    # Proyección ortogonal de self sobre otro
    def proyeccion(self, otro):
        # (a·b / |b|²) * b
        escalar = self.producto_escalar(otro) / (abs(otro)**2)
        return escalar * otro

    # Componente escalar de self en la dirección de otro
    def componente(self, otro):
        # (a·b) / |b|
        return self.producto_escalar(otro) / abs(otro)

    # Representación como string
    def __str__(self):
        return f"({self.x:.2f}, {self.y:.2f}, {self.z:.2f})"

    # Repr para depuración
    def __repr__(self):
        return f"Vector3D({self.x}, {self.y}, {self.z})"
    
if __name__ == "__main__":
    # Crear vectores
    a = Vector3D(1, 0, 0)
    b = Vector3D(0, 1, 0)
    c = Vector3D(2, 3, 4)

    print("a =", a)
    print("b =", b)
    print("c =", c)

    # Suma
    print("a + b =", a + b)

    # Multiplicación por escalar
    print("2 * c =", 2 * c)
    print("c * 3 =", c * 3)

    # Longitud
    print("|c| =", abs(c))

    # Normalización
    print("c normalizado =", c.normalizar())
    print("|c normalizado| =", abs(c.normalizar()))

    # Producto escalar
    print("a · b =", a.producto_escalar(b))

    # Producto vectorial
    print("a × b =", a.producto_vectorial(b))

    # Perpendicularidad
    print("¿a perpendicular a b?", a.es_perpendicular(b))
    print("¿a perpendicular a c?", a.es_perpendicular(c))

    # Proyección de c sobre a
    print("Proyección de c sobre a =", c.proyeccion(a))

    # Componente de c en a
    print("Componente de c en a =", c.componente(a))

    # Otro ejemplo: vectores perpendiculares por definición
    d = Vector3D(2, 3, 4)
    e = Vector3D(-2, -3, -4)  # opuesto, no perpendicular
    print("¿d perpendicular a e?", d.es_perpendicular(e))