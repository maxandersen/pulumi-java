// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a single physical circuit between the Customer and Google. CircuitInfo objects are created by Google, so all fields are output only.
 * 
 */
public final class InterconnectCircuitInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final InterconnectCircuitInfoResponse Empty = new InterconnectCircuitInfoResponse();

    /**
     * Customer-side demarc ID for this circuit.
     * 
     */
    @Import(name="customerDemarcId", required=true)
    private String customerDemarcId;

    public String customerDemarcId() {
        return this.customerDemarcId;
    }

    /**
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * 
     */
    @Import(name="googleCircuitId", required=true)
    private String googleCircuitId;

    public String googleCircuitId() {
        return this.googleCircuitId;
    }

    /**
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * 
     */
    @Import(name="googleDemarcId", required=true)
    private String googleDemarcId;

    public String googleDemarcId() {
        return this.googleDemarcId;
    }

    private InterconnectCircuitInfoResponse() {}

    private InterconnectCircuitInfoResponse(InterconnectCircuitInfoResponse $) {
        this.customerDemarcId = $.customerDemarcId;
        this.googleCircuitId = $.googleCircuitId;
        this.googleDemarcId = $.googleDemarcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectCircuitInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectCircuitInfoResponse $;

        public Builder() {
            $ = new InterconnectCircuitInfoResponse();
        }

        public Builder(InterconnectCircuitInfoResponse defaults) {
            $ = new InterconnectCircuitInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder customerDemarcId(String customerDemarcId) {
            $.customerDemarcId = customerDemarcId;
            return this;
        }

        public Builder googleCircuitId(String googleCircuitId) {
            $.googleCircuitId = googleCircuitId;
            return this;
        }

        public Builder googleDemarcId(String googleDemarcId) {
            $.googleDemarcId = googleDemarcId;
            return this;
        }

        public InterconnectCircuitInfoResponse build() {
            $.customerDemarcId = Objects.requireNonNull($.customerDemarcId, "expected parameter 'customerDemarcId' to be non-null");
            $.googleCircuitId = Objects.requireNonNull($.googleCircuitId, "expected parameter 'googleCircuitId' to be non-null");
            $.googleDemarcId = Objects.requireNonNull($.googleDemarcId, "expected parameter 'googleDemarcId' to be non-null");
            return $;
        }
    }

}
