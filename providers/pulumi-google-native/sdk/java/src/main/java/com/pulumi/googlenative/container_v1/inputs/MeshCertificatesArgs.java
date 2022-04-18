// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
 * 
 */
public final class MeshCertificatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MeshCertificatesArgs Empty = new MeshCertificatesArgs();

    /**
     * enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    @Import(name="enableCertificates")
      private final @Nullable Output<Boolean> enableCertificates;

    public Output<Boolean> enableCertificates() {
        return this.enableCertificates == null ? Codegen.empty() : this.enableCertificates;
    }

    public MeshCertificatesArgs(@Nullable Output<Boolean> enableCertificates) {
        this.enableCertificates = enableCertificates;
    }

    private MeshCertificatesArgs() {
        this.enableCertificates = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshCertificatesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCertificates = defaults.enableCertificates;
        }

        public Builder enableCertificates(@Nullable Output<Boolean> enableCertificates) {
            this.enableCertificates = enableCertificates;
            return this;
        }
        public Builder enableCertificates(@Nullable Boolean enableCertificates) {
            this.enableCertificates = Codegen.ofNullable(enableCertificates);
            return this;
        }        public MeshCertificatesArgs build() {
            return new MeshCertificatesArgs(enableCertificates);
        }
    }
}
