// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOriginGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOriginGroupArgs Empty = new GetOriginGroupArgs();

    /**
     * Name of the endpoint under the profile which is unique globally.
     * 
     */
    @Import(name="endpointName", required=true)
    private String endpointName;

    public String endpointName() {
        return this.endpointName;
    }

    /**
     * Name of the origin group which is unique within the endpoint.
     * 
     */
    @Import(name="originGroupName", required=true)
    private String originGroupName;

    public String originGroupName() {
        return this.originGroupName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
    private String profileName;

    public String profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetOriginGroupArgs() {}

    private GetOriginGroupArgs(GetOriginGroupArgs $) {
        this.endpointName = $.endpointName;
        this.originGroupName = $.originGroupName;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOriginGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOriginGroupArgs $;

        public Builder() {
            $ = new GetOriginGroupArgs();
        }

        public Builder(GetOriginGroupArgs defaults) {
            $ = new GetOriginGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointName(String endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        public Builder originGroupName(String originGroupName) {
            $.originGroupName = originGroupName;
            return this;
        }

        public Builder profileName(String profileName) {
            $.profileName = profileName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetOriginGroupArgs build() {
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.originGroupName = Objects.requireNonNull($.originGroupName, "expected parameter 'originGroupName' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
