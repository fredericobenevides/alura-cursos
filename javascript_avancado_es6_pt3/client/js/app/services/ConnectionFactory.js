var ConnectionFactory = (function() {
  const stores = ['negociacoes'];
  const version = 3;
  const dbName = 'aluraframe';

  var connection = null;
  var close = null;

  return class ConnectionFactory {

    constructor() {
      throw new Error('Não é possível criar instancias de ConnectionFactory');
    }

    static getConnection() {
      return new Promise((resolve, reject) => {
        let openRequest = window.indexedDB.open(stores, version);

        openRequest.onupgradedneeded = e => {
          ConnectionFactory._createStores(e.target.result);
        };

        openRequest.onsuccess = e => {
          if (!connection) {
            connection = e.target.result;
            close = connection.close.bind(connection);
            connection.close = function() {
              throw new Error('Voce nao pode fechar diretamente a conexão');
            }
          }
          resolve(connection);

        };

        openRequest.onerror = e => {
          console.log(e.target.error);
          reject(e.target.error.name);

        };
      });
    }

    static _createStores(connection) {
      stores.forEach(store => {
        if(connection.objectStoreNames.contains(store)) {
          e.target.result.deleteObjectStore(store);
        }

        connection.createObjectStore(store, { autoIncreme: true });
      });
    }

    static closeConnection() {
      if (connection) {
        close();
        connection = null;
      }
    }
  }

})();

