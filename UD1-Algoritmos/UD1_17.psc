Algoritmo ejercicio17
	MOSTRAR "Introduzca la hora, minutos y segundos de salida"
	LEER h, m, s
	MOSTRAR "Tiempo del viaje en segundos"
	LEER t
	tS<- h*3600+m*60+s+t
	h<- trunc(tS/3600)
	tS<-tS-(h*3600)
	m<- trunc(tS/60)
	s<- trunc(tS-(m*60))
	SI h>=24 Entonces
		h<-h-24
	FinSi
	MOSTRAR "La hora de llegada es a las: ", h, ":", m, ":", s
FinAlgoritmo