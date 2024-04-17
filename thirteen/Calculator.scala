object Calculator {
  def main(args: Array[String]): Unit = {
    val input = "2 * 3 ="
    val parts = input.split(" ")
    val num1 = parts(0).toInt
    val operator = parts(1)
    val num2 = parts(2).toInt

    val result = operator match {
      case "+" => num1 + num2
      case "-" => num1 - num2
      case "*" => num1 * num2
      case "/" => num1 / num2
      case _ => throw new Exception("Invalid operator")
    }

    println(s"$num1 $operator $num2 = $result")
  }
}

/*
-----------------------------------------------------------
Output
-----------------------------------------------------------
2 * 3 = 6
*/
