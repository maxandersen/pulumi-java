// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStaticMemberArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStaticMemberArgs Empty = new GetStaticMemberArgs();

    /**
     * The name of the network group.
     * 
     */
    @Import(name="networkGroupName", required=true)
    private String networkGroupName;

    public String networkGroupName() {
        return this.networkGroupName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private String networkManagerName;

    public String networkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the static member.
     * 
     */
    @Import(name="staticMemberName", required=true)
    private String staticMemberName;

    public String staticMemberName() {
        return this.staticMemberName;
    }

    private GetStaticMemberArgs() {}

    private GetStaticMemberArgs(GetStaticMemberArgs $) {
        this.networkGroupName = $.networkGroupName;
        this.networkManagerName = $.networkManagerName;
        this.resourceGroupName = $.resourceGroupName;
        this.staticMemberName = $.staticMemberName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStaticMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStaticMemberArgs $;

        public Builder() {
            $ = new GetStaticMemberArgs();
        }

        public Builder(GetStaticMemberArgs defaults) {
            $ = new GetStaticMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkGroupName(String networkGroupName) {
            $.networkGroupName = networkGroupName;
            return this;
        }

        public Builder networkManagerName(String networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder staticMemberName(String staticMemberName) {
            $.staticMemberName = staticMemberName;
            return this;
        }

        public GetStaticMemberArgs build() {
            $.networkGroupName = Objects.requireNonNull($.networkGroupName, "expected parameter 'networkGroupName' to be non-null");
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.staticMemberName = Objects.requireNonNull($.staticMemberName, "expected parameter 'staticMemberName' to be non-null");
            return $;
        }
    }

}
