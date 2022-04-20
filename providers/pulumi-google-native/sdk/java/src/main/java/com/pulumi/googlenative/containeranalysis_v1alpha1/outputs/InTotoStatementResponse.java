// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.InTotoProvenanceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.SlsaProvenanceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.SubjectResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InTotoStatementResponse {
    /**
     * &#34;https://slsa.dev/provenance/v0.1&#34; for SlsaProvenance.
     * 
     */
    private final String predicateType;
    /**
     * provenance is a predicate of type intotoprovenance
     * 
     */
    private final InTotoProvenanceResponse provenance;
    /**
     * slsa_provenance is a predicate of type slsaProvenance
     * 
     */
    private final SlsaProvenanceResponse slsaProvenance;
    /**
     * subject is the subjects of the intoto statement
     * 
     */
    private final List<SubjectResponse> subject;
    /**
     * Always &#34;https://in-toto.io/Statement/v0.1&#34;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private InTotoStatementResponse(
        @CustomType.Parameter("predicateType") String predicateType,
        @CustomType.Parameter("provenance") InTotoProvenanceResponse provenance,
        @CustomType.Parameter("slsaProvenance") SlsaProvenanceResponse slsaProvenance,
        @CustomType.Parameter("subject") List<SubjectResponse> subject,
        @CustomType.Parameter("type") String type) {
        this.predicateType = predicateType;
        this.provenance = provenance;
        this.slsaProvenance = slsaProvenance;
        this.subject = subject;
        this.type = type;
    }

    /**
     * &#34;https://slsa.dev/provenance/v0.1&#34; for SlsaProvenance.
     * 
    */
    public String predicateType() {
        return this.predicateType;
    }
    /**
     * provenance is a predicate of type intotoprovenance
     * 
    */
    public InTotoProvenanceResponse provenance() {
        return this.provenance;
    }
    /**
     * slsa_provenance is a predicate of type slsaProvenance
     * 
    */
    public SlsaProvenanceResponse slsaProvenance() {
        return this.slsaProvenance;
    }
    /**
     * subject is the subjects of the intoto statement
     * 
    */
    public List<SubjectResponse> subject() {
        return this.subject;
    }
    /**
     * Always &#34;https://in-toto.io/Statement/v0.1&#34;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InTotoStatementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String predicateType;
        private InTotoProvenanceResponse provenance;
        private SlsaProvenanceResponse slsaProvenance;
        private List<SubjectResponse> subject;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InTotoStatementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predicateType = defaults.predicateType;
    	      this.provenance = defaults.provenance;
    	      this.slsaProvenance = defaults.slsaProvenance;
    	      this.subject = defaults.subject;
    	      this.type = defaults.type;
        }

        public Builder predicateType(String predicateType) {
            this.predicateType = Objects.requireNonNull(predicateType);
            return this;
        }
        public Builder provenance(InTotoProvenanceResponse provenance) {
            this.provenance = Objects.requireNonNull(provenance);
            return this;
        }
        public Builder slsaProvenance(SlsaProvenanceResponse slsaProvenance) {
            this.slsaProvenance = Objects.requireNonNull(slsaProvenance);
            return this;
        }
        public Builder subject(List<SubjectResponse> subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder subject(SubjectResponse... subject) {
            return subject(List.of(subject));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public InTotoStatementResponse build() {
            return new InTotoStatementResponse(predicateType, provenance, slsaProvenance, subject, type);
        }
    }
}
