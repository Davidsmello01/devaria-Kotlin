fun main() {
    println("Favod informar o nome do convidado:")
    val nome = readLine()

    if (nome.isNullOrEmpty() || nome.isBlank()){
        println("Nome informado não é válido!")
        return
    }
    println("Favor informar a Idade do convidado:")
    val idade = readLine()?.toIntOrNull()

    if (idade== null || idade<=0){
        println("Idade informada não é válido!")
        return
    }

    var estaconvidado = false
    when(nome){
        "Kaiq" -> estaconvidado = true
        "ale" -> estaconvidado = true
        "Rick" -> estaconvidado = true
        "Alan" -> estaconvidado = true
        "Nois" -> estaconvidado = true
        else -> estaconvidado = false
    }

    if (estaconvidado && idade >= 18){
        println("Bem vindo a festa!")
    }else if(!estaconvidado){
        println("Voce não esta na lista de convidados")
    }else{
        print("Você não tem idade para a festa!")
    }


}


