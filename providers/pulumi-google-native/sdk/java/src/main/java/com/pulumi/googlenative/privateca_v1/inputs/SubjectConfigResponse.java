// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1.inputs.SubjectAltNamesResponse;
import com.pulumi.googlenative.privateca_v1.inputs.SubjectResponse;
import java.util.Objects;


/**
 * These values are used to create the distinguished name and subject alternative name fields in an X.509 certificate.
 * 
 */
public final class SubjectConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SubjectConfigResponse Empty = new SubjectConfigResponse();

    /**
     * Contains distinguished name fields such as the common name, location and organization.
     * 
     */
    @Import(name="subject", required=true)
      private final SubjectResponse subject;

    public SubjectResponse subject() {
        return this.subject;
    }

    /**
     * Optional. The subject alternative name fields.
     * 
     */
    @Import(name="subjectAltName", required=true)
      private final SubjectAltNamesResponse subjectAltName;

    public SubjectAltNamesResponse subjectAltName() {
        return this.subjectAltName;
    }

    public SubjectConfigResponse(
        SubjectResponse subject,
        SubjectAltNamesResponse subjectAltName) {
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.subjectAltName = Objects.requireNonNull(subjectAltName, "expected parameter 'subjectAltName' to be non-null");
    }

    private SubjectConfigResponse() {
        this.subject = null;
        this.subjectAltName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubjectResponse subject;
        private SubjectAltNamesResponse subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder subject(SubjectResponse subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder subjectAltName(SubjectAltNamesResponse subjectAltName) {
            this.subjectAltName = Objects.requireNonNull(subjectAltName);
            return this;
        }        public SubjectConfigResponse build() {
            return new SubjectConfigResponse(subject, subjectAltName);
        }
    }
}
