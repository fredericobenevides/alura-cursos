var soap =  require('soap');

function CorreiosSOAPCLient() {
  this._url = 'http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx?wsdl';
}

module.exports = function() {
  return CorreiosSOAPCLient;
}

CorreiosSOAPCLient.prototype.calculaPrazo = function(args, callback) {
  soap.createClient(this._url, function(erro, cliente) {
    console.log('cliente soap criado');
    cliente.CalcPrazo(args, callback);
  });
}

