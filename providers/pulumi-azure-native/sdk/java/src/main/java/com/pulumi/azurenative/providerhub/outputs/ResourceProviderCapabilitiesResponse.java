// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ResourceProviderCapabilitiesResponse {
    private final String effect;
    private final String quotaId;
    private final @Nullable List<String> requiredFeatures;

    @CustomType.Constructor
    private ResourceProviderCapabilitiesResponse(
        @CustomType.Parameter("effect") String effect,
        @CustomType.Parameter("quotaId") String quotaId,
        @CustomType.Parameter("requiredFeatures") @Nullable List<String> requiredFeatures) {
        this.effect = effect;
        this.quotaId = quotaId;
        this.requiredFeatures = requiredFeatures;
    }

    public String effect() {
        return this.effect;
    }
    public String quotaId() {
        return this.quotaId;
    }
    public List<String> requiredFeatures() {
        return this.requiredFeatures == null ? List.of() : this.requiredFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderCapabilitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String quotaId;
        private @Nullable List<String> requiredFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderCapabilitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.quotaId = defaults.quotaId;
    	      this.requiredFeatures = defaults.requiredFeatures;
        }

        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        public Builder quotaId(String quotaId) {
            this.quotaId = Objects.requireNonNull(quotaId);
            return this;
        }
        public Builder requiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }
        public Builder requiredFeatures(String... requiredFeatures) {
            return requiredFeatures(List.of(requiredFeatures));
        }        public ResourceProviderCapabilitiesResponse build() {
            return new ResourceProviderCapabilitiesResponse(effect, quotaId, requiredFeatures);
        }
    }
}
