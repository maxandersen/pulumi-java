// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PgpSignedAttestationResponse;
import java.util.Objects;

@OutputCustomType
public final class AttestationResponse {
    private final PgpSignedAttestationResponse pgpSignedAttestation;

    @OutputCustomType.Constructor
    private AttestationResponse(@OutputCustomType.Parameter("pgpSignedAttestation") PgpSignedAttestationResponse pgpSignedAttestation) {
        this.pgpSignedAttestation = pgpSignedAttestation;
    }

    public PgpSignedAttestationResponse getPgpSignedAttestation() {
        return this.pgpSignedAttestation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PgpSignedAttestationResponse pgpSignedAttestation;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pgpSignedAttestation = defaults.pgpSignedAttestation;
        }

        public Builder setPgpSignedAttestation(PgpSignedAttestationResponse pgpSignedAttestation) {
            this.pgpSignedAttestation = Objects.requireNonNull(pgpSignedAttestation);
            return this;
        }
        public AttestationResponse build() {
            return new AttestationResponse(pgpSignedAttestation);
        }
    }
}
