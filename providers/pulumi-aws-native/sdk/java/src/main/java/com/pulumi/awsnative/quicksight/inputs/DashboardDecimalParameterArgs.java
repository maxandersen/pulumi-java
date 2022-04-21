// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * &lt;p&gt;A decimal parameter.&lt;/p&gt;
 * 
 */
public final class DashboardDecimalParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardDecimalParameterArgs Empty = new DashboardDecimalParameterArgs();

    /**
     * &lt;p&gt;A display name for the decimal parameter.&lt;/p&gt;
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * &lt;p&gt;The values for the decimal parameter.&lt;/p&gt;
     * 
     */
    @Import(name="values", required=true)
    private Output<List<Double>> values;

    public Output<List<Double>> values() {
        return this.values;
    }

    private DashboardDecimalParameterArgs() {}

    private DashboardDecimalParameterArgs(DashboardDecimalParameterArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardDecimalParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardDecimalParameterArgs $;

        public Builder() {
            $ = new DashboardDecimalParameterArgs();
        }

        public Builder(DashboardDecimalParameterArgs defaults) {
            $ = new DashboardDecimalParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder values(Output<List<Double>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<Double> values) {
            return values(Output.of(values));
        }

        public Builder values(Double... values) {
            return values(List.of(values));
        }

        public DashboardDecimalParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
