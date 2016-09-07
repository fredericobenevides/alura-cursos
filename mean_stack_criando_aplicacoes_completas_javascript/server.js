var http = require('http');
var app = require('./config/express');
// require('./config/database');
require('./config/database')('192.168.34.174/alurapic');

http.createServer(app).listen(3000, function() {
  console.log('Servidor iniciado');
});

// http.createServer(function(req, res) {
//   res.end();
// }).listen(3000, function() {
//   console.log('NEH');
// });
