class Jugador (val nombre: String, val seccion_tablero: String, var gemas: Int, var mazo_cartas= Int, var mano_cartas= Int){
  def JugarCarta(carta: Int){}

  def RobarCarta(): Unit = {
    mazo_cartas-=1 : Int
    mano_cartas+=1

  }

}
