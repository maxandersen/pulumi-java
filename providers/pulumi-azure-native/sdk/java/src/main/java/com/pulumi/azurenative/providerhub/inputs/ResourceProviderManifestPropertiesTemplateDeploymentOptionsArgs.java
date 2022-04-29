// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.enums.PreflightOption;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs extends ResourceArgs {

    public static final ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs Empty = new ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs();

    @Import(name="preflightOptions")
    private @Nullable Output<List<Either<String,PreflightOption>>> preflightOptions;

    public Optional<Output<List<Either<String,PreflightOption>>>> preflightOptions() {
        return Optional.ofNullable(this.preflightOptions);
    }

    @Import(name="preflightSupported")
    private @Nullable Output<Boolean> preflightSupported;

    public Optional<Output<Boolean>> preflightSupported() {
        return Optional.ofNullable(this.preflightSupported);
    }

    private ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs() {}

    private ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs(ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs $) {
        this.preflightOptions = $.preflightOptions;
        this.preflightSupported = $.preflightSupported;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs $;

        public Builder() {
            $ = new ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs();
        }

        public Builder(ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs defaults) {
            $ = new ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder preflightOptions(@Nullable Output<List<Either<String,PreflightOption>>> preflightOptions) {
            $.preflightOptions = preflightOptions;
            return this;
        }

        public Builder preflightOptions(List<Either<String,PreflightOption>> preflightOptions) {
            return preflightOptions(Output.of(preflightOptions));
        }

        public Builder preflightOptions(Either<String,PreflightOption>... preflightOptions) {
            return preflightOptions(List.of(preflightOptions));
        }

        public Builder preflightSupported(@Nullable Output<Boolean> preflightSupported) {
            $.preflightSupported = preflightSupported;
            return this;
        }

        public Builder preflightSupported(Boolean preflightSupported) {
            return preflightSupported(Output.of(preflightSupported));
        }

        public ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs build() {
            return $;
        }
    }

}
