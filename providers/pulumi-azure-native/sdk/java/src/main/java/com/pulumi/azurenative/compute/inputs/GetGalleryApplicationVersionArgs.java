// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGalleryApplicationVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGalleryApplicationVersionArgs Empty = new GetGalleryApplicationVersionArgs();

    /**
     * The expand expression to apply on the operation.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the gallery Application Definition in which the Application Version resides.
     * 
     */
    @Import(name="galleryApplicationName", required=true)
    private String galleryApplicationName;

    public String galleryApplicationName() {
        return this.galleryApplicationName;
    }

    /**
     * The name of the gallery Application Version to be retrieved.
     * 
     */
    @Import(name="galleryApplicationVersionName", required=true)
    private String galleryApplicationVersionName;

    public String galleryApplicationVersionName() {
        return this.galleryApplicationVersionName;
    }

    /**
     * The name of the Shared Application Gallery in which the Application Definition resides.
     * 
     */
    @Import(name="galleryName", required=true)
    private String galleryName;

    public String galleryName() {
        return this.galleryName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetGalleryApplicationVersionArgs() {}

    private GetGalleryApplicationVersionArgs(GetGalleryApplicationVersionArgs $) {
        this.expand = $.expand;
        this.galleryApplicationName = $.galleryApplicationName;
        this.galleryApplicationVersionName = $.galleryApplicationVersionName;
        this.galleryName = $.galleryName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGalleryApplicationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGalleryApplicationVersionArgs $;

        public Builder() {
            $ = new GetGalleryApplicationVersionArgs();
        }

        public Builder(GetGalleryApplicationVersionArgs defaults) {
            $ = new GetGalleryApplicationVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        public Builder galleryApplicationName(String galleryApplicationName) {
            $.galleryApplicationName = galleryApplicationName;
            return this;
        }

        public Builder galleryApplicationVersionName(String galleryApplicationVersionName) {
            $.galleryApplicationVersionName = galleryApplicationVersionName;
            return this;
        }

        public Builder galleryName(String galleryName) {
            $.galleryName = galleryName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetGalleryApplicationVersionArgs build() {
            $.galleryApplicationName = Objects.requireNonNull($.galleryApplicationName, "expected parameter 'galleryApplicationName' to be non-null");
            $.galleryApplicationVersionName = Objects.requireNonNull($.galleryApplicationVersionName, "expected parameter 'galleryApplicationVersionName' to be non-null");
            $.galleryName = Objects.requireNonNull($.galleryName, "expected parameter 'galleryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
