Algoritmo UD1_23
	mostrar "Elige la ubicación del servicio"
	leer zona
	mostrar "¿Cuánto pesa su paquete?"
	leer peso
	segun zona hacer
		1:
			mostrar "Ubicación: América del Sur"
			pesoFinal<-peso*24
			Si peso>5 Entonces
				Mostrar "Su paquete pesa más de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		2:
			mostrar "Ubicación: América del Sur"
			pesoFinal<-peso*20
			Si peso>5 Entonces
				Mostrar "Su paquete pesa más de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		3:
			mostrar "Ubicación: América del Sur"
			pesoFinal<-peso*21
			Si peso>5 Entonces
				Mostrar "Su paquete pesa más de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		4:
			mostrar "Ubicación: América del Sur"
			pesoFinal<-peso*10
			Si peso>5 Entonces
				Mostrar "Su paquete pesa más de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		5:
			mostrar "Ubicación: América del Sur"
			pesoFinal<-peso*18
			Si peso>5 Entonces
				Mostrar "Su paquete pesa más de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		De Otro Modo:
			mostrar "ERROR: Opción no válida"
	FinSegun
FinAlgoritmo
