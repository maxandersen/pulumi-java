// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.awsnative.iotsitewise.outputs.AssetModelExpressionVariable;
import com.pulumi.awsnative.iotsitewise.outputs.AssetModelMetricWindow;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AssetModelMetric {
    /**
     * @return The mathematical expression that defines the metric aggregation function. You can specify up to 10 functions per expression.
     * 
     */
    private final String expression;
    /**
     * @return The list of variables used in the expression.
     * 
     */
    private final List<AssetModelExpressionVariable> variables;
    /**
     * @return The window (time interval) over which AWS IoT SiteWise computes the metric&#39;s aggregation expression
     * 
     */
    private final AssetModelMetricWindow window;

    @CustomType.Constructor
    private AssetModelMetric(
        @CustomType.Parameter("expression") String expression,
        @CustomType.Parameter("variables") List<AssetModelExpressionVariable> variables,
        @CustomType.Parameter("window") AssetModelMetricWindow window) {
        this.expression = expression;
        this.variables = variables;
        this.window = window;
    }

    /**
     * @return The mathematical expression that defines the metric aggregation function. You can specify up to 10 functions per expression.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return The list of variables used in the expression.
     * 
     */
    public List<AssetModelExpressionVariable> variables() {
        return this.variables;
    }
    /**
     * @return The window (time interval) over which AWS IoT SiteWise computes the metric&#39;s aggregation expression
     * 
     */
    public AssetModelMetricWindow window() {
        return this.window;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expression;
        private List<AssetModelExpressionVariable> variables;
        private AssetModelMetricWindow window;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.variables = defaults.variables;
    	      this.window = defaults.window;
        }

        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder variables(List<AssetModelExpressionVariable> variables) {
            this.variables = Objects.requireNonNull(variables);
            return this;
        }
        public Builder variables(AssetModelExpressionVariable... variables) {
            return variables(List.of(variables));
        }
        public Builder window(AssetModelMetricWindow window) {
            this.window = Objects.requireNonNull(window);
            return this;
        }        public AssetModelMetric build() {
            return new AssetModelMetric(expression, variables, window);
        }
    }
}
