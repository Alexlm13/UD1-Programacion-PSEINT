Algoritmo UD1_23
	mostrar "Elige la ubicaci�n del servicio"
	leer zona
	mostrar "�Cu�nto pesa su paquete?"
	leer peso
	segun zona hacer
		1:
			mostrar "Ubicaci�n: Am�rica del Sur"
			pesoFinal<-peso*24
			Si peso>5 Entonces
				Mostrar "Su paquete pesa m�s de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		2:
			mostrar "Ubicaci�n: Am�rica del Sur"
			pesoFinal<-peso*20
			Si peso>5 Entonces
				Mostrar "Su paquete pesa m�s de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		3:
			mostrar "Ubicaci�n: Am�rica del Sur"
			pesoFinal<-peso*21
			Si peso>5 Entonces
				Mostrar "Su paquete pesa m�s de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		4:
			mostrar "Ubicaci�n: Am�rica del Sur"
			pesoFinal<-peso*10
			Si peso>5 Entonces
				Mostrar "Su paquete pesa m�s de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		5:
			mostrar "Ubicaci�n: Am�rica del Sur"
			pesoFinal<-peso*18
			Si peso>5 Entonces
				Mostrar "Su paquete pesa m�s de 5kg, no se puede transportar"
			SiNo
				mostrar "El costo de la entrega es de: ", pesoFinal," euros"
			FinSi
		De Otro Modo:
			mostrar "ERROR: Opci�n no v�lida"
	FinSegun
FinAlgoritmo
