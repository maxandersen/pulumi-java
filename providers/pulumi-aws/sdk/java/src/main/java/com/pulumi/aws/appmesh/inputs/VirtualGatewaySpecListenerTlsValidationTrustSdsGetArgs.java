// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs Empty = new VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs();

    /**
     * The name of the secret for a virtual gateway&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    @Import(name="secretName", required=true)
      private final Output<String> secretName;

    public Output<String> secretName() {
        return this.secretName;
    }

    public VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs(Output<String> secretName) {
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
    }

    private VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs() {
        this.secretName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
        }

        public Builder secretName(Output<String> secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder secretName(String secretName) {
            this.secretName = Output.of(Objects.requireNonNull(secretName));
            return this;
        }        public VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs build() {
            return new VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs(secretName);
        }
    }
}
