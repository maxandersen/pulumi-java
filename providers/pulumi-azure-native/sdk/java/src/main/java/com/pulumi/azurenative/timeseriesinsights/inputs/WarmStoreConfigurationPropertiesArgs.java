// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The warm store configuration provides the details to create a warm store cache that will retain a copy of the environment&#39;s data available for faster query.
 * 
 */
public final class WarmStoreConfigurationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WarmStoreConfigurationPropertiesArgs Empty = new WarmStoreConfigurationPropertiesArgs();

    /**
     * ISO8601 timespan specifying the number of days the environment&#39;s events will be available for query from the warm store.
     * 
     */
    @Import(name="dataRetention", required=true)
    private Output<String> dataRetention;

    /**
     * @return ISO8601 timespan specifying the number of days the environment&#39;s events will be available for query from the warm store.
     * 
     */
    public Output<String> dataRetention() {
        return this.dataRetention;
    }

    private WarmStoreConfigurationPropertiesArgs() {}

    private WarmStoreConfigurationPropertiesArgs(WarmStoreConfigurationPropertiesArgs $) {
        this.dataRetention = $.dataRetention;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WarmStoreConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WarmStoreConfigurationPropertiesArgs $;

        public Builder() {
            $ = new WarmStoreConfigurationPropertiesArgs();
        }

        public Builder(WarmStoreConfigurationPropertiesArgs defaults) {
            $ = new WarmStoreConfigurationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataRetention ISO8601 timespan specifying the number of days the environment&#39;s events will be available for query from the warm store.
         * 
         * @return builder
         * 
         */
        public Builder dataRetention(Output<String> dataRetention) {
            $.dataRetention = dataRetention;
            return this;
        }

        /**
         * @param dataRetention ISO8601 timespan specifying the number of days the environment&#39;s events will be available for query from the warm store.
         * 
         * @return builder
         * 
         */
        public Builder dataRetention(String dataRetention) {
            return dataRetention(Output.of(dataRetention));
        }

        public WarmStoreConfigurationPropertiesArgs build() {
            $.dataRetention = Objects.requireNonNull($.dataRetention, "expected parameter 'dataRetention' to be non-null");
            return $;
        }
    }

}
