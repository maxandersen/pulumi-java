// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.azurenative.servicefabricmesh.inputs.ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a volume whose lifetime is scoped to the application&#39;s lifetime.
 * 
 */
public final class ApplicationScopedVolumeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationScopedVolumeResponse Empty = new ApplicationScopedVolumeResponse();

    /**
     * Describes parameters for creating application-scoped volumes.
     * 
     */
    @Import(name="creationParameters", required=true)
      private final ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse creationParameters;

    public ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse creationParameters() {
        return this.creationParameters;
    }

    /**
     * The path within the container at which the volume should be mounted. Only valid path characters are allowed.
     * 
     */
    @Import(name="destinationPath", required=true)
      private final String destinationPath;

    public String destinationPath() {
        return this.destinationPath;
    }

    /**
     * Name of the volume being referenced.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The flag indicating whether the volume is read only. Default is &#39;false&#39;.
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Boolean readOnly;

    public Optional<Boolean> readOnly() {
        return this.readOnly == null ? Optional.empty() : Optional.ofNullable(this.readOnly);
    }

    public ApplicationScopedVolumeResponse(
        ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse creationParameters,
        String destinationPath,
        String name,
        @Nullable Boolean readOnly) {
        this.creationParameters = Objects.requireNonNull(creationParameters, "expected parameter 'creationParameters' to be non-null");
        this.destinationPath = Objects.requireNonNull(destinationPath, "expected parameter 'destinationPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = readOnly;
    }

    private ApplicationScopedVolumeResponse() {
        this.creationParameters = null;
        this.destinationPath = null;
        this.name = null;
        this.readOnly = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationScopedVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse creationParameters;
        private String destinationPath;
        private String name;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationScopedVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationParameters = defaults.creationParameters;
    	      this.destinationPath = defaults.destinationPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder creationParameters(ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse creationParameters) {
            this.creationParameters = Objects.requireNonNull(creationParameters);
            return this;
        }
        public Builder destinationPath(String destinationPath) {
            this.destinationPath = Objects.requireNonNull(destinationPath);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }        public ApplicationScopedVolumeResponse build() {
            return new ApplicationScopedVolumeResponse(creationParameters, destinationPath, name, readOnly);
        }
    }
}
