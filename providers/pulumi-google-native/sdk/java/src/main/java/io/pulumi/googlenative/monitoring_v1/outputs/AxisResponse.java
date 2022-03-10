// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AxisResponse {
    /**
     * The label of the axis.
     * 
     */
    private final String label;
    /**
     * The axis scale. By default, a linear scale is used.
     * 
     */
    private final String scale;

    @OutputCustomType.Constructor
    private AxisResponse(
        @OutputCustomType.Parameter("label") String label,
        @OutputCustomType.Parameter("scale") String scale) {
        this.label = label;
        this.scale = scale;
    }

    /**
     * The label of the axis.
     * 
    */
    public String getLabel() {
        return this.label;
    }
    /**
     * The axis scale. By default, a linear scale is used.
     * 
    */
    public String getScale() {
        return this.scale;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AxisResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String label;
        private String scale;

        public Builder() {
    	      // Empty
        }

        public Builder(AxisResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.scale = defaults.scale;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setScale(String scale) {
            this.scale = Objects.requireNonNull(scale);
            return this;
        }
        public AxisResponse build() {
            return new AxisResponse(label, scale);
        }
    }
}
