object test2{
    def result(input:Int):String=input match{
            case x if x<=0 => "Negative or Zero input"
            case x if x%2==0 => "Input is a even number"
            case _ => "Input is a odd number"
    }
    def main(args: Array[String])={
        
        printf("Enter the number: ")
        val input:Int= scala.io.StdIn.readLine.toInt
        println(result(input))
        
    }
    
}