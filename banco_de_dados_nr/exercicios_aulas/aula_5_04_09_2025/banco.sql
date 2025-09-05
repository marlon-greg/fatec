// CONTEXTO: Usando o banco de dados 'veiculos'
use veiculos

// ===================================================================
// PARTE 1: COMANDOS DE OTIMIZAÇÃO (ÍNDICES)
// Para garantir que as consultas abaixo rodem rápido e sem avisos.
// ===================================================================

db.veiculo.createIndex({ "year": 1 });
db.veiculo.createIndex({ "odometer": 1 });
db.veiculo.createIndex({ "model": 1 });


// ===================================================================
// PARTE 2: SEU SCRIPT DE TESTES (Exatamente como você mandou)
// ===================================================================

/*#EQ*/
db.veiculo.find(
    {
        year:{ $eq: 2015
        }
    }
)

/* $GT*/
db.veiculo.find(
    {
        odometer:{ 
         $gt: 20000    
        }
    },
    {
        _id: false,
        odometer: true,
        model: true,
        year: true
    }
).sort({odometer: 1})

/* $IN*/
db.veiculo.find(
    {
        model: { 
            $in: ["Camaro", "Cruze"]
        }
    }
)

/* $LT*/
db.veiculo.find(
    {
        odometer: {
            $lt: 1000
        }
    },
    {
        _id: false,
        odometer: true,
        model: true,
        year: true
    }
).sort({odometer: 1})   
    
/* $NE*/
db.veiculo.find({
    year:{
        $ne: 2015
    }
})

/* $nin*/
db.veiculo.find({
    model:{
        $nin: ["Camaro", "Cruze"]
    }
})

/* $and*/
db.veiculo.find({
    $and:[
        {odometer: {$gt: 20000} },
        {odometer: {$lt: 30000} }
    ]
},
{
    _id: false,
    odometer: true,
    model: true,
    year: true
}
).sort({odometer: -1})

/*Inserindo um novo veículo*/
db.veiculo.insertOne({
   
    year: 1980,
    make: "GM",
    model: "Opala",
    trim: "4.0S",
    body: "Sedan",
    transmission: "Manual",
    vin:"CAC2828",
    state: "SP",
    condition: 50,
    odometer: 800000
}
)

db.veiculo.find({model: "Opala"})

/*Atualizando o veículo + $set */
db.veiculo.updateOne(
    {
        model: "Opala"

    },
    {
        $set: { condition: 100, odometer: 0 }
    }
)
/* Insere mais veículos para testar as queries */
db.veiculo.insertMany([
    {
        year: 2015,
        make: "GM",
        model: "Camaro",
        trim: "SS 6.2",
        body: "Sedan",
        transmission: "Manual",
        vin:"BOI1234",
        state: "SP",
        condition: 80,
        odometer: 150000
    },
    {
        year: 2020,
        make: "GM",
        model: "Camaro",
        trim: "SS 6.2 v8",
        body: "Sedan",
        transmission: "Manual",
        vin:"ABC1234",
        state: "MG",
        condition: 90,
        odometer: 50000
    }
])

db.veiculo.find( {
    trim: {
        $in:["SS 6.2 V8", "SS 6.2"]
    }
})