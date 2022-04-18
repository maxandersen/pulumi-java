// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes fields that are relavent to the revocation of a Certificate.
 * 
 */
public final class RevocationDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final RevocationDetailsResponse Empty = new RevocationDetailsResponse();

    /**
     * Indicates why a Certificate was revoked.
     * 
     */
    @Import(name="revocationState", required=true)
      private final String revocationState;

    public String revocationState() {
        return this.revocationState;
    }

    /**
     * The time at which this Certificate was revoked.
     * 
     */
    @Import(name="revocationTime", required=true)
      private final String revocationTime;

    public String revocationTime() {
        return this.revocationTime;
    }

    public RevocationDetailsResponse(
        String revocationState,
        String revocationTime) {
        this.revocationState = Objects.requireNonNull(revocationState, "expected parameter 'revocationState' to be non-null");
        this.revocationTime = Objects.requireNonNull(revocationTime, "expected parameter 'revocationTime' to be non-null");
    }

    private RevocationDetailsResponse() {
        this.revocationState = null;
        this.revocationTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RevocationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String revocationState;
        private String revocationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RevocationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revocationState = defaults.revocationState;
    	      this.revocationTime = defaults.revocationTime;
        }

        public Builder revocationState(String revocationState) {
            this.revocationState = Objects.requireNonNull(revocationState);
            return this;
        }
        public Builder revocationTime(String revocationTime) {
            this.revocationTime = Objects.requireNonNull(revocationTime);
            return this;
        }        public RevocationDetailsResponse build() {
            return new RevocationDetailsResponse(revocationState, revocationTime);
        }
    }
}
