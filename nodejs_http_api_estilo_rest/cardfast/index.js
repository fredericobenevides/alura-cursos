var app = require('./config/custom-express.js')()

app.listen(3001, function() {
  console.log('Servidor de cartoes rodando na porta 3001');
});

