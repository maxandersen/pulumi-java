// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * DocumentNote represents an SPDX Document Creation Infromation section: https://spdx.github.io/spdx-spec/2-document-creation-information/
 * 
 */
public final class DocumentNoteResponse extends com.pulumi.resources.InvokeArgs {

    public static final DocumentNoteResponse Empty = new DocumentNoteResponse();

    /**
     * Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata")
     * 
     */
    @Import(name="dataLicence", required=true)
      private final String dataLicence;

    public String dataLicence() {
        return this.dataLicence;
    }

    /**
     * Provide a reference number that can be used to understand how to parse and interpret the rest of the file
     * 
     */
    @Import(name="spdxVersion", required=true)
      private final String spdxVersion;

    public String spdxVersion() {
        return this.spdxVersion;
    }

    public DocumentNoteResponse(
        String dataLicence,
        String spdxVersion) {
        this.dataLicence = Objects.requireNonNull(dataLicence, "expected parameter 'dataLicence' to be non-null");
        this.spdxVersion = Objects.requireNonNull(spdxVersion, "expected parameter 'spdxVersion' to be non-null");
    }

    private DocumentNoteResponse() {
        this.dataLicence = null;
        this.spdxVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataLicence;
        private String spdxVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataLicence = defaults.dataLicence;
    	      this.spdxVersion = defaults.spdxVersion;
        }

        public Builder dataLicence(String dataLicence) {
            this.dataLicence = Objects.requireNonNull(dataLicence);
            return this;
        }
        public Builder spdxVersion(String spdxVersion) {
            this.spdxVersion = Objects.requireNonNull(spdxVersion);
            return this;
        }        public DocumentNoteResponse build() {
            return new DocumentNoteResponse(dataLicence, spdxVersion);
        }
    }
}
