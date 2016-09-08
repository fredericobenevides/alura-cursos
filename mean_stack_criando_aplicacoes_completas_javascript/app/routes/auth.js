module.exports = function(app) {

  var api = app.api.auth;

  // /* tem que vir depois para que o autenticar não passe por essa rota
  app.post('/autenticar', api.autentica);
  app.use('/*', api.verificaToken);
};
