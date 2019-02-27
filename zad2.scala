object Main {
def main(args: Array[String]) {
    var n = io.StdIn.readInt()
    var k = 0;
    var tab = new Array[String](n) 
    var lnght = new Array[Int](n)
    while(k<n){
        tab(k) = io.StdIn.readLine()
        k=k+1
    }
    var i = n-2
    var j = 0
    var temp = ""
    while(i>=1){
        j=0
        while(j<=i){
            if(tab(j).length==tab(j+1).length){
                if(tab(j)>tab(j+1)){
                    temp=tab(j)
                    tab(j)=tab(j+1)
                    tab(j+1)=temp
                }
            }
            else{
                if(tab(j).length>tab(j+1).length){
                    temp=tab(j)
                    tab(j)=tab(j+1)
                    tab(j+1)=temp
                }
            }
            j+=1
        }
        i-=1
    }
    println("Posortowane:")
    k=0
    while(k<n){
        println(tab(k))
        k=k+1
    }
    }
}