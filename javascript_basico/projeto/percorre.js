function percorreArray(trsPacientes, comportamento) {

  for (posicaoAtual = 0; posicaoAtual <= trsPacientes.length - 1; posicaoAtual++) {
    var pacienteTrAtual = trsPacientes[posicaoAtual];

    comportamento(pacienteTrAtual);
  }
}
