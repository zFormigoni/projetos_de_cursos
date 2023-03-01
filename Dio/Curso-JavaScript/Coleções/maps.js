function getAdm(Map){
    let adm = [];
    for ([k,v] of pessoas){
        if (v === "adm"){
            adm.push(k)
        }
    }
   return adm;
}

function getUser(Map){
    let user = [];
    for ([k,v] of pessoas){
        if (v === "user"){
            user.push(k)
        }
    }
   return user;
}

const pessoas = new Map();

pessoas.set(`pessoa 1`  ,"adm");
pessoas.set(`pessoa 2`  ,"user");
pessoas.set(`pessoa 3`  ,"adm");
pessoas.set(`pessoa 4`  ,"user");
pessoas.set(`pessoa 5`  ,"adm");
pessoas.set(`pessoa 6`  ,"user");
pessoas.set(`pessoa 7`  ,"adm");
pessoas.set(`pessoa 8`  ,"user");
pessoas.set(`pessoa 9`  ,"adm");
pessoas.set(`pessoa 10`  ,"user");

console.log(`lista de adms: \n${getAdm(pessoas)}`);
console.log(`lista de adms: \n${getUser(pessoas)}`);
