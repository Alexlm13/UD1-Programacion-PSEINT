Algoritmo UD1_10_Segun
		mostrar "Escriba la nota de las tres calificaciones"
		leer nota1
		leer nota2
		leer nota3
		media<-trunc((nota1+nota2+nota3)/3)
		
		mostrar "Escriba la nota del examen final"
		leer examen
		mostrar "Escrina la nota del trabajo final"
		leer trabajo
		notaFinal<-trunc((media*0.55)+(examen*0.30)+(trabajo*0.15))
		mostrar "La nota final del alumno es: ",notaFinal
		
		segun notaFinal Hacer
			0, 1, 2, 3, 4:
				mostrar "Suspenso"
			5, 6:
				Mostrar "Bien"
			7, 8, 9:
				mostrar "Notable"
			10:
				mostrar "Sobresaliente"
			de otro modo:
				mostrar "Su nota no es válida"
		FinSegun
FinAlgoritmo
