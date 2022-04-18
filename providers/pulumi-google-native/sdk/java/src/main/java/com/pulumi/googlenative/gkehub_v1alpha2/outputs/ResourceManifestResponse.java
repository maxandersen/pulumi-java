// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceManifestResponse {
    /**
     * Whether the resource provided in the manifest is `cluster_scoped`. If unset, the manifest is assumed to be namespace scoped. This field is used for REST mapping when applying the resource in a cluster.
     * 
     */
    private final Boolean clusterScoped;
    /**
     * YAML manifest of the resource.
     * 
     */
    private final String manifest;

    @CustomType.Constructor
    private ResourceManifestResponse(
        @CustomType.Parameter("clusterScoped") Boolean clusterScoped,
        @CustomType.Parameter("manifest") String manifest) {
        this.clusterScoped = clusterScoped;
        this.manifest = manifest;
    }

    /**
     * Whether the resource provided in the manifest is `cluster_scoped`. If unset, the manifest is assumed to be namespace scoped. This field is used for REST mapping when applying the resource in a cluster.
     * 
    */
    public Boolean clusterScoped() {
        return this.clusterScoped;
    }
    /**
     * YAML manifest of the resource.
     * 
    */
    public String manifest() {
        return this.manifest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceManifestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean clusterScoped;
        private String manifest;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceManifestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterScoped = defaults.clusterScoped;
    	      this.manifest = defaults.manifest;
        }

        public Builder clusterScoped(Boolean clusterScoped) {
            this.clusterScoped = Objects.requireNonNull(clusterScoped);
            return this;
        }
        public Builder manifest(String manifest) {
            this.manifest = Objects.requireNonNull(manifest);
            return this;
        }        public ResourceManifestResponse build() {
            return new ResourceManifestResponse(clusterScoped, manifest);
        }
    }
}
