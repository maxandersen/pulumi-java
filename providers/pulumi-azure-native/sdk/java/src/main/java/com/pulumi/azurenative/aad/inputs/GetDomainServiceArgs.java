// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aad.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDomainServiceArgs extends InvokeArgs {

    public static final GetDomainServiceArgs Empty = new GetDomainServiceArgs();

    /**
     * The name of the domain service.
     * 
     */
    @Import(name="domainServiceName", required=true)
    private String domainServiceName;

    /**
     * @return The name of the domain service.
     * 
     */
    public String domainServiceName() {
        return this.domainServiceName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDomainServiceArgs() {}

    private GetDomainServiceArgs(GetDomainServiceArgs $) {
        this.domainServiceName = $.domainServiceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainServiceArgs $;

        public Builder() {
            $ = new GetDomainServiceArgs();
        }

        public Builder(GetDomainServiceArgs defaults) {
            $ = new GetDomainServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainServiceName The name of the domain service.
         * 
         * @return builder
         * 
         */
        public Builder domainServiceName(String domainServiceName) {
            $.domainServiceName = domainServiceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDomainServiceArgs build() {
            $.domainServiceName = Objects.requireNonNull($.domainServiceName, "expected parameter 'domainServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
