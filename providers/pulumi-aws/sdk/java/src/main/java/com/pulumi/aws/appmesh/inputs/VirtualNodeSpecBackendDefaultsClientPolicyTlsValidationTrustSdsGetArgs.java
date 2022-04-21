// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs();

    /**
     * The name of the secret for a virtual node&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    public Output<String> secretName() {
        return this.secretName;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs() {}

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs $) {
        this.secretName = $.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs();
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs defaults) {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs build() {
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            return $;
        }
    }

}
