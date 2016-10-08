var mysql = require('mysql');

function createDBConnection() {
  return mysql.createConnection({
    host: '192.168.34.239',
    user: 'root',
    password: '123456',
    database: 'payfast'
  })
}

module.exports = function() {
  return createDBConnection;
}
