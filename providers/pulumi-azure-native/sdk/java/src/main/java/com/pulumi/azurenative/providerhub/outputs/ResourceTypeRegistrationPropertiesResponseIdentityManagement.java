// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceTypeRegistrationPropertiesResponseIdentityManagement {
    private final @Nullable String applicationId;
    private final @Nullable String type;

    @CustomType.Constructor
    private ResourceTypeRegistrationPropertiesResponseIdentityManagement(
        @CustomType.Parameter("applicationId") @Nullable String applicationId,
        @CustomType.Parameter("type") @Nullable String type) {
        this.applicationId = applicationId;
        this.type = type;
    }

    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseIdentityManagement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseIdentityManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.type = defaults.type;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ResourceTypeRegistrationPropertiesResponseIdentityManagement build() {
            return new ResourceTypeRegistrationPropertiesResponseIdentityManagement(applicationId, type);
        }
    }
}
