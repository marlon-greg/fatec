use livros 

db.livro.find(
    {
        // UTILIZANDO O OR PARA FAZER A BUSCA
       /* $or:[
            {titulo: "Imersão"},
            {titulo: "Ruptura"}
            ]
            */
        
        // UTILIZANDO O AND PARA FAZER A BUSCA
     /*   $and:[
            {titulo: "Ruptura"},
            {paginas: 320}
            ]
         */
         // UTILIZANDO O NOR PARA FAZER A BUSCA
         $nor:[
            {titulo: "Ruptura"},
            {titulo: "Imersão"}
            ]
         
    },
    {
        _id:false,
        isbn: false
    }
    
)
