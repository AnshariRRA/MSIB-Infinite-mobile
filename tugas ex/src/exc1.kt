fun main(){
    val namadepan: String = " anshari rra"
    println("nama depan : $namadepan")
    val nmaakhir: String ="arief"
    println("nama belakang  : $nmaakhir")
    val sex: String ="pria"
    println("jenis kelamin  : $sex")
    val umr: Int = 20
    println("umur anda  : $umr")

    val single: Boolean = false
    val tdksingle: Boolean = true

    println("satus kamu adalah =" + (single && tdksingle))
    println("satus kamu adalah =" + (single || tdksingle))
    println("satus kamu adalah =" + (!tdksingle))
    println("satus kamu adalah =" + (single > tdksingle))
}
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println(groupId)
    println(groupMember)
    println(session)
    return arrayOf(groupId, groupMember, session)
}
