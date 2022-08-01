object test3{
    def main(args: Array[String])={
        def upper(name:String):String= name.toUpperCase()

        def lower(name:String):String= name.toLowerCase()
   
        def formatNames(name:String,method:Int,character:String,position:Int):String={
            var str=""
            var char=""
            for(i<-0 to name.length()-1){
                if(name(i).toString==character && i==position-1){
                    if(method==1){
                        char=upper(character)
                    }
                    else{
                        char=lower(character)
                    }
                    str=str+char
                }
                else{
                    str=str+name(i)
                }
            }
            return str
        }
        println(upper("Benny"))
        
        println(formatNames("Niroshan",1,"i",2))

        println(lower("Saman"))

        println(formatNames("Kumara",1,"a",6))
    }
}