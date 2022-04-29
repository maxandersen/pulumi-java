// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Properties of the IoT Security solution&#39;s user defined resources.
 * 
 */
public final class UserDefinedResourcesPropertiesArgs extends ResourceArgs {

    public static final UserDefinedResourcesPropertiesArgs Empty = new UserDefinedResourcesPropertiesArgs();

    /**
     * Azure Resource Graph query which represents the security solution&#39;s user defined resources. Required to start with &#34;where type != &#34;Microsoft.Devices/IotHubs&#34;&#34;
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return Azure Resource Graph query which represents the security solution&#39;s user defined resources. Required to start with &#34;where type != &#34;Microsoft.Devices/IotHubs&#34;&#34;
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    /**
     * List of Azure subscription ids on which the user defined resources query should be executed.
     * 
     */
    @Import(name="querySubscriptions", required=true)
    private Output<List<String>> querySubscriptions;

    /**
     * @return List of Azure subscription ids on which the user defined resources query should be executed.
     * 
     */
    public Output<List<String>> querySubscriptions() {
        return this.querySubscriptions;
    }

    private UserDefinedResourcesPropertiesArgs() {}

    private UserDefinedResourcesPropertiesArgs(UserDefinedResourcesPropertiesArgs $) {
        this.query = $.query;
        this.querySubscriptions = $.querySubscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserDefinedResourcesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserDefinedResourcesPropertiesArgs $;

        public Builder() {
            $ = new UserDefinedResourcesPropertiesArgs();
        }

        public Builder(UserDefinedResourcesPropertiesArgs defaults) {
            $ = new UserDefinedResourcesPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query Azure Resource Graph query which represents the security solution&#39;s user defined resources. Required to start with &#34;where type != &#34;Microsoft.Devices/IotHubs&#34;&#34;
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Azure Resource Graph query which represents the security solution&#39;s user defined resources. Required to start with &#34;where type != &#34;Microsoft.Devices/IotHubs&#34;&#34;
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param querySubscriptions List of Azure subscription ids on which the user defined resources query should be executed.
         * 
         * @return builder
         * 
         */
        public Builder querySubscriptions(Output<List<String>> querySubscriptions) {
            $.querySubscriptions = querySubscriptions;
            return this;
        }

        /**
         * @param querySubscriptions List of Azure subscription ids on which the user defined resources query should be executed.
         * 
         * @return builder
         * 
         */
        public Builder querySubscriptions(List<String> querySubscriptions) {
            return querySubscriptions(Output.of(querySubscriptions));
        }

        /**
         * @param querySubscriptions List of Azure subscription ids on which the user defined resources query should be executed.
         * 
         * @return builder
         * 
         */
        public Builder querySubscriptions(String... querySubscriptions) {
            return querySubscriptions(List.of(querySubscriptions));
        }

        public UserDefinedResourcesPropertiesArgs build() {
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            $.querySubscriptions = Objects.requireNonNull($.querySubscriptions, "expected parameter 'querySubscriptions' to be non-null");
            return $;
        }
    }

}
