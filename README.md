# Objetos remotos usando RMI
## Comunicación de procesos

Los sistemas distribuidos requieren que los procesos (programas en ejecución) se ejecuten en diferentes espacios de máquinas.
En un mecanismo de comunicación básico, el lenguaje java soporta sockets, los cuales son
flexibles y suficientes para una comunicación general.

Una alternativa para los sockets son los RPC (Remote Procedure Call) los cuales extraen la
interfaz de comunicación del nivel de una llamada a procedimiento. Un modelo equivalente
en el paradigma orientado a objetos son los objetos distribuidos. Los objetos distribuidos
pueden ser implementados usando java mediante RMI.

RMI permite que una aplicación se comunique con objetos que se encuentran en procesos
que se ejecutan en máquinas remotas. En lugar de crear un objeto, se liga un objeto remoto
con un representante local, conocido como stub. Los mensajes dirigidos al objeto remoto se
envían al stub local, como si este fuera el objeto remoto. El stub acepta los mensajes que se
le envíen, y a su vez, los envía al objeto remoto, el cual invoca sus métodos apropiados. El
resultado de la invocación de los métodos en el objeto remoto se envían de regreso al stub
local, que los reenvía al emisor original de la llamada.
