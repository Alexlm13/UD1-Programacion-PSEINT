Algoritmo UD1_bucles_7
	suma<-0
	fuera<-0
	iguales<-0
	
	REPETIR
		MOSTRAR "Introduce el l�mite inferior del intervalo"
		LEER liminf
		MOSTRAR "Introduce el l�mite superior del intervalo"
		LEER limsup
		SI liminf>limsup Entonces
			MOSTRAR "El l�mite inferior no puede ser mayor que el superior, introduza un n�mero nuevo"
		FinSi
	Hasta Que liminf<=limsup
	REPETIR
		MOSTRAR "Introduce un n�mero (0 para terminar)"
		LEER num
		Si num<> 0 Entonces
			SI num = liminf o num = limsup Entonces
				iguales<- iguales+1
			FinSi
			Si num>limin Y num<limsup Entonces
				suma<-suma+1
			SiNo
				fuera<-fuera+1
			FinSi
		FinSi
	Hasta Que num=0
	MOSTRAR "La suma de los n�meros dentro del intervalo es: ", suma
	MOSTRAR "La cantidad de n�meros fuera del intervalo es: ", fuera
	MOSTRAR "La cantidad de n�meros iguales a los l�mites del intervalo es: ", iguales
	
FinAlgoritmo