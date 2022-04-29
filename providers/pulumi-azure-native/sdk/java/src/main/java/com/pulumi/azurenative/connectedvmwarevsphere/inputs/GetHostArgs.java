// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetHostArgs extends InvokeArgs {

    public static final GetHostArgs Empty = new GetHostArgs();

    /**
     * Name of the host.
     * 
     */
    @Import(name="hostName", required=true)
    private String hostName;

    /**
     * @return Name of the host.
     * 
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Resource Group Name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetHostArgs() {}

    private GetHostArgs(GetHostArgs $) {
        this.hostName = $.hostName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostArgs $;

        public Builder() {
            $ = new GetHostArgs();
        }

        public Builder(GetHostArgs defaults) {
            $ = new GetHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostName Name of the host.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetHostArgs build() {
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
