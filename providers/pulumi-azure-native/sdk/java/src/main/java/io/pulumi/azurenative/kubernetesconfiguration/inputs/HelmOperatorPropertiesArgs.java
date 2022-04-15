// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for Helm operator.
 * 
 */
public final class HelmOperatorPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final HelmOperatorPropertiesArgs Empty = new HelmOperatorPropertiesArgs();

    /**
     * Values override for the operator Helm chart.
     * 
     */
    @Import(name="chartValues")
      private final @Nullable Output<String> chartValues;

    public Output<String> chartValues() {
        return this.chartValues == null ? Codegen.empty() : this.chartValues;
    }

    /**
     * Version of the operator Helm chart.
     * 
     */
    @Import(name="chartVersion")
      private final @Nullable Output<String> chartVersion;

    public Output<String> chartVersion() {
        return this.chartVersion == null ? Codegen.empty() : this.chartVersion;
    }

    public HelmOperatorPropertiesArgs(
        @Nullable Output<String> chartValues,
        @Nullable Output<String> chartVersion) {
        this.chartValues = chartValues;
        this.chartVersion = chartVersion;
    }

    private HelmOperatorPropertiesArgs() {
        this.chartValues = Codegen.empty();
        this.chartVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HelmOperatorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> chartValues;
        private @Nullable Output<String> chartVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(HelmOperatorPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chartValues = defaults.chartValues;
    	      this.chartVersion = defaults.chartVersion;
        }

        public Builder chartValues(@Nullable Output<String> chartValues) {
            this.chartValues = chartValues;
            return this;
        }
        public Builder chartValues(@Nullable String chartValues) {
            this.chartValues = Codegen.ofNullable(chartValues);
            return this;
        }
        public Builder chartVersion(@Nullable Output<String> chartVersion) {
            this.chartVersion = chartVersion;
            return this;
        }
        public Builder chartVersion(@Nullable String chartVersion) {
            this.chartVersion = Codegen.ofNullable(chartVersion);
            return this;
        }        public HelmOperatorPropertiesArgs build() {
            return new HelmOperatorPropertiesArgs(chartValues, chartVersion);
        }
    }
}
