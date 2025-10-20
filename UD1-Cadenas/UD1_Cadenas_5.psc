Algoritmo UD1_Cadenas_5
	mostrar "Escriba su nombre y apellidos"
	leer nombre
	nombre<-Mayusculas(nombre)
	mostrar "Iniciales:"
	
	//Borra espacios al principio si los hay
	mientras Subcadena(nombre, i,i)=" " Hacer
		i<-i+1
	FinMientras
	
	//Saca las iniciales del nombre
	Para j<-i Hasta Longitud(nombre)-1
		si j=0 o subcadena(nombre,j-1,j-1)=" " Entonces
			Escribir sin saltar subcadena(nombre, j, j)
		FinSi
	Fin Para
FinAlgoritmo