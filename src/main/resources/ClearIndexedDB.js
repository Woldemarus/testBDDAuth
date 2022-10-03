let dbs = await indexeDB.databases();for(let db of dbs){ indexedDB.deleteDatabase(db.name)};
