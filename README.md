# AlgoritmoPopeye

Este algoritmo determina el mayor cardinal de los conjuntos estables de un grafo

El programa esta hecho en Java y orientado a objetos. Tiene 3 clases

La clase Nodo, que es donde se define cada vertice y tiene 3 atributos, el identificador del nodo y tambien tiene un arreglo para almacenar los nodos que son adayacentes a él y otro arreglo para almacenar los nodos que no son adyacentes a él.

La clase aplicación es la que hace la lógica para conectar a los nodos y para calcular el mayor cardinal de los conjuntos estables del grafo. 

Para calcular el Mayor cardinal del conjunto no adyacente se hace lo siguiente:

-Se recorre todos los nodos del grafo
-Por cada nodo, se recorre todos los nodos, incluyendo al nodo en que el ciclo esta posicionando. Se verifica que los nodos que se estan interando no son adyacentes con el nodo posición. Si no son adyacentes entonces el nodo iterado se une al conjunto estable del nodo posicion y se verifica si la cantidad de este conjunto es mayor a un acumulador que determina el mayor cardinal.
