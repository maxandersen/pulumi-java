// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlusterfsVolumeSource {
    /**
     * @return endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private final String endpoints;
    /**
     * @return path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private final String path;
    /**
     * @return readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private final @Nullable Boolean readOnly;

    @CustomType.Constructor
    private GlusterfsVolumeSource(
        @CustomType.Parameter("endpoints") String endpoints,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly) {
        this.endpoints = endpoints;
        this.path = path;
        this.readOnly = readOnly;
    }

    /**
     * @return endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public String endpoints() {
        return this.endpoints;
    }
    /**
     * @return path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlusterfsVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoints;
        private String path;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GlusterfsVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder endpoints(String endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }        public GlusterfsVolumeSource build() {
            return new GlusterfsVolumeSource(endpoints, path, readOnly);
        }
    }
}
