// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WarmStoreConfigurationPropertiesResponse {
    /**
     * ISO8601 timespan specifying the number of days the environment's events will be available for query from the warm store.
     * 
     */
    private final String dataRetention;

    @CustomType.Constructor
    private WarmStoreConfigurationPropertiesResponse(@CustomType.Parameter("dataRetention") String dataRetention) {
        this.dataRetention = dataRetention;
    }

    /**
     * ISO8601 timespan specifying the number of days the environment's events will be available for query from the warm store.
     * 
    */
    public String dataRetention() {
        return this.dataRetention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WarmStoreConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataRetention;

        public Builder() {
    	      // Empty
        }

        public Builder(WarmStoreConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRetention = defaults.dataRetention;
        }

        public Builder dataRetention(String dataRetention) {
            this.dataRetention = Objects.requireNonNull(dataRetention);
            return this;
        }        public WarmStoreConfigurationPropertiesResponse build() {
            return new WarmStoreConfigurationPropertiesResponse(dataRetention);
        }
    }
}
