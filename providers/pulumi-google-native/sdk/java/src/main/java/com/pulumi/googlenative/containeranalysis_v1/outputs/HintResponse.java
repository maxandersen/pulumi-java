// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HintResponse {
    /**
     * The human readable name of this attestation authority, for example "qa".
     * 
     */
    private final String humanReadableName;

    @CustomType.Constructor
    private HintResponse(@CustomType.Parameter("humanReadableName") String humanReadableName) {
        this.humanReadableName = humanReadableName;
    }

    /**
     * The human readable name of this attestation authority, for example "qa".
     * 
    */
    public String humanReadableName() {
        return this.humanReadableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(HintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanReadableName = defaults.humanReadableName;
        }

        public Builder humanReadableName(String humanReadableName) {
            this.humanReadableName = Objects.requireNonNull(humanReadableName);
            return this;
        }        public HintResponse build() {
            return new HintResponse(humanReadableName);
        }
    }
}
