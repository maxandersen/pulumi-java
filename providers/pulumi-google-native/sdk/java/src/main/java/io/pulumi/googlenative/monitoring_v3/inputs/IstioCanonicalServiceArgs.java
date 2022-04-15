// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Canonical service scoped to an Istio mesh. Anthos clusters running ASM >= 1.6.8 will have their services ingested as this type.
 * 
 */
public final class IstioCanonicalServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final IstioCanonicalServiceArgs Empty = new IstioCanonicalServiceArgs();

    /**
     * The name of the canonical service underlying this service. Corresponds to the destination_canonical_service_name metric label in label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
     * 
     */
    @Import(name="canonicalService")
      private final @Nullable Output<String> canonicalService;

    public Output<String> canonicalService() {
        return this.canonicalService == null ? Codegen.empty() : this.canonicalService;
    }

    /**
     * The namespace of the canonical service underlying this service. Corresponds to the destination_canonical_service_namespace metric label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
     * 
     */
    @Import(name="canonicalServiceNamespace")
      private final @Nullable Output<String> canonicalServiceNamespace;

    public Output<String> canonicalServiceNamespace() {
        return this.canonicalServiceNamespace == null ? Codegen.empty() : this.canonicalServiceNamespace;
    }

    /**
     * Identifier for the Istio mesh in which this canonical service is defined. Corresponds to the mesh_uid metric label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
     * 
     */
    @Import(name="meshUid")
      private final @Nullable Output<String> meshUid;

    public Output<String> meshUid() {
        return this.meshUid == null ? Codegen.empty() : this.meshUid;
    }

    public IstioCanonicalServiceArgs(
        @Nullable Output<String> canonicalService,
        @Nullable Output<String> canonicalServiceNamespace,
        @Nullable Output<String> meshUid) {
        this.canonicalService = canonicalService;
        this.canonicalServiceNamespace = canonicalServiceNamespace;
        this.meshUid = meshUid;
    }

    private IstioCanonicalServiceArgs() {
        this.canonicalService = Codegen.empty();
        this.canonicalServiceNamespace = Codegen.empty();
        this.meshUid = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IstioCanonicalServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> canonicalService;
        private @Nullable Output<String> canonicalServiceNamespace;
        private @Nullable Output<String> meshUid;

        public Builder() {
    	      // Empty
        }

        public Builder(IstioCanonicalServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalService = defaults.canonicalService;
    	      this.canonicalServiceNamespace = defaults.canonicalServiceNamespace;
    	      this.meshUid = defaults.meshUid;
        }

        public Builder canonicalService(@Nullable Output<String> canonicalService) {
            this.canonicalService = canonicalService;
            return this;
        }
        public Builder canonicalService(@Nullable String canonicalService) {
            this.canonicalService = Codegen.ofNullable(canonicalService);
            return this;
        }
        public Builder canonicalServiceNamespace(@Nullable Output<String> canonicalServiceNamespace) {
            this.canonicalServiceNamespace = canonicalServiceNamespace;
            return this;
        }
        public Builder canonicalServiceNamespace(@Nullable String canonicalServiceNamespace) {
            this.canonicalServiceNamespace = Codegen.ofNullable(canonicalServiceNamespace);
            return this;
        }
        public Builder meshUid(@Nullable Output<String> meshUid) {
            this.meshUid = meshUid;
            return this;
        }
        public Builder meshUid(@Nullable String meshUid) {
            this.meshUid = Codegen.ofNullable(meshUid);
            return this;
        }        public IstioCanonicalServiceArgs build() {
            return new IstioCanonicalServiceArgs(canonicalService, canonicalServiceNamespace, meshUid);
        }
    }
}
