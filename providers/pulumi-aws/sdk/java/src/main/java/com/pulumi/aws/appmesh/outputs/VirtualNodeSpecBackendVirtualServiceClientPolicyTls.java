// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTls {
    /**
     * The listener&#39;s TLS certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate certificate;
    /**
     * Whether the policy is enforced. Default is `true`.
     * 
     */
    private final @Nullable Boolean enforce;
    /**
     * One or more ports that the policy is enforced for.
     * 
     */
    private final @Nullable List<Integer> ports;
    /**
     * The listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    private final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation validation;

    @CustomType.Constructor
    private VirtualNodeSpecBackendVirtualServiceClientPolicyTls(
        @CustomType.Parameter("certificate") @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate certificate,
        @CustomType.Parameter("enforce") @Nullable Boolean enforce,
        @CustomType.Parameter("ports") @Nullable List<Integer> ports,
        @CustomType.Parameter("validation") VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation validation) {
        this.certificate = certificate;
        this.enforce = enforce;
        this.ports = ports;
        this.validation = validation;
    }

    /**
     * The listener&#39;s TLS certificate.
     * 
    */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * Whether the policy is enforced. Default is `true`.
     * 
    */
    public Optional<Boolean> enforce() {
        return Optional.ofNullable(this.enforce);
    }
    /**
     * One or more ports that the policy is enforced for.
     * 
    */
    public List<Integer> ports() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * The listener&#39;s Transport Layer Security (TLS) validation context.
     * 
    */
    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation validation() {
        return this.validation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate certificate;
        private @Nullable Boolean enforce;
        private @Nullable List<Integer> ports;
        private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.enforce = defaults.enforce;
    	      this.ports = defaults.ports;
    	      this.validation = defaults.validation;
        }

        public Builder certificate(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder enforce(@Nullable Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Builder ports(@Nullable List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }
        public Builder validation(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }        public VirtualNodeSpecBackendVirtualServiceClientPolicyTls build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTls(certificate, enforce, ports, validation);
        }
    }
}
