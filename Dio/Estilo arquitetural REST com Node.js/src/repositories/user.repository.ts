import { randomUUID } from "crypto";
import DataBaseError from "../models/errors/database.error.model";
import User from "../models/user.model";
import db from "../db";

class UserRepository {

    async findAllUsers(): Promise<User[]>{
        try {
            const query = `
        select uuid, 
        username from application_user`;
        
        const {rows} = await db.query<User>(query);

        return rows || [];
        } catch (error) {
            throw new DataBaseError('erro na consulta por id', error);
        }
        
    }

    async findById(uuid: string): Promise<User> {
        const query = `
        select uuid, username 
        from application_user 
        where uuid = $1`;

        // ! metodo para buscar por nome de usuario.
        /*const query = `
        select username, uuid from application_user
        where username = $1`;*/

        const values = [uuid];
        const { rows } = await db.query<User>(query, values);
        
        const [ user ] = rows; //! mesma coisa que: user = rows[0];

        return user;
    }

    async create(user: User): Promise<string>{
        const script = `
        insert into application_user(
            username, password
        )
        values ($1, crypt($2, 'my_salt'))
        returning uuid
        `;
        
        const values = [user.username, user.password];
        const { rows } = await db.query<{uuid: string}>(script, values)
        const [newUser] = rows;

        return newUser.uuid;
    }

    async update(user: User): Promise<void>{
        const script = `
        update application_user
        set
            username = $1,
            password = crypt($2, 'my_salt')
        where uuid= $3
        `;
        
        const values = [user.username, user.password, user.uuid];
        await db.query(script, values);

    }

    async remove(uuid: string): Promise<void>{
        const script = `
        delete 
        from application_user 
        where uuid=$1
        `;

        const values = [uuid];
        await db.query(script, values);
        
    } 

    async findByUsernameAndPassword(username: string, password: string): Promise<User | null> {
        try {
            const query = `
                select uuid, username 
                from application_user 
                where username = $1
                and password = crypt($2, 'my_salt')`;
    
            const values = [username, password];
            const { rows } = await db.query<User>(query, values);
            const [user] = rows;
    
            return user || null;
        } catch (error) {
            throw new DataBaseError('erro na consulta por username e/ou password', error);
        }
       
    }
}

export default new UserRepository;