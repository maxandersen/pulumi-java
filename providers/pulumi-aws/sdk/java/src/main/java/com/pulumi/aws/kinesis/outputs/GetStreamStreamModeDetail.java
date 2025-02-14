// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStreamStreamModeDetail {
    /**
     * @return The capacity mode of the stream. Either `ON_DEMAND` or `PROVISIONED`.
     * 
     */
    private final String streamMode;

    @CustomType.Constructor
    private GetStreamStreamModeDetail(@CustomType.Parameter("streamMode") String streamMode) {
        this.streamMode = streamMode;
    }

    /**
     * @return The capacity mode of the stream. Either `ON_DEMAND` or `PROVISIONED`.
     * 
     */
    public String streamMode() {
        return this.streamMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamStreamModeDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String streamMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamStreamModeDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamMode = defaults.streamMode;
        }

        public Builder streamMode(String streamMode) {
            this.streamMode = Objects.requireNonNull(streamMode);
            return this;
        }        public GetStreamStreamModeDetail build() {
            return new GetStreamStreamModeDetail(streamMode);
        }
    }
}
