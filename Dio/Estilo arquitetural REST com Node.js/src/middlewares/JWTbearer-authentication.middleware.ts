import { NextFunction, Request, Response } from "express";
import ForbiddenError from "../models/errors/forbidden.error.model";
import JWT from "jsonwebtoken";
import userRepository from "../repositories/user.repository";

async function JWTbearerAuthenticationMiddleWare(req: Request, res:Response, next: NextFunction){
    try {

        const authorizationHeader = req.headers['authorization'];

        if (!authorizationHeader){
            throw new ForbiddenError('Credenciais não informadas');
        }

        const [authenticationType, token] = authorizationHeader.split(' ');


        if(authenticationType !== 'bearer'|| !token){
            throw new ForbiddenError('Tipo de autenticação invalida');
        }

        try {
            const tokebPayload = JWT.verify(token,'my_secret_key');
        
        if (typeof tokebPayload !=='object' || !tokebPayload.sub){
            throw new ForbiddenError('token invalido');
        }
        
        const uuid = tokebPayload.sub;
        const user = await userRepository.findById(uuid);
        req.user = user;
        next();
        } catch (error) {
            throw new ForbiddenError('token invalido');
        }
        
    } catch (error) {
        next(error)
    }
}

export default JWTbearerAuthenticationMiddleWare;