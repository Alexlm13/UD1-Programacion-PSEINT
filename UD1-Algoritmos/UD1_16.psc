Algoritmo UD1_16
	mostrar "Introduzca la distancia entre vehículos"
	leer dist
	mostrar "Introduzca la velocidad del coche más rápido"
	leer v1
	mostrar "Introduzca la velocidad del coche más lento"
	leer v2
	tiempo<-(dist/(v1-v2))*60
	mostrar "El coche mas rápido alcanzará al lento en ", tiempo, " minutos"
FinAlgoritmo
