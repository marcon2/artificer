/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.artificer.repository.hibernate.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Indexed;

/**
 * @author Brett Meyer.
 */
@Entity
@Indexed
@Analyzer(impl = StandardAnalyzer.class)
@Table(name = "XsdDocument")
public class ArtificerXsdDocumentArtifact extends ArtificerDocumentArtifact {

    private List<ArtificerArtifact> elements = new ArrayList<>();

    private List<ArtificerArtifact> attributes = new ArrayList<>();

    private List<ArtificerArtifact> simpleTypes = new ArrayList<>();

    private List<ArtificerArtifact> complexTypes = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    public List<ArtificerArtifact> getElements() {
        return elements;
    }

    public void setElements(List<ArtificerArtifact> elements) {
        this.elements = elements;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<ArtificerArtifact> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ArtificerArtifact> attributes) {
        this.attributes = attributes;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<ArtificerArtifact> getSimpleTypes() {
        return simpleTypes;
    }

    public void setSimpleTypes(List<ArtificerArtifact> simpleTypes) {
        this.simpleTypes = simpleTypes;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<ArtificerArtifact> getComplexTypes() {
        return complexTypes;
    }

    public void setComplexTypes(List<ArtificerArtifact> complexTypes) {
        this.complexTypes = complexTypes;
    }
}
