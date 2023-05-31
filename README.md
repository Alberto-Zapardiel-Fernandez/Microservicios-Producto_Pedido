# Microservicios-Producto_Pedido
<h3>Este proyecto consta de 2 partes:</h3>
<ol>
  <li><b>Productos</b></li>
  <h4>Es el encargado de conectar con la tabla productos de la base de datos.</h4>
  Tenemos una entity llamada Producto, que tiene unas variables:
  <ul>
    <li>codigoProducto: Es el identificador único para cada producto</li>
    <li>nombreProducto</li>
    <li>precioUnitario</li>
    <li>stock</li>
  </ul>
  <p>A su vez tiene un constructor con los parámetros de estas variables y sus getters y setters</p>
  <p>Tenemos el paquete <b>app</b> que es el punto de entrada</p>
  <p>También el paquete <b>repository</b> que es el encargado de conectar con JpaRepository para tener sus métodos de persistencia.</p>
  <p>Contamos con un paquete <b>controller</b> el cual es el encargado de definir las rutas y los métodos (<i>GET y POST</i>) para obtener los datos de los productos o para actualizarlos</p>
  <p>Por último tenemos el paquete <b>service</b> que es el encargado de implementar la lógica de los métodos y hacer las llamadas a la <i>BD</i></p>
  <li><b>Pedidos</b></li>
</ol>
