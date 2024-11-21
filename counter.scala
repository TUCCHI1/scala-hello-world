
//> using scala 3.5.2
//> using dep "com.lihaoyi::os-lib:0.11.3"

@main
def countFiles(): Unit =
    val paths = os.list(os.pwd)
    println(paths.length)