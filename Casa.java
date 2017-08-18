class Casa
{
   //variables de instancia
   Circle ventana;
   Triangle techo;
   Square pared;
   Square puerta;
   
   //constructor
   Casa()
   {
       ventana = new Circle();
       techo = new Triangle();
       pared = new Square();
       puerta = new Square();
   }
   
   //metodos
   void dibujate()
   {
       ventana.makeVisible();
       techo.makeVisible();
       pared.makeVisible();
       puerta.makeVisible();
   }
   
   void acomodate()
   {
       techo.moveHorizontal(100);
       techo.changeSize(60,60);
       techo.moveVertical(50);
       ventana.moveHorizontal(120);
       ventana.changeSize(20);
       ventana.moveVertical(40);
       pared.moveHorizontal(60);
       pared.changeSize(60);
       pared.moveVertical(75);
       puerta.moveHorizontal(75);
       puerta.changeColor("yellow");
       puerta.changeSize(30);
       puerta.moveVertical(105);
       
   }


}