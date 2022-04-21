// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebPubSubArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebPubSubArgs Empty = new GetWebPubSubArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    private GetWebPubSubArgs() {}

    private GetWebPubSubArgs(GetWebPubSubArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebPubSubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebPubSubArgs $;

        public Builder() {
            $ = new GetWebPubSubArgs();
        }

        public Builder(GetWebPubSubArgs defaults) {
            $ = new GetWebPubSubArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetWebPubSubArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
