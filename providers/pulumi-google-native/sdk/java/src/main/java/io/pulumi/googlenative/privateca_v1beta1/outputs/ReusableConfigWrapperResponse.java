// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.ReusableConfigValuesResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReusableConfigWrapperResponse {
    /**
     * A resource path to a ReusableConfig in the format `projects/*{@literal /}locations/*{@literal /}reusableConfigs/*`.
     * 
     */
    private final String reusableConfig;
    /**
     * A user-specified inline ReusableConfigValues.
     * 
     */
    private final ReusableConfigValuesResponse reusableConfigValues;

    @OutputCustomType.Constructor
    private ReusableConfigWrapperResponse(
        @OutputCustomType.Parameter("reusableConfig") String reusableConfig,
        @OutputCustomType.Parameter("reusableConfigValues") ReusableConfigValuesResponse reusableConfigValues) {
        this.reusableConfig = reusableConfig;
        this.reusableConfigValues = reusableConfigValues;
    }

    /**
     * A resource path to a ReusableConfig in the format `projects/*{@literal /}locations/*{@literal /}reusableConfigs/*`.
     * 
    */
    public String getReusableConfig() {
        return this.reusableConfig;
    }
    /**
     * A user-specified inline ReusableConfigValues.
     * 
    */
    public ReusableConfigValuesResponse getReusableConfigValues() {
        return this.reusableConfigValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReusableConfigWrapperResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String reusableConfig;
        private ReusableConfigValuesResponse reusableConfigValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ReusableConfigWrapperResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reusableConfig = defaults.reusableConfig;
    	      this.reusableConfigValues = defaults.reusableConfigValues;
        }

        public Builder setReusableConfig(String reusableConfig) {
            this.reusableConfig = Objects.requireNonNull(reusableConfig);
            return this;
        }

        public Builder setReusableConfigValues(ReusableConfigValuesResponse reusableConfigValues) {
            this.reusableConfigValues = Objects.requireNonNull(reusableConfigValues);
            return this;
        }
        public ReusableConfigWrapperResponse build() {
            return new ReusableConfigWrapperResponse(reusableConfig, reusableConfigValues);
        }
    }
}
