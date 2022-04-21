// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes parameters for creating application-scoped volumes provided by Service Fabric Volume Disks
 * 
 */
public final class ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse Empty = new ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse();

    /**
     * User readable description of the volume.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the application-scoped volume kind.
     * Expected value is &#39;ServiceFabricVolumeDisk&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Volume size
     * 
     */
    @Import(name="sizeDisk", required=true)
    private String sizeDisk;

    public String sizeDisk() {
        return this.sizeDisk;
    }

    private ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse() {}

    private ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse(ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse $) {
        this.description = $.description;
        this.kind = $.kind;
        this.sizeDisk = $.sizeDisk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse $;

        public Builder() {
            $ = new ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse();
        }

        public Builder(ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse defaults) {
            $ = new ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder sizeDisk(String sizeDisk) {
            $.sizeDisk = sizeDisk;
            return this;
        }

        public ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse build() {
            $.kind = Codegen.stringProp("kind").arg($.kind).require();
            $.sizeDisk = Objects.requireNonNull($.sizeDisk, "expected parameter 'sizeDisk' to be non-null");
            return $;
        }
    }

}
