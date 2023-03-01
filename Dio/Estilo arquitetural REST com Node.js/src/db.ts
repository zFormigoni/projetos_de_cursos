import { Pool } from "pg";

const connectionString = 'postgres://epmzihoq:r0LPR1XhHnv0jFOCGOQOd1tUGAvkGijf@kandula.db.elephantsql.com/epmzihoq';

const db = new Pool({connectionString});

export default db;