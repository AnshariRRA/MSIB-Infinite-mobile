package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini
    import java.util.*

    //Main Function , Entry point of Program
    fun main(args: Array<String>) {

        //array of subjects Names
        val subjectName = arrayOf<String>("masukan nilai anda")

        //Input Stream
        val scanner = Scanner(System.`in`)

        //Declare Array to Contain Subjects marks
        val marksArray = DoubleArray(1)

        //Start Input Subjects Marks
        println(" ")
        for(i in marksArray.indices){
            print("${subjectName[i]} : ")
            marksArray[i] = scanner.nextDouble()
        }

        //Calculate Total Marks in All Subjects
        val total = marksArray.sum()

        //Calculate Percentage
        val percentage = marksArray.average()

        //To find out Grade based on Percentage
        when{
            percentage>=90 -> println("Grade : A ")
            percentage>=80 -> println("Grade : B ")
            percentage>=70 -> println("Grade : C ")
            percentage >=60 -> println("Grade : D ")
            else -> println("Grade : Anda mendapatkan nilai E")
        }
    }

}