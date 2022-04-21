// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import com.google.gson.JsonElement;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceSubresourceScaleArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceSubresources defines the status and scale subresources for CustomResources.
 * 
 */
public final class CustomResourceSubresourcesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceSubresourcesArgs Empty = new CustomResourceSubresourcesArgs();

    /**
     * scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
     * 
     */
    @Import(name="scale")
    private @Nullable Output<CustomResourceSubresourceScaleArgs> scale;

    public Optional<Output<CustomResourceSubresourceScaleArgs>> scale() {
        return Optional.ofNullable(this.scale);
    }

    /**
     * status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
     * 
     */
    @Import(name="status")
    private @Nullable Output<JsonElement> status;

    public Optional<Output<JsonElement>> status() {
        return Optional.ofNullable(this.status);
    }

    private CustomResourceSubresourcesArgs() {}

    private CustomResourceSubresourcesArgs(CustomResourceSubresourcesArgs $) {
        this.scale = $.scale;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceSubresourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceSubresourcesArgs $;

        public Builder() {
            $ = new CustomResourceSubresourcesArgs();
        }

        public Builder(CustomResourceSubresourcesArgs defaults) {
            $ = new CustomResourceSubresourcesArgs(Objects.requireNonNull(defaults));
        }

        public Builder scale(@Nullable Output<CustomResourceSubresourceScaleArgs> scale) {
            $.scale = scale;
            return this;
        }

        public Builder scale(CustomResourceSubresourceScaleArgs scale) {
            return scale(Output.of(scale));
        }

        public Builder status(@Nullable Output<JsonElement> status) {
            $.status = status;
            return this;
        }

        public Builder status(JsonElement status) {
            return status(Output.of(status));
        }

        public CustomResourceSubresourcesArgs build() {
            return $;
        }
    }

}
