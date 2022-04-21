// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs();

    /**
     * The name of the secret for a virtual node&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    public Output<String> secretName() {
        return this.secretName;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs() {}

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs $) {
        this.secretName = $.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs();
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs defaults) {
            $ = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsArgs build() {
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            return $;
        }
    }

}
