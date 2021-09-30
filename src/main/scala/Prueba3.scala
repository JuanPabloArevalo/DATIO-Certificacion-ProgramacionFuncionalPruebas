object Main2 extends App {

  class Node(private var name: String, private var description: String) {
    def getName() = name
    def getDescription() = description
    def setName(name: String) = this.name = name
    def setDescription(desc: String) = this.description = desc
    override def toString() = s"Name: $name, Description: $description"
  }

  class Edge(val firstNode: Node, val secondNode: Node, private val tag: String) {
    def getTag() = tag
    override def toString() = s"FirstNode: $firstNode, SecondNode: $secondNode, Tag: $tag"
  }

  class DataStructure(var name: String, var description: String, nodes: List[Node], edges: List[Edge]) {
    override def toString() = s"Name: $name, Description: $description, Nodes: $nodes, Edges: $edges"
  }

  class DataStructureForest(val name: String, val dataStructures: List[DataStructure]) {
    override def toString() = s"Name: $name, DataStructures: $dataStructures"
  }

  //new DataStructure("nombre", "desc", Nil, Nil).

  abstract class Prueba{
    def pruebita = println("Hola")
    def pruebota
  }

  class Hola3 extends Prueba{
    def prueba5 = println("Chao")

    override def pruebota: Unit = print("SI")
  }

  new Hola3().prueba5
}

