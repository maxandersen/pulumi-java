// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BuildProvenanceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.InTotoProvenanceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.InTotoStatementResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BuildDetailsResponse {
    /**
     * @return Deprecated. See InTotoStatement for the replacement. In-toto Provenance representation as defined in spec.
     * 
     * @deprecated
     * Deprecated. See InTotoStatement for the replacement. In-toto Provenance representation as defined in spec.
     * 
     */
    @Deprecated /* Deprecated. See InTotoStatement for the replacement. In-toto Provenance representation as defined in spec. */
    private final InTotoProvenanceResponse intotoProvenance;
    /**
     * @return In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence&#39;s envelope.
     * 
     */
    private final InTotoStatementResponse intotoStatement;
    /**
     * @return The actual provenance
     * 
     */
    private final BuildProvenanceResponse provenance;
    /**
     * @return Serialized JSON representation of the provenance, used in generating the `BuildSignature` in the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    private final String provenanceBytes;

    @CustomType.Constructor
    private BuildDetailsResponse(
        @CustomType.Parameter("intotoProvenance") InTotoProvenanceResponse intotoProvenance,
        @CustomType.Parameter("intotoStatement") InTotoStatementResponse intotoStatement,
        @CustomType.Parameter("provenance") BuildProvenanceResponse provenance,
        @CustomType.Parameter("provenanceBytes") String provenanceBytes) {
        this.intotoProvenance = intotoProvenance;
        this.intotoStatement = intotoStatement;
        this.provenance = provenance;
        this.provenanceBytes = provenanceBytes;
    }

    /**
     * @return Deprecated. See InTotoStatement for the replacement. In-toto Provenance representation as defined in spec.
     * 
     * @deprecated
     * Deprecated. See InTotoStatement for the replacement. In-toto Provenance representation as defined in spec.
     * 
     */
    @Deprecated /* Deprecated. See InTotoStatement for the replacement. In-toto Provenance representation as defined in spec. */
    public InTotoProvenanceResponse intotoProvenance() {
        return this.intotoProvenance;
    }
    /**
     * @return In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence&#39;s envelope.
     * 
     */
    public InTotoStatementResponse intotoStatement() {
        return this.intotoStatement;
    }
    /**
     * @return The actual provenance
     * 
     */
    public BuildProvenanceResponse provenance() {
        return this.provenance;
    }
    /**
     * @return Serialized JSON representation of the provenance, used in generating the `BuildSignature` in the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    public String provenanceBytes() {
        return this.provenanceBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InTotoProvenanceResponse intotoProvenance;
        private InTotoStatementResponse intotoStatement;
        private BuildProvenanceResponse provenance;
        private String provenanceBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intotoProvenance = defaults.intotoProvenance;
    	      this.intotoStatement = defaults.intotoStatement;
    	      this.provenance = defaults.provenance;
    	      this.provenanceBytes = defaults.provenanceBytes;
        }

        public Builder intotoProvenance(InTotoProvenanceResponse intotoProvenance) {
            this.intotoProvenance = Objects.requireNonNull(intotoProvenance);
            return this;
        }
        public Builder intotoStatement(InTotoStatementResponse intotoStatement) {
            this.intotoStatement = Objects.requireNonNull(intotoStatement);
            return this;
        }
        public Builder provenance(BuildProvenanceResponse provenance) {
            this.provenance = Objects.requireNonNull(provenance);
            return this;
        }
        public Builder provenanceBytes(String provenanceBytes) {
            this.provenanceBytes = Objects.requireNonNull(provenanceBytes);
            return this;
        }        public BuildDetailsResponse build() {
            return new BuildDetailsResponse(intotoProvenance, intotoStatement, provenance, provenanceBytes);
        }
    }
}
