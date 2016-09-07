module.exports = function(app) {

  var api = app.api.foto;

  app.get('/v1/fotos', api.lista);

  // app.route('/v1/fotos')
  //   .get(api.lista)
  //   .post(api.adiciona);

  app.route('/v1/fotos/:id')
    .get(api.buscaPorId)
    .delete(api.removePorId);

  // app.get('/v1/fotos', function(req, res) {
  //   var fotos = [
  //     {_id: 1, titulo: 'Leão', url:'http://www.fundosanimais.com/Minis/leoes.jpg' },
  //     {_id: 2, titulo: 'Leão 2', url:'http://www.fundosanimais.com/Minis/leoes.jpg' }
  //   ];

  //   res.json(fotos);
  // });

};
