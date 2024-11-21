
//> using scala 3.5.2
//> using toolkit 0.6.0

@main
def countFiles(): Unit =
    val paths = os.list(os.pwd)
    println(paths.length)