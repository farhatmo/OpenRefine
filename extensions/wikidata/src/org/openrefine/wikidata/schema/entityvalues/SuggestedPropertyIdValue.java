package org.openrefine.wikidata.schema.entityvalues;

import org.wikidata.wdtk.datamodel.helpers.ToString;
import org.wikidata.wdtk.datamodel.interfaces.PropertyIdValue;

public class SuggestedPropertyIdValue extends SuggestedEntityIdValue implements PropertyIdValue {

    public SuggestedPropertyIdValue(String id, String siteIRI, String label) {
        super(id, siteIRI, label);
    }

    @Override
    public String getEntityType() {
        return ET_PROPERTY;
    }

    @Override
    public String toString() {
        return "suggested "+ToString.toString(this)+" (\""+getLabel()+"\")";
    }
}
