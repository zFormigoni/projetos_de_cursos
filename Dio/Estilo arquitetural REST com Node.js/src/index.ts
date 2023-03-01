import express from 'express';
import basicAuthenticationMiddleWare from './middlewares/basic-authentication.middleware';
import JWTbearerAuthenticationMiddleWare from './middlewares/JWTbearer-authentication.middleware';
import errorHandler from './middlewares/error.handler.middleware';
import authorizationRoute from './routes/authorization.route';
import statusRoute from './routes/status.routes';
import usersRoute from './routes/users.routes';

const app = express();

//! configurações da aplicação  
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

//! configurações de rotas
app.use(statusRoute);
app.use(authorizationRoute);

app.use(JWTbearerAuthenticationMiddleWare);
app.use(usersRoute);

//! configuralção dos handlers de erro
app.use(errorHandler);


//! iniciando o servidor 
app.listen(3000, () => {
    console.log('executando na porta 3000');
})