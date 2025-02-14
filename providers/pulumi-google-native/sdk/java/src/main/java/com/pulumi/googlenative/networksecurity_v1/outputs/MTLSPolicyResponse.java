// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networksecurity_v1.outputs.ValidationCAResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MTLSPolicyResponse {
    /**
     * @return  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    private final List<ValidationCAResponse> clientValidationCa;

    @CustomType.Constructor
    private MTLSPolicyResponse(@CustomType.Parameter("clientValidationCa") List<ValidationCAResponse> clientValidationCa) {
        this.clientValidationCa = clientValidationCa;
    }

    /**
     * @return  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    public List<ValidationCAResponse> clientValidationCa() {
        return this.clientValidationCa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MTLSPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ValidationCAResponse> clientValidationCa;

        public Builder() {
    	      // Empty
        }

        public Builder(MTLSPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientValidationCa = defaults.clientValidationCa;
        }

        public Builder clientValidationCa(List<ValidationCAResponse> clientValidationCa) {
            this.clientValidationCa = Objects.requireNonNull(clientValidationCa);
            return this;
        }
        public Builder clientValidationCa(ValidationCAResponse... clientValidationCa) {
            return clientValidationCa(List.of(clientValidationCa));
        }        public MTLSPolicyResponse build() {
            return new MTLSPolicyResponse(clientValidationCa);
        }
    }
}
