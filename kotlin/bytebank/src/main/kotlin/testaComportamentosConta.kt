private fun testaComportamentosConta() {
    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta(titular = "Fran", numero = 1001)
    contaAlex.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    if (contaFran.transfere(100.00, contaAlex)) {
        println("Transferência realizada com sucesso.")
    } else {
        println("Falha na transferência.")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}

