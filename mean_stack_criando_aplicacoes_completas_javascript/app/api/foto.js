var mongoose = require('mongoose');

var api = {};

var model = mongoose.model('Foto');
// var CONTADOR = 2;

// var fotos = [
//   {_id: 1, titulo: 'Leão', url:'http://www.fundosanimais.com/Minis/leoes.jpg' },
//   {_id: 2, titulo: 'Leão 2', url:'http://www.fundosanimais.com/Minis/leoes.jpg' }
// ];

api.lista = function(req, res) {
  model
    .find({ })
    .then(function(fotos) {
      res.json(fotos);
    }, function(error) {
      console.log(error);
      res.status(500).json(error);
    });

  // model.find(function(error, fotos) {
  //   if (error) {
  //     res.status(500).json(error);
  //   }

  //   res.json(fotos);
  // });

  // res.json(fotos);
};

api.buscaPorId = function(req, res) {
  model
    .findById(req.params.id)
    .then(function(foto) {
      if (!foto) throw Error('Foto não encontrada');
      res.json(foto);

    }, function(error) {
      console.log(error);
      res.status(500).json(error);
    });

  // var foto = fotos.find(function(foto) {
  //   return foto._id == req.params.id;
  // });

  // res.json(foto);
};

api.removePorId = function(req, res) {
  model
    .remove({_id: req.params.id})
    .then(function() {
      res.sendStatus(204);

    }, function(error) {
      console.log(error);
      res.status(500).json(error);
    });

  // fotos.filter(function(foto) {
  //   return foto._id != req.params.id;
  // });

  // res.sendStatus(204);
};

api.adiciona = function(req, res) {
  var foto = req.body;

  model.create(foto)
    .then(function(foto) {
      res.json(foto);

    }, function(error) {
      console.log(error);
      res.status(500).json(error);
    });


  // var foto = req.body;
  // foto._id = ++CONTADOR;
  // fotos.push(foto);

  // res.json(foto);
};

api.atualiza = function(req, res) {
  model
    .findByIdAndUpdate(req.params.id, req.body)
    .then(function(foto) {
      res.json(foto);

    }, function(error) {
      console.log(error);
      res.status(500).json(error);
    });

  // var foto = req.body;
  // var fotoId = req.params.id;

  // var indice = fotos.findIndex(function(foto) {
  //   return foto._id == fotoId;
  // });

  // fotos[indice] = foto;

  // res.sendStatus(200);
}

module.exports = api;
