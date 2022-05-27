// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TimeSeriesInsightsReferenceDataSetKeyPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeSeriesInsightsReferenceDataSetKeyPropertyArgs Empty = new TimeSeriesInsightsReferenceDataSetKeyPropertyArgs();

    /**
     * The name of the key property. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the key property. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The data type of the key property. Valid values include `Bool`, `DateTime`, `Double`, `String`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The data type of the key property. Valid values include `Bool`, `DateTime`, `Double`, `String`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private TimeSeriesInsightsReferenceDataSetKeyPropertyArgs() {}

    private TimeSeriesInsightsReferenceDataSetKeyPropertyArgs(TimeSeriesInsightsReferenceDataSetKeyPropertyArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesInsightsReferenceDataSetKeyPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesInsightsReferenceDataSetKeyPropertyArgs $;

        public Builder() {
            $ = new TimeSeriesInsightsReferenceDataSetKeyPropertyArgs();
        }

        public Builder(TimeSeriesInsightsReferenceDataSetKeyPropertyArgs defaults) {
            $ = new TimeSeriesInsightsReferenceDataSetKeyPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the key property. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the key property. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The data type of the key property. Valid values include `Bool`, `DateTime`, `Double`, `String`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The data type of the key property. Valid values include `Bool`, `DateTime`, `Double`, `String`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TimeSeriesInsightsReferenceDataSetKeyPropertyArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
