// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.ResourceTypeExtensionOptionsResponseResourceCreationBegin;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesResponseExtensionOptions extends com.pulumi.resources.InvokeArgs {

    public static final ResourceTypeRegistrationPropertiesResponseExtensionOptions Empty = new ResourceTypeRegistrationPropertiesResponseExtensionOptions();

    @Import(name="resourceCreationBegin")
    private @Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin;

    public Optional<ResourceTypeExtensionOptionsResponseResourceCreationBegin> resourceCreationBegin() {
        return Optional.ofNullable(this.resourceCreationBegin);
    }

    private ResourceTypeRegistrationPropertiesResponseExtensionOptions() {}

    private ResourceTypeRegistrationPropertiesResponseExtensionOptions(ResourceTypeRegistrationPropertiesResponseExtensionOptions $) {
        this.resourceCreationBegin = $.resourceCreationBegin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceTypeRegistrationPropertiesResponseExtensionOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceTypeRegistrationPropertiesResponseExtensionOptions $;

        public Builder() {
            $ = new ResourceTypeRegistrationPropertiesResponseExtensionOptions();
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseExtensionOptions defaults) {
            $ = new ResourceTypeRegistrationPropertiesResponseExtensionOptions(Objects.requireNonNull(defaults));
        }

        public Builder resourceCreationBegin(@Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin) {
            $.resourceCreationBegin = resourceCreationBegin;
            return this;
        }

        public ResourceTypeRegistrationPropertiesResponseExtensionOptions build() {
            return $;
        }
    }

}
