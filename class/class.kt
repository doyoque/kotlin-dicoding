class Animal{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}
 
fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}
 
/*
output:
Fungsi Getter terpanggil
Nama: Dicoding Miaw
Fungsi Setter terpanggil
Fungsi Getter terpanggil
Nama: Goose
*/
