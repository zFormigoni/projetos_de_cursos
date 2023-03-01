import { Request, Response, NextFunction, Router } from "express";
import ForbiddenError from "../models/errors/forbidden.error.model";
import userRepository from "../repositories/user.repository";
import JWT from 'jsonwebtoken';
import { StatusCodes } from "http-status-codes";
import basicAuthenticationMiddleWare from "../middlewares/basic-authentication.middleware";
import JWTbearerAuthenticationMiddleWare from "../middlewares/JWTbearer-authentication.middleware";

const authorizationRoute = Router();

authorizationRoute.post('/token',JWTbearerAuthenticationMiddleWare, async (req: Request, res: Response, next: NextFunction) => {
    try {
        const user = req.user;

        if (!user){
            throw new ForbiddenError('Usuario não informado!')
        }

        const jwtPayLoad = {username: user.username};
        const jwtOptions = {subject: user.uuid};
        const secretKey = "my_secret_key"
        const jwt = JWT.sign(jwtPayLoad, secretKey, jwtOptions);
        res.status(StatusCodes.OK).json({token: jwt})


    } catch (error) {
        next(error); 
    }   

});

authorizationRoute.post('/token/validate', JWTbearerAuthenticationMiddleWare, (req: Request, res: Response, next: NextFunction) => {
    res.sendStatus(StatusCodes.OK);
})


export default authorizationRoute