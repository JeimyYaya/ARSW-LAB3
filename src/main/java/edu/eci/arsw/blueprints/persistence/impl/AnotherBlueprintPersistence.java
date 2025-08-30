package edu.eci.arsw.blueprints.persistence.impl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.persistence.BlueprintsPersistence;

public class AnotherBlueprintPersistence implements BlueprintsPersistence{
    @Autowired
    private BlueprintsPersistence blueprintsPersistence;

    

    @Override
    public void saveBlueprint(Blueprint bp) {
        
    }

    @Override
    public Blueprint getBlueprint(String author, String bprintname) {
        return null;
    }    

}
