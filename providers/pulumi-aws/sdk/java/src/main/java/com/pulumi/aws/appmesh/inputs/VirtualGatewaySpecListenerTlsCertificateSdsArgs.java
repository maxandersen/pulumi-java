// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecListenerTlsCertificateSdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsCertificateSdsArgs Empty = new VirtualGatewaySpecListenerTlsCertificateSdsArgs();

    /**
     * The name of the secret for a virtual gateway&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    @Import(name="secretName", required=true)
      private final Output<String> secretName;

    public Output<String> secretName() {
        return this.secretName;
    }

    public VirtualGatewaySpecListenerTlsCertificateSdsArgs(Output<String> secretName) {
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
    }

    private VirtualGatewaySpecListenerTlsCertificateSdsArgs() {
        this.secretName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsCertificateSdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsCertificateSdsArgs defaults) {
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
        }        public VirtualGatewaySpecListenerTlsCertificateSdsArgs build() {
            return new VirtualGatewaySpecListenerTlsCertificateSdsArgs(secretName);
        }
    }
}
