// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1AssetResourceStatusResponse {
    /**
     * @return Additional information about the current state.
     * 
     */
    private final String message;
    /**
     * @return The current state of the managed resource.
     * 
     */
    private final String state;
    /**
     * @return Last update time of the status.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GoogleCloudDataplexV1AssetResourceStatusResponse(
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.message = message;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * @return Additional information about the current state.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return The current state of the managed resource.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Last update time of the status.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1AssetResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDataplexV1AssetResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GoogleCloudDataplexV1AssetResourceStatusResponse build() {
            return new GoogleCloudDataplexV1AssetResourceStatusResponse(message, state, updateTime);
        }
    }
}
