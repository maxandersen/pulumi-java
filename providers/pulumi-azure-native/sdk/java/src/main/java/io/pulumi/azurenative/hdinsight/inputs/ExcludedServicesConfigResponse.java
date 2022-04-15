// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration that services will be excluded when creating cluster.
 * 
 */
public final class ExcludedServicesConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExcludedServicesConfigResponse Empty = new ExcludedServicesConfigResponse();

    /**
     * The config id of excluded services.
     * 
     */
    @Import(name="excludedServicesConfigId")
      private final @Nullable String excludedServicesConfigId;

    public Optional<String> excludedServicesConfigId() {
        return this.excludedServicesConfigId == null ? Optional.empty() : Optional.ofNullable(this.excludedServicesConfigId);
    }

    /**
     * The list of excluded services.
     * 
     */
    @Import(name="excludedServicesList")
      private final @Nullable String excludedServicesList;

    public Optional<String> excludedServicesList() {
        return this.excludedServicesList == null ? Optional.empty() : Optional.ofNullable(this.excludedServicesList);
    }

    public ExcludedServicesConfigResponse(
        @Nullable String excludedServicesConfigId,
        @Nullable String excludedServicesList) {
        this.excludedServicesConfigId = excludedServicesConfigId;
        this.excludedServicesList = excludedServicesList;
    }

    private ExcludedServicesConfigResponse() {
        this.excludedServicesConfigId = null;
        this.excludedServicesList = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExcludedServicesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String excludedServicesConfigId;
        private @Nullable String excludedServicesList;

        public Builder() {
    	      // Empty
        }

        public Builder(ExcludedServicesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedServicesConfigId = defaults.excludedServicesConfigId;
    	      this.excludedServicesList = defaults.excludedServicesList;
        }

        public Builder excludedServicesConfigId(@Nullable String excludedServicesConfigId) {
            this.excludedServicesConfigId = excludedServicesConfigId;
            return this;
        }
        public Builder excludedServicesList(@Nullable String excludedServicesList) {
            this.excludedServicesList = excludedServicesList;
            return this;
        }        public ExcludedServicesConfigResponse build() {
            return new ExcludedServicesConfigResponse(excludedServicesConfigId, excludedServicesList);
        }
    }
}
