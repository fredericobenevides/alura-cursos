var express = require('express');
var app = express();
var consign = require('consign');
var bodyParser = require('body-parser');

app.use(express.static('./public'));
app.use(bodyParser.json());

consign({ cwd: 'app' })
  .include('api')
  .then('routes')
  .into(app);


// app.get('/v1/fotos', function(req, res) {
//   var fotos = [
//     {_id: 1, titulo: 'Leão', url:'http://www.fundosanimais.com/Minis/leoes.jpg' },
//     {_id: 2, titulo: 'Leão 2', url:'http://www.fundosanimais.com/Minis/leoes.jpg' }
//   ];

//   res.json(fotos);
// });

// require('../app/routes/foto')(app);
// require('../app/routes/grupo')(app);

module.exports = app;
