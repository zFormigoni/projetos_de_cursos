const http = require('http');

const server = http.createServer((req, res) => {
    res.writeHead(200, {'content-Type': 'application/json'});

    if (req.url === '/inicio'){
        res.end(
            JSON.stringify({
                message :'Hello World',
            }));
    }
    
    if (req.url === '/teste'){
        res.end(
            JSON.stringify({
                message :'teste',
            })
        );
    }

})
.listen(2000, () => console.log('Servidor Rodando na Porta 2000'));