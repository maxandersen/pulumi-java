// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PgpSignedAttestationResponse;
import java.util.Objects;

@CustomType
public final class AttestationResponse {
    private final PgpSignedAttestationResponse pgpSignedAttestation;

    @CustomType.Constructor
    private AttestationResponse(@CustomType.Parameter("pgpSignedAttestation") PgpSignedAttestationResponse pgpSignedAttestation) {
        this.pgpSignedAttestation = pgpSignedAttestation;
    }

    public PgpSignedAttestationResponse pgpSignedAttestation() {
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

        public Builder pgpSignedAttestation(PgpSignedAttestationResponse pgpSignedAttestation) {
            this.pgpSignedAttestation = Objects.requireNonNull(pgpSignedAttestation);
            return this;
        }        public AttestationResponse build() {
            return new AttestationResponse(pgpSignedAttestation);
        }
    }
}
