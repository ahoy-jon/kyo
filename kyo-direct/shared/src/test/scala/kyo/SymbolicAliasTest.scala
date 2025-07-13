package kyo

class SymbolicAliasTest extends Test:
    
    "!" in pendingUntilFixed {
        def f(i:Int): Int < Any = i + 1
        typeCheck(
            """
              |direct:
              | f(1).!
              |
              |""".stripMargin)
        
    }