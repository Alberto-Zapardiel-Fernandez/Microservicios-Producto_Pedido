# Microservicios-Producto_Pedido
<h3>Este proyecto consta de 2 partes:</h3>
<ol>
  <li><b>Productos</b></li>
  <h4>Es el encargado de conectar con la tabla <i>productos</i> de la base de datos.</h4>
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
  <h4>Es el encargado de conectar con la tabla <i>pedidos</i> de la base de datos.</h4>
  Tenemos una entity llamada Pedido, que tiene unas variables:
  <ul>
    <li>idPedido: Es el identificador único para cada pedido</li>
    <li>codigoProducto: Es el identificador del producto que conforma el pedido</li>
    <li>unidades: Referido al número de productos. Con este actualizaremos la tabla <b><i>producto</i></b></li>
    <li>total: El precio del producto * las unidades</li>
    <li>fechaPedido: La fecha cuando ha sido realizado el pedido</li>
  </ul>
  <p>A su vez tiene un constructor con los parámetros de estas variables y sus getters y setters</p>
  <h4>También tenemos la clase <b><i>ProductoPedido</i></b> que es la clase espejo de Producto para almacenar los datos del producto que necesitemos traer de la otra tabla.</h4>
  <p>Tenemos el paquete <b>app</b> que es el punto de entrada y en el que llamaremos a RestTemplate para poder comunicarnos con la otra tabla de productos.</p>
  <p>También el paquete <b>repository</b> que es el encargado de conectar con JpaRepository para tener sus métodos de persistencia.</p>
  <p>Contamos con un paquete <b>controller</b> el cual es el encargado de definir las rutas y los métodos (<i>GET y POST</i>) para obtener los datos de los productos o para actualizarlos</p>
  <p>Por último tenemos el paquete <b>service</b> que es el encargado de implementar la lógica de los métodos y hacer las llamadas a la <i>BD</i></p>
  <p>En este tendremos los métodos para ver los pedidos y los productos, además, tendremos el método altaPedido, el cual, recibe por parámetros el idProducto y las unidades</p>
  <p>Dentro haremos una llamada al microservicio producto y nos devolverá el precio del producto pasando su id de producto. Para terminar tendremos que hacer la llamada put para modificar el producto que tenga ese ID y le pasaremos las unidades para que sean modificadas</p>
</ol>
<h4>Los puertos utilizados para cada servicio son:</h4>
<ol>
  <li>puerto 7000 - para las llmadas desde el microservicio Pedido</li>
  <li>puerto 8000 - para las llmadas desde el microservicio Producto</li>
</ol>
